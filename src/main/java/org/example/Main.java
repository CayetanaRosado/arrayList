package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Crea un programa que lea una lista de números enteros desde teclado y
        // los almacene en un ArrayList. A continuación, el programa deberá mostrar
        // por pantalla el número de elementos de la lista y la suma de los mismos.
        // NUEVO
        boolean verdad = true;
        int numero;
        int suma = 0;
        ArrayList<Integer> numerosLista = new ArrayList<Integer>();
        System.out.println("Escribe los numeros que quieras: ");
        do {
            numero = sc.nextInt();
            if (numero != 0) {
                numerosLista.add(numero);
            }

        } while (numero != 0);

        for (int i = 0; i < numerosLista.size(); i++) {
            suma += numerosLista.get(i);
        }
    }
}
