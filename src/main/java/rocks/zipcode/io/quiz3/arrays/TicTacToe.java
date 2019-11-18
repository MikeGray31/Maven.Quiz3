package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;

    }

    public TicTacToe() {
        String[] row1 = {" ", " ", " "};
        String[] row2 = {" ", " ", " "};
        String[] row3 = {" ", " ", " "};
        String[][] rowsAndColumns = {row1, row2, row3};
        this.board = rowsAndColumns;

    }

    public String[] getRow(Integer value) {
        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = {this.board[0][value], this.board[1][value], this.board[2][value]};
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if(board[rowIndex][0] ==  board[rowIndex][1]  && board[rowIndex][1] == board[rowIndex][2]){
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if(board[0][columnIndex] ==  board[1][columnIndex]  && board[1][columnIndex] == board[2][columnIndex]){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if(checkForWin("X")) return "X";
        if(checkForWin("O")) return "O";
        return " ";
    }

    public String[][] getBoard() {
        return this.board;
    }

    public Boolean checkForWin(String isXorO){
        for(int i = 0; i < 3 ; i++){
            if(isRowHomogenous(i) && this.board[i][0].equals(isXorO)){
                return true;
            }
        }
        for(int i = 0; i < 3 ; i++){
            if(isColumnHomogeneous(i) && this.board[0][i].equals(isXorO)) {
                return true;
            }
        }
        if(board[0][0].equals(isXorO) && board[1][1].equals(isXorO) && board[2][2].equals(isXorO)) {
            return true;
        }
        if(board[2][0].equals(isXorO) && board[1][1].equals(isXorO) && board[0][2].equals(isXorO)) {
            return true;
        }
        return false;
    }
}
