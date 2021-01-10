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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese 1 para el area del cuadrado, 2 para el "
                + "triángulo y 3 para el rectangulo.");
        num = entrada.nextInt();
        if(num == 1){
            obtenerAreaCuadrado();
        }else{
            if(num == 2){
                obtenerAreaTriangulo();
            }else{
                if(num == 3){
                    obtenerAreaRectangulo();
                }else{
                    if(num > 3){
                        System.out.println("El numero que ingreso es incorrecto");
                    }
                }             
            }
        }  
    }
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        int lado;
        int area;
        System.out.println("Ingrese el valor del lado");
        lado = entrada.nextInt();
        area = lado * lado;
        System.out.println("El área del cuadrado es: "+area);
    }
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;
        System.out.println("Ingrese el valor de base");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de altura");
        altura = entrada.nextInt();
        area = (base * altura)/2;
        System.out.println("El área del triangulo es:"+ area);
    }
    public static void obtenerAreaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;
        System.out.println("Ingrese el valor de base");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de altura");
        altura = entrada.nextInt();
        area = base * altura;
        System.out.println("El área del rectangulo es; " + area);
    }
}
    
