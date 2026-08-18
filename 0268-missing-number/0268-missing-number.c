int missingNumber(int* nums, int numsSize) {
    int sum=numsSize*(numsSize+1)/2;
    int t=0;
    for(int i=0;i<numsSize;i++){
        t+=nums[i];
    }
    return (sum-t);
}