class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int i=0;
       int j=1;
       int k=2;
       while(k<arr.length){
        if(arr[j]>arr[i] && arr[j] > arr[k]){
            return j;
        }
        i++;
        j++;
        k++;
       } 
       return -1;
    }
}