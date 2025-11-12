package org.example;

public class Kendaraan {

//    ATRIBUTE
    String jenis;
    String warna;
    int kecepatan;

//    KONSTRUKTOR
    public Kendaraan(String jenis, String warna, int kecepatan){
        this.jenis = jenis;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

//    METHOD
    void nyalakanMesin(){
        System.out.println("Menyalakan mesin");
    }

    void matikanMesin(){
        System.out.println("Mematikan mesin");
    }

    void majuKedepan(){
        System.out.println("Berjalan maju");
    }
}
