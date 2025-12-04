package RecursionConcepts;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        System.out.println(waysForQueens(board, 0));
    }
    
    static int waysForQueens(boolean[][] board, int rows){
        if(rows==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        
        int count=0;

        // placing the queens and checking for every row and col
        for(int col=0; col<board.length; col++){
            //place the queen if the position is safe
            if(issafe(board, rows, col)){
                board[rows][col]=true;
                count+=waysForQueens(board, rows+1);
                board[rows][col]=false;
            }
        }
        return count;
    }
    
    private static boolean issafe(boolean[][] board, int rows, int col) {
        //check vertical row
        for(int i=0; i< rows; i++){
            if(board[i][col]){
                return false;
            }
        }

        //diagolanlly left
        int stepsforLeft= Math.min(rows, col);
        for(int i=1; i<=stepsforLeft; i++){
            if(board[rows-i][col-i]){
                return false;
            }
        }

        //diagolanlly right
        int stepsforright= Math.min(rows, board.length-col-1);
        for(int i=1; i<=stepsforright; i++){
            if(board[rows-i][col+i]){
                return false;
            }
        }

        return true;
    }
    
    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
