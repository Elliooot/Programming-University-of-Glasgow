import java.util.Scanner;
import java.util.Random;
public class PaperScissorStone {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

        int myWinTimes = 0;
        int comWinTimes = 0;
        int cnt = 0;
        while(myWinTimes < 3 && comWinTimes < 3){
            System.out.println("Round " + cnt);
            int randomNum = rand.nextInt(3);
            System.out.println("Please enter your choice:");
            String s = keyboard.nextLine();
            int mychoice = 0;
            if(s == "Scissors"){
                mychoice = 1;
            }else if(s == "Stone"){
                mychoice = 2;
            }
            if(mychoice == 0 && randomNum == 2) {
                myWinTimes++;
                System.out.println("You win!");
            }else if(mychoice == 1 && randomNum == 0) {
                myWinTimes++;
                System.out.println("You win!");
            }else if(mychoice == 2 && randomNum == 1) {
                myWinTimes++;
                System.out.println("You win!");
            }else
                comWinTimes++;
                System.out.println("Computer Wins");
            cnt++;
        }
        if(myWinTimes == 3)
            System.out.println("You win!");
        else
            System.out.println("Computer Wins");
    }
}
