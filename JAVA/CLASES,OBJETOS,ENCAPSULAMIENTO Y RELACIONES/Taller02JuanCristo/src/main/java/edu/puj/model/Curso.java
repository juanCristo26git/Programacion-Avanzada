package edu.puj.model;
import java.util.ArrayList;

public class Curso
{
    private String nombreCurso;
    private String codigoCurso;
    private ArrayList<Estudiante> listaEstudiantes=new ArrayList<>();

    public Curso(String nombre, String codigoCurso, ArrayList<Estudiante> listaEstudiantes)
    {
        this.nombreCurso = nombre;
        this.codigoCurso = codigoCurso;
        this.listaEstudiantes = listaEstudiantes;
    }

    public void agregarEstudiante (Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    public void mostrarEstudiantes(){
        for(Estudiante estudiante:listaEstudiantes){
            System.out.println(estudiante.toString());

        }
    }
    public Integer getCantidadEstudiantes(){
        return listaEstudiantes.size();
    }
}

