package org.example;

public class Main {
            public static void main(String[] args) {

//        BUAT OBJECT
        Kendaraan mobil = new Kendaraan("Mobil", "Hitam", 80);


//        System.out.println("Jenis mobil\t\t:" + mobil.jenis);
//        System.out.println("Warna mobil\t\t:" + mobil.warna);
//        System.out.println("Kecepatan mobil\t:" + mobil.kecepatan);
//        mobil.kecepatan = 100;


//        PAKAI GETTER & SETTER
        System.out.println("Jenis mobil\t\t:" + mobil.getJenis());
System.out.println("Warna mobil\t\t:" + mobil.getWarna());
        System.out.println("Kecepatan mobil\t:" + mobil.getKecepatan());

        mobil.setKecepatan(100);

        System.out.println("\nPerubahan");
        System.out.println("Kecepatan baru \t: " + mobil.getKecepatan());

        mobil.nyalakanMesin();
        mobil.majuKedepan();
    }
}