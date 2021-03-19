import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestResult {

    @DisplayName("#1 Return Value without rounded numbers")
    @Test
    public void testGradingStudents_ReturnValue() {
        List<Integer> result = Arrays.asList(4, 72, 65, 80, 90);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = Arrays.asList(72, 65, 80, 90);
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
        List<Integer> result = Arrays.asList(66, 73, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, calc);
    }
    @DisplayName("#4 First parameter too low!")
    @Test
    public void testGradingStudents_FirstParameterTooLow() {
        List<Integer> result = Arrays.asList(-1, 73, 67, 38, 33);
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
    @DisplayName("#8 Return Value with rounded numbers")
    @Test
    public void testGradingStudents_ReturnValueRoundedNumbers() {
        List<Integer> result = Arrays.asList(4, 73, 38, 88, 99);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = Arrays.asList(75, 40, 90, 100);
        assertEquals(expected, calc);
    }




}


