public class Grid {
    protected int col;
    protected int row;

    char[][] grid;

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;

        grid = new char[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public Disc drop(char symbol, int col){
        for(int i = grid.length - 1; i >= 0; i--){
            if(grid[i][col] == ' '){
                grid[i][col] = symbol;
                return new Disc(symbol, i, col);
            }
        }
        return null;
    }

    public void undo(int col){
        int top = 0; //start checking from top row
        while(grid[top][col] == ' '){
            top++;
        }
        grid[top][col] = ' ';
    }

    public boolean haveWon(Grid board, char symbol){
        for(int i = 0; i < board.row; i++){ //check row
            for(int j = 0; j < board.col - 3; j++){//(0, 3), (0, 4), (0, 5), (0, 6)
                if(board.grid[i][j] == symbol && board.grid[i][j+1] == symbol && board.grid[i][j+2] == symbol && board.grid[i][j+3] == symbol){
                    return true;
                }
            }
        }
        for(int i = 0; i < board.row - 3; i++){ //check col
            for(int j = 0; j < board.col; j++){//(2, 0), (3, 0), (4, 0), (5, 0)
                if(board.grid[i][j] == symbol && board.grid[i+1][j] == symbol && board.grid[i+2][j] == symbol && board.grid[i+3][j] == symbol){
                    return true;
                }
            }
        }
        for(int i = 0; i < board.row - 3; i++){ //check diagonals
            for(int j = 0; j < board.col - 3; j++){//(2, 3), (3, 4), (4, 5), (5, 6)
                if(board.grid[i][j] == symbol && board.grid[i+1][j+1] == symbol && board.grid[i+2][j+2] == symbol && board.grid[i+3][j+3] == symbol){
                    return true;
                }
            }
        }
        for(int i = 3; i < board.row; i++){ // check another diagonals
            for(int j = 0; j < board.col - 3; j++){//(6, 0), (5, 1), (4, 2), (3, 3)
                if(board.grid[i][j] == symbol && board.grid[i-1][j+1] == symbol && board.grid[i-2][j+2] == symbol && board.grid[i-3][j+3] == symbol){
                    return true;
                }
            }
        }
        return false;
    }

    public static void toString(Grid board){ //print the board
        for(int i = 0; i < board.row; i++){
            for(int j = 0; j < board.col; j++){
                System.out.print(String.format("%s", board.grid[i][j]));
                if(j != board.col - 1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
