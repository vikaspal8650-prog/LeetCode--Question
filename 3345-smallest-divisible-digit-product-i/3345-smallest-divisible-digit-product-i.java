class Solution {
    public int pro(int n){
        int ans=1;
        while(n>0){
            int ld=n%10;
            ans=ans*ld;
            n/=10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
      int p=1; 
      while(true){
       p=pro(n);
        if(p%t==0){
            return n;
            

        }
        n++;
      }  
    }
}