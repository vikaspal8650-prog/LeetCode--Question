class Solution {
    public boolean checkString(String s) {
       int n=s.length();
       int i=0;
       
        char ch=s.charAt(i);
        if(ch=='a'){
            while(i<n && s.charAt(i)=='a')
            i++;
        }
        while(i<n ){
            if(s.charAt(i)=='a')
            return false;
            i++;
        }
       return true;
    }
}