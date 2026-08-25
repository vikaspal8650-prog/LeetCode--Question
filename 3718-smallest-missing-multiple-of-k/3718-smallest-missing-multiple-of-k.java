class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        boolean vis[]=new boolean[101];
        for(int i : nums)
             vis[i]=true;
             int i=0;
          for( i=k;i<vis.length;i=i+k){
            if(!vis[i])
              return i;
          }
          return i;
    }
}