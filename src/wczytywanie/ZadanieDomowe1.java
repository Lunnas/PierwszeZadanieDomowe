package wczytywanie;
import java.util.Scanner;

public class ZadanieDomowe1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swój wiek:");
        int wiek = in.nextInt();
        if (wiek < 0) return;
        if (wiek > 150) return;

        System.out.println("Twój wiek to: " + wiek);

        if (wiek < 18) {
            System.out.println("Jesteś dzieckiem");
        } else if (wiek < 40) {
            System.out.println("Jesteś dorosłym");
        } else if (wiek < 60) {
            System.out.println("Jesteś w średnim wieku");
        } else {
            System.out.println("Jesteś w podeszłym wieku");
        }
    }
}
