package pl.lotko.type.tuple;

public interface Triple<A, B, C> extends Pair<A, B> {
    static <A, B, C> Triple<A, B, C> of(A first, B second, C third) {
        return new TripleValue<>(first, second, third);
    }

    C getThird();
}
