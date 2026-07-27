public class KalkulatorLuas {

    public int hitungLuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        KalkulatorLuas kalkulator = new KalkulatorLuas();

        int panjang = 10;
        int lebar = 5;

        int hasilLuas = kalkulator.hitungLuasPersegiPanjang(panjang, lebar);

        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas Persegi Panjang: " + hasilLuas);
    }
}
