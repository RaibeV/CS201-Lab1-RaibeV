package CS201LLab1;
import java.util.Scanner;
//NAME:  add your name here
//DATE:  add the current date of your lab class
//LAB TIME: add the time of your lab class
//PROGRAM:
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to CS201L - Lab1!");

        //declare variables used
        int x1, x2, y1, y2;
        double dist1, dist2;
        char choice;
        String inputLine;
        Scanner input = new Scanner(System.in);

        //get choice from the user
        System.out.print("\nHow would you like to get your 4 values: enter(e) or generate(g)? ");
        inputLine = input.nextLine();
        choice = inputLine.charAt(0);

        //allow user to enter both points (1 point has been done for you)
        if (choice == 'e') {
            System.out.println("Enter the 4 values separated by spaces: ");
            x1 = input.nextInt();
            y1 = input.nextInt();

            if (!((x1 >= -10 && x1 <= 10) &&
                (y1 >= -10 && y1 <= 10))){
                System.out.println("A value entered was not valid"); 
                return;                       
            }

        }
        //generate a value from -10 to 10 for both points (1 point has been done for you)
        else if (choice == 'g') {
            x1 = (int)(Math.random() * 21) - 10;
            y1 = (int)(Math.random() * 21) - 10;
         }
        else {
            System.out.println("The value " + choice + " is not a valid option!");
            return;
        }
        //print both points
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");

        //calculate dist1 & dist2 (the distance from each point to the origin)
        dist1 = Math.pow(Math.pow((x1-0),2) + Math.pow((y1-0),2),.5);

        //determine which is distance closer to the origin and print


        //close scanner
        input.close();
    }
}