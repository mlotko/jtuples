package pl.lotko.type.tuple;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Iterator;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FactoryMethods {
    private static final UnitValue SHARED_UNIT = new UnitValue();

    public static Tuple tupleFrom(Object[] values) {
        switch (values.length) {
            case 0:
                return tupleOfNothing();
            case 1:
                return tupleOf(values[0]);
            case 2:
                return tupleOf(values[0], values[1]);
            case 3:
                return tupleOf(values[0], values[1], values[2]);
            case 4:
                return tupleOf(values[0], values[1], values[2], values[3]);
            case 5:
                return tupleOf(values[0], values[1], values[2], values[3], values[4]);
            default:
                throw new IllegalArgumentException(String.format(
                        "Cannot represent array tupleFrom %s elements with tuples.", values.length));
        }
    }

    public static Tuple tupleFrom(Collection<?> collection) {
        int size = collection.size();
        if (size <= 5) {
            Iterator<?> iterator = collection.iterator();
            switch (size) {
                case 0:
                    return tupleOfNothing();
                case 1:
                    return tupleOf(iterator.next());
                case 2:
                    return tupleOf(iterator.next(), iterator.next());
                case 3:
                    return tupleOf(iterator.next(), iterator.next(), iterator.next());
                case 4:
                    return tupleOf(iterator.next(), iterator.next(), iterator.next(), iterator.next());
                case 5:
                    return tupleOf(iterator.next(), iterator.next(), iterator.next(), iterator.next(), iterator.next());
            }
        }
        throw new IllegalArgumentException(String.format(
                "Cannot represent collection tupleFrom %s elements with tuples.", size));
    }

    public static Tuple tupleOfNothing() {
        return SHARED_UNIT;
    }

    public static <A> Monuple<A> tupleOf(A first) {
        return new MonupleValue<>(first);
    }

    public static <A, B> Pair<A, B> tupleOf(A first, B second) {
        return new PairValue<>(first, second);
    }

    public static <A, B, C> Triple<A, B, C> tupleOf(A first, B second, C third) {
        return new TripleValue<>(first, second, third);
    }

    public static <A, B, C, D> Quadruple<A, B, C, D> tupleOf(A first, B second, C third, D fourth) {
        return new QuadrupleValue<>(first, second, third, fourth);
    }

    public static <A, B, C, D, E> Pentuple<A, B, C, D, E> tupleOf(A first, B second, C third, D fourth, E fifth) {
        return new PentupleValue<>(first, second, third, fourth, fifth);
    }

}
