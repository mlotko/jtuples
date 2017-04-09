package pl.lotko.type.tuple

import spock.lang.Specification

class PairTest extends Specification {
    def "Of"() {
        when:
        def pair = TupleFactory.of("String", 123)

        then:
        pair instanceof Pair
        pair.first == "String"
        pair.second == 123
    }
}
