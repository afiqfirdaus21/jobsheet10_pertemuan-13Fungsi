import java.util.Scanner;
public class Ucapan_21 {

    public static String PenerimanUcapan(){
        Scanner sc21 = new Scanner (System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc21.nextLine();
        sc21.close();
        return namaOrang;
    }
    public static void main (String[] args){
        String nama = PenerimanUcapan();
        System.out.println("Thank you " + nama+"\n May the force be with you.");
    }
}