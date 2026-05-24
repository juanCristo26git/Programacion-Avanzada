package edu.puj.app;

import edu.puj.model.Estudiante;
import edu.puj.model.Curso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de estudiantes");

        System.out.println("Ingrese los datos del curso");

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = scanner.nextLine();
        System.out.println("Ingrese el código del curso:");
        String codigoCurso = scanner.nextLine();

        Curso curso = new Curso(nombreCurso, codigoCurso, new ArrayList<>());

        System.out.println("Ingrese la cantidad de estudiantes que quiere ingresar");
        int cant = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad del estudiante:");
            Integer edad = Integer.valueOf(scanner.nextLine());

            System.out.println("Ingrese el codigo del estudiante:");
            String codigo = scanner.nextLine();

            Estudiante estudiante = new Estudiante(nombre, edad, codigo);
            curso.agregarEstudiante(estudiante);
        }

        curso.mostrarEstudiantes();
    }
}


