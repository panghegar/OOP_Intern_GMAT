package org.example;

public abstract class Kendaraan {

    // ATRIBUT
    private String jenis;
    private String warna;
    private int kecepatan;

    // KONSTRUKTOR
    public Kendaraan(String jenis, String warna, int kecepatan){
        this.jenis = jenis;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // SETTER
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    // GETTER
    public String getJenis(){
        return jenis;
    }

    public String getWarna(){
        return warna;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    // METHOD ABSTRACT
    abstract void nyalakanMesin();

    // METHOD BIASA
    void matikanMesin(){
        System.out.println("Mematikan mesin");
    }

    void majuKedepan(){
        System.out.println("Berjalan maju");
    }

    // OVERLOADING
    void majuKedepan(int jarak) {
        System.out.println(jenis + " maju sejauh " + jarak + " meter");
    }

    void majuKedepan(int jarak, int detik) {
        System.out.println(jenis + " maju sejauh " + jarak + " meter dalam " + detik + " detik");
    }

    void info(){
        System.out.println("Jenis mobil\t\t:" + jenis);
        System.out.println("Warna mobil\t\t:" + warna);
        System.out.println("Kecepatan mobil\t:" + kecepatan + "\n");
    }
}
