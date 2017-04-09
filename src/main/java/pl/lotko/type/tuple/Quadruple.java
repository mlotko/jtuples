package pl.lotko.type.tuple;

public interface Quadruple<A, B, C, D> extends Triple<A, B, C> {
    static <A, B, C, D> Quadruple<A, B, C, D> of(A first, B second, C third, D fourth) {
        return new QuadrupleValue<>(first, second, third, fourth);
    }

    D getFourth();
}
