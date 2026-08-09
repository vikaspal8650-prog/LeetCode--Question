class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
       int[] ans=new int[j+1];
       for(int num : nums){
        if(num%2==0){
            ans[i]=num;
            i++;
        }
        else{
            ans[j]=num;
            j--;
        }
       }
        return ans;
    }
}