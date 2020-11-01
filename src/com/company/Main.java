package com.company;

import java.util.*;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void printProgramTitle(String title) {
        System.out.println("**** DAFTAR INFORMASI MAHASISWA****");
        System.out.println("**");
        System.out.println("*******");
    }
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input jumlah data: ");
        int jmlData = input.nextInt();
        List<Mahasiswa> daftarMhs = new ArrayList<>();
        for (int i = 0; i < jmlData ; i++) {
            System.out.println("Input data ke- "+ (i + 1) +" ");
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Input NIM: ");
                String nim = input.nextLine();
                System.out.print("Input Nama: ");
                String nama = input.nextLine();
                System.out.print("Input IPK: ");
                double ipk = input.nextDouble();
                System.out.println("");
                daftarMhs.add(new Mahasiswa(nim, nama, ipk));
            }catch(Exception e) {
                System.out.print("Input Salah : " + e);
            }
        }
        MahasiswaComporator comporator = new MahasiswaComporator();
        Collections.sort(daftarMhs,comporator);
        System.out.println("\nHasil Sorting: ");
        for (Mahasiswa mhsall:daftarMhs)
            System.out.println(mhsall.toString());
    }
}