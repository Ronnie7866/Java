package DataStructureAndAlgorithms.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxProfitInJobScheduling {

    static class Job {
        int Job_ID;
        int deadline;
        int profit;

        Job(int Job_ID, int deadline, int profit) {
            this.Job_ID = Job_ID;
            this.deadline = deadline;
            this.profit = profit;

        }

        public String toString() {
            return "JOB_ID " + this.Job_ID + " " + "DEADLINE " + this.deadline + " " +  "PROFIT " + this.profit;
        }
    }


    private static int maxProfit(Job[] arr, int maxDeadline) {
        int profit = 0;
        boolean[] visited = new boolean[maxDeadline];
        int[] isJobAvailable = new int[maxDeadline];
        for (int i = 0; i < arr.length; i++) {
            for (int j = Math.min(maxDeadline - 1, arr[i].deadline - 1); j >= 0; j--) {
                if (!visited[j]) {
                    visited[j] = true;
                    isJobAvailable[j] = arr[i].Job_ID;
                    break;
                }
            }
        }

        for (int i = 0; i < isJobAvailable.length; i++) {
            System.out.print(isJobAvailable[i] + " ");
        }
        for (int j = 0; j < isJobAvailable.length; j++) {
            if (isJobAvailable[j] >= 0) { // Check if a job is available at the current index
                int jobIndex = isJobAvailable[j];
                profit += arr[jobIndex].profit; // Accumulate the profit for the available job
            }
        }
        System.out.println();
        return profit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Job[] arr = new Job[9];
        for (int i = 0; i < arr.length; i++) {
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            Job job1 = new Job(id, deadline, profit);
            arr[i] = job1;
        }
        for (var i : arr) {
            System.out.println(i);
        }
        System.out.println();
        sc.close();
//        LambdaExpression
//        Arrays.sort(arr, (o1, o2) -> Integer.compare(o2.profit, o1.profit));
        Arrays.sort(arr, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                if (o1.profit < o2.profit) return 0;
                else return -1;
            }
        });


        for (var i : arr) {
            System.out.println(i);
        }

        int ans = maxProfit(arr, 7);
        System.out.println(ans);
    }
}

/*
        1 5 55
        2 2 65
        3 7 75
        4 3 60
        5 2 70
        6 1 50
        7 4 85
        8 5 68
        9 3 45
*/
