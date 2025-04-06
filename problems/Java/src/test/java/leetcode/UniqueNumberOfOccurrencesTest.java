package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrencesTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @Test
    public void testAllSameElement() {
        int[] input = {5, 5, 5, 5};
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(input));
    }

    @Test
    public void testUniqueElements() {
        int[] input = {1, 2, 3, 4};
        assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences(input));

    }

    @Test
    public void testNegativeNumbers() {
        int[] input = {-1, -2, -2, -1, -1, -3};
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(input));
    }

    @Test
    public void testDuplicateFrequencies() {
        int[] input = {1, 2, 2, 3, 3};
        assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences(input));
    }
}