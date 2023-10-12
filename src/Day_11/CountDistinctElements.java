package Day_11;

import java.util.ArrayList;

public class CountDistinctElements {
    public static void main(String[] args) {
        int [] arr = {10, 30, 40, 20, 10, 20, 50, 10};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(elementCheck(list, arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
    }

    static boolean elementCheck(ArrayList<Integer> list, int n){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == n){
                return false;
            }
        }

        return true;
    }

}
