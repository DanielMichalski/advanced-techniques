package advanced_techniques.p_97_regex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String url = "http://www.onet.pl";

        InputStreamReader isr =
                new InputStreamReader(new URL(url).openStream());

        StringBuilder sb = new StringBuilder();

        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }

        String patternString = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>]*)\\s*>";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String match = sb.substring(start, end);
            System.out.println(match);
        }
    }
}
