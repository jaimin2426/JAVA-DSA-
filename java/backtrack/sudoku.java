public class sudoku{

    public static boolean isSafe(int sudoku[][],int row ,int col, int digit){
        // row
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        // column
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        // grid
        int frow = (row/3)*3;
        int fcol = (col/3)*3;

        for(int i=frow;i<frow+3;i++){
            for(int j=fcol;j<fcol+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean sudokusolver(int sudoku[][] , int row,int col){
        // base case
        if(row ==9){
            return true; 
        }
        // recursion
        int nextrow = row, nextcol = col+1;
        if(col+1==9){
            nextrow = row+1; 
            nextcol = 0;  
        }

        if(sudoku[row][col]!=0){
            return sudokusolver(sudoku, nextrow, nextcol);
        }

        for(int k = 1; k<=9; k++){
            if(isSafe(sudoku,row,col,k)){
                sudoku[row][col] = k;
                if(sudokusolver(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" | ");
            }
            System.out.println();
            System.out.println("------------------------------------");
            
        }
    }
    public static void main(String args[]){
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if(sudokusolver(sudoku, 0, 0)){
            System.out.println("solution exist");
            print(sudoku);
        }
        else{
            System.out.println("solution is not exist");
        }
    }
}