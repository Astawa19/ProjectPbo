package Minuman;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int tanya;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Botol minuman = new Botol(1,"Soda", "VODKA", "40%", 100);
        Botol botol1 = new Botol(2,"Alkohol", "Black Tea", "40%", 100);
        Botol minuman1 = new Botol(3,"Campuran", "RUM", "40%", 60);
        Botol aqua = new Botol();
        ArrayList<Alkohol> listAlkohol = new ArrayList<Alkohol>();

        listAlkohol.add(minuman);
        listAlkohol.add(botol1);
        listAlkohol.add(minuman1);
         listAlkohol.add(aqua);

        while (true) {
            ubahIndex(listAlkohol);
            do {
                System.out.println("=================================");
                System.out.println("|           Toko VIBE           |");
                System.out.println("=================================");
                System.out.println("| 1. Data Minuman               |");
                System.out.println("| 2. Transaksi                  |");
                System.out.println("| 3. Tambah Minuman             |");
                System.out.println("| 4. Hapus Minuman              |");
                System.out.println("| 5. Keluar                     |");
                System.out.println("=================================");
                System.out.print(" Masukan Pilihan : ");
                tanya = input.nextInt();
            } while (tanya < 1 || tanya > 5);

            if (tanya == 1) {
                tampilDataTabel(listAlkohol);
            } else if (tanya == 2) {
                transaksi(listAlkohol);
            } else if (tanya == 3) {
                tambahData(listAlkohol);
            } else if (tanya == 4) {
                hapusData(listAlkohol);
            } else {
                System.out.println("=================================");
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }
        }
    }

    public static void ubahIndex(ArrayList<Alkohol> listAlkohol) {
        for (int index = 1; index <= listAlkohol.size(); index++) {
            Alkohol alkohol = listAlkohol.get(index-1);
            alkohol.setKodeMinuman(index);
        }
    }

    public static void tampilData(ArrayList<Alkohol> listAlkohol) {
        System.out.println("=================================");
        System.out.println("            Data Minuman");
        System.out.println();
        for (int i = 0; i < listAlkohol.size(); i++) {
            System.out.print(i + ". ");
            listAlkohol.get(i).view();
        }
    }

    public static void tampilDataTabel(ArrayList<Alkohol> listAlkohol) {
        System.out.println();
        System.out.println(
                "=================================================================================================================================");
        System.out.printf("|%-5s|%-10s|%-20s|%-20s|%-20s|%-15s|%-15s|%-15s|\n", "Kode", "Jenis", "Nama Minuman", "Brp % alkohols",
                "Jumlah Minuman", "Harga Minuman", "Diskon", "Harga Total");
        System.out.println(
                "=================================================================================================================================");
        for (int i = 0; i < listAlkohol.size(); i++) {
            listAlkohol.get(i).viewTable();
        }
        System.out.println(
                "=================================================================================================================================");
    }

    public static void transaksi(ArrayList<Alkohol> listAlkohol) {
        tampilDataTabel(listAlkohol);
        do {
            System.out.print("Pilih Minuman yang ingin di beli : ");
            tanya = input.nextInt();
            if ((tanya < 0) || (tanya >= listAlkohol.size())) {
                System.out.println("Minuman tidak ditemukan");
            }
        } while ((tanya < 0) || (tanya >= listAlkohol.size()));

        System.out.println("Anda akan membeli :");
        System.out.println();
        listAlkohol.get(tanya-1).view();

        double uang;
        do {
            System.out.print("Masukan uang : ");
            uang = input.nextDouble();
            if (uang < listAlkohol.get(tanya-1).hargaTotal()) {
                System.out.println("Uang anda kurang");
            }
        } while (uang < listAlkohol.get(tanya-1).hargaTotal());

        double kembalian = uang - listAlkohol.get(tanya-1).hargaTotal();
        System.out.println("Kembalian anda : " + kembalian + "\n");
        listAlkohol.remove(listAlkohol.get(tanya-1));
    }

    public static void tambahData(ArrayList<Alkohol> listAlkohol) {
        do {
            System.out.println("=================================");
            System.out.println("Pilih jenis Minuman :");
            System.out.println("1. Alkohol");
            System.out.println("2. Koktail");
            System.out.println("3. Campuran");
            System.out.println("=================================");
            System.out.print("Masukan Pilihan : ");
            tanya = input.nextInt();
        } while (tanya < 1 || tanya > 3);

        if (tanya == 1) {
            Botol botol = new Botol(0,null, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data Minuman  ");
            System.out.println("=================================");

            input.nextLine();
            System.out.print("Nama Minuman : ");
            botol.setNamaminuman(input.nextLine());
            System.out.print("Brp % Alkohol : ");
            botol.setAlkohol(input.nextLine());
            System.out.print("Jumlah Minuman : ");
            botol.setJumlahHalaman(input.nextInt());
            botol.setJenis("Alkohol");
            listAlkohol.add(botol);
        } else if (tanya == 2) {
            Botol minuman = new Botol(0,null, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan Data Minuman  ");
            System.out.println("=================================");

            input.nextLine();
            System.out.print("Nama Minuman : ");
            minuman.setNamaminuman(input.nextLine());
            System.out.print("Brp % alkohol : ");
            minuman.setAlkohol(input.nextLine());
            System.out.print("Jumlah Minuman : ");
            minuman.setJumlahHalaman(input.nextInt());
            minuman.setJenis("Koktail");

            listAlkohol.add(minuman);
        } else {
            Botol textminum = new Botol(0,null, null, null, 0);
            System.out.println("=================================");
            System.out.println("Masukan data Minuman ");
            System.out.println("=================================");

            input.nextLine();
            System.out.print("Nama Minuman : ");
            textminum.setNamaminuman(input.nextLine());
            System.out.print("Beralkohol   : ");
            textminum.setAlkohol(input.nextLine());
            System.out.print("Jumlah Minuman : ");
            textminum.setJumlahHalaman(input.nextInt());
            textminum.setJenis("Campuran");
            listAlkohol.add(textminum);
        }

    }

    public static void hapusData(ArrayList<Alkohol> listAlkohol) {
        tampilDataTabel(listAlkohol);
        do {
            System.out.println("=================================");
            System.out.print("Pilih Minuman yang akan dihapus : ");
            tanya = input.nextInt();
            if ((tanya < 0) || (tanya >= listAlkohol.size())) {
                System.out.println("Minuman tidak ditemukan");
            }
        } while ((tanya < 0) || (tanya >= listAlkohol.size()));

        listAlkohol.remove(tanya);
    }

}