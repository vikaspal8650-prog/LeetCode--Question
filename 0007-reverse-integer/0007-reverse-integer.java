class Solution {
    public int reverse(int x) {
      String s=x+"";
      int sign=1;
      int i=0;
      long ans=0;
      int n=s.length();
      if(i<n && (s.charAt(i)=='-')){
       sign=-1;
       i++;

      }
    while(i<n && sign==-1){
         char ch=s.charAt(n-i);
         ans=ans*10+(ch-'0');
         if(sign==-1 && -ans < Integer.MIN_VALUE)
         return 0;
        i++;
    }
       while(i<n ){
        char ch=s.charAt(n-1-i);
        ans=ans*10+(ch-'0');
        if(sign==1  && ans>Integer.MAX_VALUE)
         return 0;
         i++;
       }
       return (int)ans*sign;
    }
}