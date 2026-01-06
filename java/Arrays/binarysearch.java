import java.util.Scanner;
public class binarysearch{

    public static int binary(int a[],int key){
        int start =0,end = a.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(key<a[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enetr "+n+" numbers");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter key for search");
        int key = sc.nextInt();
        int found = binary(a,key);

        if(found == -1){
            System.out.println("Element not found in your list!");
        }
        else{
            System.out.println("Element found index at: "+ found);
        }
    }
}