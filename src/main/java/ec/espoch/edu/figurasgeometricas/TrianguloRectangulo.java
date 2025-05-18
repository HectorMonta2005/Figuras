/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.figurasgeometricas;

/**
 *
 * @author KARLA
 */
public class TrianguloRectangulo {

    public float baseCentimetro;
    public float alturaCentimetro;

    public TrianguloRectangulo(float baseCentimetro, float alturaCentimetro) {
        this.baseCentimetro = baseCentimetro;
        this.alturaCentimetro = alturaCentimetro;

    }

    public void imprimir() {
        System.out.println(" baseCentimetro: " + baseCentimetro);
        System.out.println("alturaCentimetro: " + alturaCentimetro);

    }

    public float calcularAreaTrianguloRectangulo() {

        return (baseCentimetro * alturaCentimetro) / 2;

    }

    public float calcularHipotenunsaTrianguloRectangulo() {

        return (float) Math.sqrt(Math.pow(baseCentimetro, 2) + Math.pow(alturaCentimetro, 2));

    }

    public float calcularPerimetroTrianguloRectangulo() {

        return baseCentimetro + alturaCentimetro + calcularHipotenunsaTrianguloRectangulo();
    }

}
