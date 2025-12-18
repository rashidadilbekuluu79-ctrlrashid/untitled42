import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle t = new Triangle();
        System.out.println("Ведите сторону треугольника для того чтобы узнать плошать.");
        System.out.print("Сторона (a); ");
        double areaA = scanner.nextDouble();
        System.out.print("сторона (b); ");
        double areaB = scanner.nextDouble();
        System.out.print("сторона (c); ");
        double areaC = scanner.nextDouble();

        System.out.println();
        System.out.print("результат: "+t.getArea(areaA,areaB,areaC));

    }
}
