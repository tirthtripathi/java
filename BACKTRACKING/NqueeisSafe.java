public class NqueeisSafe {
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left diagonal up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Right diagonal up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    // it print all posible solutions 

    // public static void nQuees(char board[][], int row) {
    //     // base
    //     if (row == board.length) {
    //         Printboard(board);
    //         return;
    //     }
    //     // recursion
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             nQuees(board, row + 1);
    //             board[row][j] = 'X';
    //         }
    //     }
    // }


    // if posible print only one solution 
    public static boolean nQuees(char board[][], int row) {
        // base
        if (row == board.length) {
           // Printboard(board);
            return true;
        }
        // recursion
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQuees(board, row + 1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }
    

    public static void Printboard(char board[][]) {
        System.out.println("---------board---------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
      // this conditions are not needed to print all posible solutions. 
        if(nQuees(board, 0)){
        System.out.println("solution is possible");
        Printboard(board);
       }
       else{
        System.out.println("solution is not possible");
       }
    }
}
// for all solutions 
//---------- out put -----------

// ---------board---------
// X Q X X 
// X X X Q 
// Q X X X 
// X X Q X 
// ---------board---------
// X X Q X 
// Q X X X 
// X X X Q 
// X Q X X 

// print only one solution among all if possible 
//---------- out put -----------

// ---------board---------
// X Q X X 
// X X X Q 
// Q X X X 
// X X Q X 