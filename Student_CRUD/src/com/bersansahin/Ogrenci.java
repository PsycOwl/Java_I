package com.bersansahin;

import java.util.Scanner;

public class Ogrenci {

    Ogrenci(int ID, Scanner s){

        ogrenciID = ID;
        Scanner adinput = new Scanner(System.in);
        System.out.println("Öğrenci Adı: ");
        ad = adinput.nextLine();
        Scanner soyadinput = new Scanner(System.in);
        System.out.println("Öğrenci Soyadı: ");
        soyad = soyadinput.nextLine();

        if (ad.isEmpty()) ad = "NULL";
        if (soyad.isEmpty()) soyad = "NULL";

    }


    private int ogrenciID;
    private String ad;
    private String soyad;

    public int getOgrenciID() {
        return ogrenciID;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
