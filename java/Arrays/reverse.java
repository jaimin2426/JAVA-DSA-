public class reverse{

    public static void reverse(int a[]){
        int start =0, end= a.length-1;

        while(start < end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int a[] = {1,5,6,9,1,84,16,16,34};

        reverse(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}