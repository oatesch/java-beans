
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Number " + number + " is ");
        if (Math.abs(number)%2 == 1) {
            System.out.println("odd.");
        }
        else {
            System.out.println("even.");
        }


    }
}
