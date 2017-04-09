package pl.lotko.type.tuple;

import lombok.Value;

@Value
public class QuadrupleValue<A, B, C, D> implements Quadruple<A, B, C, D> {
    A first;
    B second;
    C third;
    D fourth;

    @Override
    public Object[] values() {
        return new Object[] {first, second, third, fourth};
    }
}
