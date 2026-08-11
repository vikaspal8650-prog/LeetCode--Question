class Solution {
    public int missingInteger(int[] nums) {
       
      int temp=nums[0];
      int tmp=nums[0];
      for(int i=1;i<nums.length;i++){
         tmp++;
        if(tmp==nums[i]){
            temp+=nums[i];
        }
        else{
            break;
        }
      }
      HashSet<Integer> set=new HashSet<>();
      for(int num :nums){
        set.add(num);
      }
      while(true){
        if(!set.contains(temp)){
            return temp;
        }
        temp++;
      }
      

    }
}