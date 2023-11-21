import java.util.Scanner;

public class Kubus21 {
    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);
        int sisi, Lp, vol;

        System.out.println("Masukkan sisi");
        sisi = sc21.nextInt();
        Lp = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan:" + Lp);

        vol = hitungVolume(sisi);
        System.out.println("Volume adalah:" + vol);
    }
}
