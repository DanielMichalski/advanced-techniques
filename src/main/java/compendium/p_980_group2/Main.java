package compendium.p_980_group2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()) {
            System.out.println("Dopasowana sekwencja: " + mat.group());
        }
    }
}
