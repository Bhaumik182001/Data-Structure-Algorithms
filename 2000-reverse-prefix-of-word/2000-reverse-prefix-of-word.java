class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        int index = 0;
        String res = "";
        boolean found = false;

        do {
            if(word.charAt(index) == ch) found = true;
            st.push(word.charAt(index++));    
        } while(index < word.length() && found == false);

        if(found == false) return word;

        while(!st.isEmpty()){
            res += st.pop();
        }

        while(index < word.length())
        res += word.charAt(index++);

        return res;
    }
}