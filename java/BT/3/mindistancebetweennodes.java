// min distance between nodes
public class mindistancebetweennodes{
    
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

    public static int lcsdistance(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = lcsdistance(root.left, n);
        int rightdist = lcsdistance(root.right, n); 
        if(leftdist == -1 && rightdist == -1){
            return -1;
        }
        else if(leftdist == -1){
            return rightdist + 1;
        }else{
            return leftdist + 1;
        }
    }

    public static int mindist(Node root,int n1,int n2){
        Node lca = LCA2(root,n1,n2);
        int lca1 = lcsdistance(lca,n1);
        int lca2 = lcsdistance(lca,n2);
        return lca1 + lca2;
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

        int n1 = 4, n2 = 6;

        int distance = mindist(root, n1, n2);
        System.out.println("Minimum distance between nodes " + n1 + " and " + n2 + " is: " + distance);
    }
}