class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet <Integer> s= new HashSet<>();
        ArrayList <Integer> l= new ArrayList<>();
        for(int i : nums){
           if(s.contains(i) ){
              l.add(i);
           }
           s.add(i);
        }
        return l;
    }
}