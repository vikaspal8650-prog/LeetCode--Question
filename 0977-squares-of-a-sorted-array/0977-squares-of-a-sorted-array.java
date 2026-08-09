class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
       int i=0;
       int j=nums.length-1;
       int k=nums.length-1;

       while(i<=j){
        int left=nums[i]*nums[i];
        int right=nums[j]*nums[j];
        if(left>right){
            arr[k]=left;
            k--;
            i++;
        }
        else{
            arr[k]=right;
            k--;
            j--;
        }
       }
        return arr;
    }
}