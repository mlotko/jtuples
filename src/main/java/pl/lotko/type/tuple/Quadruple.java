package pl.lotko.type.tuple;

public interface Quadruple<A, B, C, D> extends Triple<A, B, C> {

    D getFourth();
}
