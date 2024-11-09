public class Grid {
    protected int col;
    protected int row;

    Disc[][] grid; //Use Disc class to construct a 2D Disc array

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;

        grid = new Disc[row][col];
    }

    public Disc drop(char symbol, int col){
        for(int i = grid.length - 1; i >= 0; i--){
            if(grid[i][col] == null){ // check if the coordinate is available
                Disc disc = new Disc(symbol, i, col); //Define a new disc
                grid[i][col] = disc;
                return disc;
            }
        }
        return null;
    }

    public void undo(int col){
        int top = 0; //start checking from top row
        while(grid[top][col] == null){
            top++;
        }
        grid[top][col] = null;
    }

    public boolean checkDirection(Disc disc, int rowIncrement, int colIncrement){ //Use it to check four different directions
        int cnt = 1; // counts the current disc
        int row = disc.getRow();
        int col = disc.getCol();
        char symbol = disc.getSymbol();

        int r = row + rowIncrement;
        int c = col + colIncrement;
        while(r >= 0 && r < this.row && c >= 0 && c < this.col && grid[r][c] != null && grid[r][c].getSymbol() == symbol){ //Ensure r and c are in the range, avoiding Disc.getSymbol() not able to be invoked and check if it is the same symbol
            cnt++;
            r += rowIncrement;
            c += colIncrement; // r and c will be changed each time
        }

        r = row - rowIncrement;
        c = col - colIncrement;
        while(r >= 0 && r < this.row && c >= 0 && c < this.col && grid[r][c] != null && grid[r][c].getSymbol() == symbol){ //Same process but reverse direction
            cnt++;
            r -= rowIncrement;
            c -= colIncrement;
        }
//        System.out.println(cnt);
        return cnt >= 4; //if cnt >= 4, it will return True
    }

    public boolean haveWon(Disc disc){
        return checkDirection(disc, 0, 1) // check horizontal
                || checkDirection(disc, 1, 0) // check vertical
                || checkDirection(disc, 1, 1) // check diagonal
                || checkDirection(disc, 1, -1); // check reverse diagonal
    }

    public static void toString(Grid board){ //print the board
        for(int i = -1; i < board.row; i++){
            System.out.println("--------------------------");
            for(int j = 0; j < board.col; j++){
                if(i < 0){
                    System.out.print(String.format("%s   ", j + 1));
                }else if(board.grid[i][j] == null){ // Disc.getSymbol() cannot invoke null is a rather tricky problem
                    System.out.print(String.format("%s", " "));
                }else{
                    System.out.print(String.format("%s", board.grid[i][j].getSymbol()));
                }
                if(i >= 0 && j != board.col - 1){
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
