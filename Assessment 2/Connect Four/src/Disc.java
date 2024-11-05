public class Disc {
    private char symbol;
    private int col;
    private int row;

    public Disc(char symbol, int row, int col) {
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

    @Override
    public String toString() {
        return "Disc{" +
                "symbol=" + symbol +
                ", col=" + col +
                ", row=" + row +
                '}';
    }
}
