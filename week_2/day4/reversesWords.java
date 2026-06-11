 class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i =0;i<words.length;i++){
            int n = words[i].length();
            StringBuilder ans = new StringBuilder();
            for(int j = n-1;j>=0;j--){
                ans.append(words[i].charAt(j));
            }
            words[i] = ans.toString();
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<words.length-1 ;i++){
            ans.append(words[i]);
            ans.append(" ");
        }
        ans.append(words[words.length-1]);
        return ans.toString();
    }
}