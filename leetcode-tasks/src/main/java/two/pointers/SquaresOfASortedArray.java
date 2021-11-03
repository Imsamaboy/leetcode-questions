package two.pointers;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l < r) {
                result[index] = r;
                right -= 1;
            } else {
                result[index] = l;
                left += 1;
            }
            index -= 1;
        }
        return result;
    }
}
