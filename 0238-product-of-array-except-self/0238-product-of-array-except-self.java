class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] pre=new int[nums.length];
       pre[0]=1;
       int[] suf=new int[nums.length];
       int n=nums.length-1;
    suf[n]=1;

       for(int i=1;i<nums.length;i++){
        pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        for(int i=0;i<=n;i++){
            nums[i]=suf[i]*pre[i];
        }
         
       return nums;
    }
}