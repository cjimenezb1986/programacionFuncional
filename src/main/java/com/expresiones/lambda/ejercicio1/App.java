package com.expresiones.lambda.ejercicio1;

import com.expresiones.lambda.ejercicio1.model.Persona;
import com.expresiones.lambda.ejercicio1.model.Producto;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Persona ps1 = new Persona(1,"Mito",LocalDate.of(1991,1,21));
        Persona ps2 = new Persona(2,"Code",LocalDate.of(1990,2,21));
        Persona ps3 = new Persona(3,"Haime",LocalDate.of(1980,6,23));
        Persona ps4 = new Persona(4,"Duke",LocalDate.of(2019,8,15));
        Persona ps5 = new Persona(5,"Zames",LocalDate.of(2010,1,4));

        Producto pr1 = new Producto(1,"Ceviche",15.0);
        Producto pr2 = new Producto(2,"Chilaquies",25.50);
        Producto pr3 = new Producto(3,"Bandeja Paisa",35.50);
        Producto pr4 = new Producto(4,"Ceviche",15.0);

        List<Persona> listaPersonas = Arrays.asList(ps1,ps2,ps3,ps4,ps5);
        List<Producto> listaProductos = Arrays.asList(pr1,pr2,pr3,pr4);

       /* for(int i=0; i<listaPersonas.size();i++){
            System.out.println(listaPersonas.get(i));
        }

        for(Persona p:listaPersonas){
            System.out.println(p);
        }*/
        //listaPersonas.forEach(p-> System.out.println(p));
        //listaPersonas.forEach(System.out::println);

        // 1- filter (Param: Predicate) Predicate devuelve un boolean--------------------------------------------------
        List<Persona> filteredList1 = listaPersonas.stream()
                .filter(p -> App.getAge(p.getBirthDate()) >=18)
                .collect(Collectors.toList());
        //App.printList(filteredList1);

        //2- Map(param: function) Para hacer calculos------------------------------------------------------------------
        List<String> filteredList2= listaPersonas.stream()
                //.filter(p -> App.getAge(p.getBirthDate()) >=18)
                //.map(p -> App.getAge(p.getBirthDate()))
                .map(p-> "coder "+p.getName())
                .collect(Collectors.toList());

        Function<String,String> coderFunction = name -> "Coder " + name;

        List<String>filteredList3= listaPersonas.stream()
                .map(Persona::getName)
                .map(coderFunction)
                .collect(Collectors.toList());

        //3- Sorted (Param: Comparator) para organizar------------------------------------------------------------------
        Comparator<Persona> byNameAsc = (Persona per1, Persona per2) -> per1.getName().compareTo(per1.getName());
        Comparator<Persona> byNameDesc = (Persona per1, Persona per2) -> per2.getName().compareTo(per1.getName());
        Comparator<Persona> byBirthDate = (Persona per1, Persona per2) -> per1.getBirthDate().compareTo(per2.getBirthDate());

        List<Persona>filteredList4= listaPersonas.stream()
                .sorted(byBirthDate)
                .collect(Collectors.toList());

        //4- Match (param: predicate)-----------------------------------------------------------------------------------
        Predicate<Persona> startWithPredicate = persona -> persona.getName().startsWith("J");

        //Anymatch (No evalua todo el stream, termina en la coincidencia) -------------------------------------------------
        boolean rpta1= listaPersonas.stream()
                //.anyMatch(p -> p.getName().startsWith("H"));
                .anyMatch(startWithPredicate);

        //AllMatch (Evalua que todos comiencen con Z)
        boolean rpta2= listaPersonas.stream()
                //.allMatch(p->p.getName().startsWith("Z"));
                .allMatch(startWithPredicate);

        //NoneMatch (Ninguno comience con la J)
        boolean rpta3=listaPersonas.stream()
                        //.noneMatch(p->p.getName().startsWith("J"));
                        .noneMatch(startWithPredicate);


        //5- Limit/Skip
        List<Persona> filteredList6 =listaPersonas.stream()
                 .skip(2)
                .limit(2)
                .collect(Collectors.toList());

        //System.out.println(rpta3);

        // 6- Collectors
        //GroupBy
        Map<String,List<Producto>> collect= listaProductos.stream()
                .filter(p -> p.getPrice()>10)
                .collect(Collectors.groupingBy(Producto::getName));

        //System.out.println(collect);

        //Count
        Map<String, Long> collect2= listaProductos.stream()
                .collect(Collectors.groupingBy(
                   Producto::getName, Collectors.counting()
                ));


        //Agrupando y sumando
        Map<String,Double> collect3= listaProductos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getName,
                        Collectors.summingDouble(Producto::getPrice)
                ));

        //Obteniendo suma y resumen
        DoubleSummaryStatistics statistics= listaProductos.stream()
                        .collect(Collectors.summarizingDouble(Producto::getPrice));

        //7- Reduce
        Optional<Double> suma= listaProductos.stream()
                .map(Producto::getPrice)
                //.reduce((a,b)->a+b)
                .reduce(Double::sum);



        System.out.println(suma.get());
        //App.printList(filteredList6);
    }

    public static int getAge(LocalDate birthDate){
        return Period.between(birthDate,LocalDate.now()).getYears();
    }

    public static void printList(List<?> list){
        list.forEach(System.out::println);
    }

}




















