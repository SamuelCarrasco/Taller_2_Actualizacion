package Model;

import java.util.ArrayList;

public class Carrera {

    private String nombreCarrera;
    private String codCarrera;
    private String cantidadSemestre;

    //Arraylist de estudiantes
    ArrayList<Estudiante> estudintes = new ArrayList<Estudiante>();

    public Carrera(String nombreCarrera, String codCarrera, String cantidadSemestre, ArrayList<Estudiante> estudintes) {
        this.nombreCarrera = nombreCarrera;
        this.codCarrera = codCarrera;
        this.cantidadSemestre = cantidadSemestre;
        this.estudintes = estudintes;
    }


    //Añadir estudiantes
    public void AñadirEstudiante (String nombre, String apellido, String rut, String nuMatricula ){
        Estudiante estudiantes = new Estudiante(nombre, apellido, rut, nuMatricula);
        this.estudintes.add(estudiantes);
    }
    //Eliminar estudiantes
    public void EliminarEstudiante (Estudiante estudiantes){
        this.estudintes.remove(estudiantes);
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(String codCarrera) {
        this.codCarrera = codCarrera;
    }

    public String getCantidadSemestre() {
        return cantidadSemestre;
    }

    public void setCantidadSemestre(String cantidadSemestre) {
        this.cantidadSemestre = cantidadSemestre;
    }

    public ArrayList<Estudiante> getEstudintes() {
        return estudintes;
    }

    public void setEstudintes(ArrayList<Estudiante> estudintes) {
        this.estudintes = estudintes;
    }
}
