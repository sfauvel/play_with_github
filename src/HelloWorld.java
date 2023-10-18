
import java.io.*;
import java.nio.charset.StandardCharsets;

public class HelloWorld {
    public static void main(String[] args) {
        final String message = "Bonjour Sébastien";


        try (OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream("hello2.adoc"), StandardCharsets.UTF_8)) {
            fileWriter.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new FileWriter("hello.adoc")) {
            fileWriter.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello, World!");
    }
}
