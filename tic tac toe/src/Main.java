import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int row = 0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        while(!gameOver){
            Display(board);

            System.out.println("Player "+player +" turn, enter row, column below:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            Fillboard(board,row,col,player);
           player = DetectTurn(player);
           gameOver = checkWin(board);
            gameOver = checkDraw(board);
        }
    }
    public static boolean checkDraw (char[][] board) {
    int full = 0;
        for(int row = 0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
               if(board[row][col] == 'X' || board[row][col] == '0'){
                   full++;
               }
            }
        }
        if(full==9){
            System.out.println("Draw : Neither Player Wins!!!");
            return true;
        }
        return false;
    }
    public static boolean checkWin (char[][] board) {
// check row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == 'X' && board[row][1] == 'X' && board[row][2] == 'X') {
                System.out.println("Player : X has Won ");
                return true;
            }
            else if (board[row][0] == '0' && board[row][1] == '0' && board[row][2] == '0') {
                System.out.println("Player : 0 has Won ");
                return true;

            }
        }
//        check col
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == 'X' && board[1][col] == 'X' && board[2][col] == 'X') {
                System.out.println("Player : X has Won ");
                return true;

            }
            else if (board[0][col] == '0' && board[1][col] == '0' && board[2][col] == '0') {
                System.out.println("Player : 0 has Won ");
                return true;

            }
        }
//        check diag
        for (int row = 0; row < board.length; row++) {
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                System.out.println("Player : X has Won ");
                return true;
            }

            else if (board[2][0] == '0' && board[1][1] == '0' && board[0][2] == '0') {
                System.out.println("Player : 0 has Won ");
                return true;

            }
            else if (board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0') {
                System.out.println("Player : 0 has Won ");
                return true;
            }
            else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
                System.out.println("Player : X has Won ");
                return true;

            }
        }
        return false;
    }
    public static char DetectTurn (char player) {
    player = (player == 'X')?'0':'X';
return player;
    }
    public static void Fillboard (char[][] board,int row,int col,char player) {
        if(board[row][col]==' '){
            board[row][col] = player;
        }
        else{
            System.out.println("Invalid Move retry");
        }

    }
    public static void Display (char[][] board){
        for(int row = 0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                System.out.print( "[" + board[row][col] + "]");
            }
            System.out.println();
        }
    }
}