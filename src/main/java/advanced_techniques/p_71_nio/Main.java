package advanced_techniques.p_71_nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("src", "main", "resources", "nio.txt");
            byte[] bytes = Files.readAllBytes(path);
            String s = new String(bytes, "UTF-8");
            System.out.println(s);

            String text = "\nDołączony tekst";
            Files.write(path, text.getBytes(), StandardOpenOption.APPEND);

            List<String> strings = Files.readAllLines(path, Charset.defaultCharset());
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
