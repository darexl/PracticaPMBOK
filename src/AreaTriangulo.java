import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        double base = s.nextDouble();
        System.out.println("Ingrese la altura: ");
        double height = s.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Área del triángulo es: " + area);
    }
}