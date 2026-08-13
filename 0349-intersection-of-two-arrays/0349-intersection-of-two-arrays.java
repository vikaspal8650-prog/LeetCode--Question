class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int ans[]=new int[Math.min(nums1.length,nums2.length)];
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int i=0;
        // int j=0;
        // int k=0;
        // while(i < nums1.length && j < nums2.length){
        //     if(nums1[i] == nums2[j]){
        //         if(k==0 || ans[k-1] !=nums1[i]){
        //            ans[k]=nums1[i];
        //             k++;
        //         }
        //         j++;
        //         i++;
        //     }
        //     else if(nums1[i] < nums2[j]){
        //         i++;
        //     }
        //     else{
        //         j++;
        //     }

        // }
        // int arr[]= new  int[k];
        // for( i=0;i <k;i++){
        //     arr[i]=ans[i];
        // }
        // return arr;
        // 2nd approach
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num2 : nums2) set2.add(num2);
        set1.retainAll(set2);
        int[] arr=new int[set1.size()];
        int i=0;
        for(int k :set1){
            arr[i++]=k;
        }
       return arr;
    }
}