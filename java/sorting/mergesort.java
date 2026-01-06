import java.util.*;
public class mergesort{

    public static void mergesort(int a[],int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(a,low,mid);
            mergesort(a, mid+1, high);
            merge(a,low,mid,high);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();

        }

        mergesort(a,0,n-1);



    }
}