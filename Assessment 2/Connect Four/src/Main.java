import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Grid board = new Grid(6,7);
        Player player1 = new Player("Frank", 'O');
        Player player2 = new Player("Colin", 'X');

//        char symbol = 'O'; //Let player1 go first
        boolean gameOver = false;
        boolean playerSwitch = true; //determine which player's turn it is


        while(!gameOver) {
            Player player = playerSwitch ? player1 : player2; // true: player1's turn; false: player2's turn
            Disc disc = null;
            player.takeTurn();

            while(disc == null) {
                System.out.println("Enter a column (1-7): ");
                int i = scanner.nextInt() - 1; //Read the entered column
                disc = board.drop(player.getSymbol(), i ); //drop a disc, if successful it will return a Disc, otherwise it will return null
                if(disc != null) {
                    Grid.toString(board);
                    undoProcess(board, player, i); // wrapping the undo process
                }else{
                    System.out.println("The column is already full, try again");
                }
            }

            gameOver = board.haveWon(disc); // check if a player has won
            if(gameOver){
                System.out.println("Player " + player.getName() + " won!");
            }else {
//                symbol = (symbol == 'X' ? 'O' : 'X');
                playerSwitch = !playerSwitch; // switch player turn
            }
        }
        scanner.close();
    }

    private static void undoProcess(Grid board, Player player, int col) {
        System.out.println("Do you want to regret your move? (Y/N)");
        char ans = scanner.next().charAt(0);
        if(ans == 'Y' || ans == 'y') {
            board.undo(col); //undo last move
            Grid.toString(board); //print board
//            player.takeTurn(); // print message

            Disc disc = null;
            while (disc == null) {
                System.out.println("Enter another column (1-7): ");
                int j = scanner.nextInt() - 1;
                disc = board.drop(player.getSymbol(), j);
                if(disc == null) {
                    System.out.println("The column is already full, try again");
                } else {
                    Grid.toString(board);
                }
            }
        }
    }
}