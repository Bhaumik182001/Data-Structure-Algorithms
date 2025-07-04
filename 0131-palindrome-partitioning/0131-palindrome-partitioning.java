class Solution {
    boolean isPalindrome(String s){
        int low= 0;
        int high = s.length() - 1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }

    void recursion(String s, int start, List<String> temp, List<List<String>> res){
        if(start == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < s.length(); i++){
            String substring = s.substring(start, i + 1);
            if(isPalindrome(substring)){
                temp.add(substring);
                recursion(s, i + 1, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        recursion(s, 0, temp, res);
        return res;
    }
}