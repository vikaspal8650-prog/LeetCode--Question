class Solution {
   
    public List<Integer> findMissingElements(int[] nums) {
    ArrayList<Integer> ans=new ArrayList<>();
    HashSet<Integer> set=new HashSet<>();
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int num : nums){
        set.add(num);
        max=Math.max(max,num);
        min=Math.min(min,num);

    }
    while(min<=max){
        if( !set.contains(min))
        ans.add(min);
        min++;
    }
    return ans;
    }
}