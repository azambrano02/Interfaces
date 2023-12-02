package model;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private List<Estudiante> estudiantes;
    private String carrera;
    private int codigo;
    private int semestres;

    public Carrera(String carrera, int codigo, int semestres) {
        this.carrera = carrera;
        this.codigo = codigo;
        this.semestres = semestres;
        this.estudiantes = new ArrayList<>();
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }
    public boolean agregarEstudiante(Estudiante estudiante) {
        if (!estudianteExiste(estudiante)) {
            this.estudiantes.add(estudiante);
            return true;
        } else {
            return false;
        }
    }
    public boolean estudianteExiste(Estudiante estudiante){
        for(Estudiante e : this.estudiantes) {
            if(estudiante.getRut().equals(e.getRut())) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Carrera{" +
                "estudiantes=" + estudiantes +
                ", carrera='" + carrera + '\'' +
                ", codigo=" + codigo +
                ", semestres=" + semestres +
                '}';
    }
    public List<Estudiante> buscarEstudiantes(String nombre) {
        List<Estudiante> estudiantesEncontrados = new ArrayList<>();
        for(Estudiante estudiante : estudiantes){
            if(estudiante.getNombre().equals(nombre)){
                estudiantesEncontrados.add(estudiante);
            }
        }
        return estudiantesEncontrados;
    }

}
