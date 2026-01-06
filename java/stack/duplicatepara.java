import java.util.*;

public class duplicatepara{

    public static boolean isvalide(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            // closing
            if(ch == ')'){
                int count = 0;
                while(st.peek() != '('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b)+(c+d))";
        String str2 = "((a+b))";
        System.out.println(isvalide(str2));
    }
}