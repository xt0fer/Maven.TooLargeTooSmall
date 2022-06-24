import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

// TODO
// format output to a dollar format
// what happens when a non-number is input?
// how do we fix it?

/**
 * this class asks a user for a dollar figure and then doubles it!
 */
public class DoubleMoney {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        DoubleMoney dm = new DoubleMoney();

        dm.do_it();
    }

    private void do_it() {

        System.out.print("What is your name? ");
        String name = in.nextLine();

        System.out.print("How many dollars do you have? ");
        double m = 0;
        try {
            m = in.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }

        double newMoney = 2 * m;
        System.out.printf("Now you have %f dollars, %s!", newMoney, name);
    }
}
