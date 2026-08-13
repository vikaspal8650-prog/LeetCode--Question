class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    
        int ans[]=new int[Math.min(nums1.length,nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                ans[k]=nums1[i];
                k++;
                j++;
                i++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }

        }
        int arr[]= new  int[k];
        for( i=0;i <k;i++){
            arr[i]=ans[i];
        }
        return arr;
       
    
    }
}