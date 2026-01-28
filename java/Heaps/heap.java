import java.util.*;

public class heap{

    static class Heap{
        ArrayList<Integer> ar = new ArrayList<>();

        public void add(int data){
            //add at last index
            ar.add(data);
            int x = ar.size()-1; // x is chile index
            int par = (x-1)/2;
            
            while(ar.get(x) < ar.get(par)){
                // swap
                int temp = ar.get(x);
                ar.set(x,ar.get(par));
                ar.set(par, temp);  

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return ar.get(0);
        }
        
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int min = i;

            if(left < ar.size() && ar.get(min) > ar.get(left)){
                min = left;
            }
            if(right < ar.size() && ar.get(min) > ar.get(right)){
                min = right;
            }

            if(min != i){
                // swap

                int temp = ar.get(i);
                ar.set(i,ar.get(min));
                ar.set(min,temp);

                heapify(min);
            }
        }
        public int remove(){
            int data = ar.get(0);
            // step1
            int temp = ar.get(0);
            ar.set(0,ar.get(ar.size()-1));
            ar.set(ar.size()-1,temp);

            // step 2delete lasrt
            ar.remove(ar.size()-1);

            // step 3 heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return ar.size() == 0;
        }
    }
    public static void main(String args[]){
        Heap hp = new Heap();
        hp.add(11);
        hp.add(1);
        hp.add(4);
        while(!hp.isEmpty()){
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}