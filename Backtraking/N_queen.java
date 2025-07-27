package Backtraking;

public class N_queen {
    static boolean issafe(int row,int col,char board[][]){
           // Horizental
        for(int i=0;i<board.length;i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }
           // Vertical
        for(int j=0;j<board.length;j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }
          // Upper left
        int r = row;
        for(int c=col;c>=0 && r>=0;r--,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
          // upper Right
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        r = row;
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

         r = row;
        for(int c=col;c<board.length && r<board.length;r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    static void saveboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                if(board[i][j] == 'Q'){
                    System.out.print("Q");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void helper(char board[][],int col){
        if(col == board.length){
            saveboard(board);
            return;
        }
        for(int row = 0;row < board.length;row++){
            if(issafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, col+1);
                board[row][col] = '.';
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        helper(board, 0);

    }
    
}
