package wczytywanie;
import java.util.Scanner;

public class MetodaMain {

    public static void main(String[] args) {
       // int wiek;
        //if (wiek < 0) return;
       // if (wiek > 150) return;
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swój wiek:");
        int wiek = in.nextInt();

        System.out.println("Twój wiek to: " + wiek);
        if (wiek < 0) return;
        if (wiek > 150) return;

        if (wiek <= 17) {
            System.out.println("Jesteś dzieckiem");
        }
        if (wiek >=18 && wiek <= 39) {
            System.out.println("Jesteś dorosłym");

        }
        if (wiek >=40 && wiek <= 59){
            System.out.println("Jesteś w średnim wieku");

        }
        if (wiek>=60) {
            System.out.println("Jesteś w podeszłym wieku");
        }
    }
}
