import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        byte london =  47;
        short madrid = 852;
        int paris = 2590000;
        long moscow = 1147000000L;
        float earth = 4.5F;
        double universe = 9.0000000000000000;
        System.out.println("Значение переменной london с типом byte равно " + london);
        System.out.println("Значение переменной madrid с типом short равно " + madrid);
        System.out.println("Значение переменной paris с типом int равно " + paris);
        System.out.println("Значение переменной moscow с типом long равно " + moscow);
        System.out.println("Значение переменной earth с типом float равно " + earth);
        System.out.println("Значение переменной universe с типом double равно " + universe);

        float a = 27.12F;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        boolean d = false;
        System.out.println(d);
        short e = 569;
        System.out.println(e);
        short f = -159;
        System.out.println(f);
        short g = 27897;
        System.out.println(g);
        byte h = 67;
        System.out.println(h);

        byte lp = 23, as = 27, ea = 30;
        lp = (byte) (lp + as + ea);
        lp = (byte) (480 / lp);
        System.out.println("На каждого ученика рассчитано " + lp + " листов бумаги");

        byte bottle = 16;
        int min20 = bottle * 10;
        int hours1 = min20 * 3;
        int days = hours1 * 24;
        int days3 = days * 3;
        int month1 = days3 * 10;
        System.out.println("За 20 минут машина произвела " + min20 + " бутылок");
        System.out.println("За сутки машина произвела " + days + " бутылок");
        System.out.println("За 3 дня машина произвела " + days3 + " бутылок");
        System.out.println("За 1 месяц машина произвела " + month1 + " бутылок");

        short cans = 120;
        short classes = 120 / 6;
        int whitePaint = classes * 2;
        int braunPaint = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + braunPaint + " коричневой краски");

        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 105;
        short egg = 4 * 70;
        int breakfast = bananas + milk + iceCream + egg;
        float breakfastKil = breakfast / 1000F;
        System.out.println(breakfastKil);

        byte loseWeightKg = 7;
        int loseWeightG = loseWeightKg * 1000;
        int days250G = loseWeightG /250;
        System.out.println(days250G);
        int days500G = loseWeightG /500;
        System.out.println(days500G);



    }
}