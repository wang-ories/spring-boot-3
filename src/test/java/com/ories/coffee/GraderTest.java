package com.ories.coffee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GraderTest {

    @Test
    void sixtyTwoShouldReturnD() {
        Grader grade = new Grader();
        var expected = 'E';

        var result = grade.determinGrade(62);

        assertEquals(expected, result);
    }

    @Test
    void seventyShouldReturnD() {
        Grader grade = new Grader();
        var expected = 'D';

        var result = grade.determinGrade(70);

        assertEquals(expected, result);
    }
    @Test
    void fiftyfiveShouldReturnF() {
        Grader grade = new Grader();
        var expected = 'F';

        var result = grade.determinGrade(55);

        assertEquals(expected, result);
    }
    @Test
    void eightyfiveShouldReturnC() {
        Grader grade = new Grader();
        var expected = 'C';

        var result = grade.determinGrade(85);

        assertEquals(expected, result);
    }

    @Test
    void ninetyOnefiveShouldReturnB() {
        Grader grade = new Grader();
        var expected = 'B';

        var result = grade.determinGrade(91);

        assertEquals(expected, result);
    }

    @Test
    void ninetySixShouldReturnA() {
        Grader grade = new Grader();
        var expected = 'A';

        var result = grade.determinGrade(96);

        assertEquals(expected, result);
    }

    @Test
    void negativeOneSixShouldReturnIllegalArgumentException() {
        Grader grade = new Grader();
        assertThrows(IllegalArgumentException.class, () ->{
            grade.determinGrade(-1);
        });

    }

}