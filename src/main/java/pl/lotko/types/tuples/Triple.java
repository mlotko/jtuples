package pl.lotko.types.tuples;

public interface Triple<A, B, C> extends Pair<A, B> {
    C getThird();
}
