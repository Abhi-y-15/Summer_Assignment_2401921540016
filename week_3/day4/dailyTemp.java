class Solution {
    public int[] dailyTemperatures(int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[]nextG = new int[n];
        nextG[n-1] = n-1;
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
            while(st.size()!=0&&nums2[i]>=nums2[st.peek()]){
                st.pop();
            }
            if(st.size()==0) nextG[i] = i;
            else nextG[i] = st.peek();
            st.push(i);
        }
        int[]ans =  new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = nextG[i] - i;
        }
        return ans ;
    }
}