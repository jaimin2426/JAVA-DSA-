public class sizeoflargestbst{
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static class info{
        boolean isBst;
        int size;
        int min;
        int max;
        info(boolean isBst, int size, int min, int max){
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxbst = 0;
    public static info largestbst(Node root){
        if(root == null){
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info infoleft = largestbst(root.left);
        info inforight = largestbst(root.right);
        int size  = infoleft.size + inforight.size + 1;
        int min = Math.min(root.data, Math.min(infoleft.min, inforight.min));
        int max = Math.max(root.data, Math.max(infoleft.max, inforight.max));

        if(root.data <= infoleft.max || root.data >= inforight.min){
            return new info(false, size, min, max);
        }
        if(infoleft.isBst && inforight.isBst){
            maxbst = Math.max(maxbst, size);
            return new info(true, size, min, max);
        }   
        return new info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        info in = largestbst(root);
        System.out.println("Size of largest BST is: " + maxbst);

    }
}