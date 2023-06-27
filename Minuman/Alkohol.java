package Minuman;

//Abstraction
abstract class Alkohol {

    //Encapsulation
    private String namaminuman, alkohol;
    private int jumlahHalaman, kodeminuman;


    public void setKodeMinuman(int kodeminuman) {
        this.kodeminuman = kodeminuman;
    }

    public void setNamaminuman(String namaminuman) {
        this.namaminuman = namaminuman;
    }

    public void setAlkohol(String alkohol) {
        this.alkohol = alkohol;
    }
  
    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
    //constructor
    public Alkohol (int kodeminuman, String namaminuman, String alkohol, int jumlahHalaman) {
        this.kodeminuman = kodeminuman;
        this.namaminuman = namaminuman;
        this.alkohol = alkohol;
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getKodeMinuman() {
        return kodeminuman;
    }

    public String getNamaminuman() {
        return namaminuman;
    }

    public String getAlkohol() {
        return alkohol;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

//Polymorphism
    abstract public double hargaMinuman ();
    abstract public double hargaTotal ();
    abstract public void view ();
    abstract public void viewTable();
}
