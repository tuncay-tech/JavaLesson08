package lesson08;

import java.util.Scanner;

public class soru05 {
    public static void main(String[] args) {
        String bir_sık_giriniz;
        Scanner girdi = new Scanner(System.in);
        System.out.print("bir şık giriniz: ");
        bir_sık_giriniz = girdi.next();
        switch (bir_sık_giriniz) {
            case "C":
                System.out.println("DOĞRU CEVAP");
                break;
            case "A":
            case "B":
            case "D":
                System.out.println("GEÇERSİZ CEVAP ŞIKKI");
                break;
        }
    }
}
