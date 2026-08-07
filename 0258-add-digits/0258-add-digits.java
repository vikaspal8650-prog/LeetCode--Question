class Solution {
    public int helper(int n){
        int ans=0;
        while(n>0){
            int ld=n%10;
            ans=ans+ld;
            n/=10;
        }
        return ans;
    }
    public int addDigits(int num) {
        int ans=0;
      while(true){
        
        String s=num+"";
        if(s.length()==1){
            return num;
        }
        num=helper(num);

      }  
      
    }
}