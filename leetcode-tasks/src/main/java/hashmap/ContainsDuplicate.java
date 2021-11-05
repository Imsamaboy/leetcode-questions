package hashmap;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            Integer curr = num;
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            } else {
                map.put(curr, 1);
            }
        }
        for (Integer value: map.values()) {
            if (value >= 2) {
                return true;
            }
        }
        return false;
    }
}
