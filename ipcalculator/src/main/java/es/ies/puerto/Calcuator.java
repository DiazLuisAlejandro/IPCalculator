package es.ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calcuator {
    public static boolean isIP(String ip){
        String[]ippart =ip.split(".*/.*");
        Pattern pattern1=Pattern.compile("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}");
        Matcher matcher= pattern1.matcher(ippart[0]);
        if (matcher.matches()) {
            Pattern pattern2=Pattern.compile("^/([1-9]|[12][0-9]|3[0-2])");
            matcher=pattern2.matcher(ippart[1]);
            if (matcher.matches()) {
                return true;    
            }
        }
        return false;
    }
}
