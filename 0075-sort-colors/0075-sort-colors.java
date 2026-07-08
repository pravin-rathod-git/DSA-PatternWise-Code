class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0;
        int mid=0;
        int h=n-1;
        while(mid<=h){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[l];
                nums[l]=temp;
                l++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[h];
                nums[h]=temp;
                h--;
            }
        }

    }
}