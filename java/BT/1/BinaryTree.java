import java.util.*;

public class BinaryTree{

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.right=null;
            this.left=null;
        }
    }

    static class binarytree{
        static int idx = -1;
        public static Node buildetree(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newnode = new Node(node[idx]);
            newnode.left = buildetree(node);
            newnode.right = buildetree(node);

            return newnode;
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        } 
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                } else{
                    System.out.print(curr.data+" ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.buildetree(node);
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                tree.preorder(root);
                break;
            case 2:
                tree.inorder(root);
                break;
            case 3:
                tree.postorder(root);
                break;
            case 4:
                tree.levelorder(root);
                break;
            default:
                throw new AssertionError();
        }        
    }
}