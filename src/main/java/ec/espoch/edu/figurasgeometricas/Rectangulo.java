/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.figurasgeometricas;

/**
 *
 * @author KARLA
 */
public class Rectangulo {
    
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void imprimir() {
        System.out.println("Base del rectángulo: " + base);
        System.out.println("Altura del rectángulo: " + altura);
    }

    public float calcularArea() {
        return base * altura;
    }

    public float calcularPerimetro() {
        return 2 * (base + altura);
    }
}

    

