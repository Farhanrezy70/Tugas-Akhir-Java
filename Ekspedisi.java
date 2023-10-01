import java.util.Scanner;

public class Ekspedisi {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);

        String Namabarang, Tujuan;
        int biayaberat, totalpengiriman , Beratbarang, Biayajarak = 100000;
        int kg1 = 10000, kg2 = 20000, kg3 = 50000;

        
        System.out.println("Masukkan nama barang : ");
        Namabarang = input.nextLine();
        System.out.println("Masukkan Tujuan : ");
        Tujuan = input.nextLine();
        
        System.out.print("Total Berat Barang = ");
        Beratbarang = input.nextInt();

        if (Beratbarang <= 2){
            System.out.println("Biaya berat pengiriman = " + kg1);
            biayaberat = kg1 * Beratbarang;
        }else if (Beratbarang <= 5){
            System.out.println("Biaya berat pengiriman = " + kg2);
            biayaberat = kg2 * Beratbarang;
        }else {
            System.out.println("Biaya berat pengiriman = " + kg3);
            biayaberat = kg3 * Beratbarang;
        }
        
        System.out.println("biaya berat barang = " + biayaberat );
        totalpengiriman = biayaberat + Biayajarak;

        System.out.println("Nama Barang : " + Namabarang );
        System.out.println("Tujuan Pengiriman : " + Tujuan );
        System.out.println("Total biaya pengiriman = " + totalpengiriman );
        
    }
}
