import java.util.Scanner;

public class Ekspedisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Namabarang, Tujuan, tambahkemasan, packing;
        int ongkosberat, totalbiaya, Beratbarang, biayaPengiriman, ongkir, kemasan;
        int kg1 = 10000, kg2 = 20000, kg3 = 50000, Express = 30000, Reguler = 10000, Kargo = 20000;

        System.out.print("Masukkan nama barang : ");
        Namabarang = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        Tujuan = input.nextLine();

        System.out.print("Berat Barang yang dikirim = ");
        Beratbarang = input.nextInt();
        
        if (Beratbarang <= 2) {
            System.out.println("Ongkos berat pengiriman = " + kg1);
            ongkosberat = kg1 * Beratbarang;
        } else if (Beratbarang <= 5) {
            System.out.println("Ongkos berat pengiriman = " + kg2);
            ongkosberat = kg2 * Beratbarang;
        } else {
            System.out.println("Ongkos berat pengiriman = " + kg3);
            ongkosberat = kg3 * Beratbarang;
        }
        System.out.println("total ongkos berat barang = " + ongkosberat);

        boolean pilihan = true;
        while (pilihan) {
            System.out.print("Pilih jenis pengiriman  (1. Express, 2. Reguler, 3. Kargo): ");
            biayaPengiriman = input.nextInt();
            switch (biayaPengiriman) {
                case 1:
                    System.out.println("Harga Pengiriman Express : " + Express);
                    biayaPengiriman = ongkosberat + Express;
                    break;
                case 2:
                    System.out.println("Harga Pengiriman Reguler : " + Reguler);
                    biayaPengiriman = ongkosberat + Reguler;
                    break;
                case 3:
                    System.out.println("Harga Pengiriman Kargo : " + Kargo);
                    biayaPengiriman = ongkosberat + Kargo;
                    break;
            }
            System.out.print("apakah barang sudah dikemas : ");
            packing = input.next();

            if (packing.equalsIgnoreCase("belum")) {
                if (Beratbarang <= 2)
                    kemasan = 5000;
                else if (Beratbarang <= 5)
                    kemasan = 10000;
                else
                    kemasan = 20000;
            } else {
                kemasan = 0;
            }

            ongkir = biayaPengiriman + kemasan;

            System.out.println("---------------------------");
            System.out.println("Nama Barang : " + Namabarang);
            System.out.println("Tujuan Pengiriman : " + Tujuan);
            System.out.println("Total biaya pengiriman = " + ongkir);

            System.out.println("---------------------------");
            System.out.println("Apakah anda ingin menghitung biaya pengiriman lagi? (ya/tidak): ");
            String lanjut = input.next();
            if (lanjut.equalsIgnoreCase("tidak")) {
                pilihan = false;
            }
            //input.nextLine();
        }
        System.out.println("Terima Kasih");
    }
}