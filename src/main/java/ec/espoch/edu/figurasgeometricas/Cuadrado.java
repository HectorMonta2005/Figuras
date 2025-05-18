/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.figurasgeometricas;

/**
 *
 * @author KARLA
 */
public class Cuadrado {
    public float longitudLadoCentimetro;
    
    public Cuadrado(){
        
    }

    public Cuadrado(float logitudLadoCentimetro) {
        this.longitudLadoCentimetro = logitudLadoCentimetro;

    }

    public void imprimir() {
        System.out.println("longitudLadoCentimetro: " + longitudLadoCentimetro);

    }

    public float calcularAreaCuadrado() {
        
        return longitudLadoCentimetro*longitudLadoCentimetro;

    }
    
    public float calcularPerimetroCuadrado(){
        
        return longitudLadoCentimetro*4;
    }
    
}
    
    

