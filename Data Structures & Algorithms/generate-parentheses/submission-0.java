class Solution {
    public List<String> generateParenthesis(int n) {
        /**
        open parantheses < n since it is the max we can insert
        close parantheses < open parantheses (since for well-formed parentheses its always opening come first )
        stop when open = close = n
        use backtracking to obtain a result
         */
        List<String> res = new ArrayList<>();
        backtrack(res, "" , 0, 0, n);
        return res;
    }
    public void backtrack(List<String> res, String str, int open, int close, int n){
        if(open == n && close == n){
            res.add(str);
            return;
        }
        if(open < n){
            backtrack(res, str + "(", open+1, close, n);
        }
        if(close< open){
            backtrack(res, str + ")", open, close+1, n);
        }
    }
}