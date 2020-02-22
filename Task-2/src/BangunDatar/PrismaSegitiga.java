package BangunDatar;

public class PrismaSegitiga extends Segitiga {
    private double tinggi;
    @Override
    public double luas(double alas, double tinggi){
        return super.luas(alas, tinggi)*getTinggi();
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
}
