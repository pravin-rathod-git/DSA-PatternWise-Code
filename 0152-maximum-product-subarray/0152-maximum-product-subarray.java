class Solution {
    public int maxProduct(int[] nums) {
        int pre=1;
        int suff=1;
        int n=nums.length;
        int maxProduct=Integer.MIN_VALUE;
        

        for(int i=0;i<n;i++){
          pre*=nums[i];
          suff*=nums[n-i-1];
          maxProduct=Math.max(maxProduct,Math.max(pre,suff)); 
          if(pre==0) pre=1;
          if(suff==0) suff=1;          
        }
        if(maxProduct>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(maxProduct<Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return maxProduct;
    }
}