import java.util.*;

public class merge{

    public static void mergesort(int arr[],int si,int ei){
        if(si<ei){
            int mid = si+(ei-si)/2;
            mergesort(arr, si, mid);//left part
            mergesort(arr, mid+1, ei);//right part 
            merge(arr,si,ei,mid);
        }
    }


    public static void merge(int arr[],int si,int ei,int mid){
        // left(0,3) = 4 //right (4,6) = 3 ---->  6-0 = 6 +1 = 7
        int temp[] = new int[ei-si+1];

        int i = si; //left part
        int j = mid+1;//right part
        int k = 0; //for temp arr

        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        // left
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // right
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        
        // temp to original arr
        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergesort(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }
}