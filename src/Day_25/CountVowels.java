package Day_25;
//prepinsta.com/java-program/count-the-number-of-vowels-in-a-string/
public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(countVowel(str));
    }
    static int countVowel(String s){
        int vowelCount = 0;
        String str = s.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowelCount ++;
            }
        }
        return vowelCount;
    }
}
