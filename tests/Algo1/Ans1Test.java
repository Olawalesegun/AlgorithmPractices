package Algo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ans1Test {

    @Test
    public void testThatWhenIPassAnArrayWithFourElementsICanStillGetResult(){
        //Given
        Ans1 ans = new Ans1();
        int[] arrVal = {2,7,11,15};
        int numVal = 18;
        int result[] = ans.twoSum(arrVal, numVal);
        assertEquals(numVal, result.toString());

        //When

        //assert
    }


    public void testThatWhenIPassAnArrayWithThreeElementsICanStillGetResult(){
        //Given
        Ans1 ans = new Ans1();
        int[] arrVal = {3, 2, 4};
        int numVal = 6;
        int result[] = ans.twoSum(arrVal, numVal);
        assertEquals(numVal, result.toString());
        //When

        //assert
    }

/*    public void testThatWhenIPassAnArrayWithTwoElementsICanStillGetResult(){
        //Given

        //When
        [3, 3]
        //assert
    }*/
}