public class subtreeofanothertree{

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
    public static boolean isIdentical(Node root, Node subtree){
        if(root == null && subtree == null){
            return true;
        }else if(root == null || subtree == null || root.data != subtree.data){
            return false;
        }

        if(!isIdentical(root.left, subtree.left)){
            return false;
        } 
        if(!isIdentical(root.right, subtree.right)){
            return false;
        }
        return true;

    }

    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        boolean leftans = isSubtree(root.left, subroot);
        boolean rightans = isSubtree(root.right, subroot);
        return leftans || rightans;
    }

    public static void main(String args[]){
        /*        Constructing the following binary tree:
                            level
                  1           1
                /   \
              2     3         2
             / \   / \
            4  5  6  7        3
        */
              
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        // sub tree
        /*    2
             / \
            4   5
        */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        // subroot.right = new Node(5);
        
        System.out.println(isSubtree(root, subroot));
    }
}