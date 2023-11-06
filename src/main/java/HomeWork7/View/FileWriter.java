package HomeWork7.View;
import java.io.IOException;

public class FileWriter {
    public void loggi(String string) {
        try (java.io.FileWriter fw = new java.io.FileWriter("file.txt", true)) {
            fw.append(string);
            fw.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
