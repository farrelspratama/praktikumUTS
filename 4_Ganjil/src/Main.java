class LimasSegiEmpat {
    double luasAlas;
    double luasSelubungLimas;
    double tinggi;

    // Konstruktor dengan nilai default
    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

    // Konstruktor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    public double getVolume() {
        return (luasAlas * tinggi) / 3;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek limas segi empat dengan setter
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        
        limas1.setLuasAlas(1);
        limas1.setLuasSelubung(1);
        limas1.setTinggi(1);
        
        System.out.println("Limas segi empat dengan luas alas : " + limas1.luasAlas 
                + ", luas selubung limas : " + limas1.luasSelubungLimas 
                + " dan tinggi : " + limas1.tinggi 
                + ". Luasnya : " + limas1.getLuas() 
                + ", sedangkan volumenya : " + limas1.getVolume());
        
        // Membuat objek limas segi empat dengan konstruktor parameter
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);

        System.out.println("Limas segi empat dengan luas alas : " + limas2.luasAlas 
                + ", luas selubung limas : " + limas2.luasSelubungLimas 
                + " dan tinggi : " + limas2.tinggi 
                + ". Luasnya : " + limas2.getLuas() 
                + ", sedangkan volumenya : " + limas2.getVolume());
        
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        System.out.println("Limas segi empat dengan luas alas : " + limas3.luasAlas 
                + ", luas selubung limas : " + limas3.luasSelubungLimas 
                + " dan tinggi : " + limas3.tinggi 
                + ". Luasnya : " + limas3.getLuas() 
                + ", sedangkan volumenya : " + limas3.getVolume());
    }
}
