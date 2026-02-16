class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 0;

        for(String word : words){
            if(word.length() >= k){
                String sub = word.substring(0, k);
                hm.put(sub, hm.getOrDefault(sub, 0) + 1);
            }
        }

        for(String word : hm.keySet()){
            if(hm.get(word) > 1) count++;
        }

        return count;
    }
}