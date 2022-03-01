package Practica3;

import java.util.Scanner;
import java.util.Vector;


public class Clases_y_metodos {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String opc;
        Vector<Estudiante> estu = new Vector<>();
        Estudiante agregar = new Estudiante();
        
       
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
                    for(int i=1;i<=5;i++)
                    {
                        agregar.AgregarNombre(sc);
                        estu.add(agregar);
                    }
                    break;
                case "b":
                        estu.forEach((x) -> {
                        System.out.println(x.toString());
                    });
                    break;
                case "c":
                    break;
            }
        }

        
    }


    
    
}
