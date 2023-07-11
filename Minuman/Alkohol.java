package Minuman;

//Abstraction
abstract class Alkohol {

    //Encapsulation
    private String namaminuman, alkohol,jenis;
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
  
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
    //constructor
    //revisi menambah counstructor tanpa parameter untuk penjalasan ada readme
    public Alkohol(){
        this.kodeminuman = 5;
        this.namaminuman = "aqua";
        this.alkohol = "0%";
        this.jenis = "Mineral";
        this.jumlahHalaman = 200;
    }
    public Alkohol (int kodeminuman,String jenis, String namaminuman, String alkohol, int jumlahHalaman) {
        this.kodeminuman = kodeminuman;
        this.namaminuman = namaminuman;
        this.alkohol = alkohol;
        this.jenis = jenis;
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

    public String getJenis() {
        return jenis;
    }
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }


//Polymorphism

//overreading
    abstract public double hargaMinuman ();
    abstract public double hargaTotal ();
    abstract public void view ();
    abstract public void viewTable();
}
