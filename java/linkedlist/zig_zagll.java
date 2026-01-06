public class zig_zagll{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        // System.out.println("Data insert at first: "+head.data);
    }

    
    private void zigzag(){
        //  find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        
        // reverse second half
        Node curr = mid.next;
        mid.next =  null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternate merging 
        Node left = head;
        Node right = prev;
        Node nextleft, nextright;

        while(left != null && right != null){
            nextleft = left.next;
            left.next = right;
            nextright = right.next;
            right.next = nextleft;

            left = nextleft;
            right = nextright;

        }
    }


    public void print(){
        if(head == null){
            System.out.println("Llinked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("---------------------");
    }



    public static void main(String[] args) {
        zig_zagll ll = new zig_zagll();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(6);
        ll.print();
        
        ll.zigzag();
        ll.print();
    }
    // merge two sorted linked list
}