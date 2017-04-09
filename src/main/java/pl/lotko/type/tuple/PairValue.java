package pl.lotko.type.tuple;

import lombok.Value;

@Value
class PairValue<A, B> implements Pair<A, B> {
    A first;
    B second;
}
