package BangunDatar;

public class Segitiga extends BangunDatar {
    @Override
    public double luas(double alas, double tinggi) {
        double hasil = (alas * tinggi)/2;
        return hasil;
    }
    public double keliling(double alas){
        double hasil = alas*alas*alas;
        return hasil;
    }

}
