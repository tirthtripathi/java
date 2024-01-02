
public class NqueeAllways {
// this part of code assure that quee is not uder atteck 
    
// this is the code to print all ways of placing Quees with out checking the safety
    public static void nQuees(char board[][], int row) {
        // base
        if (row == board.length) {
            count++;
            Printboard(board);
            return;
        }
        // recursion
        for (int j = 0; j<board.length; j++) {
            board[row][j] = 'Q';
            nQuees(board, row+1);
            board[row][j] = 'X';
        }
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
   static int count=0;
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQuees(board, 0);

        System.out.println("total count:"+count);
    }
}

//----------- out put -------------   

// ---------board---------
// Q X 
// Q X 
// ---------board---------
// Q X 
// X Q 
// ---------board---------
// X Q 
// Q X 
// ---------board---------
// X Q 
// X Q 