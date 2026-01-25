public class mirrorbst{
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

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftm = mirror(root.left);
        Node rightm = mirror(root.right);
        root.left = rightm;
        root.right = leftm;
        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        mirror(root);
        System.out.println("Mirrored BST Preorder:");
        preorder(root);
    }
}