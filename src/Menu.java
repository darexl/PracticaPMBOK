import java.util.*;

public class Menu {
    public static void main(String args []){
        int choice;
        String order;
        Scanner sc = new Scanner(System.in);
        System.out.println("****** MENU ******");
        System.out.println("1. Area Triángulo");
        System.out.println("2. Area Cuadrado");

        System.out.println("Elegir una opción: ");
        choice = sc.nextInt();

        AreaTriangulo triangulo = new AreaTriangulo();
        AreaCuadrado cuadrado = new AreaCuadrado();

        switch(choice){
            case 1:
                triangulo.at();
                break;

            case 2:
                cuadrado.ac();
                break;
            default:
                order = "No es una opción";
        }
    }
}
