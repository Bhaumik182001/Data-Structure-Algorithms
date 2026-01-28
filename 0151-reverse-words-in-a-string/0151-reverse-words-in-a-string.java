class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(str));
        String st = String.join(" ", str);
        return st;
    }
}