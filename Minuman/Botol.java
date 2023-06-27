package Minuman;
//Inheritance
class Botol extends Alkohol {
    public Botol(int kodeminuman, String namaminuman, String alkohol, int jumlahMinuman) {
        super(kodeminuman, namaminuman, alkohol, jumlahMinuman);
    }

    @Override
    public double hargaMinuman() {
        return getJumlahHalaman()*50;
    }
    
    @Override
    public double hargaTotal() {
        return hargaMinuman();
    }

    @Override
    public void view() {
        System.out.println("Data Botol");
        System.out.println("Kode Minuman\t: "+getKodeMinuman());
        System.out.println("Nama Minuman\t: "+getNamaminuman());
        System.out.println("Beralkohol\t: "+getAlkohol());
        System.out.println("Jumlah Minuman\t: "+getJumlahHalaman());
        System.out.println("Harga Minuman\t: "+hargaMinuman());
        System.out.println("Harga Total\t: "+hargaTotal());
        System.out.println();
    }

    @Override
    public void viewTable() {
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-20d|%-15.2f|%-15.2f|%-15.2f|\n", getKodeMinuman(), "minuman", getNamaminuman(), getAlkohol(), getJumlahHalaman(), hargaMinuman(), 0.0 , hargaTotal());
    }


}