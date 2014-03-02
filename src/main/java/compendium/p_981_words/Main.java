package compendium.p_981_words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("to jest test.");

        while (mat.find()) {
            System.out.println("Dopasowana sekwencja: " + mat.group());
        }
    }
}
