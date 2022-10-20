import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        System.out.println("Выберите номер задания (1-11)");
        N = scan.nextInt();
        if (1 == N) {
            double a = (101 + 0) / 3;
            System.out.println(a);
            double b = 0.000003 * 10000000.1;
            System.out.println(b);
            boolean c = true && true;
            System.out.println(c);
            boolean d = false && true;
            System.out.println(d);
            boolean e = (false && false) | (true && true);
            System.out.println(e);
            boolean f = (false && false) && (true && true);
            System.out.println(f);
        }
        if (N == 2) {
            int chislo1;
            int chislo2;
            int chislo3;
            int chislo4;
            System.out.println("Введите 4 числа ");
            chislo1 = scan.nextInt();
            chislo2 = scan.nextInt();
            chislo3 = scan.nextInt();
            chislo4 = scan.nextInt();
            if (chislo1 == chislo2 && chislo2 == chislo3 && chislo3 == chislo4) {
                System.out.println("Числа равны");
            } else {
                System.out.println("Числа не равны");
            }
        }
        if (N == 3) {
            int[] Massive = {1, 10, 100, 1000, 10000, 100000};
            int max = Massive[0];
            for (int i : Massive) {
                if (i > max)
                    max = i;
            }
            System.out.println("Максималтьное число = " + max);
        }
        if (N == 4) {
            int[] Mas = {1, 10, 100, 1000, 10000, 100000};
            int min = Mas[0];
            for (int i : Mas) {
                if (i < min)
                    min = i;
            }
            System.out.println("Минимальное число = " + min);
        }
        if (N == 8) {
            int a;
            System.out.println("Введите темперетуру в градусах цельсия ");
            a = scan.nextInt();
            double Cf = (a - 32) / 1.8;
            System.out.println("Температупа в градусах форнегейта = " + Cf);
        }
        if (N == 9) {
            double IMT;
            double BEC;
            double POCT;
            System.out.println("Введите вес ");
            BEC = scan.nextDouble();
            System.out.println("Введите рост ");
            POCT = scan.nextDouble();
            IMT = BEC / POCT / POCT;
            System.out.println(IMT);
        }
        if (N == 10) {
            System.out.println("Введите число ");
            double chislo1 = scan.nextDouble();
            double chislo2;
            double chislo3;
            double chislo4;
            chislo2 = chislo1*chislo1;
            chislo3 = chislo1*chislo1*chislo1;
            chislo4 = chislo1*chislo1*chislo1*chislo1;
            System.out.println(chislo2);
            System.out.println(chislo3);
            System.out.println(chislo4);
        }
        if (N == 11) {
            System.out.println("Введите сторону a");
            int a = scan.nextInt();
            System.out.println("Введите сторону b");
            int b = scan.nextInt();
            System.out.println("Введите сторону c");
            int c = scan.nextInt();
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Может получится треугольник");
            } else {
                System.out.println("Треугольник не может получится");
            }
        }
    }
}