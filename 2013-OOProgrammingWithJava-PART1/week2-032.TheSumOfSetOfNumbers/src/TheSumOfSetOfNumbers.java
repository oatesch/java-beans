
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        int x=0;
        int total=0;
        while (x!=limit){
            x++;
            total += x;  
        }
        System.out.println("Sum is " + total);
    }
}
