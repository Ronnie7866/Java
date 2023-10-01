package BinaryTrees;
import java.util.*;
class printBoundaryOfTree{

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node constructTree(String[] arr){
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < arr.length-1; i=i+2) {
            Node left = new Node(0);
            Node right = new Node(0);
            Node temp = q.remove();
            if(arr[i].equals("n")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("n")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }

            temp.left = left;
            temp.right = right;
        }
        return root;
    }

    public static void nthLevel(Node root, int n){
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    public static int height(Node root){
        if((root == null) || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static void printB(Node root){
        leftB(root);
        bottomB(root);
        rightB(root.right);
    }

    public static void leftB(Node root){
        if (root == null) return;
        if(root.left == null && root.right == null) return;
        System.out.print(root.val + " ");
        if(root.left != null) leftB(root.left);
        else leftB(root.right);
    }

    public static void bottomB(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            System.out.print(root.val + " ");
            return;
        }
        bottomB(root.left);
        bottomB(root.right);
    }

    private static void rightB(Node root) {
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.right != null) rightB(root.right);
        else {
            rightB(root.left);
        }
        System.out.print(root.val  + " ");
    }

    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","n","6","7","n","8","n","9","10","n","11","n","12","n","13","n","14","15","16","n","17","n","n","18","n","19","n","n","n","20","21","22","23","n","24","25","26","27","n","n","28","n","n"};
        Node root = constructTree(arr);
        int level = height(root) + 1;
        for (int i = 1; i <= level; i++){
            System.out.println();
            nthLevel(root,i);
        }
        System.out.println();
        System.out.println();

        printB(root);
    }
}