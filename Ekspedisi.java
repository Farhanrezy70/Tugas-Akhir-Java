import java.util.Scanner;

public class Ekspedisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Tujuan, tambahkemasan, packing;
        int ongkosberat, totalbiaya, Beratbarang, biayaPengiriman, ongkir, kemasan;
        int kg1 = 10000, kg2 = 20000, kg3 = 50000, Express = 30000, Reguler = 10000, Kargo = 20000;
        String [] Namabarang = new String[1];

        //fitur penambahan barang
        boolean pilihan1=true;
        while (pilihan1){
        for (int i = 0; i <Namabarang.length; i++){
            System.out.print("Masukkan nama barang : ");
             Namabarang[i] = input.next();

            System.out.println("Apakah anda ingin menambahkan barang lagi? (ya/tidak): ");
            String lanjut1 = input.next();
            if (lanjut1.equalsIgnoreCase("tidak")) {
                pilihan1 = false;
            }
        }
        }
        System.out.print("Masukkan Alamat : ");
        Tujuan = input.next();

        //fitur penghitungan berat menggunakan if else
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

        //perulangan untuk fitur penghitungan biaya pengiriman
        boolean pilihan = true;
        while (pilihan) {
            //penggunaan fitur switch case untuk memilih jasa ekspedisi
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

            //penggunaan nested if untuk penambahan fitur tambah kemasan
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

            //print hasil pengisian data
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