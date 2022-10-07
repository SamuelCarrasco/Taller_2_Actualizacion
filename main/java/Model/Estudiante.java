package Model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private String nuMatricula;

    public Estudiante(String nombre, String apellido, String rut, String nuMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.nuMatricula = nuMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNuMatricula() {
        return nuMatricula;
    }

    public void setNuMatricula(String nuMatricula) {
        this.nuMatricula = nuMatricula;
    }
}
