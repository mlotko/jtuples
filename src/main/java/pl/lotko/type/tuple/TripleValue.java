package pl.lotko.type.tuple;

import lombok.Value;

@Value
class TripleValue<A, B, C> implements Triple<A, B, C> {
    A first;
    B second;
    C third;
}
