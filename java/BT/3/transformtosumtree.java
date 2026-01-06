// Transform to sum tree
public class transformtosumtree{
    
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

    public static int transform(Node root){
        
        if(root == null){
            return 0;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;

        int newleft = root.left != null ? root.left.data : 0;
        int newright = root.right != null ? root.right.data : 0;
        root.data = leftchild + rightchild + newleft + newright;
        return data;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]){
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

        transform(root);
        inorder(root); // Print inorder of the transformed sum tree

    }
}