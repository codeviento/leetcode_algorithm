package easy;

public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int validCount = 0;

        for(int num: nums) {
            if (num != val) {
                nums[validCount++] = num;
            }
        }
        return validCount;
    }
}
