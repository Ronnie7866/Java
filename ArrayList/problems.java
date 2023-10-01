package ArrayList;

import java.util.ArrayList;

public class problems {

    static ArrayList sumOfTriplets(int[] arr){
        int n = arr.length;
        ArrayList ans = new ArrayList<>();
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == 0){
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list.addAll(list));
    }
}
