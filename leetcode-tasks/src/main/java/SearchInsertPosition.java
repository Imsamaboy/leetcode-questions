public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        // border cases
        if (target > nums[right]) return right + 1;
        if ((target < nums[left])) return 0;
        // if target is between two values
        while (left <= right) {
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) {
                right = mid;
            }
            if (target > nums[mid]) {
                if (left == mid) return mid + 1;
                left = mid;
            }
            mid = left + (right - left) / 2;
        }
        return mid + 1;
    }
}
