class Solution { 
    public boolean ispallindrome(int num){
        int org=num;
        int rev=0;
        while(num >0){
            int ld=num%10;
            rev=rev*10+ld;
            num/=10;
        }
        if(rev== org){
            return true;
        }
        return false;
    }
    public boolean convert(int n ,int i){
        int ans=0;
        int j=0;
        while(n > 0){
            int ld= n%i;
             ans=ans+(int)Math.pow(10,j)*ld;
             j++;
             n/=2;
        }
       return ispallindrome(ans);
    }
    public boolean isStrictlyPalindromic(int n) {
        boolean ans=true;
        for(int i=2; i<n-1;i++){
            ans=ans & convert(n,i);
        }
        return ans;
    }
}