package two.pointers;

public class MoveZeros {
    public int[] moveZeroes(int[] nums) {
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < nums.length && pointer2 < nums.length) {
            if (nums[pointer1] != 0) {
                pointer1 += 1;
                pointer2 += 1;
            } else {
                if (nums[pointer2] != 0) {
                    nums[pointer1] = nums[pointer2];
                    nums[pointer2] = 0;
                    pointer1 += 1;
                    pointer2 = pointer1;
                } else {
                    pointer2 += 1;
                }
            }
        }
        return nums;
    }
}
