
public class validbst{

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

    public static boolean isvalidbst(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.right.left = new Node(11);
        root.right.right = new Node(20);

        if(isvalidbst(root, null, null)){
            System.out.println("valid bst");
        }else{
            System.out.println("not a valid bst");
        }
    }
}