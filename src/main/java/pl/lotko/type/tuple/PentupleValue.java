package pl.lotko.type.tuple;

import lombok.Value;

@Value
public class PentupleValue<A, B, C, D, E> implements Pentuple<A, B, C, D, E> {
    A first;
    B second;
    C third;
    D fourth;
    E fifth;

    @Override
    public Object[] values() {
        return new Object[] {first, second, third, fourth, fifth};
    }
}
