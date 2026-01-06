public class doublyll{

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }

        // Node temp = head;
        // while(temp.next != null){
        //     temp = temp.next;
        // }
        // temp.next = newnode;
        // newnode.prev = temp;

        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        
    }

    public int removefrist(){
        if(head == null){
            System.out.println("Lineked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removelast(){
        if(head == null){
            System.out.println("Lineked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        // while(temp.next.next != null){
        //     temp = temp.next;
        // }
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = temp.data;
        temp.next.prev = null;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next; 
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");

    }


    public static void main(String args[]){
        doublyll dll = new doublyll();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.addlast(6);
        dll.addlast(7);
        dll.print();

        // dll.removefrist();
        // dll.print();
        // dll.removelast();
        // dll.print();
        // dll.removelast();
        dll.reverse();
        dll.print();
        
    }
}