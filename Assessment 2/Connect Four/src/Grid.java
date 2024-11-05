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

    public boolean checkDirection(Disc disc, int rowIncrement, int colIncrement){
        int cnt = 1;
        int row = disc.getRow();
        int col = disc.getCol();
        char symbol = disc.getSymbol();

        int r = row + rowIncrement;
        int c = col + colIncrement;
        while(r >= 0 && r < this.row && c >= 0 && c < this.col && grid[r][c] == symbol){
            cnt++;
            r += rowIncrement;
            c += colIncrement;
        }

        r = row - rowIncrement;
        c = col - colIncrement;
        while(r >= 0 && r < this.row && c >= 0 && c < this.col && grid[r][c] == symbol){
            cnt++;
            r -= rowIncrement;
            c -= colIncrement;
        }
//        System.out.println(cnt);
        return cnt >= 4;
    }

    public boolean haveWon(Disc disc){
        return checkDirection(disc, 0, 1) // check horizontal
                || checkDirection(disc, 1, 0) // check vertical
                || checkDirection(disc, 1, 1) // check diagonal
                || checkDirection(disc, 1, -1); // check reverse diagonal
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
