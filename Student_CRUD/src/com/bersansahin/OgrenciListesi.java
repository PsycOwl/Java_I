package com.bersansahin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciListesi {

    private int size = 13061000;

    private List<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();


    public int generateID(){
        size += 1;
        return size;

    }

    private Ogrenci ogrenciBul(int ogrenciID) {
        for(Ogrenci ogrenci : ogrenciListesi) {
            if(ogrenci.getOgrenciID() == ogrenciID) {
                return ogrenci;
            }
        }
        System.out.println("Öyle bir öğrenci yok");
        return null;
    }


    public void ogrenciEkle(Scanner s){

        Ogrenci o = new Ogrenci(generateID(), s);
        ogrenciListesi.add(o);

    }

    public void ogrenciSil(int ID){

        ogrenciListesi.remove(ogrenciBul(ID));

    }

    public void ogrenciGuncelle(int ID) throws java.lang.NullPointerException {


        if (ogrenciBul(ID) != null){

            System.out.println(ogrenciBul(ID).getAd()+" "+ ogrenciBul(ID).getSoyad()+"\n");

            Scanner adinput = new Scanner(System.in);
            System.out.println("Öğrencinin yeni adını girin: ");
            ogrenciBul(ID).setAd(adinput.nextLine());
            Scanner soyadinput = new Scanner(System.in);
            System.out.println("Öğrencinin yeni soyadını girin: ");
            ogrenciBul(ID).setSoyad(soyadinput.nextLine());

        }
        else System.out.println("Öyle bir öğrenci yok");

    }

    public void listele() {
        for(Ogrenci ogrenci : ogrenciListesi) {
            System.out.println(ogrenci.getOgrenciID()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad());
        }
    }


}

