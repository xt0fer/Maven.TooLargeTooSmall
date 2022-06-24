import java.util.Scanner;

public class ReturnValue {

    /**
     * NOT OKAY!! See comments.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();

        // re-factor this to be able to test it!!
        name = processName(name);

        System.out.println(name);
    }

    static String processName(String name) {
        name = name.toUpperCase();
        name = name + " maybe you'll be a Zipcoder someday!\n";

        return name;
    }

    // add a string producing processing function to manipulate the name!
}
