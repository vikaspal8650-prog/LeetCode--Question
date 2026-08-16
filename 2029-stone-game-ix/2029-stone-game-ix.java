class Solution {
    public boolean stoneGameIX(int[] stones) {
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int num : stones){
            if(num%3==0)
            cnt0++;
            else if(num%3==1)
            cnt1++;
            else cnt2++;
        }
        if(cnt0%2==0){
            return cnt1>=1 && cnt2 >=1;
        }
        
           
       return Math.abs(cnt1-cnt2)>2;
    }
}