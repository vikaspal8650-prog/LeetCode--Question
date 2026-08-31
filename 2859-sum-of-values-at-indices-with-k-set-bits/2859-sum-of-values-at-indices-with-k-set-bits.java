class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.size();i++){
            int j=i;
            count =0;
            while(j> 0){
                j=j&  (j-1);
                count++;
            }
            if(count==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}