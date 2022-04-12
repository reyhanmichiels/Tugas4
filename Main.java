package TugasPemlan4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tugas Praktikum Pemlan Reyhan Hafiz Rusyard/215150700111018\n");

        System.out.println("Menampilkan input sesuai permintaan kak iqbal");
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        System.out.println();

        System.out.println("Tugas Praktikum Pemlan Reyhan Hafiz Rusyard/215150700111018\n");
        System.out.println("Menambahkan input menggunakan scanner");
        System.out.print("Masukkan Nama Merchant : ");
        String newNamaMerchant = scan.nextLine();
        System.out.print("Masukkan Nama Produk : ");
        String newNamaProduk = scan.nextLine();
        System.out.print("Masukkan Harga Produk : ");
        double newHarga = scan.nextDouble();
        scan.nextLine();
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(newNamaMerchant,newNamaProduk,newHarga));
        DataMerchant.tampilData();
        System.out.println();

        System.out.println("Tugas Praktikum Pemlan Reyhan Hafiz Rusyard/215150700111018\n");
        System.out.println("Menggunakan method cari, tampil, dan update");
        System.out.print("Masukkan Nama Merchant yang ingin diupdate : ");
        String update = scan.nextLine();
        DataMerchant.updateMerchant(DataMerchant.cariMerchant(update));
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant(update));




    }
}
