
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}



// class Solution {
//     public List<List<String>> groupAnagrams(String[] s) {
//         HashSet<ArrayList<String>> set = new HashSet<>();
//         ArrayList<int[]> freqS = new ArrayList<>();
//         for(int i =0;i<s.length;i++){
//             int[]freq = new int[26];
//             for(int j = 0;j<s[i].length();j++){
//                 freq[s.charAt(j)-'a']++;
//             }
//             freqS.add(freq);
//         }
//         ArrayList<ArrayList<String>> ans = new ArrayList<>();
//         for(int i = 0;i<freqS.size();i++){
//             ArrayList<String> an = new ArrayList<>();
//             an.add(s[i]);
//             for(int j = 0;j<freqS.size();j++){
//                 if(Arrays.equals(freqS.get(i),freqS.get(j)&&i!=j){
//                     an.add(s[j]);
//                 }
//             }
//             set.add(an);
//         }
//         for(int i = 0;i<set.size();i++){
//             ans.add(set.get(i));
//         }
//         return ans;
//     }
// }