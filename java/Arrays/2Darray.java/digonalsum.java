public class digonalsum{

    public static int digonal(int a[][]){
        int sum = 0;
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[0].length;j++){
        //         if(i==j){
        //             sum += a[i][j];
        //         }
        //         else if(i+j == a.length-1){
        //             sum += a[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<a.length;i++){
            // pd
            sum += a[i][i];
            // sd
            if(i != a.length-1-i)
                sum += a[i][a.length-i-1];
        }
        return sum;
    }
    public static void main(String args[]){
        int a[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
        int sum = digonal(a);
        System.err.println(sum);
    }
}