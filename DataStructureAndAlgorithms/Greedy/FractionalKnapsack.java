package DataStructureAndAlgorithms.Greedy;

import java.util.*;

public class FractionalKnapsack {
    static class Item {
        int weight;
        int profit;

        Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
        }

        public String toString() {
            return this.weight + " " + this.profit;
        }
    }
//    public static class Compare implements Comparator <Item> {
//        public int compare(Item a, Item b) {
//            if ((a.profit / a.weight) > (b.profit / b.weight)) {
//                return 1;
//            }
//            else return -1;
//        }
//    }
    public static void main(String[] args) {
        Item[] arr = new Item[7];
        //Compare c = new Compare();
        arr[0] = new Item(5, 25);
        arr[1] = new Item(10, 75);
        arr[2] = new Item(12, 100);
        arr[3] = new Item(4, 50);
        arr[4] = new Item(7, 45);
        arr[5] = new Item(9, 90);
        arr[6] = new Item(3, 30);

        for (var i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Collections.sort(list, c);
        Arrays.sort(arr, new Comparator<Item>(){
            @Override
            public int compare(Item a, Item b) {
                double item1 = Double.valueOf(a.profit / a.weight);
                double item2 = Double.valueOf(b.profit/b.weight);
                if (item1 < item2) {
                    return 1;
                }
                else return -1;
            }
        });

        for (var i : arr) {
            System.out.print(i + " ");
        }


        int capacity = 37;
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].weight <= capacity) {
                profit += arr[i].profit;
                capacity -= arr[i].weight;
            } else {
                // Calculate the fraction of the item that can fit
                double fraction = (double) capacity / arr[i].weight;
                profit += (int) (fraction * arr[i].profit);
                break;  // Break the loop as the knapsack is full
            }
        }
        System.out.println();
        System.out.println(profit);
    }
}
