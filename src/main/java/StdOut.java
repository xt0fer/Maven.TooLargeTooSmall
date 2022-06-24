import java.util.Scanner;

public class StdOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();

        name = name.toUpperCase();
        name = name + " maybe you'll be a Zipcoder someday!\n";

        System.out.println(name);
    }
}
