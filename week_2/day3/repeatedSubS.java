class Solution {
    public boolean repeatedSubstringPattern(String s) {
     int n = s.length();
        int upTo = (int) Math.ceil(Math.sqrt(n));
        for (int i = 1; i <= upTo; ++i) {
            if (n % i == 0) {
                if (i != n && check(s, s.substring(0, i)))
                    return true;
                int len = n / i;
                if (len != 1 && len != n && check(s, s.substring(0, len)))
                    return true;
            }
        }
        return false;
    }

    private boolean check(String s, String substr) {
        return s.endsWith(substr) && substr.repeat(s.length() / substr.length()).equals(s);
    }
}