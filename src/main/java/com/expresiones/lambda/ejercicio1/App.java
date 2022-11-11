package com.expresiones.lambda.ejercicio1;

import com.expresiones.lambda.ejercicio1.model.Persona;
import com.expresiones.lambda.ejercicio1.model.Producto;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Persona p1=new Persona(1,"Mito",LocalDate.of(1991,1,21));
        Persona p2=new Persona(2,"Code",LocalDate.of(1990,2,21));
        Persona p3=new Persona(3,"Jaime",LocalDate.of(1980,6,23));
        Persona p4=new Persona(4,"Duke",LocalDate.of(2019,8,15));
        Persona p5=new Persona(5,"James",LocalDate.of(2010,1,4));

        Producto pr1 = new Producto(1,"Ceviche",15.0);
        Producto pr2 = new Producto(2,"Chilaquies",25.50);
        Producto pr3 = new Producto(3,"Bandeja Paisa",35.50);
        Producto pr4 = new Producto(4,"Sopa",15.0);

        List<Persona> listaPersonas = Arrays.asList(p1,p2,p3,p4,p5);
        List<Producto> listaProductos = Arrays.asList(pr1,pr2,pr3,pr4);

    }

}
