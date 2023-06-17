package Minuman;
class Minuman extends Alkohol implements HargaDiskon {

    public Minuman(int kodeminuman, String namaminuman, String alkohol, int jumlahMinuman) {
        super(kodeminuman, namaminuman, alkohol, jumlahMinuman);
    }

    @Override
    public double hargaMinuman() {
        return getJumlahHalaman()*75;
    }

    @Override
    public double Diskon() {
        return hargaMinuman()*0.1;
    }

    @Override
    public double hargaTotal() {
        return hargaMinuman() - Diskon();
    }

    @Override
    public void view() {
        System.out.println("Data Minuman");
        System.out.println("Kode Minuman\t: "+getKodeMinuman());
        System.out.println("Nama Minuman\t: "+getNamaminuman());
        System.out.println("Brp % Alkohol\t: "+getAlkohol());
        System.out.println("Jumlah Halaman\t: "+getJumlahHalaman());
        System.out.println("Harga Minuman\t: "+hargaMinuman());
        System.out.println("Diskon\t\t: "+Diskon());
        System.out.println("Harga Total\t: "+hargaTotal());
        System.out.println();
    }

    @Override
    public void viewTable() {
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-20d|%-15.2f|%-15.2f|%-15.2f|\n", getKodeMinuman(), "Koktail", getNamaminuman(), getAlkohol(), getJumlahHalaman(), hargaMinuman(), Diskon() , hargaTotal());
    }
}