class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";

        for(String word : words){
            int val = 0;  
            
            for(char c : word.toCharArray()){
                int index = (int)c - 97;
                val += weights[index];
            }
            
            val %= 26;
            val = 25 - val;
            char cha = (char)(97 + val);
            res += cha;
        }
        
        return res;
    }
}