
import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> c = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();
        int num = 0;
        StringBuilder curS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                c.push(num);
                st.push(curS);

                num = 0;
                curS = new StringBuilder();
            }

            else if (ch == ']') {
                int repeat = c.pop();
                StringBuilder prev = st.pop();

                for (int j = 0; j < repeat; j++) {
                    prev.append(curS);
                    
                }
                curS = prev;
            }
            else{
                curS.append(ch);
            }

        }
        return curS.toString();

    }
}
