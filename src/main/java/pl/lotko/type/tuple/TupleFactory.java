package pl.lotko.type.tuple;

import java.util.Collection;

class TupleFactory {
    public Tuple of(Object[] values) {
        switch (values.length) {
            case 2:
                return Pair.of(values[0], values[1]);
            case 3:
                return Triple.of(values[0], values[1], values[2]);
            case 4:
                return Quadruple.of(values[0], values[1], values[2], values[3]);
            case 5:
                return Pentuple.of(values[0], values[1], values[2], values[3], values[4]);
            default:
                throw new IllegalArgumentException(String.format("Cannot represent array of %s elements with tuples."));
        }
    }
}
