import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = input.nextInt();
        int basamaksayisi = 0;
        int gecicisayi = sayi;
        int basamakdeger;
        int sonuc = 0;
        int basamakkuvveti;

        while (gecicisayi != 0) {
            gecicisayi /= 10;
            basamaksayisi++;
        }

        gecicisayi = sayi;
        while (gecicisayi != 0) {
            basamakdeger = gecicisayi % 10;
            // 1*1*1*1 = 1^4
            basamakkuvveti = 1;
            for (int i = 1; i <= basamaksayisi; i++) {
                basamakkuvveti *= basamakdeger;
            }
            sonuc += basamakkuvveti;
            gecicisayi /= 10;
        }

        if (sonuc == sayi) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }


    }
}