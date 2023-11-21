import java.util.Scanner;
public class TerimaKasih_21_P2 {
    public static void UcapanTerimaKasih(){
        System.out.println("Thank you for being the best theacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything");
        }

    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terima Kasih Pak... Bu... Semoga Sehat Selalu ";
        UcapanTambahan(ucapan);
    }
}