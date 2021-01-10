/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        obtenerValor(informacion);
    }
    public static void obtenerValor(int [][] arreglo){
        String cadenaF = "" ;
        for(int fila = 0; fila < arreglo.length; fila++){
            for(int col = 0; col < arreglo[fila].length; col++){
                if(arreglo[fila][col] % 2 == 0) {
                    cadenaF = String.format("%s%d\t",cadenaF, arreglo[fila][col]);    
                }
            }
        }
        System.out.printf("Los numero pares son: \n%s",cadenaF);
    }
}
    

