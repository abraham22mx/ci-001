package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class SumApp {
    private static final Logger logger = LoggerFactory.getLogger(SumApp.class);

    public static int sum(int a, int b) {
        if (a < 0 || b < 0) {
            logger.error("Número negativo detectado: a=" + a + ", b=" + b);
            throw new IllegalArgumentException("No se permiten números negativos");
        }
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        try {
            int result = sum(a, b);
            System.out.println("La suma es: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

