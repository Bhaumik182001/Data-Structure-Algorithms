class Solution {
    void recursion(int n, int open, int close, String ans ,List<String> res){
        if(close == n){
            res.add(ans);
            return;
        }

        if(open < n) recursion(n, open + 1, close, ans + "(", res);
        if(open > close) recursion(n, open, close + 1, ans + ")", res);
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        recursion(n, 0, 0, "", res);
        return res;
    }
}