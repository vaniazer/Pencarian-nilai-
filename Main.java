package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan Berapa Kali Input: ");

        int array = angka.nextInt();
        int nilai[]=new int[array];
        String namadepan, namabelakang;
        int tinggi;
        int rendah;
        int jumlah = 0;
        int rata;
        int i;
        System.out.print("Masukan Nama Depan : ");
        namadepan = angka.next();
        System.out.print("Masukan Nama Belakang : ");
        namabelakang = angka.next();


        for (i=0; i<array;i++){

            System.out.print("Masukan Nilai : ");
            nilai[i] = angka.nextInt();
            jumlah = jumlah + nilai[i];
        }

	    rendah = nilai[0];
        tinggi = nilai[0];

            for (i=0;i<array;i++){
                if (nilai[i] > tinggi){
                    tinggi = nilai[i];
                }
                else if (nilai[i] < rendah){
                    rendah = nilai[i];
                }
            }
        rata = jumlah/array;

        System.out.println("--------------------------------------");
        System.out.println("Nama = " + namadepan + " " + namabelakang);
        System.out.println("Nilai tertinggi = " +tinggi);
        System.out.println("Nilai terendah = " +rendah);
        System.out.println("Nilai rata rata = " +rata);

    }
}
