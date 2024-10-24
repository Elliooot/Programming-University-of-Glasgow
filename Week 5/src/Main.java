public class Main {
    public static void main(String[] args) {
        int col = 6, row = 7;
        for(int i = col - 1; i > 2; i--){ // check the diagonals
            for(int j = row - col - 1; j < row - 3; j++){
                System.out.println(i + " " + (i-1) + " " +(i-2) + " " + (i-3) + " " + j + " "+(j+1) +" "+(j+2) + " " +(j+3));
            }
        }
    }
}