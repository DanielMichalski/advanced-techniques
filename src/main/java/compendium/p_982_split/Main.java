package compendium.p_982_split;

import java.util.regex.Pattern;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        String str = "one two, alpha9 12!done";

        Pattern pattern = Pattern.compile("[ ,.!]+");

        String[] strs = str.split(pattern.pattern());

        for (String s : strs) {
            System.out.println(s);
        }
    }
}
