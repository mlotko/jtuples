package pl.lotko.type.tuple;

import lombok.Value;

@Value
public class TripleValue<A, B, C> implements Triple<A, B, C> {
    A first;
    B second;
    C third;

    @Override
    public Object[] values() {
        return new Object[] {first, second, third};
    }
}
