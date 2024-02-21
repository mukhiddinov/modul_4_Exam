import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String file = "example.txt";
        String fileCopy = "example_copy.txt";
        File sourceFile = new File(file);

        try {
            Scanner scanner = new Scanner(file);
            FileWriter fileWriter = new FileWriter(fileCopy);
            while (scanner.hasNextLine()){
                String lineString = scanner.nextLine();
                fileWriter.write(lineString + "\n");
            }
            fileWriter.close();
            System.out.println("file copied!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
