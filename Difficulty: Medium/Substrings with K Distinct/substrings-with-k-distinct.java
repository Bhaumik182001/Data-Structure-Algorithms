class Solution {
    
    public int atMost(String s, int k){
        if(k < 0) return 0;
        
        int[] alpha = new int[26];
        
        int count = 0;
        int uni = 0;
        int left = 0;
        
        for(int right = 0; right < s.length(); right++){
            if(alpha[s.charAt(right) - 'a'] == 0){
                uni++;
            }
            
            alpha[s.charAt(right) - 'a']++;
            
            while(uni > k){
                alpha[s.charAt(left) - 'a']--;
                
                if((alpha[s.charAt(left) - 'a']) == 0){
                    uni--;
                }
                left++;
            }
            
            count += (right - left) + 1;
        }
        
        return count;
    }
    
    public int countSubstr(String s, int k) {
        return atMost(s, k) - atMost(s, k - 1);
    }
}