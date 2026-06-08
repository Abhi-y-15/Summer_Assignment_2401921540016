class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false ;
        int[]arr1 = new int[26];
        int[]arr2 = new int[26];
        for(int i =0;i<s.length();i++){
            for(int j =0;j<26;j++){
                if(s.charAt(i) == (char)(j+97)){
                    arr1[j] = arr1[j] +1;
                    break ;
                }
            }
            for(int j =0;j<26;j++){
                if(t.charAt(i) == (char)(j+97)){
                    arr2[j] = arr2[j] +1;
                    break;
                }
            }
        }
        for(int i = 0;i<26 ;i++){
            if(arr1[i]!=arr2[i]){
                return false ;
            }
        }
        return true ;
    }
}