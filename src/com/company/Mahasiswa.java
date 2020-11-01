package com.company;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Double ipk;

    public Mahasiswa(String nim, String nama, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    public String toString(){
        return String.format("%-15s %-25s %s", this.nim, this.nama, this.ipk);
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public double getIpk(){
        return ipk;
    }

}
