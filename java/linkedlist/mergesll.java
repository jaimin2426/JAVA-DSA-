public class mergesll{
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

    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node h1,Node h2){
        Node mergell = new Node(-1);
        Node temp = mergell;

        while(h1 != null && h2 != null){
            if(h1.data <=h2.data){
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while(h1 != null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        } while(h2 != null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getmid(head);
        // leaf and right ms
        Node righthead = mid.next;
        mid.next = null;
        Node lefthead = mergeSort(head);
        Node nrighthead = mergeSort(righthead); 
        // merge
        return merge(lefthead,nrighthead);
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
        mergesll ll = new mergesll();
        ll.addfirst(5);
        ll.addfirst(3);
        ll.addfirst(8);
        ll.addfirst(1);
        ll.addfirst(4);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
    // merge two sorted linked list
}