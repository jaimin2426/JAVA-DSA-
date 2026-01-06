import java.util.*;

public class NGE{
    public static void main(String args[]){
        int a[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int Nge[] = new int[a.length];

        for(int i=a.length-1 ; i>=0;i--){
            while(!s.isEmpty() && a[s.peek()] <= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                Nge[i] = -1;
            }else{
                Nge[i] = a[s.peek()];
            }

            s.push(i);
        }
        for(int i=0;i<Nge.length;i++){
            System.out.print(Nge[i]+ " ");
        }


    }
}