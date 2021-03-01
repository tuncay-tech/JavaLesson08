package lesson08;

import java.util.Arrays;

public class page09 {
    public static void main(String[] args) {
        int[] birnci_array = {3, 5, 7, 8, 9, 32, 369, 325, 14};

        // sorttan önce
        for (int i = 0; i < birnci_array.length; i++) {
            System.out.print(birnci_array[i] + "--");
        }
        System.out.println();
        Arrays.sort(birnci_array);

        // sorttan sonra   yani sort arraylarin küçüktün büyüğe doğru sıralyor
        for (int i = 0; i < birnci_array.length; i++) {
            System.out.print(birnci_array[i] + "--");
        }

    }
}
