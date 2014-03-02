package compendium.p_978_regex_matches;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        Matcher mat;
        boolean found;

        Pattern pat = Pattern.compile("Java");

        mat = pat.matcher("Java");
        found = mat.matches();
        System.out.println("Dopasowywanie slowa Java do slowa Java");
        System.out.println("Pasuje? " + found);

        mat = pat.matcher("Java 7");
        found = mat.matches();
        System.out.println("Dopasowywanie slowa Java do slowa Java 7");
        System.out.println("Pasuje? " + found);
    }
}
