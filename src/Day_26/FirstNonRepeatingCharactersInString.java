package Day_26;
//https://prepinsta.com/java-program/to-find-non-repeating-characters-in-a-string/
public class FirstNonRepeatingCharactersInString {
    public static void main(String[] args) {
        String s = "Wadgaonkar";
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(repeatCheck(str.charAt(i), str)){
                System.out.println(str.charAt(i) + " is the first non repeating char");
                break;
            }
        }
    }
    public static boolean repeatCheck(char ch, String str){
        int count = 0;
        for (int i = 0; i <str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count <= 1;
    }
}
