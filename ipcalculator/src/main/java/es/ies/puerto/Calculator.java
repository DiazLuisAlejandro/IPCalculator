package es.ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    static String ipString = null;
    static String maskValue = null;

    /**
     * This method calculates if the IP is valid
     * 
     * @param ip that you introduce
     * @return true if is valid
     */
    public static boolean isIP(String ip) {
        String[] ipPart = ip.split("/");

        Pattern pattern1 = Pattern.compile("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}");
        Matcher matcher = pattern1.matcher(ipPart[0]);
        if (matcher.matches()) {
            ipString = ipPart[0];
            Pattern pattern2 = Pattern.compile("^([1-9]|[12][0-9]|3[0-1])");
            matcher = pattern2.matcher(ipPart[1]);
            if (matcher.matches()) {
                maskValue = ipPart[1];
                return true;
            }
        }
        return false;
    }

    /**
     * This method says the IP class
     * 
     * @return the IP class
     */
    public static String getIPClass() {
        String[] ipPart = ipString.split("\\.");

        if (Integer.parseInt(ipPart[0]) < 128) {
            return "A";
        } else if (Integer.parseInt(ipPart[0]) < 192) {
            return "B";
        } else if (Integer.parseInt(ipPart[0]) < 224) {
            return "C";
        } else if (Integer.parseInt(ipPart[0]) < 240) {
            return "D";
        } else {
            return "E";
        }
    }
    /**
     * This gives you the mask and the avalible IP
     * @return the IP and the mask of the network
     */
    public static String getMaskAndAvalibleIps() {
        switch (Integer.parseInt(maskValue)) {
            case 1:
                return "Su mascara es: 128.0.0.0 y tiene 2^31 ip, siendo 2^31-2 los host";
            case 2:
                return "Su mascara es: 192.0.0.0 y tiene 2^30 ip, siendo 2^30-2 los host";
            case 3:
                return "Su mascara es: 224.0.0.0 y tiene 2^29 ip, siendo 2^29-2 los host";
            case 4:
                return "Su mascara es: 240.0.0.0 y tiene 2^28 ip, siendo 2^28-2 los host";
            case 5:
                return "Su mascara es: 248.0.0.0 y tiene 2^27 ip, siendo 2^27-2 los host";
            case 6:
                return "Su mascara es: 252.0.0.0 y tiene 2^26 ip, siendo 2^26-2 los host";
            case 7:
                return "Su mascara es: 254.0.0.0 y tiene 2^25 ip, siendo 2^25-2 los host";
            case 8:
                return "Su mascara es: 255.0.0.0 y tiene 2^24 ip, siendo 2^24-2 los host";
            case 9:
                return "Su mascara es: 255.128.0.0 y tiene 2^23 ip, siendo 2^23-2 los host";
            case 10:
                return "Su mascara es: 255.192.0.0 y tiene 2^22 ip, siendo 2^22-2 los host";
            case 11:
                return "Su mascara es: 255.224.0.0 y tiene 2^21 ip, siendo 2^21-2 los host";
            case 12:
                return "Su mascara es: 255.240.0.0 y tiene 2^20 ip, siendo 2^20-2 los host";
            case 13:
                return "Su mascara es: 255.248.0.0 y tiene 2^19 ip, siendo 2^19-2 los host";
            case 14:
                return "Su mascara es: 255.252.0.0 y tiene 2^18 ip, siendo 2^18-2 los host";
            case 15:
                return "Su mascara es: 255.254.0.0 y tiene 2^17 ip, siendo 2^17-2 los host";
            case 16:
                return "Su mascara es: 255.255.0.0 y tiene 2^16 ip, siendo 2^16-2 los host";
            case 17:
                return "Su mascara es: 255.255.128.0 y tiene 2^15 ip, siendo 2^15-2 los host";
            case 18:
                return "Su mascara es: 255.255.192.0 y tiene 2^14 ip, siendo 2^14-2 los host";
            case 19:
                return "Su mascara es: 255.255.224.0 y tiene 2^13 ip, siendo 2^13-2 los host";
            case 20:
                return "Su mascara es: 255.255.240.0 y tiene 2^12 ip, siendo 2^12-2 los host";
            case 21:
                return "Su mascara es: 255.255.248.0 y tiene 2^11 ip, siendo 2^11-2 los host";
            case 22:
                return "Su mascara es: 255.255.252.0 y tiene 2^10 ip, siendo 2^10-2 los host";
            case 23:
                return "Su mascara es: 255.255.254.0 y tiene 2^9 ip, siendo 2^9-2 los host";
            case 24:
                return "Su mascara es: 255.255.255.0 y tiene 2^8 ip, siendo 2^8-2 los host";
            case 25:
                return "Su mascara es: 255.255.255.128 y tiene 2^7 ip, siendo 2^7-2 los host";
            case 26:
                return "Su mascara es: 255.255.255.192 y tiene 2^6 ip, siendo 2^6-2 los host";
            case 27:
                return "Su mascara es: 255.255.255.224 y tiene 2^5 ip, siendo 2^5-2 los host";
            case 28:
                return "Su mascara es: 255.255.255.240 y tiene 2^4 ip, siendo 2^4-2 los host";
            case 29:
                return "Su mascara es: 255.255.255.248 y tiene 2^3 ip, siendo 2^3-2 los host";
            case 30:
                return "Su mascara es: 255.255.255.252 y tiene 2^2 ip, siendo 2^2-2 los host";
            case 31:
                return "Su mascara es: 255.255.255.254 y tiene 2^1 ip, siendo 2^1-2 los host";

        }
        return null;
    }

}
