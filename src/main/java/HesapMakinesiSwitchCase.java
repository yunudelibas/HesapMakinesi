package Donguler;

import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;
        Scanner girdi =new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        sayi1= girdi.nextInt();
        System.out.print("Bir Sayı Giriniz:");
        sayi2= girdi.nextInt();
        System.out.println("Seçim Yapınız:\n1-Toplama\n2-Çıkarma\n3-çarpma\n4-Bölme\n");
        secim= girdi.nextInt();
        switch (secim){
            case 1:
                System.out.println("Toplam="+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Fark="+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpım="+(sayi1*sayi2));
                break;
            case 4:
                if (sayi2 !=0) {
                    System.out.println("Bölüm="+(sayi1/sayi2));
                } else {
                    System.out.println("Bölünen sıfır olamaz");
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");

        }

    }
}
