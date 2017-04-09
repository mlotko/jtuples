package pl.lotko.type.tuple;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Iterator;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FactoryMethods {
    private static final UnitValue SHARED_UNIT = new UnitValue();

    public static Tuple from(Object[] values) {
        switch (values.length) {
            case 0:
                return ofNothing();
            case 1:
                return of(values[0]);
            case 2:
                return of(values[0], values[1]);
            case 3:
                return of(values[0], values[1], values[2]);
            case 4:
                return of(values[0], values[1], values[2], values[3]);
            case 5:
                return of(values[0], values[1], values[2], values[3], values[4]);
            default:
                throw new IllegalArgumentException(String.format(
                        "Cannot represent array from %s elements with tuples.", values.length));
        }
    }

    public static Tuple from(Collection<?> collection) {
        int size = collection.size();
        if (size <= 5) {
            Iterator<?> iterator = collection.iterator();
            switch (size) {
                case 0:
                    return ofNothing();
                case 1:
                    return of(iterator.next());
                case 2:
                    return of(iterator.next(), iterator.next());
                case 3:
                    return of(iterator.next(), iterator.next(), iterator.next());
                case 4:
                    return of(iterator.next(), iterator.next(), iterator.next(), iterator.next());
                case 5:
                    return of(iterator.next(), iterator.next(), iterator.next(), iterator.next(), iterator.next());
            }
        }
        throw new IllegalArgumentException(String.format(
                "Cannot represent collection from %s elements with tuples.", size));
    }

    public static Tuple ofNothing() {
        return SHARED_UNIT;
    }

    public static <A> Monuple<A> of(A first) {
        return new MonupleValue<>(first);
    }

    public static <A, B> Pair<A, B> of(A first, B second) {
        return new PairValue<>(first, second);
    }

    public static <A, B, C> Triple<A, B, C> of(A first, B second, C third) {
        return new TripleValue<>(first, second, third);
    }

    public static <A, B, C, D> Quadruple<A, B, C, D> of(A first, B second, C third, D fourth) {
        return new QuadrupleValue<>(first, second, third, fourth);
    }

    public static <A, B, C, D, E> Pentuple<A, B, C, D, E> of(A first, B second, C third, D fourth, E fifth) {
        return new PentupleValue<>(first, second, third, fourth, fifth);
    }

}
