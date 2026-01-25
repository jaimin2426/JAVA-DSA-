import java.util.*;

public class balancedbst{
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
    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public static void getinorder(Node root, ArrayList<Integer> inorderList){
        if(root == null){
            return;
        }
        getinorder(root.left, inorderList);
        inorderList.add(root.data);
        getinorder(root.right, inorderList);
    }

    public static Node balancedbst(Node root){
        // Step 1: Store inorder traversal of the BST in an array
        ArrayList<Integer> inorderList = new ArrayList<>();
        getinorder(root, inorderList);

        // Step 2: Create a balanced BST from the sorted array
        return createBST(inorderList, 0, inorderList.size() - 1);
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        Node balancedRoot = balancedbst(root);
        // Function to print preorder traversal of the balanced BST
        System.out.println("Preorder Traversal of Balanced BST:");
        preorder(balancedRoot);

    }
}