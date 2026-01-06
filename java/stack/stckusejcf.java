import java.util.*;

public class stckusejcf{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

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