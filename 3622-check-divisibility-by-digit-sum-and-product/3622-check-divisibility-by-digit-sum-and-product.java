class Solution {
    public boolean checkDivisibility(int n) {
       int sum=0;
       int ld=0;
       int org=n;
       long prod=1;
       while(n>0){
        ld=n%10;
        prod=prod*ld;
        sum=sum+ld;
        n/=10;
       }
       return org%(sum+prod)== 0;
    }
}