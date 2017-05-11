
package Others;
import java.util.*;
/**
 * Created by varun on 10/2/16.
 */
public class Theatre {


    public void reserveSeat(String reservation,String[][] layout)
    {
        int count = 1;
        for (int row = 0; row < layout.length; row++) {
            for (int col = 0; col < layout[row].length; col++) {
                if(layout[row][col].contains(reservation) && count>0)
                {
                    layout[row][col] = "n";
                    System.out.println("you reserved Seat Number  :-> "+row+""+col+"\n");
                    count--;
                }
            }

        }
    }


    public void availableSeats(String[][] layout)
    {
        for (int row = 0; row < layout.length; row++) {
            for (int col = 0; col < layout[row].length; col++) {
                if(layout[row][col].contains("n"))
                 System.out.print("  ");
                else
                    System.out.print(layout[row][col]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String[][] layout = {
                {"k ", "k ", "k ", "k ", "k ", "k ", "k ", "k ","k ", "k ", "k ", "k "},
                {"k ", "k ", "k ", "k ", "k ", "k ", "k ", "k ","k ", "k ", "k ", "k "},
                {"k ", "k ", "k ", "k ", "k ", "k ", "k ", "k ","k ", "k ", "k ", "k "},
                {"s ", "s ", "s ", "s ", "s ", "s ", "s ", "s ","s ", "s ", "s ", "s "},
                {"s ", "s ", "s ", "s ", "s ", "s ", "s ", "s ","s ", "s ", "s ", "s "},
                {"a ", "a ", "a ", "a ", "  ", "  ", "  ", "  ","a ", "a ", "a ", "a "},
                {"a ", "a ", "a ", "a ", "  ", "  ", "  ", "  ","a ", "a ", "a ", "a "},
                {"a ", "a ", "a ", "a ", "  ", "  ", "  ", "  ","a ", "a ", "a ", "a "},
                {"a ", "a ", "a ", "a ", "  ", "  ", "  ", "  ","a ", "a ", "a ", "a "},
                {"a ", "a ", "a ", "a ", "  ", "  ", "  ", "  ","a ", "a ", "a ", "a "}
        };
        boolean quit = false;
        Theatre t = new Theatre();

        while(!quit) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter from below commands to proceed further");
            System.out.println("reserve -> for book ticket");
            System.out.println("available -> for see available seats");
            System.out.println("exit -> to exit from application");
            String command = in.nextLine();

            if (command.equals("available")) {
                t.availableSeats(layout);
            } else if (command.equals("reserve")) {
                Scanner reservation = new Scanner(System.in);
                System.out.println("Please enter your preferences for booking");
                System.out.println("k for kids,  s for senior citizens,  a for adults");
                t.reserveSeat(reservation.nextLine(), layout);

            } else if (command.equals("exit")) {
                quit = true;
                System.out.println("Good bye!!");
            } else {
                System.out.println("please enter valid input..\n");
            }
        }
    }
}
