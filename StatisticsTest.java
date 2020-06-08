import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsTest {

    @Test
    public void testCalculateMax() {
        String expectedResult = "6";
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        String findMax = Statistics.calculateMax(numbers);
        assertEquals(expectedResult, findMax);
    }

    @Test
    public void testCalculateMin() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        String expectedResult = "1";
        String findMin = Statistics.calculateMin(numbers);
        assertEquals(expectedResult, findMin);
    }

    @Test
    public void testMedianWithEvenElements() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        String expectedResult = "3.5";
        String findMedian = Statistics.calculateMedian(numbers);
        assertEquals(expectedResult, findMedian);
    }

    @Test
    public void testMedianWithOddElements() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 90));
        String expectedResult = "3.0";
        String findMedian = Statistics.calculateMedian(numbers);
        assertEquals(expectedResult, findMedian);
    }

    @Test
    public void testMean() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        String expectedResult = "3.0";
        String findMean = Statistics.calculateAverage(numbers);
        assertEquals(expectedResult, findMean);

        ArrayList<Integer> emptyArray = new ArrayList<>(Arrays.asList());
        String nA = "n/a";
        String findNoMean = Statistics.calculateAverage(emptyArray);
        assertEquals(nA, findNoMean);
    }
}