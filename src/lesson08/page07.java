package lesson08;

public class page07 {
    public static void main(String[] args) {
        int[] biirnci_array = {3, 5, 7, 8, 9};
        int[] ikinici_array = new int[6];  // {3,5,7,8,9,10}
        for (int i = 0; i < biirnci_array.length; i++) {
            ikinici_array[i] = biirnci_array[i];
        }
        ikinici_array[5] = 10;
        // ikinci arrayın elemanlarını yazdıralım
        for (int i = 0; i < ikinici_array.length; i++) {
            System.out.println((i + 1) + ".nci eleman: " + ikinici_array[i]);
        }
    }
}
