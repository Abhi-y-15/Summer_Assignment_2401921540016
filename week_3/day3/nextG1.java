class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[]nextG = new int[n];
        nextG[n-1] = -1;
        st.push(nums2[n-1]);
        for(int i = n-2;i>=0;i--){
            while(st.size()!=0&&nums2[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0) nextG[i] = -1;
            else nextG[i] = st.peek();
            st.push(nums2[i]);
        }
        int[]ans = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i] = nextG[j];
                }
            }
        }
        return ans;
    }
}