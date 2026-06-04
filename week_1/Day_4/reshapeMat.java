class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int x = mat.length;
        int y = mat[0].length;
        if((x*y) != (c*r)) return mat; 
        int[][]ans = new int[r][c];
        int[]temp = new int[x*y];
        int k = 0;
        for(int i = 0;i<x;i++){
            for(int j=0;j<y;j++){
                temp[k++] = mat[i][j];
            }
        }
        k = 0;
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j] = temp[k++];
            }
        }
        return ans ;
    }
}