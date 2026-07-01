class Solution {
    public int equal012(String s) {
    
        HashMap<String, Integer> hm = new HashMap<>();
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count = 0;
        hm.put("0#0", 1);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') count0++;
            if(s.charAt(i) == '1') count1++;
            if(s.charAt(i) == '2') count2++;
            
            String temp = (count0 - count1) + "#" + (count1 - count2);
            
            if(hm.containsKey(temp)){
                count += hm.get(temp);
                hm.put(temp, hm.get(temp) + 1);
            } else {
                hm.put(temp, 1);
            }
        }
        
        return count;
    }
}