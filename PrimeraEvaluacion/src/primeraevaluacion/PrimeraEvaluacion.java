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

    static void EfectuarMatrices() {
        //Objeto de leectura.
        Scanner entrada = new Scanner(System.in);

        //Bienvenida 
        System.out.println(" Bienvenido al 1er ejercicio, donde se sumara dos matrices y su resultado se multiplicara por su tercera matriz");
        System.out.println("   ");
        System.out.println("Ingrese el orden para sus 3 matrices cuadrada");
        System.out.println("( ej: 2. Su matriz es de 2x2. )");
        int num = 0;

        num = entrada.nextInt();
        //Declaracion de arreglos
        int[][] Matriz_1 = new int[num][num];
        int[][] Matriz_2 = new int[num][num];
        int[][] Matriz_3 = new int[num][num];
        int[][] Matriz_Suma = new int[num][num];
        int[][] Matriz_Resultado = new int[num][num];

        //Verificacion de datos
        System.out.println("Su matriz es de " + num + "x" + num);
        System.out.println(" ");
        System.out.println("Ahora ingrese los siguentes (" + (num * num) + ")numeros, segun la posiscion que se le indique ");

        //Llenado de la primera Matriz.
        System.out.println("  ");
        System.out.println("Para el llenado de la Primera Matriz");
        System.out.println("  ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Ingrese el nunmero para la posicion " + i + " - " + j + " igual a: ");
                Matriz_1[i][j] = entrada.nextInt();
            }
        }

        //Llenado de la segunda Matriz.
        System.out.println("   ");
        System.out.println("Para el llenado de la Segunda Matriz");
        System.out.println("   ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Ingrese el nunmero para la posicion " + i + " - " + j + " igual a: ");
                Matriz_2[i][j] = entrada.nextInt();
            }
        }

        //Llenado de la tercera Matriz.
        System.out.println("  ");
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
        /*Imprimir Operaciones efectuadas.
        Imprimir Matriz Resultado*/
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("[ " + Matriz_Resultado[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    static void RellenoAutomatico() {

        int x, y;

        //Objeto de leectura.
        Scanner entrada = new Scanner(System.in);

        //Bienvenida 
        System.out.println("Bienvenido al 2do ejercicio, donde su matriz se rellenara automaticamente de acuerdo a la formula 23(x)^4 + 20(y)^3 - 3");
        System.out.println("Ingrese los valores requeridos segun se le indique  ");
        System.out.println(" ");
        System.out.print("Ingrese el numero de filas de la matriz: ");
        x = entrada.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        y = entrada.nextInt();

        //Declaracion de Matriz.
        int[][] Matriz_AutoRellenada;

        //Verificacion de Datos.
        System.out.println("  ");
        System.out.println("Su matriz es de " + x + "x" + y);
        System.out.println(" ");

        Matriz_AutoRellenada = new int[x][y];

        //Operacion para cada elemento.
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Matriz_AutoRellenada[i][j] = ((23 * (i * i * i * i)) + (20 * (j * j * j)) - 3);
            }
        }
        //Imprimir Matriz.
        System.out.println("La matriz resultante se relleno segun la funcion (23x^4) + (20y^3) - 3");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("[ " + Matriz_AutoRellenada[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    static void MatrizIdentidad() {
        boolean Validacion = true;

        //Objeto de leectura.
        Scanner entrada = new Scanner(System.in);

        //Bienvenida 
        System.out.println(" Bienvenido al 3er ejercicio, donde validara si su matriz igresada es, o no es Identidad");
        System.out.println("   ");
        System.out.println("Ingrese el orden para su matriz cuadrada");
        System.out.println("( ej: 2. Su matriz es de 2x2. )");
        int num = 0;

        num = entrada.nextInt();

        //Declaracion de Matriz.
        int[][] Matriz_Identidad = new int[num][num];

        //Verificacion de datos
        System.out.println("Su matriz es de " + num + "x" + num);
        System.out.println(" ");
        System.out.println("Ahora ingrese los siguentes (" + (num * num) + ")numeros, segun la posiscion que se le indique ");

        //Llenado de la Matriz.
        System.out.println("  ");
        System.out.println("Para el llenado de su Matriz");
        System.out.println("  ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Ingrese el nunmero para la posicion " + i + " - " + j + " igual a: ");
                Matriz_Identidad[i][j] = entrada.nextInt();
            }
        }

        System.out.println(" ");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == i) {
                    if (Matriz_Identidad[i][j] != 1) {
                        Validacion = false;
                    }
                } else {
                    if (Matriz_Identidad[i][j] != 0) {
                        Validacion = false;
                    }
                }
            }
        }

        if (Validacion == true) {
            System.out.println(" La matriz ingresada es identidad.");
        } else {
            System.out.println("La Matriz ingresada no es Identidad");
        }

    }

    static void MatrizTriangularS() {
        boolean Validacion = true;
        //Objeto de leectura.
        Scanner entrada = new Scanner(System.in);

        //Bienvenida 
        System.out.println(" Bienvenido al 4to ejercicio, donde se validara si su matriz es, o no es Triangular Superior");
        System.out.println("   ");
        System.out.println("Ingrese el orden para su matriz cuadrada");
        System.out.println("( ej: 2. Su matriz es de 2x2. )");
        int num = 0;

        num = entrada.nextInt();
        //Declaracion de arreglos
        int[][] Matriz_Interna = new int[num][num];
        int[][] Matriz_Triangular = new int[num][num];

        //Verificacion de datos
        System.out.println("Su matriz es de " + num + "x" + num);
        System.out.println(" ");
        System.out.println("Ahora ingrese los siguentes (" + (num * num) + ")numeros, segun la posiscion que se le indique ");

        //Llenado de la Matriz Interna
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j < i) {
                    Matriz_Interna[i][j] = 0;
                } else {
                    Matriz_Interna[i][j] = 1;
                }
            }
        }

        //Llenado de la Matriz.
        System.out.println("  ");
        System.out.println("Para el llenado de la Primera Matriz");
        System.out.println("  ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Ingrese el nunmero para la posicion " + i + " - " + j + " igual a: ");
                Matriz_Triangular[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (Matriz_Interna[i][j] == 0) {
                    if (Matriz_Triangular[i][j] != 0) {
                        Validacion = false;
                    }
                } else {
                    if (Matriz_Triangular[i][j] == 0) {
                        Validacion = false;
                    }
                }
            }
        }
        if (Validacion == true) {
            System.out.println(" La matriz ingresada es Triangular Superior.");
        } else {
            System.out.println("La Matriz ingresada No es Triangular Superior");
        }
        System.out.println("");
    }

    public static void main(String args[]) {

        int CasoEspecifico = 0;

        do {
            System.out.println("Te damos la Bienvenida al programa de la primera Evaluacion de Estructura de Datos");
            System.out.println("Seleccione una opcion para poder cotinuar");

            System.out.println("  ");
            System.out.println("[1] Ejercicio 1 ");
            System.out.println("[2] Ejercicio 2 ");
            System.out.println("[3] Ejercicio 3 ");
            System.out.println("[4] Ejercicio 4 ");
            System.out.println("  ");
            System.out.println("[0] Salir ");

            Scanner entrada = new Scanner(System.in);

            CasoEspecifico = entrada.nextInt();
            
            switch (CasoEspecifico) {

                case 1:
                    EfectuarMatrices();
                    break;

                case 2:
                    RellenoAutomatico();
                    break;

                case 3:
                    MatrizIdentidad();
                    break;

                case 4:
                    MatrizTriangularS();
                    break;

                default:
                    System.out.println("El numero que ingreso, no esta disponible dentro de las opciones");
                    break;

            }
        } while (CasoEspecifico != 0);

    }

}
