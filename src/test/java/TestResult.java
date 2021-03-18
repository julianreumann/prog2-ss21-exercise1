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
        List<Integer> result = Arrays.asList(4, 73, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);
        assertEquals(expected, calc);
    }

    @DisplayName("#2 First parameter too high!")
    @Test
    public void testGradingStudents_FirstParameterTooHigh() {
        List<Integer> result = Arrays.asList(65, 73, 67, 38, 33);
        List<Integer> calc = Result.gradingStudents(result);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, calc);
    }
}


