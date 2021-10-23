import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean containDuplicate = false;
        for (int i=0; i<nums.length; i++) {
            if (hm.get(nums[i]) != null) {
                containDuplicate = true;
                break;
            } else {
                hm.put(nums[i], 1);
            }
        }
        
        return containDuplicate;
    }
}
