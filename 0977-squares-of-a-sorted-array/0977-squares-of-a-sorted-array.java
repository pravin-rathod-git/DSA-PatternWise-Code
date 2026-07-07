class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;

        int i=r;

        int[] result=new int[nums.length];

        while(l<=r){
            int a=Math.abs(nums[l]);
            int b=Math.abs(nums[r]);

            if(a>b){
                result[i]=a*a;
                i--;
                l++;
            }else{
                result[i]=b*b;
                i--;
                r--;
            }
        }
        return result;
    }
}