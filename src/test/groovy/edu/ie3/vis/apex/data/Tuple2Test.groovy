package edu.ie3.vis.apex.data

import spock.lang.Specification

class Tuple2Test extends Specification {

    def "A Tuple2 should return x correctly if requested to do so"() {
        given: "a valid tuple"
        Tuple2<Double, Double> testTuple = new Tuple2(2.0, 3.0)

        expect: "when x is requested, the correct x should be returned"
        testTuple.getX() == 2.0
    }

    def "A Tuple2 should return y correctly if requested to do so"() {
        given: "a valid tuple"
        Tuple2<Double, Double> testTuple = new Tuple2(2.0, 3.0)

        expect: "when y is requested, the correct x should be returned"
        testTuple.getY() == 3.0
    }

    def "Two valid tuples should always be compared against their x values"() {
        given: "two valid tuples in a list"
        Tuple2<Double, Double> testTuple1 = new Tuple2(100.0, 3.0)
        Tuple2<Double, Double> testTuple2 = new Tuple2(3.0, 3.0)
        ArrayList<Tuple2<Double,Double>> tupleList = new ArrayList<>()
        tupleList.add(testTuple1)
        tupleList.add(testTuple2)

        expect: "tuple order should be from smallest to biggest x"
        Collections.sort(tupleList)
        tupleList.get(0) == testTuple2
        tupleList.get(1) == testTuple1
    }

    def "Two valid tuples with the same values should be equal"() {
        given: "two valid, equal tuples"
        Tuple2<Double, Double> testTuple1 = new Tuple2(100.0, 3.0)
        Tuple2<Double, Double> testTuple2 = new Tuple2(100.0, 3.0)

        expect: "equals should return true"
        testTuple1.equals(testTuple2)

    }

    def "hashCode should be calculated correctly for a tuple "() {
        given: "a valid tuple"
        Tuple2<Double, Double> testTuple1 = new Tuple2(100.0, 3.0)

        expect: "equals should return true"
        testTuple1.hashCode() == 962923

    }
}
