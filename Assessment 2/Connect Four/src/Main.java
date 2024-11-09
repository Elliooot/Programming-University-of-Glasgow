import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Grid board = new Grid(6,7);
        Player player1 = new Player("Harris", 'O');
        Player player2 = new Player("Trump", 'X');

//        char symbol = 'O'; //Let player1 go first
        boolean gameOver = false; //determine if game is over
        boolean playerSwitch = true; //determine which player's turn it is
//        boolean validInput = false; //I used to put it here

        while(!gameOver) {
            Player player = playerSwitch ? player1 : player2; // true: player1's turn; false: player2's turn
            Disc disc = null; //A new disc is needed to be defined here
            player.takeTurn();

            while(disc == null) {
                int i;
                boolean validInput = false; //I think it is worth noting that I used to put it outside the first while loop, and it will crash after one move because validInput is always True
                while(!validInput){
                    System.out.println("Enter a column (1-7): ");
                    try{ //Check if users enter an integer between 1 and 7
                        i = scanner.nextInt() - 1; //Read the entered column

                        disc = board.drop(player.getSymbol(), i); //drop a disc, if successful it will return a Disc, otherwise it will return null
                        if(disc != null) {
                            Grid.toString(board);
                            undoProcess(board, player, i); // wrapping the undo process
                            validInput = true; //jump out of this while loop
                        }else{
                            System.out.println("The column is already full, try again");
                        }
                    }catch(InputMismatchException e){ //catch error if user enter a non-integer
                        System.out.println("Invalid input. Try again.");
                        scanner.nextLine();
                    }catch (ArrayIndexOutOfBoundsException e){ //catch error if the integer user entered out of bound
                        System.out.println("Input out of bounds. Try again.");
                        scanner.nextLine();
                    }
                }
            }

            gameOver = board.haveWon(disc); // check if a player has won
            if(gameOver){
                System.out.println("Player " + player.getName() + " won!");
            }else {
//                symbol = (symbol == 'X' ? 'O' : 'X'); //previous method to switch turn
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

            Disc disc = null; //Same process
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