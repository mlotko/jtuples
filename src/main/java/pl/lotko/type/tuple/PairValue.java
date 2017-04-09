package pl.lotko.type.tuple;

import lombok.Value;

@Value
public class PairValue<A, B> implements Pair<A, B> {
    A first;
    B second;

    @Override
    public Object[] values() {
        return new Object[] { first, second };
    }
}
