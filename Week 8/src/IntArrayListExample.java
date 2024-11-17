import java.util.ArrayList;

public class IntArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        int sum = 0;
        for(Integer i : myList) {
            sum += i;
        }
        System.out.println("The Array List sum is " + sum);

        // illustrating for each loop with an array
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        int sum2 = 0;
        for(int i : myArray) {
            sum2 += i;
        }
        System.out.println("The Array List sum is " + sum2);
    }
}
