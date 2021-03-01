package lesson08;

import java.util.Scanner;

public class soru04 {
    public static void main(String[] args) {
        String  ay_ismi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("bir ay giriniz: ");
        ay_ismi = girdi.next();
        switch (ay_ismi){
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("bu ay 31 gündür");
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasim":
                System.out.println("bu ay 30 gündür");
                break;
        }
    }
}
