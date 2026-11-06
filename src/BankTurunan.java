public class BankTurunan {

    public static void main(String[] args) {

        Tabungan tabungan = new Tabungan(
                "101", "Ani", 1000000, 2.5
        );

        Giro giro = new Giro(
                "201", "Budi", 200000, 500000
        );

        System.out.println("==== INFORMASI REKENING AWAL ====");

        tabungan.cetakInfo();

        System.out.println();

        giro.cetakInfo();

        System.out.println("\n==== TRANSAKSI TABUNGAN ====");

        int tarikTabungan = 1500000;
        boolean hasilTabungan = tabungan.tarik(tarikTabungan);

        System.out.println(
                "Tabungan tarik " + Rekening.formatRupiah(tarikTabungan)
                        + " : " + (hasilTabungan ? "Berhasil" : "Ditolak")
        );

        int tarikGiro1 = 500000;
        boolean hasilGiro1 = giro.tarik(tarikGiro1);

        System.out.println(
                "Giro tarik " + Rekening.formatRupiah(tarikGiro1)
                        + " : " + (hasilGiro1 ? "Berhasil" : "Ditolak")
        );

        int tarikGiro2 = 300000;
        boolean hasilGiro2 = giro.tarik(tarikGiro2);

        System.out.println(
                "Giro tarik " + Rekening.formatRupiah(tarikGiro2)
                        + " : " + (hasilGiro2 ? "Berhasil" : "Ditolak")
        );

        int setorGiro = 100000;
        boolean hasilSetor = giro.setor(setorGiro);

        System.out.println(
                "Giro setor " + Rekening.formatRupiah(setorGiro)
                        + " : " + (hasilSetor ? "Berhasil" : "Ditolak")
        );

        int bunga = tabungan.tambahBunga();

        System.out.println(
                "Bunga tabungan : " + Rekening.formatRupiah(bunga)
        );

        System.out.println("\n========== REKENING AKHIR ==========");

        tabungan.cetakInfo();
        System.out.println();
        giro.cetakInfo();
    }
}