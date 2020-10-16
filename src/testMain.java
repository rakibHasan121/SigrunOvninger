import java.io.*;

/**
 * Created by rakib
 * Date: 2020-10-15
 * Time: 17:20
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
public class testMain {
    public static void main(String[] args) throws IOException {
        String textToAppend = "Happy Learning 2!!";
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/Inlämningsuppgift/Inlämningsuppgift_2/AllFiles/log.txt", true));

        writer.write(textToAppend);
        writer.newLine();

        writer.close();
    }
}
