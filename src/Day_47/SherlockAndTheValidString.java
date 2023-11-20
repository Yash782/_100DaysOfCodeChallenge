package Day_47;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-sherlock-and-valid-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-three
public class SherlockAndTheValidString {
    public static void main(String[] args) {
        String s = "abbc";
        System.out.println(isValid(s));
    }
    public static String isValid(String s) {
        // Write your code here
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int freq = charFreqMap.getOrDefault(c, 0);
            charFreqMap.put(c, ++freq);
        }

        int [] arr = new int[charFreqMap.size()];

        var entrySet = charFreqMap.values();
        int idx = 0;

        for (Map.Entry<Character, Integer> characterIntegerEntry : charFreqMap.entrySet()) {
            arr[idx++] = characterIntegerEntry.getValue();
        }

        Arrays.sort(arr);

        if(charFreqMap.size() == 1) return "YES";

        int first = arr[0];
        int second = arr[1];
        int last = arr[arr.length-1];
        int lastSecond = arr[arr.length -2];

        if(first == last) return "YES";

        if(first == 1 && second == last) return "YES";

        if(first == second && second == lastSecond && lastSecond == (last -1)) return "YES";

        return "NO";
    }
}
