package com.expresiones.lambda.ejercicio1;

public class Alumno {

    private int id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String nombreCurso;
    private Double nota;
    private int edad;

    public Alumno() {
    }

    public Alumno(int id, String cedula, String nombres, String apellidos, String nombreCurso, Double nota, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void imprimirDatos() {
        System.out.println("\nid :" + id);
        System.out.println("cedula : " + cedula);
        System.out.println("nombres : " + nombres);
        System.out.println("apellidos : " + apellidos);
        System.out.println("nombreCurso : " + nombreCurso);
        System.out.println("nota : " + nota);
        System.out.println("edad : " + edad);

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", cedula='" + cedula + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", nota=" + nota +
                ", edad=" + edad +
                '}';
    }
}
