import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, tutar, kmucreti = 2.20, baslangic = 10, ucret;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        km = input.nextDouble();
        tutar = km * kmucreti;
        ucret = tutar + baslangic;
        System.out.println(ucret >= 20 ? "Tutarınız: " + ucret : "Tutarınız 20 tl'dir");


    }
}