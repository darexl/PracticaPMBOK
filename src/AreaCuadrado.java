import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        double side = sc.nextDouble();
        double area = side*side;
        System.out.print("El área del cuadrado es: " + area);
    }
}
