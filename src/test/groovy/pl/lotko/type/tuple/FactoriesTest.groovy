package pl.lotko.type.tuple

import spock.lang.Specification

import java.time.LocalDate
import java.time.Month

import static pl.lotko.type.tuple.Factories.*

class FactoriesTest extends Specification {
    def "nothing tuple can be created as well"() {
        when:
        def unit = unitSupplier()

        then:
        unit instanceof Tuple
        !(unit instanceof Monuple)
        unit.values().length == 0

        where:
        unitSupplier << [
                { tupleOfNothing() },
                { tuplize(new Object[0]) },
                { tuplize([]) },
        ]
    }

    def "one argument create a Monuple"() {
        when:
        def monuple = monupleSupplier()

        then:
        monuple instanceof Monuple
        !(monuple instanceof Pair)
        monuple.first == "String"
        Object[] values = monuple.values()
        values.length == 1
        values[0] == "String"

        where:
        monupleSupplier << [
                { tupleOf("String") },
                { tuplize(["String"])},
                { tuplize(["String"] as String[])}
        ]
    }


    def "two arguments create a Pair"() {
        when:
        def pair = pairSupplier()

        then:
        pair instanceof Pair
        !(pair instanceof Triple)
        pair.first == "String"
        pair.second == 123
        Object[] values = pair.values()
        values.length == 2
        values[0] == "String"
        values[1] == 123

        where:
        pairSupplier << [
                {tupleOf("String", 123)},
                {tuplize(["String", 123])},
                {tuplize(["String", 123] as Object[])},
        ]
    }

    def "three arguments create a Triple"() {
        when:
        def triple = tripleSupplier()

        then:
        triple instanceof Triple
        !(triple instanceof Quadruple)
        triple.first == "String"
        triple.second == 123
        triple.third == new BigDecimal("1.0")
        Object[] values = triple.values()
        values.length == 3
        values[0] == "String"
        values[1] == 123
        values[2] == 1.0

        where:
        tripleSupplier << [
                {tupleOf("String", 123, 1.0)},
                {tuplize(["String", 123, 1.0])},
                {tuplize(["String", 123, 1.0] as Object[])}
        ]
    }

    def "four args generate a Quadruple"() {
        when:
        def quadruple = quadrupleSupplier()

        then:
        quadruple instanceof Quadruple
        !(quadruple instanceof Pentuple)
        quadruple.first == "String"
        quadruple.second == 123
        quadruple.third == 456L
        quadruple.fourth == 1.0d
        Object[] values = quadruple.values()
        values.length == 4
        values[0] == "String"
        values[1] == 123
        values[2] == 456L
        values[3] == 1.0d

        where:
        quadrupleSupplier << [
                {tupleOf("String", 123, 456L, 1.0d)},
                {tuplize(["String", 123, 456L, 1.0d])},
                {tuplize(["String", 123, 456L, 1.0d] as Object[])}
        ]
    }

    def "five args generate a Pentuple"() {
        when:
        def pentuple = pentupleSupplier()

        then:
        pentuple instanceof Pentuple
        pentuple.first == "String"
        pentuple.second == 123
        pentuple.third == 456L
        pentuple.fourth == 1.0d
        pentuple.fifth.year == 2017
        pentuple.fifth.month == Month.APRIL
        pentuple.fifth.dayOfMonth == 9
        Object[] values = pentuple.values()
        values[0] == pentuple.first
        values[1] == pentuple.second
        values[2] == pentuple.third
        values[3] == pentuple.fourth
        values[4] == pentuple.fifth

        where:
        pentupleSupplier << [
                {tupleOf("String", 123, 456L, 1.0d, LocalDate.of(2017, Month.APRIL, 9))},
                {tuplize(["String", 123, 456L, 1.0d, LocalDate.of(2017, Month.APRIL, 9)])},
                {tuplize(["String", 123, 456L, 1.0d, LocalDate.of(2017, Month.APRIL, 9)] as Object[])}
        ]
    }

    def "six element tuples are not supported"() {
        when:
        overflow()

        then:
        thrown IllegalArgumentException

        where:
        overflow << [
                {tuplize([1, 2, 3, 4, 5, 6] as Object[])},
                {tuplize([1, 2, 3, 4, 5, 6])}

        ]
    }
}
