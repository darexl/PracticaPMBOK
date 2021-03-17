import java.util.Scanner;

public class AreaTriangulo {

    public void at() {
        Scanner s = new Scanner(System.in);
        //Ingresar valor de la base del triangulo
        System.out.println("Ingrese la base: ");
        double base = s.nextDouble();

        //Ingresar valor de la altura del triangulo
        System.out.println("Ingrese la altura: ");
        double height = s.nextDouble();

        if(base>0){
            if(height>0){
                double area = (base * height) / 2;
                //Area calculada mediante fórmula
                System.out.println("Área del triángulo es: " + area);

            }else{
                System.out.println("No se puede ingresar numeros negativos");
            }
        }
        else{
            System.out.println("No se puede ingresar numeros negativos");
        }

    }
}