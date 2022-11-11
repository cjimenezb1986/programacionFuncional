package com.expresiones.lambda.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestAlumno {

    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno(1,"1010","Cristian Raul","Ramirez Escalante","Microservicios",16.4,16));
        listaAlumnos.add(new Alumno(2,"1018","Lionel","Messi","Java",17.1,29));
        listaAlumnos.add(new Alumno(3,"1017","Cristiano","Ronaldo","Mysql",18.3,28));
        listaAlumnos.add(new Alumno(4,"1016","Kylian","Mbappe","Postgress",19.0,27));
        listaAlumnos.add(new Alumno(5,"1015","Neymar","Jr","JPA",10.0,25));
        listaAlumnos.add(new Alumno(6,"1014","Robert","Lewandowsky","DOCKER",11.0,22));
        listaAlumnos.add(new Alumno(7,"1013","Kevin","De Bruyne","Microservicios",12.0,18));
        listaAlumnos.add(new Alumno(8,"1012","Karim","Benzema","Microservicios",13.6,20));
        listaAlumnos.add(new Alumno(9,"1011","Erling","Haalam","Microservicios",14.0,35));
        listaAlumnos.add(new Alumno(10,"1019","Mohamed","Salah","Microservicios",15.0,40));

        System.out.println("\n------------------");
        System.out.println("Lista de alumnos");
        System.out.println("------------------");
        listaAlumnos.stream().
                forEach(alumno -> alumno.imprimirDatos());

        System.out.println("\nAlumnos cuyo nombre empieza con L o G");
        System.out.println("------------------");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombres().startsWith("L") || alumno.getNombres().startsWith("K"))
                .forEach(alumno -> alumno.imprimirDatos());

        System.out.println("------------------");
        System.out.println("\nNumero de alumnos");
        System.out.println(listaAlumnos.stream()
                .count());

        System.out.println("------------------");
        System.out.println("\n Alumno con menor edad : ");
        System.out.println(listaAlumnos.stream()
                .min((a1,a2) -> a1.getEdad() - a2.getEdad()));


        System.out.println("------------------");
        System.out.println("\n Alumno con mayor edad :");
        System.out.println(listaAlumnos.stream()
                .max((a1,a2) -> a1.getEdad() - a2.getEdad()));

        System.out.println("------------------");
        System.out.println("\n Primer alumno : ");
        System.out.println(listaAlumnos.stream()
                .findFirst());

        System.out.println("------------------");
        System.out.println("\n Alumnos que los nombres de los cursos : ");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombreCurso().endsWith("s"))
                .forEach(Alumno::imprimirDatos);

        System.out.println("------------------");
        System.out.println("\n Alumnos que los nombres de los cursos contiene la letra a : ");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombreCurso().contains("a"))
                .forEach(Alumno::imprimirDatos);

        System.out.println("------------------");
        System.out.println("\n Alumnos que los nombres es mayor a 8 caracteres : ");
        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombres().length()>8)
                .forEach(Alumno::imprimirDatos);

        //https://www.youtube.com/watch?v=U5oOdNG2XQY&ab_channel=MitoCode
    }
}


















