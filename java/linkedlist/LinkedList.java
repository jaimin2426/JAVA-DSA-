/**
 * This Java class defines a LinkedList data structure with methods to add elements at the beginning
 * and end, and print the elements in the list.
 */
public class LinkedList{

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

    // add first
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

    // add last
    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        // System.out.println("Data insert at last: "+tail.data);
    }

    // add middle
    public void addmiddle(int data,int key){
        if(key == 0){
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        
        Node temp = head;
        int i = 0;
        while(key-1>i){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        // System.out.println("Data insert at "+key+" position: "+newnode.data);

    }

    // print linked list
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

    // remove first
    public int removef(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    
    // remove last
    public int removel(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // search 
    public int search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key ){
                return i;
            }
            temp = temp.next;
            i++;
        }
        
        return -1;
    }
    

    // search using recursion // O(n)
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }

    // reverse linkedlist  //(IMP) O(n)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //remove nth node from end //   O(n)
    public void removefromend(int n){
        // calculat size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
            return;
        }

        int i = 1;
        int idx = sz-n;
        Node prev = head;
        while(i  < idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // find middle node
    public Node middle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // palindrome
    public boolean ispalindrome(){
        if(head == null|| head.next == null){
            return true;
        }// find midle
        Node mid = middle();
        // reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // head of 2nd half
        Node left = head;// head of 1st half
        // check palindrome
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(5);
        ll.addlast(4);
        // ll.addmiddle(9,3);
        // ll.addmiddle(8,0);
        ll.print();
        // System.out.println("Size of a linkedlist: "+ll.size);
        // ll.removef();
        // ll.print();
        // System.out.println("Size of a linkedlist: "+ll.size);
        // ll.removel();
        // ll.print();
        // System.out.println("Size of a linkedlist: "+ll.size);
        // System.out.println("search normal way: "+ll.search(4));
        // System.out.println("search using recursion: "+ll.recsearch(4));
        // ll.reverse();
        // ll.print();

        // ll.removefromend(3);
        // ll.print();

        System.out.println(ll.ispalindrome());


    }
}