package two.pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
    @Test
    void sortedSquares() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] nums1 = new int[]{-7,-3,2,3,11};
        int[] nums2 = new int[]{0};
        int[] nums3 = new int[]{-1, 1};

        int[] result = new int[]{0, 1, 9, 16, 100};
        int[] result1 = new int[]{4, 9, 9, 49, 121};
        int[] result2 = new int[]{0};
        int[] result3 = new int[]{1, 1};
        assertArrayEquals(result, squaresOfASortedArray.sortedSquares(nums));
        assertArrayEquals(result1, squaresOfASortedArray.sortedSquares(nums1));
        assertArrayEquals(result2, squaresOfASortedArray.sortedSquares(nums2));
        assertArrayEquals(result3, squaresOfASortedArray.sortedSquares(nums3));
    }
}