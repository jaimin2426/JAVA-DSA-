import java.util.*;

public class stack{

    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
            System.out.println("pushed" + data);

        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1); 
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("top "+s.peek());
        System.out.println("removed "+s.pop());
        System.out.println("top"+s.peek());

        while(!s.isEmpty()){
            System.out.println("top"+s.peek());
            s.pop();
        }
        
    }
}