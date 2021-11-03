import binary.search.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();
    @Test
    void search() {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int[] nums1 = new int[]{-1,0,3,5,9,12};
        int[] nums2 = new int[]{-1,0,3,5,9,12};
        int[] nums3 = new int[]{-1,0,3,5,9,12};
        int[] nums4 = new int[]{-1,0,3,5,9,12};
        int target = 9;
        int target1 = 12;
        int target2 = -1;
        int target3 = 40;
        int target4 = -100;
        assertEquals(4, binarySearch.search(nums, target));
        assertEquals(5, binarySearch.search(nums, target1));
        assertEquals(0, binarySearch.search(nums, target2));
        assertEquals(-1, binarySearch.search(nums, target3));
        assertEquals(-1, binarySearch.search(nums, target4));
    }
}