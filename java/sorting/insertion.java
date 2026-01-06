import java.util.*;


public class insertion{

    public static void printarr(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void insertion(int a[]){
        int n = a.length;
        for(int i=1;i<n;i++){
            int current = a[i];
            int prev = i-1;
            // finding out the correct postion to insert  
            while(prev >= 0 && a[prev] > current){
                a[prev+1] = a[prev];
                prev--;
            }
            // innsert
            a[prev+1]= current; 
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        insertion(a);
        // Arrays.sort(a);   inbuilt function in java for sorting
        // Arrays.sort(a,0,3);   Arrays.sort(Arrayname, firstindex postion, last indexpostion)
        // Arrays.sort(a,Collections.reverseOrder());  it is work on only objects so replace with int to Integer
        // Arrays.sort(a,0,3,Collections.reverseOrder());   Arrays.sort(Arrayname, firstindex postion, last indexpostion,Collection.reverseOrdder())
        printarr(a);
    
        
    }
}