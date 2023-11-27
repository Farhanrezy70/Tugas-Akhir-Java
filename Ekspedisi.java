import java.util.Scanner;

public class testProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Tujuan, tambahkemasan, packing;
        int ongkosberat, totalbiaya, Beratbarang, biayaPengiriman, ongkir, kemasan;
        int kg1 = 10000, kg2 = 20000, kg3 = 50000, Express = 30000, Reguler = 10000, Kargo = 20000;
        int[] nomerpelanggan = new int[1];
        String[][] dataPengiriman = new String[1][4];

        //fitur penambahan barang
        boolean pilihan1=true;
        while (pilihan1){
            for (int i = 0; i < nomerpelanggan.length; i++) {
                System.out.print("Masukkan informasi untuk pelanggan ke-");
                nomerpelanggan[i] = input.nextInt();
            }
        
            for (int i = 0; i < dataPengiriman.length; i++) {
                System.out.print("Nama Pelanggan: ");
                dataPengiriman[i][0] = input.next();

                System.out.print("Nama Barang: ");
                dataPengiriman[i][1] = input.next();

                System.out.print("Nomor Paket: ");
                dataPengiriman[i][2] = input.next();

                System.out.print("Alamat Pengiriman: ");
                dataPengiriman[i][3] = input.next();

                System.out.println(); // Pindah ke baris baru untuk pelanggan berikutnya
                System.out.println("Apakah anda ingin menambahkan barang lagi? (ya/tidak): ");
                String lanjut1 = input.next();
                if (lanjut1.equalsIgnoreCase("tidak")) {
                    pilihan1 = false;
                }   
            break;
            }

        }

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
            for (int i = 0; i < nomerpelanggan.length; i++) {
                System.out.print("informasi Pelanggan ke-");
                nomerpelanggan[i] = input.nextInt();
                    // Menampilkan semua informasi pengiriman
                
            }
            
            for (int i = 0; i < dataPengiriman.length; i++) {
                System.out.println("Nama Pelanggan: " + dataPengiriman[i][0]);
                System.out.println("Nama Barang: " + dataPengiriman[i][1]);
                System.out.println("Nomor Paket: " + dataPengiriman[i][2]);
                System.out.println("Alamat Pengiriman: " + dataPengiriman[i][3]);
                System.out.println();
            }
            
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
