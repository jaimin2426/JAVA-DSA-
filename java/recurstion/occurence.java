public class occurence{

    public static int firstoccu(int arr[],int i,int key){
        if(arr.length==i){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstoccu(arr,i+1,key);
    }

    public static int lastoccu(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isfound = lastoccu(arr, i+1, key);       
        if(isfound == -1 && arr[i]==key){
            return i;
        }
    
        return isfound;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,2,5,4,2,7};
        int target = 4;
        // int j = firstoccu(arr,0,target);
        int j = lastoccu(arr,0,target);

        System.out.println(j);
    }
}