package compendium.p_982_replace_all;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";

        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Oryginala sekwencja: " + str);

        str = mat.replaceAll("Eric ");
        System.out.println("Zmodyfikowana sekwencja: " + str);
    }
}
