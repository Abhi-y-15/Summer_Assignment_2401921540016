class Solution1 {
    public int firstUniqChar(String s) {
        if(s.length()==1)return 0;
        for(int i = 0;i<s.length()-1 ;i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch))
                return i;
        }
        return -1;
    }
}


class Solution2 {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}