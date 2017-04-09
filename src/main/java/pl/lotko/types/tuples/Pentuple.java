package pl.lotko.types.tuples;

public interface Pentuple<A, B, C, D, E> extends Quadruple<A, B, C, D> {
    E getFifth();
}
