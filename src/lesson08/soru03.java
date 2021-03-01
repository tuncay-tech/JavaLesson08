package lesson08;

import java.util.Scanner;

public class soru03 {
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        sayi = girdi.nextInt();
        switch (sayi){
            case 9:
                System.out.println("bir basamaklı en büyük sayı");
                break;
            case 99:
                System.out.println("iki basamaklı en büyük sayı");
                break;

            case 999:
                System.out.println("üç basamaklı en büyük sayı");
                break;
            default:
                System.out.println("yorum yok");

        }
    }
}
