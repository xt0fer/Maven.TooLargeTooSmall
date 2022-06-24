import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilezOh {
    public static void main(String[] args) {
        FilezOh fo = new FilezOh();

        boolean worked = fo.writeToFile();

        if (worked == true) {
            System.out.println("writing worked\n\n");
            boolean readItToo = fo.readFromFile();
            if (readItToo) {
                System.out.println("reading and writing to a file worked.");
            }
        }

    }

    private boolean writeToFile() {
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter("myfile.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        outputFile.println("Hey There!\n");
        outputFile.println("I wrote text to this file.\n");

        outputFile.close();
        return true;
    }

    private boolean readFromFile() {
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(Paths.get("myfile.txt"), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line;
        while (inputFile.hasNext()) {
            line = inputFile.nextLine();
            System.out.println(line);
        }
        return true;
    }

}
