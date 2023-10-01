package Heap;

import Arrays.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class insertionInHeap {

    private static void swap(ArrayList<Integer> arr, int l,int r){
    int temp = arr.get(l);
    arr.set(l, arr.get(r));
    arr.set(r, temp);
    }
    private static void push_up_in_MinHeap(ArrayList<Integer> heap, int i){
        // until correct position found / root reached
        int parent_index = (i-1)/2;
        if(i == 0 || heap.get(parent_index) < heap.get(i)) return;
        // swap
        swap(heap,parent_index,i);
        // compare with parent / recursive call on parent
        push_up_in_MinHeap(heap,parent_index);
    }

    public static void insertion_in_MinHeap(ArrayList<Integer> heap, int element){
        heap.add(element);
        int index = heap.size()-1;
        push_up_in_MinHeap(heap, index);
    }
    public static void insertionn_in_maxheap(ArrayList<Integer> heap, int element){
        heap.add(element);
        int index = heap.size()-1;
        push_up_in_MaxHeap(heap,index);
    }
    private static void push_up_in_MaxHeap(ArrayList<Integer> heap, int i){
        int parent_index = (i-1)/2;
        if(i == 0 || heap.get(parent_index) > heap.get(i)) return;
        swap(heap,parent_index,i);
        push_up_in_MaxHeap(heap,parent_index);
    }








    public static void Delete_from_Min_heap(ArrayList<Integer> heap){
        int last = heap.size()-1;
        swap(heap,0,last);
        heap.remove(last);
        push_down_in_MINHeap(heap,0);
    }

    private static void push_down_in_MINHeap(ArrayList<Integer> heap, int index){
        int n = heap.size()-1;
        if(index == n) return; // base case
        int left_child = (2*index)+1;
        int right_child = (2*index)+2;
        int smallest = index; // suppose this is smallest i,e,. (parent)
        if(left_child <= n && heap.get(left_child) < heap.get(smallest)){
            smallest = left_child;
        }
        if(right_child <= n && heap.get(right_child) < heap.get(smallest)){
            smallest = right_child;
        }
        if (index == smallest) return; // base case

        swap(heap,index,smallest);// swap

        push_down_in_MINHeap(heap,smallest);
    }

    public static void Delete_from_Maxheap(ArrayList<Integer> heap){
        int last = heap.size()-1;
        swap(heap,0,last);
        heap.remove(last);

        push_down_in_MaxHeap(heap,0);
    }

    public static void push_down_in_MaxHeap(ArrayList<Integer> heap, int index){
        int n = heap.size()-1;
        if(index == n) return; // base case

        int left_child = (2*index)+1;
        int right_child = (2*index)+2;
        int largest = index;
        if(left_child <= n && heap.get(left_child) > heap.get(largest)){
            largest = left_child;
        }
        if(right_child <= n && heap.get(right_child) > heap.get(largest)){
            largest = right_child;
        }
        if(index == largest) return;

        swap(heap,largest,index);
        push_down_in_MaxHeap(heap,largest);
    }

    private static void heapify_Min(ArrayList<Integer> arr){
        int n = arr.size()-1;
        int left_Node = arr.size()-1;// last leaf node ka first parent pakdo wahi first non leaf node hai
        int first_non_leaf_Node = (left_Node-1)/2;
        for(int i = first_non_leaf_Node; i >= 0; i--){
            push_down_in_MINHeap(arr,i);
        }
    }

    private static void heapify_Max(ArrayList<Integer> arr){
        int n = arr.size()-1;
        int leafNode = n;
        int firstLeafNode = (leafNode-1)/2;
        for (int i = firstLeafNode; i >= 0; i--){
            push_down_in_MaxHeap(arr,i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(10);
        heap.add(80);
        heap.add(50);
        heap.add(5);
        heap.add(20);
        heap.add(70);
        System.out.println(heap);
        heapify_Max(heap);
        System.out.println(heap);
    }
}
