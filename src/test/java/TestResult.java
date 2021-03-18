import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestResult {
    @BeforeAll
    static void init() {
    }

    @BeforeEach
    void setUp() {
    }

    @DisplayName("#1 difference between grades")
    @Test
    public void testGradingStudents_DifferenceGrades() {
        List<Integer> result = Arrays.asList(4, 73, 67, 84, 88);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = Arrays.asList(75, 67, 85, 90);
        assertEquals(expected, calc);
    }
    @DisplayName("#2 value of grades less 38")
    @Test
    public void testGradingStudents_ValueOfGradesLess38() {
        List<Integer> result = Arrays.asList(4, 33, 24, 12, 13);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = Arrays.asList(33, 24, 12, 13);
        assertEquals(expected, calc);
    }

    @DisplayName("#3 First parameter too high!")
    @Test
    public void testGradingStudents_FirstParameterTooHigh() {
        List<Integer> result = Arrays.asList(-1, 73, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, calc);
    }
    @DisplayName("#4 First parameter too low!")
    @Test
    public void testGradingStudents_FirstParameterTooLow() {
        List<Integer> result = Arrays.asList(61, 73, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, calc);
    }

    @DisplayName("#5 Grades too high")
    @Test
    public void testGradingStudents_GradesTooHigh() {
        List<Integer> result = Arrays.asList(4, 101, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = Arrays.asList(null,67,40,33);
        assertEquals(expected, calc);
    }
    @DisplayName("#6 Grades too low")
    @Test
    public void testGradingStudents_GradesTooLow() {
        List<Integer> result = Arrays.asList(4, -5, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = Arrays.asList(null,67,40,33);
        assertEquals(expected, calc);
    }


    @DisplayName("#7 Size of array while transformation")
    @Test
    public void testGradingStudents_SizeOfArrayWhileTransformation() {
        List<Integer> result = Arrays.asList(4, 33, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected =Arrays.asList(33, 67, 40, 33);
        assertEquals(expected.size(), calc.size());
    }





}


