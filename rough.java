public class rough {

    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[smallest]) < 0) {
                    smallest = j;
                    // swap smallest and i
                    String temp = arr[i];
                    arr[i] = arr[smallest];
                    arr[smallest] = temp;
                }
            }
        }
    }

        static void insertionSort ( int[] arr){
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int j = i;
                while (j > 0 && arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
            }
        }

        static void merge(int[] arr, int left, int mid, int right){
             int n1 = mid-left+1;
             int n2 = right-mid;
             int[] first = new int[n1];
             int[] second = new int[n2];
             for (int i = 0; i < n1; i++) first[i] = arr[left+i];// 1 2 3 4 5 6 7 8 9
             for (int j = 0; j < n2; j++) second[j] = arr[mid+1+j];
             int i = 0, j = 0, k = left;
             while (i < n1 && j < n2) {
                 if (first[i] < second[j]) {
                     arr[k++] = first[i++];
                 } else {
                     arr[k++] = second[j++];
                 }
             }
                 while (i < n1){
                     arr[k++] = first[i++];
                 }
                 while (j < n2) {
                     arr[k++] = second[j++];
                 }
            }

        static void mergeSort(int[] arr, int left, int right){
        if (left >= right) return;
        int mid  = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
        }

        static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }

        static int partition(int[] arr, int start, int end) {
            int pivot = arr[start];
            int count = 0;
            for (int i = 1; i < end; i++) {
                if (arr[i] <= pivot) count++;
            }
            int pivotIndex = start + count;
            swap(arr,start,pivotIndex);

            int right = start, left = end;

            while(right < pivotIndex && left > pivotIndex){

                while(arr[right] <= pivot) right++;
                while(arr[left] > pivot) left--;

                if (right < pivotIndex && left > pivotIndex){
                    swap(arr,right,left);
                    right++;
                    left--;
                }
            }
            return pivotIndex;
        }

        static void countSort(int[] arr, int left, int right){
        if (left >= right) return;
        int PT = partition(arr, left, right);
        countSort(arr, left, PT-1);
        countSort(arr,PT+1,right);
        }

        public static void main (String[]args){
            int[] arr = {8,7,4,5,2,36,5,8,4,5,2,1};
            int n = arr.length;
            countSort(arr,0,n-1);
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    }