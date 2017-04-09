package pl.lotko.type.tuple;

public final class UnitValue implements Tuple {
    private static final Object[] NO_VALUES = new Object[0];

    @Override
    public Object[] values() {
        return NO_VALUES;
    }
}
