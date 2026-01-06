public class kthAncestor{
    
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

    public static int kthAncestor(Node root, int n, int k) {
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftdistance  = kthAncestor(root.left, n, k);
        int rightdistance = kthAncestor(root.right, n, k);

        if(leftdistance == -1 && rightdistance == -1){
            return -1;
        }

        int max = Math.max(leftdistance, rightdistance);
        if(max +1 == k){
            System.out.println("The " + k + "th ancestor is: " + root.data);
        }
        return max + 1;
    }
    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \
             4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int k = 2;
        int node = 5;
        
        kthAncestor(root, node, k);
    }
}