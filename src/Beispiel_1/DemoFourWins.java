package Beispiel_1;
import java.util.Scanner;

public class DemoFourWins {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Spielfeldgröße horizontal auswählen:");
        int SpielfeldgroeßeX = obj.nextInt();


        System.out.println("Spielfeldgröße vertikal auswählen:");
        int SpielfeldgroeßeY = obj.nextInt();

        FourWins Spiel1 = new FourWins(SpielfeldgroeßeX,SpielfeldgroeßeY);
        Spiel1.print();

        int SpielfeldX, SpielfeldY;


        for (int i = 0; i <= SpielfeldgroeßeX * SpielfeldgroeßeY; i++) {
            System.out.println("Spieler A");
            System.out.println("Spielfeld horizontal auswählen:");
            SpielfeldX = obj.nextInt();
            System.out.println("Spielfeld vertikal auswählen:");
            SpielfeldY = obj.nextInt();

            System.out.println("Eingabe korrekt? " + Spiel1.playerA(SpielfeldX, SpielfeldY));
            Spiel1.print();
//            System.out.println("Vier gewinnt? " + Spiel1.fourInRow());
            if (Spiel1.winner() == 'A' || Spiel1.winner() == 'B') {
                System.out.println("Der Gewinner ist Spieler: " + Spiel1.winner());
            }

            System.out.println("Spieler B");
            System.out.println("Spielfeld horizontal auswählen:");
            SpielfeldX = obj.nextInt();
            System.out.println("Spielfeld vertikal auswählen:");
            SpielfeldY = obj.nextInt();

            System.out.println("Eingabe korrekt? " + Spiel1.playerB(SpielfeldX, SpielfeldY));
            Spiel1.print();
//            System.out.println("Vier gewinnt? " + Spiel1.fourInRow());
        }




    }
}
