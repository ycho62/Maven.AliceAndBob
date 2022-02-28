import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner names = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = names.nextLine();

            if (name.equals("Alice") || name.equals("Bob")) {
                System.out.println("Hello " + name);
            } else {
                System.out.println("Access denied");
            }
        }
    }

