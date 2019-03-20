/*
Sum of set of numbers, the program should ask for both the lower and upper bound. 
You can assume that the users first gives the smaller number and then the greater number.
*/
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //lower and upper bound
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int number = first; //iterator in while loop
        
        while (number <= last) {
            sum += number;
            number++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
