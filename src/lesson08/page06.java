package lesson08;

public class page06 {
    public static void main(String[] args) {
        String[] birinci_aray = {"bir", "iki", "üç", "dört"};
        String[] ikinci_aray = new String[4];
        ikinci_aray = birinci_aray.clone();
        for (int i = 0; i < ikinci_aray.length; i++) {
            System.out.println((i + 1) + " .ci eleman " + ikinci_aray[i]);
        }
        boolean aynı_mi = birinci_aray.equals(ikinci_aray);
        System.out.println("aynı mı = " + aynı_mi);
    }
}
