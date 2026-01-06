import java.util.*;


public class selection{

    public static void printarr(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void selection(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int minele = i;
            for(int j=i+1;j<n;j++){
                if(a[minele]>a[j]){
                    minele = j; 
                }
            }

            int temp = a[minele];
            a[minele] = a[i];
            a[i] = temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        selection(a);
        printarr(a);
    
        
    }
}