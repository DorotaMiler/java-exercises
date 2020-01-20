package _i_exceptions._i3_exceptions_must_be_handled;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagerWriter {
    public static void main(String[] args) {

        try {
            run();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    private static void run() throws IOException {
        File file = new File("test.txt");

        FileWriter writer = new FileWriter(file);
        writer.write("This is just a test");
        writer.close();
    }
}
