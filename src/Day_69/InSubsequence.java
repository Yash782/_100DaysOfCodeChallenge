package Day_69;

public class InSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int c = 0, index = -1;
        for(int i = 0; i<s.length() ;i++) {
            c = 0;
            for(int j = index + 1 ; j<t.length() ;j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    index = j;
                    c = 1;
                    break;
                }
            }
            if(c == 0) {
                return false;
            }
        }
        return true;
    }
}
