import java.util.Scanner;
public class Percobaan621_1 {

    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b){
        int volume= hitungLuas(a,b)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc21= new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan Panjang");
        p=sc21.nextInt();
        System.out.println("Masukkan lebar");
        l=sc21.nextInt();
        System.out.println("Masukkan tinggi");
        t=sc21.nextInt();

        L=p*l;
        System.out.println("Luas persegi panjang adalah"+ L);

        vol=p*l*t;
        System.out.println("Volume balok adalah" + vol);
    }
}