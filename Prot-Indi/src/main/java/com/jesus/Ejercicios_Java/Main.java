package com.jesus.Ejercicios_Java;

import com.jesus.Ejercicios_Java.Arrays.Arrays;
import com.jesus.Ejercicios_Java.Matrices.Matriz0;
import com.jesus.Ejercicios_Java.Matrices.Matriz1_9;

public class Main {
    public static void main(String[] args) {

        Arrays obj = new Arrays();

        Matriz0 matriz0 = new Matriz0();
        Matriz1_9 matriz1_9 = new Matriz1_9();

        System.out.println(
                "--------------------------- \n" +
                "- 1. Arreglos ( Arrays ). - \n" +
                "--------------------------- \n" +
                "1. Declaración y creación de un arreglo. \n" +
                "Declarar un arreglo de 10 enteros:"
        );

        obj.imprimirArray(obj.listaEscrita);

        System.out.println(
                "\n" +
                "Inicializar con valores aleatorios: "
        );

        obj.imprimirArray(obj.listaArray
        );

        System.out.println(
                "\n" +
                "------------------------- \n" +
                "2. Recorrido e Impresión. \n" +
                "Así se recorre la 'listaArray' con un bucle de 'for': \n"
        );

        obj.recorrerListaArray();

        System.out.println(
                "\n" +
                "---------------- \n" +
                "3. Modificación. \n" +
                "Cambiar todos los valores impares por cero ( 0 ). \n \n" +
                "El original: "
        );

        obj.imprimirArray(obj.listaArray);

        System.out.println(
                "\n" +
                "La modificada: "
        );

        obj.modificarLista0();
        obj.imprimirArray(obj.lista0);

        System.out.println(
                "\n" +
                "--- \n" +
                "Multiplicar todos los valores por su indice. \n \n" +
                "El original: "
        );

        obj.imprimirArray(obj.listaArray);

        System.out.println(
                "\n" +
                "El modificado: "
        );

        obj.modificarListaX();
        obj.imprimirArray(obj.listaX);

        System.out.println(
                "\n" +
                "------------ \n" +
                "4. Búsqueda. \n" +
                "Imprimir búsqueda lineal para encontrar un valor en el arreglo. \n \n" +
                "Se busca el numero" + obj.valorBuscado + " en 'listaArray': "
        );

        obj.imprimirArray(obj.listaArray);

        String resultado = obj.busqueda(obj.listaArray, obj.valorBuscado);
        System.out.println(
                "\n" +
                resultado
        );


        System.out.print(
                "\n \n" +
                "------------------------------------------- \n" +
                "- 2. Matrices ( Arrays Bidimencionales ). - \n" +
                "------------------------------------------- \n" +
                "1. Declaración e inicialización. \n" +
                "Acá se dá una matriz de 3x3 en Java: \n \n");

        matriz0.imprimirMatriz0();

        System.out.print("\n Y resuelto se da una matriz 3x3 con numeros agregados del 1 al 9: \n");

        matriz1_9.imprimirMatriz1_9();

        System.out.print("\n" +
                "------------- \n" +
                "2. Recorrido. \n" +
                "La matriz en forma de tabla: \n");

        matriz1_9.tabla();

        System.out.println("\n" +
                "--------------- \n" +
                "3. Operaciones. \n");

        int total = matriz1_9.sumaElementos();

        System.out.println("La suma de todos los elementos de la matriz: " + total + "\n \n" +
                "Y el intercambio de las filas 1 y 2. \n" +
                "1ro, la matriz original, para tener una vista previa antes del cambio: \n");

        matriz1_9.imprimirMatriz1_9();

        System.out.println("\n" +
                "Y la matriz cambiando las filas: \n");

        matriz1_9.intercambiarFilas(0,2);
        matriz1_9.imprimirMatriz1_9();

        System.out.println("\n");
    }
}