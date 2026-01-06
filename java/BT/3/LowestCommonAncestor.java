
import java.util.ArrayList;

public class LowestCommonAncestor {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Approach 1: Using Path ArrayList
    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

        // Finding the last common node in both paths
        int i = 0;
        for(;i<path1.size() && i<path2.size() ;i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        Node lca = path1.get(i-1);
        return lca;
    }

    // Approcach 2: Optimized
    public static Node LCA2(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node lcaleft = LCA2(root.left, n1, n2);
        Node lcaright = LCA2(root.right, n1, n2);

        if(lcaright == null){
            return lcaleft;
        }
        if(lcaleft == null){
            return lcaright;
        }
        return root;
    }
    public static void main(String args[]) {
        /*        Constructing the following binary tree:
                  1
                /   \
              2      3
             / \    / \
            4   5  6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;

    // Approach 1: Using Path ArrayList
        Node lcaNode = lca(root, n1, n2);

        if (lcaNode != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lcaNode.data);
        } else {
            System.out.println("LCA not found.");
        }
        
    // Approach 2: Optimized
        Node lcaNode2 = LCA2(root, n1, n2);

        if (lcaNode2 != null) {
            System.out.println("LCA2 of " + n1 + " and " + n2 + " is: " + lcaNode2.data);
        } else {
            System.out.println("LCA not found.");
        }
    }
}