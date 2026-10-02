class Solution {
    public void help(int n,int open, int close, ArrayList<String> result,String str){
        if(str.length()==2*n){
            result.add(str);
             return;
        }
        if(open<n){
            help(n,open+1,close,result,str+"(");
        }
        if(close<open){
            help(n,open,close+1,result,str+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result=new ArrayList<>();
        help(n,0,0,result,"");
        return result;
    }
}