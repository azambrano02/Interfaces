package model;

public class Estudiante {
    private String nombre;
    private String rut;
    private String matricula;

    public Estudiante(String nombre, String rut, String matricula) {
        this.nombre = nombre;
        this.rut = rut;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
