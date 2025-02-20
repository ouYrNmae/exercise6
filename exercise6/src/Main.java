//Jocelin Martinez-Reyes Exercise 6 2/20/25
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int test = trial.promptInt("Please input a int type message:");
        System.out.println(test);

        String test2 = trial.promptDouble("Please input a double type message:");
        System.out.println(test2);

        String test3 = trial.promptString("Please input a String type message:");
        System.out.println(test3);
    }
}

class trial {
    static Scanner input = new Scanner(System.in);

    static String promptString(String message) {
        //hardest one.
        boolean isCaught = true;

        String userIn = "";
        while(isCaught) {
            try {
                System.out.println(message);
                userIn = input.nextLine();

                try {
                    Double.parseDouble(userIn);
                    System.out.println("Message is not of the true String type, please try again.");
                }
                catch(Exception e) {
                    try {
                        Integer.parseInt(userIn);
                        System.out.println("Message is not of the true String type, please try again.");
                    }
                    catch(Exception e2) {
                        isCaught = false;
                    }
                }
            }
            catch(Exception e) {
                System.out.println("Oops! Something went wrong!");
            }
        }

        return userIn;
    }

    static int promptInt(String message) {
        boolean isCaught = true;

        int userIn = 0;
        while (isCaught) {
            try {
                System.out.println(message);
                userIn = Integer.parseInt(input.nextLine());

                isCaught = false;
            }
            catch(Exception e) {
                System.out.println("Message is not of the int type, please try again.");
            }
        }

        return userIn;
    }

    static String promptDouble(String message) {
        boolean isCaught = true;
        String userIn = "";
        while (isCaught) {
            try {
                System.out.println(message);
                userIn = input.nextLine();

                try {
                    Integer.parseInt(userIn);
                    System.out.println("Message is not of the double type, please try again.");
                } catch (Exception e) {
                    try {
                        Double.parseDouble(userIn);
                        isCaught = false;
                    } catch (Exception e2) {
                        System.out.println("Message is not of the double type, please try again.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Oops! Something went wrong!");
            }
        }
        return userIn;
    }
}