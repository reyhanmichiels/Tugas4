package TugasPemlan4;

import java.util.Scanner;

public class DataMerchant {
    static Merchant[] merchant = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant newMerch){
        Merchant[] merch = new Merchant[DataMerchant.merchant.length + 1];

        for (int i = 0; i < DataMerchant.merchant.length; i++) {
            merch[i] = merchant[i];
        }

        merch[DataMerchant.merchant.length] = newMerch;
        return merch;
    }

    public static void tampilData (){
        for (Merchant m : merchant){
            System.out.println("=== Tampilan Data Merchant UBFOOD ===");
            System.out.println("Nama Merchant   : " + m.getNamaMerchant());
            System.out.println("Nama Produk     : " + m.getNamaProduk());
            System.out.println("Harga           : " + (int) m.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant (String nama){
        int idx = 0;
        for (int i = 0; i < DataMerchant.merchant.length; i++) {
            if (merchant[i].getNamaMerchant().equals(nama)){
                idx = i;
                break;
            }
        }

        return merchant[idx];
    }

    public static void tampilMerchant(Merchant merch){
        System.out.println("=== Tampilan Data Merchant UBFOOD ===");
        System.out.println("Nama Merchant   : " + merch.getNamaMerchant());
        System.out.println("Nama Produk     : " + merch.getNamaProduk());
        System.out.println("Harga           : " + (int) merch.getHargaMakanan());
    }

    public static void updateMerchant(Merchant merch){
        java.util.Scanner scan = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Pilih data yang ingin diubah :");
        System.out.println("1. Nama Produk");
        System.out.println("2. Harga");
        System.out.print("Masukkan Pilihan : ");
        int pilih = scan.nextInt();
        scan.nextLine();

        if (pilih == 1){
            System.out.print("Masukkan Nama Produk yang baru : ");
            String newNamaProduk = scan.nextLine();
            merch.setNamaProduk(newNamaProduk);
        }

        else{
            System.out.print("Masukkan Harga yang baru : ");
            double newHarga = scan.nextDouble();
            merch.setHargaMakanan(newHarga);
        }
    }
}
