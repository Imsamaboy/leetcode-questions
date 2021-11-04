package two.pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    MoveZeros moveZeros = new MoveZeros();

    @Test
    void moveZeroes() {
        int[] nums = new int[]{0,1,0,3,12};
        int[] nums2 = new int[]{0};
        int[] nums3 = new int[]{0, 0, 0, 0, 1, 2, 0, 5};

        int[] result = new int[]{1, 3, 12, 0, 0};
        int[] result2 = new int[]{0};
        int[] result3 = new int[]{1, 2, 5, 0, 0, 0, 0, 0};
        assertArrayEquals(result, moveZeros.moveZeroes(nums));
        assertArrayEquals(result2, moveZeros.moveZeroes(nums2));
        assertArrayEquals(result3, moveZeros.moveZeroes(nums3));
    }
}