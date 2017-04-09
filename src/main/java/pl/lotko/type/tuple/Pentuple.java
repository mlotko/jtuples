package pl.lotko.type.tuple;

public interface Pentuple<A, B, C, D, E> extends Quadruple<A, B, C, D> {
    static <A, B, C, D, E> Pentuple<A, B, C, D, E> of(A first, B second, C third, D fourth, E fifth) {
        return new PentupleValue<>(first, second, third, fourth, fifth);
    }

    E getFifth();
}
