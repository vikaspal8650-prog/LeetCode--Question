class Solution {
    public double average(int[] salary) {
      int sum=0;
      int min=Integer.MAX_VALUE;
      int max=0;
      for(int num : salary){
        max=Math.max(max,num);
        min= Math.min(min,num);
        sum+=num;
      }
      int n=salary.length-2;
      return (double)(sum-min-max)/n;

    }
}