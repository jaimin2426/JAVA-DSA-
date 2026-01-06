public class height_countnode_sum_tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int LH = height(root.left);
        int RH = height(root.right);
        return Math.max(LH, RH) + 1;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc+rc+1;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int lc = sum(root.left);
        int rc = sum(root.right);
        return lc+rc+root.data;
    }
    public static void main(String args[]){


        /*        Constructing the following binary tree:
                            level
                  1           1
                /   \
              2     3         2
             / \   / \
            4  5  6  7        3
               \   /  \
               10 9    8      4
        */
              
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.left.right.right = new Node(10);

        System.out.println("Height of the tree: " + height(root));
        System.out.println("Number of Nodes in the tree: "+ countNode(root));
        System.out.println("Sum of all nodes in the tree: "+ sum(root));

    }
}