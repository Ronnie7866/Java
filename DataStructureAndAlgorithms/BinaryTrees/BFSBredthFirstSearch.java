package DataStructureAndAlgorithms.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSBredthFirstSearch {
    static class Node {
        int val;
        Node left;
        Node right;


        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            if (q.peek().left != null) q.add(q.peek().left);
            if (q.peek().right != null) q.add(q.peek().right);
            System.out.println(q.peek().val);
            q.poll();
        }
    }

    public static void main(String args[]) {
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
        bfs(root);
    }
}
