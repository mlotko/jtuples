package pl.lotko.type.tuple;

import lombok.Value;

@Value
class QuadrupleValue<A, B, C, D> implements Quadruple<A, B, C, D> {
    A first;
    B second;
    C third;
    D fourth;
}
