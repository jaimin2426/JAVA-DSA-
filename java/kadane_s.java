public class kadane_s{

    public static int kadanes(int arr[]){
       int cusum = 0;
       int maxsum = Integer.MIN_VALUE;

       for(int i: arr){
        cusum += i;
        maxsum = Math.max(maxsum,cusum);
        if(cusum<0){
            cusum = 0;
        }

       }
       return maxsum;
    }
    public static void main(String arhgs[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        int sum = kadanes(arr);
        System.out.println(sum);

    }
}