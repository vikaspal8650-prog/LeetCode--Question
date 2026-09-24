class Solution {
    public int countsum(int n){
        int sum=0;
        while(n >0){
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ans=countsum(nums[i]);
           if(ans==i) return i;
        }
        return -1;
    }
}