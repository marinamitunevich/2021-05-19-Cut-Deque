package telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    NumberService numbersService;

    @BeforeEach
    void setUp() {
        numbersService = new NumberService();
    }

    @Test
    void getMaxCoveredNumbers() {
        List<Integer> numbers = Arrays.asList(5,1,-10,-8,4,3);
        assertEquals(3,numbersService.getMaxCoveredNumbers(numbers,2));
    }
}