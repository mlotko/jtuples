package pl.lotko.type.tuple;

import lombok.Value;

import java.util.Arrays;
import java.util.stream.Stream;

@Value
class PairValue<A, B> implements Pair<A, B> {
    A first;
    B second;

    @Override
    public Object[] values() {
        return new Object[] { first, second };
    }
}
