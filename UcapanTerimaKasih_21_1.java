import java.util.Scanner;

public class UcapanTerimaKasih_21_1 {

    public static String PenerimaUcapan() {
        Scanner sc21 = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan:");
        String namaOrang = sc21.nextLine();
        sc21.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println("Ucapan tambahan: " + ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        UcapanTambahan("Semoga sehat selalu dan sukses selalu!");
    }
}
