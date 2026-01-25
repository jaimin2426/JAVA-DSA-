import java.util.*;

public class BST{

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

    public static Node insert(Node root, int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static boolean search(Node root, int key){
        if(root == null ){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
        
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int key){
        if(root.data < key){
            root.right = delete(root.right, key);
        }else if(root.data > key){
            root.left = delete(root.left, key);
        }else{ // voila case
            // .case 1 leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 3 both children
            Node IS = findinoerderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findinoerderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    // print in rangeg 
    public static void printinrange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        
        if(root.data >= k1 && root.data <= k2){
            printinrange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinrange(root.right, k1, k2);
        }
        else if(root.data <k1){
            printinrange(root.left, k1, k2);
        }else{
            printinrange(root.right, k1, k2);
        }
    }

    public static void printroottoleaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);   
        }
        printroottoleaf(root.left, path);
        printroottoleaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    

    public static void main(String args[]){
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        inorder(root);
        System.out.println();
        // System.out.println("" + search(root, 10));

        // root = delete(root, 8);
        // inorder(root);
        System.out.println();

        printinrange(root, 5, 12); 
        printroottoleaf(root, new ArrayList<>());
        
    }
}