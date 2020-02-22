package BangunDatar;

public class PersegiPanjang extends BangunDatar{

    @Override
    public double luas(double alas, double tinggi) {
        double hasil = alas*tinggi;
        return hasil;
    }
    public double keliling(double alas,double tinggi){
        double hasil = 2*(alas+tinggi);
        return hasil;
    }
}
