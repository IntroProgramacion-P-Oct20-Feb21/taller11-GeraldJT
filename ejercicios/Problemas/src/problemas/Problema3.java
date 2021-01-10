/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        System.out.println("Ingrese la primera nota");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        nota4 = entrada.nextDouble();
        String promedio = obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.println(promedio);
    }
    public static String obtenerPromedio(double a, double b, double c, double d){
        double promedio = 0;
        String cadenaF = "";
        promedio = (a + b + c + d)/4;
        if((promedio >= 0) && (promedio <= 5)){
            cadenaF = String.format("%sEl promedio de las notas: %.2f %.2f %.2f %.2f "
                    + "es: Regular", cadenaF, a, b, c, d);
        }else{
            if((promedio >= 5.1) && (promedio <= 8)){
                cadenaF = String.format("%sEl promedio de las notas: %.2f %.2f %.2f "
                        + "%.2f " + "es: Bueno", cadenaF, a, b, c, d);
            }else{
                if((promedio >= 8.1) && (promedio <= 9)){
                     cadenaF = String.format("%sEl promedio de las notas: %.2f %.2f "
                             + "%.2f %.2f es: Muy bueno", cadenaF, a, b, c, d);
                }else{
                    if((promedio >= 9.1) && (promedio <= 10)){
                        cadenaF = String.format("%sEl promedio de las notas: %.2f "
                               + "%.2f %.2f %.2f es: Sobresaliente", cadenaF, a, b,
                               c, d);
                    }           
                }
            }
        }
        return cadenaF;
    }
}
    

