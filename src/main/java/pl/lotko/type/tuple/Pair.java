package pl.lotko.type.tuple;

public interface Pair<A, B> extends Tuple {
    static <A, B> Pair<A, B> of(A first, B second) {
        return new PairValue<>(first, second);
    }

    A getFirst();
    B getSecond();

}
