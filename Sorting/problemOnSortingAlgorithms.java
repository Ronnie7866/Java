package Sorting;

public class problemOnSortingAlgorithms {

    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if (fruits[j].compareTo(fruits[minIndex]) < 0){
                    minIndex = j;
                }
            }
            // swap current element or minindex
            String temp = fruits[i];
            fruits[i] = fruits[minIndex];
            fruits[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"Mango", "Papaya", "Kiwi", "Orange"};
        sortFruits(fruits);
        for (String val : fruits){
            System.out.println(val + " ");
        }
    }
}
