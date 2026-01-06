import java.util.*;

public class Diameter{

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

    public static int diameter(Node root){  // O(n^2)
        if(root == null){
            return 0;
        }
        int leftdiameter = diameter(root.left);
        int leftheight = height(root.left);
        int rightdiameter = diameter(root.right);
        int rightheight = height(root.right);

        int selfdaiameter = leftheight + rightheight + 1;
        return Math.max(selfdaiameter, Math.max(leftdiameter, rightdiameter));

    }


    static class Info{
        int daia;
        int height;
        public Info(int data,int height){
            this.daia = data;
            this.height = height; 
        }
    }
    
    public static Info daiameter2(Node root){ //O(n)
        if(root == null){
            return new Info(0,0);
        }
        Info leftinfo = daiameter2(root.left);
        Info rightinfo = daiameter2(root.right);

        int daia = Math.max(Math.max(leftinfo.daia, rightinfo.daia), leftinfo.height + rightinfo.height + 1);
        int height = Math.max(leftinfo.height, rightinfo.height) + 1;
        return new Info(daia, height);
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

        // System.out.println("Diameter of the tree is: " + diameter(root));
        System.out.println("Diameter of the tree is: " + daiameter2(root).daia);
        System.out.println("Height of the tree is: " + daiameter2(root).height);
        
    }
}