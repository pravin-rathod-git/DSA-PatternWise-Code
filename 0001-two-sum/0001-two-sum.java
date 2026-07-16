class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            int element=nums[i];
            int preSum=target-element;
            if(map.containsKey(preSum)){
                return new int []{i,map.get(preSum)};
            }
            map.put(element,i);
        }

        return new int []{};
    }
}