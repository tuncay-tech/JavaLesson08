package lesson08;

import java.util.Scanner;

public class soru02 {
    public static void main(String[] args) {
        String harf;
        Scanner girdi = new Scanner(System.in);
        System.out.print(" bir harf giriniz: ");
        harf = girdi.next();
        if (harf.length()==1){
            switch (harf){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("sesli harf");
                    break;
                case "b":
                case "d":
                case "f":
                    System.out.println("sessiz harf");
                    break;
                default:
                    System.out.println("geçersiz karakter");
            }
        }else {
            System.out.println("lütfen bir harf giriniz");
        }
    }
}
