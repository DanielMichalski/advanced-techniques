package compendium.p_979_regex_find;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher("test 1 2 3 test");

        while (matcher.find()) {
            System.out.println("Slowo znalezione pod indeksem " + matcher.start());
        }
    }
}
