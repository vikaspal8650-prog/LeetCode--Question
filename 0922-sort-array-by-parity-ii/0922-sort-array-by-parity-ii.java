class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int j=0;
        int i=1;
        int ans[]= new int[nums.length];
        for(int num : nums){
            if(num%2==0){
                ans[j]=num;
                j=j+2;
            }
            else{
                ans[i]=num;
                i=i+2;
            }
            
        }
       
        return ans;
    }
}