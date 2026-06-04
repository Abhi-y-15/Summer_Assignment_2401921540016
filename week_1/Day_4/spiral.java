
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        int l= 0  ,r = m-1,t = 0, b = n-1 ;
        while(count < n*m){
            for(int i = l ;i<=r&& count < n * m;i++){
                ans.add(mat[t][i]);
                count++;
            }
            t++;
            for(int i = t ;i<=b&& count < n * m;i++){
                ans.add(mat[i][r]);
                count++;
            }
            r--;
            for(int i = r ;i>=l&& count < n * m;i--){
                ans.add(mat[b][i]);
                count++;
            }
            b--;
            for(int i = b;i>=t&& count < n * m;i--){
                ans.add(mat[i][l]);
                count++;
            }
            l++;
        }
        return ans ;
    }
}