package org.example;

public class Main {
            public static void main(String[] args) {

//        BUAT OBJECT
        Kendaraan mobil = new Kendaraan("Mobil", "Hitam", 80);
//        OBJEK DARI SUBCLASS
        Mobil BMWPutih = new Mobil("Putih", 120, 4, 4);
//        OBJEK OVERRIDE
        Kendaraan avanzaOverride = new Kendaraan("Mobil", "Hitam", 60);
        Mobil avanzaOverride2 = new Mobil("Hitam", 60, 4, 4);

//        OVERLOADING
        Kendaraan baracuda = new Kendaraan("Rantis", "Hitam", 80);

//        System.out.println("Jenis mobil\t\t:" + mobil.jenis);
//        System.out.println("Warna mobil\t\t:" + mobil.warna);
//        System.out.println("Kecepatan mobil\t:" + mobil.kecepatan);
//        mobil.kecepatan = 100;


//        PAKAI GETTER & SETTER
//        System.out.println("Jenis mobil\t\t:" + mobil.getJenis());
//        System.out.println("Warna mobil\t\t:" + mobil.getWarna());
//        System.out.println("Kecepatan mobil\t:" + mobil.getKecepatan());
//
//        mobil.setKecepatan(100);
//
//        System.out.println("\nPerubahan");
//        System.out.println("Kecepatan baru \t: " + mobil.getKecepatan());
//
//        mobil.nyalakanMesin();
//        mobil.majuKedepan();

//        INHERITENCE
//        BMWPutih.info(); //SUPERCLASS
//        BMWPutih.nyalakanMesin(); //SUPERCLASS
//        BMWPutih.menjalankanRoda(); //SUBCLASS
//        BMWPutih.bukaPintu();

//        OVERRIDE
//        avanzaOverride.majuKedepan();
//        avanzaOverride2.majuKedepan();

//        OVERLOADING
        baracuda.majuKedepan();
        baracuda.majuKedepan(100);
        baracuda.majuKedepan(100, 10);
    }
}