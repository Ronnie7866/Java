package DataStructureAndAlgorithms.BinaryTrees;
import java.util.Queue;
import java.util.LinkedList;

public class constructTree {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static int height(Node root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
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

    public static Node constructBinaryTree(String[] arr){
        int x = Integer.parseInt(arr[0]);
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(x);
        q.add(root);
        int i = 1;
        while(i < arr.length-1){
            Node left = new Node(0);
            Node right = new Node(0);
            Node temp = q.remove();
            if (arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }

    public static void main(String[] args) {
        String[] arr = {"2","","3","","4","","5","","6"};
        Node root = constructBinaryTree(arr);
        int level = height(root) + 1;
        for (int i = 1; i <= level; i++){
            System.out.println();
            nthLevel(root,i);
        }
    }
}
