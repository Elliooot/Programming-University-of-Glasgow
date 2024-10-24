public class Disc {
    private char symbol;
    private int col;
    private int row;

    public Disc(char symbol, int col, int row) {
        this.symbol = symbol;
        this.col = col;
        this.row = row;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
