class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || nums[i] > nums[i-1]){
                int j = i + 1;
                int k = nums.length - 1;
                while(j<k){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ans.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[k]}));
                        while(j<k && nums[j+1] == nums[j]){
                            j++;
                        }
                        j++;
                        while(j<k && nums[k-1] == nums[k]){
                            k--;
                        }
                        k--;
                    }else if(nums[i] + nums[j] + nums[k] < 0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        
        return ans;
    }
}
