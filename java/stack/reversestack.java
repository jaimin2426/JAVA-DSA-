import java.util.*;

public class reversestack{
    public static void pushatbottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushatbottom(st, data);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushatbottom(st, top);
    }
    public static void printstack(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    public static void main(String ags[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        // printstack(st);
        reverseStack(st);
        printstack(st);
        
    }
}