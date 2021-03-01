package lesson08;

public class page02 {
    public static void main(String[] args) {
        String[] dizi2 = new String[4];
        //birinci elemana değer atayalım
        dizi2[0]="ahmet";
        //.2. elemana değer atayalım
        dizi2[1]="mehmet";
        //3. elemana değer atayalım
        dizi2[2]="üçüncü eleman";
        //4. elemana değer atayalım
        dizi2[3]="4. elelman";
        dizi2[2] = "değişti";
        System.out.println("1. elemanın değeri: " + dizi2[0]);
        System.out.println("2. elemanın değeri: " + dizi2[1]);
        System.out.println("3. elemanın değeri: " + dizi2[2]);
        System.out.println("4. elemanın değeri: " + dizi2[3]);
    }
}
