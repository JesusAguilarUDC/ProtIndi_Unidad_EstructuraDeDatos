package com.jesus.Ejercicios_Java.Arrays;

import java.util.Random;

public class Arrays {
    Random random = new Random();

    // 1. Declaración y creación.
    // En Python, se puede escribir una lista con datos anteriormente puestas de esta manera:
    public int[] listaEscrita = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    // Se utiliza el comando "array" para hacer el enlistado multiple datos relacionados a una unica variable.
    // Usualmente usado en otros lenguajes, como Java, pero donde tambien se le puede usar en Python con una extención.
    public int[] listaArray = new int[10];

    // Copias para practicas.
    public int[] lista0;
    public int[] listaX;

    // -----------------------
    // 2. Recorrido y mostrar.
    // Recorrdio usando bucle for clásico.
    public Arrays() {
        for (int i = 0; i < listaArray.length; i++) {
            listaArray[i] = random.nextInt(10) + 1;
        }

        // Clones para los demas ejercicios.
        this.lista0 = listaArray.clone();
        this.listaX = listaArray.clone();
    }

    // Poder imprimir o visualizar los arreglos hechos.
    public void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Recorre el arreglo y pone la 'Posición' de cada elemento.
    public void recorrerListaArray() {
        for (int i = 0; i < listaArray.length; i++) {
            System.out.println("Posición " + i + ": " + listaArray[i]);
        }
    }

    // Modifica el arreglo 'lista0' para hacer que los numeros impares sean igual a cero ( 0 ).
    public void modificarLista0() {
        for (int i = 0; i < lista0.length; i++) {
            if (lista0[i] % 2 != 0) {
                lista0[i] = 0;
            }
        }
    }

    // Modifica el arreglo 'listaX' para poder multiplicar sus indices con los resultados.
    public void modificarListaX() {
        for (int i = 0; i < listaX.length; i++) {
            listaX[i] = listaX[i] * i;
        }
    }

    // Se agrega 'busqueda' para poder verificar si un numero está dentro del arreglo.
    public String busqueda(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return "El valor " + valor + " si está en la lista, en la posición " + i + ".";
            }
        }
        return "El valor " + valor + " NO está en la lista.";
    }

    public int valorBuscado = 8;

}
