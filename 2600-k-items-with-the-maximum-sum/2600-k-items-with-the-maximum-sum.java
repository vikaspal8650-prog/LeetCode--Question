class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans=0;
        if(k<=numOnes){
            return k;
        }
         if(k>numOnes){
            ans=numOnes;
            k=k-numOnes;
            while(k>0 && numZeros>0){
                ans+=0;
                k--;
                numZeros--;
            }
            while(k>0 &&numNegOnes>0){
                ans+=-1;
                k--;
                numNegOnes--;
            }
        }
        return ans;
    }
}