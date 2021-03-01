package lesson08;

import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {
        String gun;
        Scanner girdi = new Scanner(System.in);
        System.out.println("gün giriniz: ");
        gun = girdi.next();
        switch (gun) {
            case "cuma":
                System.out.println("müslümanlar için kutsal gün");
                break;
            case "cumartesi":
                System.out.println("yahudiler  için kutsal gün");
                break;
            case "pazar":
                System.out.println("hristiyanlar için kutsal gün");
                break;
            default:
                System.out.println("kutsal gün değildir");
        }

    }

}
