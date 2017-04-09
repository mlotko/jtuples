package pl.lotko.types.tuples;

public interface Quadruple<A, B, C, D> extends Triple<A, B, C> {
    D getFourth();
}
