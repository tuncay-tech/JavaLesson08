package lesson08;

public class page08 {
    public static void main(String[] args) {
        int[] birnci_array = {3, 5, 7, 8, 9,132,24,123,43,54,1};
        int[] ikinci_array = {1, 2, 43, 435, 24,6,2,3,1,52};


        int sourceposition = 2;

        int desinitionposition=3;
        int lenght = 3;
        System.arraycopy(birnci_array ,sourceposition,ikinci_array,desinitionposition,lenght);
        for (int i=0; i <ikinci_array.length;i++){
            System.out.println((i+1)+ ".nci elelman: " + ikinci_array[i]);
        }
    }
}
