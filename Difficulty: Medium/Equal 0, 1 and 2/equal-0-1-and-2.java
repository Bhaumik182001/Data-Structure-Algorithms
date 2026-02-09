class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    {
        HashMap<String, Integer> hm = new HashMap<>();
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        long ans = 0;
        
        String key = "0#0";
        hm.put(key, 1);
        
        for(char c : str.toCharArray()){
            if(c == '0') count0++;
            if(c == '1') count1++;
            if(c == '2') count2++;
            
            key = (count1 - count0) + "#" + (count2 - count1);
            
            if(hm.containsKey(key)){
                ans += hm.get(key);
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }
        
        return ans;
    }
} 