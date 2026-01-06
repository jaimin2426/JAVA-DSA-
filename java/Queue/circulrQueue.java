public class circulrQueue{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return front ==  (rear + 1) % size;
        }

        public static void add(int data){
            if(isFull()){
                System.err.println("Queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data; 
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            int x = arr[front];

            if(rear == front){
                front = rear = -1;
            }else{      
                front = (front+1) % size;
            }
            
            return x;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    } 
    public static void main(String args[]){
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());       
        q.add(6);
    

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}