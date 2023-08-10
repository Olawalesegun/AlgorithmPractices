package Algo1;

public class Ans1 {
    public int[] twoSum(int[] nums, int target) {
        int lengthOfArray = nums.length;
        int[] collector = new int[2];
        for(int firstCount=0; firstCount<lengthOfArray; firstCount++){
            for(int secondCount = firstCount + 1; secondCount<lengthOfArray; secondCount++){
                if((nums[firstCount] + nums[secondCount]) == target){
                    collector[0] = firstCount;
                    collector[1] = secondCount;
                }
            }
        }
        return collector;
    }
}
