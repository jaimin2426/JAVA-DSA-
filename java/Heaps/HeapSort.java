public class HeapSort{

    // Time Complexity = O(n logn)

    public static void heapify(int arr[],int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;

        if(left < size && arr[left] > arr[max]){ // if you want data in discending order write < insted of >
            max = left;
        }
        if(right < size && arr[right] > arr[max]){ // if you want data in discending order write < insted of >
            max = right;
        }

        if(max != i){
            // swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr,max,size);
        }

    }
    
    public static void heapsort(int arr[]){
        // stpe 1 build max heap
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        // step 2 push largest at end
        for(int i=n-1;i>=0;i--){
            // swap largest first with last index 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }

    }    public static void main(String args[]){
        int arr[] = {1,2,4,5,3}; 

        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}