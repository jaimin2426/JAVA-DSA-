import java.util.*;

public class Maxareahistogram{

    public static int nslnsr(int num[]){
        int maxarea =0;
        int nsl[] = new int[num.length];
        int nsr[] = new int[num.length];
        
        // nsl
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<num.length;i++){
            while(!s.isEmpty() && num[s.peek()] >= num[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }


        // nsr
        s = new Stack<>();
        for(int i=num.length-1;i>=0;i--){
            while(!s.isEmpty() && num[s.peek()] >= num[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = num.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // calculate area  width = j-i-1 = nsr[i] - nsl[i] -1

        for(int i=0;i<num.length;i++){
            int height = num[i];
            int weidth = nsr[i] - nsl[i] - 1;

            int currarea = height * weidth;

            maxarea = Math.max(currarea, maxarea);
        }
        System.out.println("Max area of histogram is "+ maxarea);
        return maxarea;
    }

    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        System.out.println("Max area of histogram is "+ nslnsr(arr));
    }
}