import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grid board = new Grid(6,7);
        Player player1 = new Player("Frank", 'O');
        Player player2 = new Player("Colin", 'X');

        char symbol = 'O'; //Let player1 go first
        boolean gameOver = false;
        int disc_cnt = 0; //count the disc number
        Player player;

        Scanner scanner = new Scanner(System.in);

        while(!gameOver) {
            if(board.checkIfFull(disc_cnt)){
                System.out.println("Tie");
                break;
            }
            if(symbol == 'O'){
                player = player1;
                player.takeTurn();
            }else{
                player = player2;
                player.takeTurn();
            }
            int i = scanner.nextInt(); //Read the entered column
            int row_rec; // record the row
            row_rec = board.drop(player.getSymbol(), i - 1); //drop a disc
            disc_cnt++;
            Grid.toString(board);

            System.out.println("Do you want to regret your move? (Y/N)");
            char ans = scanner.next().charAt(0);
            if(ans == 'Y' || ans == 'y'){
                board.undo(row_rec, i - 1);
                disc_cnt--;
                Grid.toString(board);
                player.takeTurn();

                int j = scanner.nextInt();
                board.drop(player.getSymbol(), j - 1);
                disc_cnt++;
                Grid.toString(board);
            }

            gameOver = board.haveWon(board, symbol);
            if(gameOver){
                System.out.println("Player " + player.getName() + " won!");
            }else {
                symbol = (symbol == 'X' ? 'O' : 'X');
            }
        }
    }
}