class Solution {
    public int minRotations(String s) {
     int ans=0;
     int diff=0;
     int temp0=0;
     for(int i=0;i<s.length();i++){
        int temp1=s.charAt(i)-'0';
        diff=Math.abs(temp0-temp1);
        ans+=Math.min(diff,10-diff);
        temp0=temp1;
     }  
     return ans; 
    }
}