package Practica3;

import java.util.Scanner;
import java.util.Vector;


public class Clases_y_metodos {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String opc;
        Vector<Estudiante> estu = new Vector<>();
        Estudiante agregar6 = new Estudiante();
        Estudiante agregar7 = new Estudiante();
        Estudiante agregar8 = new Estudiante();
        Estudiante agregar9 = new Estudiante();
        Estudiante agregar10 = new Estudiante();
       
        estu.add( new Estudiante("Fernando", "001", "Programacion", 100));
        estu.add( new Estudiante("Luis", "002", "calculo", 50));
        estu.add( new Estudiante("David", "003", "Español", 78));
        estu.add( new Estudiante("Mayerli", "004", "Administracion", 90));
        estu.add( new Estudiante("Cristian", "005", "Geografia", 24));
        
        while(!salir){
            System.out.println("a.Capturar alumnos");
            System.out.println("b.Mostrar alumnos");
            System.out.println("c.Salir");

            System.out.println("Seleccione una opcion");
            opc=sc.next();

            switch(opc){
                case "a":
                        agregar6.AgregarNombre(sc);
                        estu.add(agregar6);
                        agregar7.AgregarNombre(sc);
                        estu.add(agregar7);
                        agregar8.AgregarNombre(sc);
                        estu.add(agregar8);
                        agregar9.AgregarNombre(sc);
                        estu.add(agregar9);
                        agregar10.AgregarNombre(sc);
                        estu.add(agregar10);
                       
                        
                        
                        
                    break;
                    
                case "b":
                        
                    estu.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    
                    break;
                case "c":
                    salir=true;
            }
        }

        
    }


    
    
}
