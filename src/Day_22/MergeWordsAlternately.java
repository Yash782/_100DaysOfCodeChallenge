package Day_22;
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeWordsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));

    }
    public static String mergeAlternately(String word1, String word2) {
        String res="";
        int min=Math.min(word1.length(),word2.length());
        if(min==word1.length()){
            for(int i=0;i<min;i++){
                res+=word1.charAt(i);
                res+=word2.charAt(i);
            }
            res+=word2.substring(word1.length());
        }else{
            for(int i=0;i<min;i++){
                res+=word1.charAt(i);
                res+=word2.charAt(i);
            }
            res+=word1.substring(word2.length());
        }
        return res;
    }
}
