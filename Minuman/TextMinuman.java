package Minuman;

class TextMinuman extends Alkohol implements HargaDiskon {
    public TextMinuman(int kodeminuman, String namaminuman, String alkohol, int jumlahMinuman) {
        super(kodeminuman, namaminuman, alkohol, jumlahMinuman);
    }

    @Override
    public double hargaMinuman() {
        return getJumlahHalaman()*150;
    }
    
    @Override
    public double Diskon() {
        return hargaMinuman()*0.2;
    }

    @Override
    public double hargaTotal() {
        return hargaMinuman() - Diskon();
    }


    @Override
    public void view() {
        System.out.println("Data TextMinuman");
        System.out.println("Kode Minuman\t\t: "+getKodeMinuman());
        System.out.println("Nama Minuman\t\t: "+getNamaminuman());
        System.out.println("Nama Pengarang\t\t: "+getAlkohol());
        System.out.println("Jumlah Halaman\t\t: "+getJumlahHalaman());
        System.out.println("Harga Minuman\t\t: "+hargaMinuman());
        System.out.println("Diskon\t\t\t: "+Diskon());
        System.out.println("Harga Total\t\t: "+hargaTotal());
        System.out.println("===============================");
    }

    @Override
    public void viewTable() {
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-20d|%-15.2f|%-15.2f|%-15.2f|\n", getKodeMinuman(), "campuran", getNamaminuman(), getAlkohol(), getJumlahHalaman(), hargaMinuman(), Diskon() , hargaTotal());
    }
}
