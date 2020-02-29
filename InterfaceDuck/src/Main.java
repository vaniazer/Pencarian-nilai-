import Defense.*;
import Fly.*;
import Offense.*;
import Sound.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih;
        char kembali;
        String nama;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Masukkan nama Duck : ");
            nama = input.next();
            System.out.println("-------------------------   -------------------------");
            System.out.println("|      MENU SUPER(1)    |   |      MENU NOOB(2)     |");
            System.out.println("-------------------------   -------------------------");
            System.out.println("|1. Rocket Fly          |   |1. Wings Fly           |");
            System.out.println("|2. Toa Sound           |   |2. Normal Sound        |");
            System.out.println("|3. Gun Offense         |   |3. Sword Offense       |");
            System.out.println("|1. Armor Defense       |   |4. Shield Defense      |");
            System.out.println("-------------------------   -------------------------");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new GunOffense(), new ArmorDefense());// Mainnya bikin objek
                    System.out.println("Super Duck Behavior : ");
                    System.out.println("Nama Duck adalah " + nama + " Memiliki :");
                    superDuck.fly();  //parameternya new rocket fly(bikin objeknya si rocketnya) dan juga toa sound
                    superDuck.sound();
                    superDuck.offense();
                    superDuck.defense();
                    break;
                case 2:

                    System.out.println("");
                    System.out.println("Noob Duck Behavior : ");
                    System.out.println("Nama Duck adalah " + nama + " Memiliki :");
                    Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordOffense(), new ShieldDefense());
                    noobDuck.fly();
                    noobDuck.sound();
                    noobDuck.offense();
                    noobDuck.defense();
                    break;
            }

                System.out.println("-----------------------------------------------------------");
                System.out.println("Ingin kembali ke menu awal? (y/n)");
                kembali = input.next().charAt(0);
            } while ( kembali == 'Y' || kembali == 'y');






        }
    }
