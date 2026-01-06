import java.util.Scanner;
public class first{

    public static int updates(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(key == num[i]){
                return i;
            }
        }
        return -1;
    }

    public static int maxofnum(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[10];

        // 
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        
        // }
        // for(int i=0;i<10;i++){
        //     System.out.println(arr[i]);
        // }

        // int num[] = {1,2,3,4,5,6,7,8,9,10};
        // int key = sc.nextInt();

        
        // int index = updates(num,key);
        // if(index == -1){
        //     System.out.println("Element is not found in list");
        // }else{
        //     System.out.println("ELement is in index at : "+index);
        // }


        int arr[] = {1,84,96,74,85,15,46,89,42,69,78,45,42,6,2,48,4,45};
        int big = maxofnum(arr);
        System.out.println(big);
    }
}