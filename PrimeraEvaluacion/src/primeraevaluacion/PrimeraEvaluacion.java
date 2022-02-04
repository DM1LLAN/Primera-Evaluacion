/*
Universidad de Margarita.
Alma Mater del Caribe.
Vicerrectorado Académico.
Decanato de Ingeniería.
Estrucctura de Datos M-01.
 */
package primeraevaluacion;

import java.util.Scanner;

/**
 * @author Diego Millán
 */
public class PrimeraEvaluacion {

    static void efectuarMatrices() {
        //Objeto de leectura.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el orden para sus 3 matrices cuadrada");
        System.out.println("( ej: 2. Su matriz es de 2x2. )");
        int num = 0;

        num = entrada.nextInt();

        int[][] Matriz_1 = new int[num][num];
        int[][] Matriz_2 = new int[num][num];
        int[][] Matriz_3 = new int[num][num];
        int[][] Matriz_Suma = new int[num][num];
        int[][] Matriz_Resultado = new int[num][num];

        System.out.println("Su matriz es de " + num + "x" + num);
        System.out.println(" ");
        System.out.println("Ahora ingrese los siguentes (" + (num * num) + ")numeros, segun la posiscion que se le indique ");

        //Llenado de la primera Matriz.
        System.out.println("Para el llenado de la Primera Matriz");
        System.out.println("  ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Ingrese el nunmero para la posicion " + i + " - " + j + " igual a: ");
                Matriz_1[i][j] = entrada.nextInt();
            }
        }

        //Llenado de la segunda Matriz.
        System.out.println("Para el llenado de la Segunda Matriz");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Ingrese el nunmero para la posicion " + i + " - " + j + " igual a: ");
                Matriz_2[i][j] = entrada.nextInt();
            }
        }

        System.out.println("  ");

        //Llenado de la tercera Matriz.
        System.out.println("Para el llenado de la Tercera Matriz");
        System.out.println("  ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Ingrese el nunmero para la posicion " + i + " - " + j + " igual a: ");
                Matriz_3[i][j] = entrada.nextInt();
            }
        }

        //Suma de Matriz_1 y Matriz_2.
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                Matriz_Suma[i][j] = Matriz_1[i][j] + Matriz_2[i][j];
            }
        }

        //Multiplicacion de la Matriz_Suma y Matriz_3.
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    Matriz_Resultado[i][j] = Matriz_Resultado[i][j] + (Matriz_Suma[i][k] * Matriz_3[k][j]);
                }
            }
        }
        //Imprimir Operaciones efectuadas.
        //Imprimir Matriz Resultado
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("[ " + Matriz_Resultado[i][j] + " ]");
            }
            System.out.println("");
        }
    }
    
    public static void main(String args[]) {
        efectuarMatrices();
        
        
        
        
        
        
        
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

