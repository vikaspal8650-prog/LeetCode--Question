class Solution {
    public int dominantIndex(int[] nums) {
      int max1=-1;
      int max2=-1;
      int idx=-1;
      for(int i=0;i<nums.length;i++){
        int x=nums[i];
        if(x > max1){
          max2=max1;
          max1=x;
          idx=i;
        }
        else if( x> max2){
            max2=x;
        }
      }

      if(max1 >= max2*2) return idx;  
      return -1;
    }
}