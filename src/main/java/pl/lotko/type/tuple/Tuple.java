package pl.lotko.type.tuple;

public interface Tuple {
    static <A, B> Pair<A, B> of(A first, B second) {
        return new PairValue<>(first, second);
    }

    static <A, B, C> Triple<A, B, C> of(A first, B second, C third) {
        return new TripleValue<>(first, second, third);
    }

    static <A, B, C, D> Quadruple<A, B, C, D> of(A first, B second, C third, D fourth) {
        return new QuadrupleValue<>(first, second, third, fourth);
    }

    static <A, B, C, D, E> Pentuple<A, B, C, D, E> of(A first, B second, C third, D fourth, E fifth) {
        return new PentupleValue<>(first, second, third, fourth, fifth);
    }

    Object[] values();
}
