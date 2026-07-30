class Solution {
    public int minimumPushes(String word) {
       int n=word.length();
       int ans=0;
       if(n<=8){
        ans=n;
       }
      else if(n<=16){
        ans=8;
        n=n-8;
        ans+=n*2;
       } 
     else  if(n<=24){
        ans=8;
        n=n-8;
        int k=n-8;
        ans+=k*3;
        ans+=8*2;
       }
     else  if(n>24){
        ans+=8;
        ans+=8*2;
        ans+=8*3;
        int k=n-24;
        ans+=k*4;
     }
     return ans;
    }
}