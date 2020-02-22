package BangunDatar;

import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alas,tinggi, tinggiSegitiga,tinggiPersegi;
        int pilih, pil, plh;
        char kembali, kemb, kbli;
        do{
            System.out.println("-------------------------");
            System.out.println("        MENU UTAMA       ");
            System.out.println("-------------------------");
            System.out.println("|1. Persegi Panjang      |");
            System.out.println("|2. Segitiga             |");
            System.out.println("-------------------------");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Input Panjang Persegi Panjang :");
                    alas = input.nextDouble();
                    System.out.print("Input Lebar Persegi Panjang :");
                    tinggi = input.nextDouble();
                    PersegiPanjang luasPerPan = new PersegiPanjang();
                    System.out.println("Luasnya adalah " + luasPerPan.luas(alas,tinggi));
                    PersegiPanjang kelilingPerPan = new PersegiPanjang();
                    System.out.println("Kelilingnya adalah " + kelilingPerPan.keliling(alas,tinggi));
                    do{
                        System.out.println("-----------------------------------");
                        System.out.println("        MENU PERSEGI PANJANG       ");
                        System.out.println("-----------------------------------");
                        System.out.println("|1. Balok                         |");
                        System.out.println("|2. Limas Persegi Panjang         |");
                        System.out.println("-----------------------------------");
                        System.out.print("Pilih = ");
                        pil = input.nextInt();
                        switch (pil){
                            case 1:
                                System.out.print("Input Tinggi Balok :");
                                tinggiPersegi = input.nextDouble();
                                Balok VolumeBalok = new Balok();
                                VolumeBalok.setTinggi(tinggiPersegi);
                                System.out.println("Volumenya adalah " + VolumeBalok.luas(alas,tinggi));
                                break;
                            case 2:
                                System.out.print("Input Tinggi Limas Persegi Panjang :");
                                tinggiPersegi = input.nextDouble();
                                LimasPersegiPanjang VolumeLimasBalok = new LimasPersegiPanjang();
                                VolumeLimasBalok.setTinggi(tinggiPersegi);
                                System.out.println("Volumenya adalah " + VolumeLimasBalok.luas(alas,tinggi));
                                break;

                        }
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Ingin kembali ke menu awal? (y/n)");
                        kembali = input.next().charAt(0);
                    } while ( kembali == 'Y' || kembali == 'y');
                    break;
                case 2:
                    System.out.print("Input Alas Segitiga :");
                    alas = input.nextDouble();
                    System.out.print("Input Tinggi Segitiga:");
                    tinggi = input.nextDouble();
                    Segitiga luasSegitiga = new Segitiga();
                    System.out.println("Luasnya adalah " + luasSegitiga.luas(alas,tinggi));
                    Segitiga kelilingSegitiga = new Segitiga();
                    double SamaSisi = kelilingSegitiga.keliling((float)alas);
                    System.out.println("Kelilingnya adalah " + SamaSisi);

                    do{
                        System.out.println("-----------------------------------");
                        System.out.println("           MENU SEGITIGA           ");
                        System.out.println("-----------------------------------");
                        System.out.println("|1. Prisma Segitiga               |");
                        System.out.println("|2. Limas Segitiga                |");
                        System.out.println("-----------------------------------");
                        System.out.print("Pilih = ");
                        plh = input.nextInt();
                        switch (plh){
                            case 1:
                                System.out.print("Input Tinggi Prisma Segitiga :");
                                tinggiSegitiga = input.nextDouble();
                                PrismaSegitiga VolumePrisma = new PrismaSegitiga();
                                VolumePrisma.setTinggi(tinggiSegitiga);
                                System.out.println("Volumenya adalah " + VolumePrisma.luas(alas,tinggi));
                                break;
                            case 2:
                                System.out.print("Input Tinggi Limas Segitiga :");
                                tinggiSegitiga = input.nextDouble();
                                LimasSegitiga VolumeLimas = new LimasSegitiga();
                                VolumeLimas.setTinggi(tinggiSegitiga);
                                System.out.println("Volumenya adalah " + VolumeLimas.luas(alas,tinggi));
                                break;

                        }
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Ingin kembali ke menu awal? (y/n)");
                        kemb = input.next().charAt(0);
                    } while ( kemb == 'Y' || kemb == 'y');
                    break;
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("Ingin kembali ke menu awal? (y/n)");
            kbli = input.next().charAt(0);
        } while ( kbli == 'Y' || kbli == 'y');

    }
}
