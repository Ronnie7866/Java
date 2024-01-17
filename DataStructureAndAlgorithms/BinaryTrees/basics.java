package DataStructureAndAlgorithms.BinaryTrees;

public class basics {

    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node root){
        if (root == null) return;
        System.out.print(root.val+" -> ");
        if(root.left != null) System.out.print(root.left.val+" ");
        if (root.left == null) System.out.print("null ");
        if(root.right != null) System.out.print(root.right.val+" ");
        if (root.right == null) System.out.print("null ");
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void preOrderTraversal(Node root){ // pahle kaam phir call phir call -> ROOT LEFT RIGHT
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root){ // call phir kaam phir call -> LEFT ROOT RIGHT
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root){ // phir call phir call phir kaam -> LEFT RIGHT ROOT
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static int height(Node root){
        if (root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + height(root.left) + height(root.right);
    }

    public static int sum(Node root){
        if (root == null) return Integer.MIN_VALUE;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int max(Node root){
        if (root == null) return 0;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int size(Node root){
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static void printNthLevel(Node root, int n){
        if (root == null) return;
        if (n == 1){
            System.out.print(root.val + " ");
            return;
        }
        printNthLevel(root.left, n-1);
        printNthLevel(root.right, n-1);
    }

    public static void printOnlyLeft(Node root, int n){
        if (root == null) return;
        if (n == 1){
            System.out.print(root.val + " ");
            return;
        }
        printNthLevel(root.left, n-1);
        printNthLevel(root.right, n-1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(50);
        root.left = a;
        root.right = b;
        Node c = new Node(30);
        Node d = new Node(40);
        a.left = c;
        a.right = d;
        Node e = new Node(60);
        Node f = new Node(70);
        b.left = e;
        b.right = f;
        Node g = new Node(80);
        f.right = g;
//        for (int i = 0; i < height(root) + 1; i++){
//            printNthLevel(root,i);
//            System.out.println();
//        }

    }
}
