
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());
        int x = 0;
        while(x != limit){
            x++;
            System.out.println(x);
        }
        
    }
}
