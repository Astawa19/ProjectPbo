package Minuman;
//Inheritance
class Botol extends Alkohol {
    public Botol(int kodeminuman,String jenis, String namaminuman, String alkohol, int jumlahMinuman) {
        super(kodeminuman, jenis, namaminuman, alkohol, jumlahMinuman);
    }
    public Botol() {
        super();
    }
    @Override
    public double hargaMinuman() {
        return getJumlahHalaman()*50;
    }
    public double Diskon() {
        return hargaMinuman()*0.1;
    }
    @Override
    public double hargaTotal() {
        return hargaMinuman() - Diskon();
    }
    
    public void view1(){
     System.out.println("Data Botol");
    }

    @Override
    public void view() {
        System.out.println("Data Botol");
        System.out.println("Kode Minuman\t: "+getKodeMinuman());
        System.out.println("Nama Minuman\t: "+getNamaminuman());
        System.out.println("Beralkohol\t: "+getAlkohol());
        System.out.println("Jumlah Minuman\t: "+getJumlahHalaman());
        System.out.println("Harga Minuman\t: "+hargaMinuman());
        System.out.println("Diskon\t\t: "+Diskon());
        System.out.println("Harga Total\t: "+hargaTotal());
        System.out.println();
    }

    @Override
    public void viewTable() {
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-20d|%-15.2f|%-15.2f|%-15.2f|\n", getKodeMinuman(), getJenis(), getNamaminuman(), getAlkohol(), getJumlahHalaman(), hargaMinuman(), Diskon() , hargaTotal());
    }


}