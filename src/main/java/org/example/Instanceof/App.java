package org.example.Instanceof;

import org.example.InstanciaYStatic.Alumno;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List canasta = new ArrayList<>();
    private void verificar(Object objecto){
        if(objecto instanceof Fruta){
       canasta.add(objecto);
       System.out.println("Fruta agregada: "+((Fruta) objecto).getNombre());
        }else{System.out.println("Elemento no permitido solo frutas por favor");}
    }
    public static void main(String[] args) {
       /*String texto = new String ("Mitocode");
       //comprobar si es una instancia
       if(texto instanceof String){
           System.out.println("Es un string");
       }*/

       /* Alumno al = new Alumno();
        if(al instanceof Alumno){
            System.out.println("es una persona");
        }*/

       //Se tiene una canasta en donde solo se debe permitir ingresar frutas

        System.out.println("Canasta abierta , por favor solo ingresar frutas");

        Manzana m1 = new Manzana("Roja");
        Manzana m2 = new Manzana("Verde");
        Naranja n1 = new Naranja("Naranja sun pepa");
        Galleta g1 = new Galleta("Galleta");


        App app = new App();
        app.verificar(m1);
        app.verificar(m2);
        app.verificar(n1);
        app.verificar(g1);




    }
}
