class Solution {
    public boolean validDigit(int n, int x) {
       boolean temp=false;;
       boolean temp2=true;
      while(n >=10){
        int ld=n%10;
        if(ld==x){
            temp=true;
        }
        n/=10;
      }
      if(n==x){
        temp2=false;
      }

      return temp&& temp2;
    }
}