class Solution {
    public boolean areNumbersAscending(String s) {
        int n=s.length();
        int i=0;
        int prev=-1;
        
        while(i<n){
            int ans=0;
            if(Character.isDigit(s.charAt(i))){
            while( i<n && Character.isDigit(s.charAt(i))){
                
                 ans=ans*10+(s.charAt(i)-'0');
                 i++;
            }
               
              if(ans <= prev){
                return false;
               }
            prev=ans;
        }
            i++;
        }
        return true;
    }
}