public class spiralmatrix{

    public static void spiral(int a[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = a.length-1;
        int endcol = a[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            // top
            for(int j=startcol ; j <= endcol ;j++){
                System.out.print(a[startrow][j]+" ");
            }
            // right
            for(int i = startrow+1 ; i<=endrow ;i++){
                System.out.print(a[i][endcol]+" ");
            }

            // bottom
            for(int i = endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(a[endrow][i]+" "); 
            }
            // left
            for(int j = endrow-1;j>=startrow+1;j--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(a[j][startcol]+" ");
            }
            startcol++;
            startrow++;
            endrow--;
            
            endcol--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int a[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};

        spiral(a);
    }
}