import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        int m1=Integer.MIN_VALUE;
         int m2=Integer.MIN_VALUE;
          int m3=Integer.MIN_VALUE;
          
         
          HashSet<Integer> set=new HashSet<>();
          for(int num : nums){
            set.add(num);
          }
          for(int num : set){
            if(num > m1){
                m3=m2;
                m2=m1;
                m1=num;
            }
            else if(num > m2){
                m3=m2;
                m2=num;
            }
            else if(num > m3){
                m3=num;
            }
        
          }
         
          if(set.size()==2 || set.size()==1){
            return m1;
          }
          return m3;
    }
}