import binary.search.SearchInsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
    @Test
    void searchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        int[] nums1 = new int[]{1};
        int target = 5;
        int target1 = 2;
        int target2 = 7;
        int target3 = 0;
        int target4 = -100;
        assertEquals(2, searchInsertPosition.searchInsert(nums, target));
        assertEquals(1, searchInsertPosition.searchInsert(nums, target1));
        assertEquals(4, searchInsertPosition.searchInsert(nums, target2));
        assertEquals(0, searchInsertPosition.searchInsert(nums, target3));
        assertEquals(0, searchInsertPosition.searchInsert(nums, target4));
        assertEquals(0, searchInsertPosition.searchInsert(nums1, target3));
    }
}