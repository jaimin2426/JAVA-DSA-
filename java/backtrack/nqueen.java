
public class nqueen {

    // Time complexity = O(n!)
    // T(n) = 1Queenplace *T(n-1) + isSafe()
    // recrance relation => T(n) = T(n-1) + isSafe()
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // check left side of the row
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // diegonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diegonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // for  n queen
    public static boolean nqueen(char board[][], int row) {// If you only want one possible solution, write the boolean instead void .

        if (row == board.length) {
            // printarr(board); 
            return true;  // when you write void so no need to write true for nqueen
        }
        // column loop 
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                if (nqueen(board, row + 1)) {
                    return true;
                }//function call     // when you write void so write this line for nqueen 'nqueen(board, row+1)'
                board[row][i] = '_';//backtracking step
            }
        }
        return false;  // for n queen no need to write this line 
    }

    static int count = 1;

    public static void printarr(char board[][]) {
        System.out.println("--------solution " + count++ + "---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '_';
            }
        }

        // for one solution 
        if (nqueen(board, 0)) {
            printarr(board);
        } else {
            System.err.println("not possible");
        }
        // nqueen(board,0);
    }
}
