/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.figurasgeometricas;

/**
 *
 * @author KARLA
 */
public class Circulo {
 
    
    private double radio;
    private final double PI = 3.14159265359;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        System.out.println("Radio del círculo: " + radio);
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}


