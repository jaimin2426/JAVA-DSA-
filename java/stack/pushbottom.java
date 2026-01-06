import java.util.*;

public class pushbottom{

    public static void pushatbottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        
        int top = st.pop();
        pushatbottom(st, data);
        st.push(top);

    }
    public static void main(String args[]){

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushatbottom(st, 4);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}