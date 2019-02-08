class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap();
        for (int i = 0; i< nums.length; i++){
            int partner = target - nums[i];
            if(numbers.containsKey(partner) && numbers.get(partner) != i){
                return new int[]{i, numbers.get(partner)};
            }
            numbers.put(nums[i], i);
        }
        throw new IllegalArgumentException("Cannot find a solution !");
    }
}

