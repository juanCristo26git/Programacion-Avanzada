package edu.puj;
import java.util.Scanner;

public class Main {

    public static Float suma(Float a, Float b) {
        return a + b;
    }

    public static Float resta(Float a, Float b) {
        return a - b;
    }

    public static Float multiplicacion(Float a, Float b) {
        return a * b;
    }

    public static Float division(Float a, Float b) {
        if (b == 0) {
            System.out.println("Error: El divisor no puede ser cero.");
            return null;
        }
        return a / b;
    }

    public static Float potencia(Float base, Float exponente) {
        return (float) Math.pow(base, exponente);
    }

    public static Float raizCuadrada(Float a) {
        if (a < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return null;
        }
        return (float) Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("CALCULADORA" + " -> " + "Usar la coma para separar numeros");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            Float resultado = 0.0f;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    Float a1 = scanner.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    Float b1 = scanner.nextFloat();
                    resultado = suma(a1, b1);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    Float a2 = scanner.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    Float b2 = scanner.nextFloat();
                    resultado = resta(a2, b2);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    Float a3 = scanner.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    Float b3 = scanner.nextFloat();
                    resultado = multiplicacion(a3, b3);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.print("Ingrese el dividendo (primer num): ");
                    Float a4 = scanner.nextFloat();
                    System.out.print("Ingrese el divisor (segundo num): ");
                    Float b4 = scanner.nextFloat();
                    resultado = division(a4, b4);
                    if (resultado != null) {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                case 5:
                    System.out.print("Ingrese la base (primer num): ");
                    Float base = scanner.nextFloat();
                    System.out.print("Ingrese el exponente (segundo num): ");
                    Float exponente = scanner.nextFloat();
                    resultado = potencia(base, exponente);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 6:
                    System.out.print("Ingrese el numero: ");
                    Float a6 = scanner.nextFloat();
                    resultado = raizCuadrada(a6);
                    if (resultado != null) {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                case 0:
                    System.out.println("salir");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
