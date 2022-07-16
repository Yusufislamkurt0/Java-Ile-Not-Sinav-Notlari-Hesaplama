
/**
 * NotHesaplama
 */
import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {

        int quiz, vize, ffinal;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Quiz Notunu Giriniz :");
        quiz = input.nextInt();
        System.out.println("Vize Notunu Giriniz : ");
        vize = input.nextInt();
        System.out.println("Final Notunu Giriniz :");
        ffinal = input.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
        System.out.println("Not Ortalamanız : " + ortalama);
        String sonuc = (ortalama >= 50) ? "Geçtiniz !" : "Kaldınız...";
        System.out.println(sonuc);

    }
}