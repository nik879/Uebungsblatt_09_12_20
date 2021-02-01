package Beispiel_2;

public class Strafen {
    private String vorname, nachname, kennzeichen;
    private int strafnummer;
    private double strafe;
    private byte anzahl;
    private static int counter;

    public Strafen(String vorname, String nachname, String kennzeichen) {
        counter++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.kennzeichen = kennzeichen;
        strafe = 0;
        anzahl = 0;
        strafnummer=counter;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getStrafnummer() {
        return strafnummer;
    }

    public double getStrafe() {
        if (anzahl == 1) {
            strafe*=0.7;
        } else if (anzahl == 2) {
            strafe*= 0.8;
        } else if (anzahl == 3) {
            strafe*= 0.9;
        }

        return strafe;
    }

    public byte getAnzahl() {
        return anzahl;
    }

    public static int getCounter() {
        return counter;
    }

    public void strafe(int geschwindigkeitsueberschreitung) {
        if (geschwindigkeitsueberschreitung < 20) {
            this.strafe += 30;
        } else if (geschwindigkeitsueberschreitung>=20 && geschwindigkeitsueberschreitung<30) {
            this.strafe += 50;
        } else if (geschwindigkeitsueberschreitung >= 30 && geschwindigkeitsueberschreitung < 50) {
            this.strafe +=100;
        } else if (geschwindigkeitsueberschreitung >= 50 && geschwindigkeitsueberschreitung <= 100) {
            this.strafe +=500;
        } else if (geschwindigkeitsueberschreitung > 100 ) {
            this.strafe +=1500;
        }
        anzahl++;

    }

    public void verbandspaket() {
        this.strafe += 25;
        anzahl++;
    }

    public void alkohol(double wert) {
        if (wert >= 0.5 && wert < 1.0) {
            this.strafe += 100;
        } else if (wert >= 1.0 && wert < 2.0) {
            this.strafe += 400;
        } else if (wert >= 2.0 && wert <= 3.0) {
            this.strafe += 1000;
        } else if (wert > 3.0) {
            this.strafe += 5000;
        }
        anzahl+=2;
    }

    public void sonstiges(double wert) {
        strafe += wert;
        anzahl++;
    }


    public String toString() {
        return "Strafen{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", strafnummer=" + strafnummer +
                ", strafe=" + strafe +
                ", anzahl=" + anzahl +
                '}';
    }
}
