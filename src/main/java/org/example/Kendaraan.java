package org.example;

public class Kendaraan {

//    ATRIBUTE
    private String jenis;
    private String warna;
    private int kecepatan;

//    KONSTRUKTOR
    public Kendaraan(String jenis, String warna, int kecepatan){
        this.jenis = jenis;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

//    SETTER
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

//    GETTER
    public String getJenis(){
        return jenis;
    }

    public String getWarna(){
        return warna;
    }
    public int getKecepatan(){
        return kecepatan;
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

