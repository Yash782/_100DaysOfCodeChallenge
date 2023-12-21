package Day_74;

import java.util.Arrays;

public class StringsAreClose {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1, word2));

    }
    public static boolean closeStrings(String word1, String word2) {
        int[]str1 = new int[26];
        int[]str2 = new int[26];
        for(char c: word1.toCharArray())
            str1[c - 'a']++;
        for(char c: word2.toCharArray()){
            str2[c - 'a']++;
            if(str1[c -'a']==0)
                return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0; i<26; i++){
            if (str1[i]!= str2[i])
                return false;
        }
        return true;
    }
}
