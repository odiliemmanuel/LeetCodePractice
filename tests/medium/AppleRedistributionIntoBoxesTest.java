package medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppleRedistributionIntoBoxesTest {


    @Test
    public void testThatApplesAreRedistributedIntoBoxesAndNumberOfBoxesUsedIsReturned() {
        int [] apple = {1, 3, 2};
        int [] capacity = {4, 3, 1, 5, 2};

        int result = AppleRedistributionIntoBoxes.findNumberOfBoxesRequiredForRedistribution(apple, capacity);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void testThatIfApplesAreRedistributed_AndResultIsNotEqualToTheSum_ResultBecomes_Minus_1(){
        int [] apple = {4, 5, 70, 4};
        int [] capacity = {4, 5, 7, 4};

        int result = AppleRedistributionIntoBoxes.findNumberOfBoxesRequiredForRedistribution(apple, capacity);
        int expected = -1;
        assertEquals(expected, result);
    }
}
