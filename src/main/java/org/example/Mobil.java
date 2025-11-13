package org.example;

public class Mobil extends Kendaraan{
    private int jmlPintu;
    private int jmlRoda;

    public Mobil( String warna, int kecepatan, int jmlPintu, int jmlRoda){
        super("Mobil", warna, kecepatan); // Dari suoer class
        this.jmlPintu = jmlPintu;
        this.jmlRoda = jmlRoda;
    }

    public void bukaPintu(){
        System.out.println("Membuka " + jmlPintu + " pintu");
    }

    public void menjalankanRoda(){
        System.out.println("Menjalankan " + jmlRoda + " roda");
    }

//    OVERRIDING
    @Override
    void majuKedepan(){
        System.out.println("Mobil melaju dengan kecepatan tinggi");
    }
}
