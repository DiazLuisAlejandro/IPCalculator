package es.ies.puerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce your IP: ");
        String  ip=scanner.nextLine();
        if (Calcuator.isIP(ip)) {
            System.out.println("Is a valid IP");
        }else{
        System.out.println("The IP that you introduce is wrong:"+ip);
        }
    }
}