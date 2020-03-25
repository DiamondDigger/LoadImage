package Loading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class CreateAndWriteFile {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("D:\\home_Projects\\udemy\\practice-java-building-projects\\Images\\src\\Loading\\log.txt");
        if (file.createNewFile()){
            System.out.println("File log.txt is created");
        }

        String text = "\nD:\\\\home_Projects\\\\udemy\\\\practice-java-building-projects\\\\Images\\\\src\\\\Loading\\\\log.txt";

        FileWriter fileWriter = new FileWriter("D:\\home_Projects\\udemy\\practice-java-building-projects\\Images\\src\\Loading\\log.txt");
        fileWriter.write("Yeeeeh! We'v done it !! Great job! Write another one! ");
//        fileWriter.close();
        System.out.println("Successfully wrote the file!");

        fileWriter.write(text);
        fileWriter.close();
        sleep(5000);
        System.out.println("Sleeping 5 seconds");
       file.delete();
        System.out.println("Deleted file");
    }
}
