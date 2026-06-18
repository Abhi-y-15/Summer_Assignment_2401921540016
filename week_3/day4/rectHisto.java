class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length ;
        Stack<Integer> st = new Stack<>();
        int[]nextS = new int[n] ;
        nextS[n-1] = n;
        st.push(n-1) ;
        for(int i = n-2 ; i>=0 ;i--){
            while(st.size()!=0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nextS[i] = n ;
            }
            else{
                nextS[i] = st.peek();
            }
            st.push(i);
        }
        while(st.size()>0)st.pop();
        int[]prevS = new int[n] ;
        prevS[0] = -1 ;
        st.push(0);
        for(int i = 1 ; i<n ;i++){
            while(st.size()!=0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                prevS[i] = -1 ;
            }
            else{
                prevS[i] = st.peek();
            }
            st.push(i);
        }
        int maxA = 0;
        for(int i = 0;i<n;i++){
            int curA = arr[i]*(nextS[i]-prevS[i]-1) ;
            maxA = Math.max(maxA,curA);
        }
        return maxA ;
    }
}