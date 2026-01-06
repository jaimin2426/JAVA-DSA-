public class mejority{

    public static int partition(int num[],int low,int high){
        int pivot = num[high];
        int i = (low-1);
        for(int j=low;j<high;j++){
            if(num[j]<=pivot){
                i++;
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        int temp = num[i+1];
        num[i+1] = num[high];
        num[high] = temp;

        return (i+1);
    }
    public static void sort(int num[],int low,int high){
        if(low<high){
            int pivot = partition(num,low,high);
            sort(num,low,pivot-1);
            sort(num,pivot+1,high);
        }
    }
    public static int mejority(int num[]){
        int n = num.length;
        sort(num,0,n-1);
        int candidate = num[n/2];
        int feq = 0;
        for(int x:num){
            if(x == candidate){
                feq++;
            }
        }
        if(feq>n/2){
            return candidate;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,2,1,1,1,2,2};
        int mejor = mejority(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.err.print(arr[i]+" ");
        // }
        System.out.println(mejor);
    }
}