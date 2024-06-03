package com.pbo.sistemperkuliahan.ui;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-24
 */

public class TextUI {
    private static Scanner userInput = new Scanner(System.in);
    
    public TextUI(){
        System.out.println("Ini adalah konstruktor dari Text UI");
    }
        
    public void run() {
        tampilkanJudul();
        
        int pilihan;
        while (true) {
            System.out.println("\nPilih menu:");
            System.out.println("1. Data Perkuliahan");
            System.out.println("2. Data Dosen");
            System.out.println("3. Data Staf");
            System.out.println("4. Data Mahasiswa");
            System.out.println("5. Keluar");
            
            System.out.print("Masukkan pilihan: ");
            pilihan = userInput.nextInt();
            
            switch (pilihan) {
                case 1:
                    menuPerkuliahan();
                    break;
                case 2:
                    menuDosen();
                    break;
                case 3:
                    menuStaf();
                    break;
                case 4:
                    menuMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
    
    private static void tampilkanJudul() {
        System.out.println("===================================");
        System.out.println("SISTEM INFORMASI AKADEMIK");
        System.out.println("===================================");
    }
    
    private static void menuPerkuliahan() {
        tampilkanJudul();
        
        System.out.println("\nPilih menu:");
        System.out.println("1. List Perkuliahan");
        System.out.println("2. Tambah Perkuliahan");
        System.out.println("3. Edit Perkuliahan");
        System.out.println("4. Kembali ke Menu Utama");
    }
    
    private static void menuDosen() {
        tampilkanJudul();
        
        System.out.println("\nPilih menu:");
        System.out.println("1. List Dosen");
        System.out.println("2. Tambah Dosen");
        System.out.println("3. Kembali ke Menu Utama");
    }
    
    private static void menuStaf() {
        tampilkanJudul();
        
        System.out.println("\nPilih menu:");
        System.out.println("1. List Staf");
        System.out.println("2. Tambah Staf");
        System.out.println("3. Kembali ke Menu Utama");
    }
    
    private static void menuMahasiswa() {
        tampilkanJudul();
        
        System.out.println("\nPilih menu:");
        System.out.println("1. List Mahasiswa");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Kembali ke Menu Utama");
    }
}
