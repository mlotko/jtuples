package pl.lotko.type.tuple;

import lombok.Value;

@Value
public class MonupleValue<A> implements Monuple<A> {
    private final A first;

    @Override
    public Object[] values() {
        return new Object[] { first };
    }
}
