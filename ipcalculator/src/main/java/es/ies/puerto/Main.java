package es.ies.puerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce your IP: ");
        String  ip=scanner.nextLine();
        if (Calculator.isIP(ip)) {
            System.out.println("Is a valid IP");
            System.out.println("This IP is a Class "+Calculator.getIPClass());
            if (Calculator.getIPClass().equals("A")||Calculator.getIPClass().equals("B")||Calculator.getIPClass().equals("C")) {
                System.out.println(Calculator.getMaskAndAvalibleIps());    
            }
        }else{
        System.out.println("The IP that you introduce is wrong:"+ip);
        }

    }
}