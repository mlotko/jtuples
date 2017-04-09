package pl.lotko.type.tuple

import spock.lang.Specification

import static pl.lotko.type.tuple.FactoryMethods.of;

class FactoryMethodsTest extends Specification {
    def "two arguments create a Pair"() {
        when:
        def pair = of("String", 123)

        then:
        pair instanceof Pair
        !(pair instanceof Triple)
        pair.first == "String"
        pair.second == 123
    }

    def "three arguments create a Triple"() {
        when:
        def triple = of("String", 123, 1.0)

        then:
        triple instanceof Triple
        !(triple instanceof Quadruple)
        triple.first == "String"
        triple.second == 123
        triple.third == new BigDecimal("1.0")
    }

}
