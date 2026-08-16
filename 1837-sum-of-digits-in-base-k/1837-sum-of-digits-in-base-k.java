class Solution {
    public int sumBase(int n, int k) {
       int ans=0;
       int i=0;
        int sum=0;
       while(n > 0){
        int ld=n %k;
        ans=ans+(int)Math.pow(10,i)*ld;
        i++;
        n/=k;
       } 
       while(ans > 0){
        sum=sum+ ans%10;
        ans/=10;
       }
       return sum;
    }
}