/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.espoch.edu.figurasgeometricas;
import java.util.Scanner;
/**
 *
 * @author KARLA
 */
public class FigurasGeometricas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu;

        System.out.println("Bienvenidos");
        System.out.println("Seleccione la figura que desea calcular:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Triángulo Rectángulo");
        System.out.print("Opción: ");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("\nCaso 1: Círculo");
                System.out.print("Ingrese el diámetro del círculo: ");
                double diametro = scanner.nextDouble();
                double radio = diametro / 2;

                Circulo circulo = new Circulo(radio);
                circulo.imprimir();
                System.out.println("Área del círculo: " + circulo.calcularArea());
                System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                break;

            case 2:
                System.out.println("\nCaso 2: Rectángulo");
                System.out.print("Ingrese la base del rectángulo: ");
                float base = scanner.nextFloat();
                System.out.print("Ingrese la altura del rectángulo: ");
                float altura = scanner.nextFloat();

                Rectangulo rectangulo = new Rectangulo(base, altura);
                rectangulo.imprimir();
                System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                break;

            case 3:
                System.out.println("\nCaso 3: Cuadrado");
                System.out.print("Ingrese la longitud del lado del cuadrado: ");
                float lado = scanner.nextFloat();

                Cuadrado cuadrado = new Cuadrado(lado);
                cuadrado.imprimir();
                System.out.println("Área del cuadrado: " + cuadrado.calcularAreaCuadrado());
                System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetroCuadrado());
                break;

            case 4:
                System.out.println("\nCaso 4: Triángulo Rectángulo");
                System.out.print("Ingrese la base del triángulo: ");
                float baseT = scanner.nextFloat();
                System.out.print("Ingrese la altura del triángulo: ");
                float alturaT = scanner.nextFloat();

                TrianguloRectangulo triangulo = new TrianguloRectangulo(baseT, alturaT);
                triangulo.imprimir();
                System.out.println("Área del triángulo: " + triangulo.calcularAreaTrianguloRectangulo());
                System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenunsaTrianguloRectangulo());
                System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetroTrianguloRectangulo());
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

    

