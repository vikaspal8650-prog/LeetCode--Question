class Solution {
    public int largestInteger(int[] nums, int k) {
        int i=0;
        int j=k;
        int[] freq=new int[51];
        for(i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int max=-1;
        for( i=0;i<nums.length;i++){
            if(k==nums.length || (freq[nums[i]]==1 &&( (k==1)||i==0 ||i==nums.length-1 )))
              max=Math.max(nums[i],max);
        }
        return max;
    }
}