class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);
        List<String> currentPath = new ArrayList<>();

        backtrack(0, s, dict, currentPath, result);

        return result;
    }

    private void backtrack(int start, String s, Set<String> dict, List<String> currentPath, List<String> result){
        if(start == s.length()){
            result.add(String.join(" ", currentPath));
            return;
        }

        for(int end = start + 1; end <= s.length(); end++){
            String prefix = s.substring(start, end);

            if(dict.contains(prefix)){
                currentPath.add(prefix);
                backtrack(end, s, dict, currentPath, result);
                currentPath.remove(currentPath.size() - 1);
            }
        }
    }
}