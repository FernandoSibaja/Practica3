package Practica3;

import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String No_estudiante;
    private String materia;
    private int calificacion;
    private String estado;
    

    public Estudiante(String nombre, String No_estudiante, String materia, int calificacion){
        this.nombre=nombre;
        this.No_estudiante=No_estudiante;
        this.materia=materia;
        this.calificacion=calificacion;
        this.estado=this.Estado(calificacion);
        
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getNo_estudiante(){
        return No_estudiante;
    }
    public void setNo_estudiante(String No_estudiante){
        this.No_estudiante=No_estudiante;
    }
    public String getmateria(){
        return materia;
    }
    public void setmateria(String materia){
        this.materia=materia;
    }
    public int getcalificacion(){
        return calificacion;
    }
    public void setcalificacion(int calificacion){
        this.calificacion=calificacion;
    }
    public String getestado(){
        return estado;
    }
    public void setestado(String estado){
        this.estado=estado;
    }
    public Estudiante() {
        this.nombre = null;
        this.No_estudiante = null;
        this.materia = null;
        this.calificacion = 0;
        this.estado = null;
    }

    public void AgregarNombre(Scanner sc){

        System.out.println("Nombre: ");
        this.nombre=sc.next();
        System.out.println("No_Estudiante: ");
        this.No_estudiante=sc.next();
        System.out.println("Materia: ");
        this.materia=sc.next();
        System.out.println("Calificacion: ");
        this.calificacion=sc.nextInt();
        this.asignarEstado();
        

    }

    public String Estado(int calificacion){
        String est;
        if(calificacion>=60)
        {
            return est="aprovado";
        }
        else
        {
            return est="reprovado";
        }
    }
    private String Estado() {
        return Estado(this.calificacion);
    }
    public void asignarEstado() {
        this.estado = this.Estado();
    }


    public String toString() {
        return nombre+", " + No_estudiante+", " + materia+", " + calificacion+", " + estado ;
        
      
    }

    
}
