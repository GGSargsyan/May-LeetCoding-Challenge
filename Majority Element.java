class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
            if(freq.get(i) > nums.length/2)
                return i;
        }
        return -1;
    }
}