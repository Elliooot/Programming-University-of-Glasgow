import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Grid board = new Grid(6,7);
        Player player1 = new Player("Frank", 'O');
        Player player2 = new Player("Colin", 'X');

        char symbol = 'O'; //Let player1 go first
        boolean gameOver = false;
        boolean playerSwitch = true;
        Disc disc;


        while(!gameOver) {
            Player player = playerSwitch ? player1 : player2;

            boolean colNotFull = false; //check if a column is full
            while(!colNotFull) {
                player.takeTurn();
                int i = scanner.nextInt() - 1; //Read the entered column
                disc = board.drop(player.getSymbol(), i ); //drop a disc
                if(disc != null) {
                    colNotFull = true;
                    Grid.toString(board);
                    undoProcess(board, player, i);

                }else{ System.out.println("The column is already full"); }
            }

            gameOver = board.haveWon(board, symbol);
            if(gameOver){
                System.out.println("Player " + player.getName() + " won!");
            }else {
//                symbol = (symbol == 'X' ? 'O' : 'X');
                playerSwitch = !playerSwitch;
            }
        }
        scanner.close();
    }

    private static void undoProcess(Grid board, Player player, int col) {
        System.out.println("Do you want to regret your move? (Y/N)");
        char ans = scanner.next().charAt(0);
        if(ans == 'Y' || ans == 'y'){
            board.undo(col);
            Grid.toString(board);
            player.takeTurn();

            int j = scanner.nextInt() - 1;
            board.drop(player.getSymbol(), j);
//                disc = new Disc(player.getSymbol(), row_rec, j - 1);
            Grid.toString(board);
        }
    }
}