package Beispiel_2;

public class DemoStrafverwaltung {
    public static void main(String[] args) {
        Strafen Speed = new Strafen("Niki", "Kachelmaier", "LN-273CK");
        Strafen Horst = new Strafen("horst", "hengstschläger", "LN-743ck");

        Speed.strafe(50);
        Speed.verbandspaket();
        Horst.sonstiges(200);
        Horst.getStrafe();
        System.out.println("Speed = " + Speed.toString());
        System.out.println("Horst = " + Horst.toString());
    }
}
