package pl.lotko.type.tuple

import spock.lang.Specification

class TripleTest extends Specification {
    def "Of"() {
        when:
        def triple = Triple.of("String", 123, 1.0)

        then:
        triple instanceof Triple
        triple.first == "String"
        triple.second == 123
        triple.third == new BigDecimal("1.0")
    }
}
