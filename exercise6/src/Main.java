//Jocelin Martinez-Reyes | Exercise 6 | 2/23/25
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int quit = 0;

        while (quit == 0) {
            System.out.println("Welcome! Now...  𝄞🎷⋆ ˚｡⋆୨୧˚ ");
            int userInt = ansInt("Please input an int (integer/number) ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧:");
            double userDouble = ansDbl("Please input a double (a decimal/fractional number) ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧:");
            String userString = ansStr("Please input a string (text) ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧:");

            System.out.println("Integer: " + userInt);
            System.out.println("Double: " + userDouble);
            System.out.println("String: " + userString);

            System.out.println("\Again ₊·*◟(˶╹̆ꇴ╹̆˵)◜‧*･? (Y/y for Yes, N/n for No)");
            
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                quit = 1;
                System.out.println("\nGoodbye ヾ(＾ ∇ ＾).!");
            } else if (answer.equalsIgnoreCase("Y")) {
                System.out.println("\nGreat! Let's try again ‎٩(⸝⸝ᵕᴗᵕ⸝⸝)و*̣̩⋆̩*.\n");
            } else {
                System.out.println("\nThat wasn't a choice in this ୧(๑•̀ᗝ•́)૭/n Exiting...\n");
                quit = 1;
            }
        }
    }

    static int ansInt(String message) {
        boolean isCaught = true;
        int userIn = 0;

        while (isCaught) {
            System.out.println(message);
            String userInput = input.nextLine();

            try {
                userIn = Integer.parseInt(userInput);
                isCaught = false; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Error: Try a correct number.(Literally any number)");
            }
        }

        return userIn; 
    }

    static double ansDbl(String message) {
        boolean isCaught = true;
        double userIn = 0.0;

        while (isCaught) {
            System.out.println(message);
            String userInput = input.nextLine();

            try {
                userIn = Double.parseDouble(userInput);
                isCaught = false; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Try a correct number. (A decimal 0.00 [the period])");
            }
        }

        return userIn; 
    }

    static String ansStr(String message) {
        String userInput = "";
        int quit = 0;

        while (quit == 0) {
            System.out.println(message);
            userInput = input.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("You gotta give me something ૮(˶ㅠ︿ㅠ)ა.");
            } else {
                quit = 1;
            }
        }
        return userInput;
    }
