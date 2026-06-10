import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        HashSet<Character>set = new HashSet<>();
        int j = 0 ;
        int maxLen = 0;
        for(int i = 0;i<s.length();i++){
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen ;
    }
}