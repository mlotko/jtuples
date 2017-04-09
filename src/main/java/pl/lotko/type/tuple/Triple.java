package pl.lotko.type.tuple;

public interface Triple<A, B, C> extends Pair<A, B> {

    C getThird();
}
