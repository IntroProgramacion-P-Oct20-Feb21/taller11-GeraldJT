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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombreC;
        String cedulaC;
        System.out.println("Ingrese su nombre y apellido");
        nombreC = entrada.nextLine();
        System.out.println("Ingrese el numreo de cédula");
        cedulaC = entrada.nextLine();
        System.out.println("Ingrese el 1 para calcular el valor de la plantilla"
                + "de luz o 2 para calcular el predio de un bien inmueble");
        opcion = entrada.nextInt();
        if(opcion == 1){
            calcularValorLuz(nombreC, cedulaC);
        }else{
            if(opcion == 2){
                calcularPredio(nombreC, cedulaC);
            }else{
                if(opcion >= 3){
                    System.out.println("La opcion es incorrecta");
                }
            }
        }
               
    }
    public static void calcularValorLuz(String cliente, String numeroCedula){
        Scanner entrada = new Scanner(System.in);
        double valorK;
        double numeroK;
        double valorP;
        System.out.println("Ingrese el valor de kilovatios");
        valorK = entrada.nextDouble();
        System.out.println("Ingrese el valor de kilovatios consumidos");
        numeroK = entrada.nextDouble();
        valorP = valorK * numeroK;
        System.out.printf("Cliente: %s con cédula: %s debe cancelar el valor "
                + "de $%.2f", cliente, numeroCedula, valorP);
    }
    public static void calcularPredio(String x, String y){
        Scanner entrada = new Scanner(System.in);
        double valorIn;
        double tPredio;
        System.out.println("Ingrese el valor del inmueble");
        valorIn = entrada.nextDouble();
        tPredio = (valorIn * 2)/100;
        System.out.printf("Cliente: %s con cédula: %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio: $%.2f", 
                x, y, valorIn, tPredio);                
    }
        
}
    

