class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer>  temp=new ArrayList<>();
        ArrayList<List<Integer>> ans=new ArrayList<>();
        for(int num : nums2){
            set.add(num);
        }
        for(int num : nums1){
            if(!set.contains(num) && !temp.contains(num)){
                temp.add(num);
            }
            
        }
        ans.add(temp);
        temp=new ArrayList<>();
        set=new HashSet<>();
        for(int num : nums1) set.add(num);
        for(int num : nums2){
            if(!set.contains(num) && !temp.contains(num)){
                temp.add(num);
            }
        }
        ans.add(temp);
        return ans;
    }
}