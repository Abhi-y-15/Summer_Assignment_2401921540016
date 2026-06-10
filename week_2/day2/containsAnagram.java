import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans  = new ArrayList<>();
        if(p.length()>s.length()) return ans ;
        int k = p.length();
        int[]freq1 = new int[26];
        int[]freq2 = new int[26];
        for(int i = 0;i<k;i++){
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq1,freq2)) ans.add(0);
        for(int i = k;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq1[s.charAt(i-k)-'a']--;
            if(Arrays.equals(freq1,freq2))
                ans.add(i-k+1);
        }
        return ans ;
    }
}