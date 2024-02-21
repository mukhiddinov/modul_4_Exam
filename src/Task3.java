import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String file = "example.txt";
        String fileResult = "result.txt";
        File sourceFile = new File(file);

        try {
            FileWriter fileWriter = new FileWriter(file);
            String firstWrite = "2 10";
            fileWriter.write(firstWrite);
            fileWriter.close();

            Scanner scanner = new Scanner(sourceFile);
            FileWriter fileWriterForResult = new FileWriter(fileResult);
            while (scanner.hasNextLine()){
                Integer num1 = scanner.nextInt();
                Integer num2 = scanner.nextInt();
                Integer result = num1 + num2;
                fileWriterForResult.write("Result: " + result);
            }

            fileWriterForResult.close();
            System.out.println("file copied!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
