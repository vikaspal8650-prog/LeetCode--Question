class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int l=0;
        int n=s.length();
        while(l<n &&s.charAt(l)==' ')
           l++;
        int sign=1;
        if(l<n && (s.charAt(l)=='-' || s.charAt(l)=='+')){
           if(s.charAt(l)=='-')
            sign=-1;
            l++;
        }

        while(l<n &&(Character.isDigit(s.charAt(l)))){
            char ch=s.charAt(l);
             ans=ans*10+(ch-'0');
             if( sign==1 && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
              if(sign==-1 && -ans < Integer.MIN_VALUE)
                  return Integer.MIN_VALUE;
              l++;    
        } 

        return (int)ans*sign;
    }
}