class Solution {
    public int minPairSum(int[] nums) {
     Arrays.sort(nums);
     int i=0;
     int j=nums.length-1;
     int min=Integer.MIN_VALUE;
     while(i<j){
       min=Math.max(min,nums[i]+nums[j]);
       i++;
       j--;
     }   
     return min;
    }
}