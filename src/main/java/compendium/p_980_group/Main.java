package compendium.p_980_group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {

        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");

        while (mat.find()) {
            System.out.println("Dopasowana sekwencja: " + mat.group());
        }
    }
}
