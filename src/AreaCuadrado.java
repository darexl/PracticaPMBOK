import java.util.Scanner;

public class AreaCuadrado {

    public void ac() {
        Scanner sc = new Scanner (System.in);
        //Ingresar valor del cuadrado
        System.out.print("Ingrese el tamaño del cuadrado: ");
        double side = sc.nextDouble();
        if(side > 0){
            double area = side*side;
            //Area calculada mediante fórmula
            System.out.print("El área del cuadrado es: " + area);
        }else{
            System.out.println("Error, no se puede ingresar numeros negativos");
        }
    }
}
