class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ans = new ArrayList<>();
        int n = words.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                for(int k = 0; k < n; k++){
                    if(k == i || k == j) continue;
                    for(int l = 0; l < n; l++){
                        if(l == i || l == j || l == k) continue;
                        String top = words[i];
                        String left = words[j];
                        String right = words[k];
                        String bottom = words[l];

                        if(top.charAt(0) == left.charAt(0) && 
                           top.charAt(3) == right.charAt(0) &&
                           right.charAt(3) == bottom.charAt(3) &&
                           left.charAt(3) == bottom.charAt(0)){
                            ans.add(Arrays.asList(top, left, right, bottom));
                           }
                    }
                }
            }
        }

        ans.sort((a, b) -> a.toString().compareTo(b.toString()));

        return ans;
    }
}