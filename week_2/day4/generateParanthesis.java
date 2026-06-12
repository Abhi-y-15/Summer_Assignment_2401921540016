import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        generate(n ,0,0,ans ,st);
        return ans ;
    }
    void generate(int n,int c,int o,List<String>ans,StringBuilder st){
        if(st.length()==2*n){
            ans.add(st.toString());
            return;
        }
        if(o<n){
            generate(n ,c,o+1,ans ,st.append('('));
            st.deleteCharAt(st.length() - 1);
        }
            
        if(c<o){
            generate(n ,c+1,o,ans ,st.append(')'));
            st.deleteCharAt(st.length() - 1);
        }
    }
}