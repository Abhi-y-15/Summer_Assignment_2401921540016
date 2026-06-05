class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st = new StringBuilder();
        st.append(strs[0]);
        for(int i = 1;i<strs.length;i++){
            StringBuilder temp = new StringBuilder();
            int j = 0;
            while(j < st.length() && j < strs[i].length()&&st.charAt(j)==strs[i].charAt(j)){
                temp.append(strs[i].charAt(j));
                j++;
            }
            st.replace(0,st.length(), temp.toString());
        }
        return st.toString();
    }
}
