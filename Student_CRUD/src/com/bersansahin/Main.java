package com.bersansahin;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        OgrenciListesi Okul = new OgrenciListesi();
        Scanner main = new Scanner(System.in);
        int choice;

        System.out.println("\t Ahmet Bersan Şahin'in Öğrenci CRUD sistemine hoşgeldiniz\n\n  ");

        do {
            System.out.println("Şeçim yapın ");
            System.out.println("1. Öğrenci Ekle ");
            System.out.println("2. Öğrenci listesini göster");
            System.out.println("3. Öğrenci güncelle ");
            System.out.println("4. Öğrenci sil ");
            System.out.println("5. Çıkış ");
            System.out.print("Sençeneği yaz : ");
            choice = main.nextInt();
            main.nextLine();
            if (choice == 1) {
                Okul.ogrenciEkle(main);
            }
            else if (choice == 2) {
                Okul.listele();
            }
            else if (choice == 3) {
                System.out.println("Güncellemek istediğiniz öğrencinin ID'sini giriniz");
                Okul.ogrenciGuncelle(main.nextInt());
            }
            else if (choice == 4) {
                System.out.println("Silmek istediğiniz öğrencinin ID'sini giriniz: ");
                Okul.ogrenciSil(main.nextInt());
            }

        } while (choice != 5);
    }
}
