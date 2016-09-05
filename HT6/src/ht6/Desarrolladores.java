/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    import java.util.Set;
    import java.util.HashSet;
    import java.util.TreeSet;
    import java.util.LinkedHashSet;
    import java.util.Scanner;

/**
 *
 * @author JoiceAndrea
 */
public class Desarrolladores {
     Set Java, Celulares, Web, Doble, Triple ;
     
     //metodo que crea la instancia de Set dependiendo de la opc ingresada por el usuario
     public void TipoSet  ( int opc){
         Factory <Integer> miFactory = new Factory <Integer>();
         //tipos de desarrolladores
         Java = miFactory.getFactory(opc);
         Celulares =miFactory.getFactory(opc);
         Web =miFactory.getFactory(opc);
         Doble =miFactory.getFactory(opc);
         Triple =miFactory.getFactory(opc);
     }
     
     //metodo que ingresa a uno de los tres tipos
     public void Ingresar (String nombre, int tipo){
         switch (tipo){
             case 1:
                 Java.add (nombre);
                 break;
             case 2: 
                 Celulares.add(nombre);
                 break;
             case 3:
                 Web.add(nombre);
                 break;
         }
     }
     
     //metodo para mostrar un grupo de desarrolladores
     public void mostrar ( Set grupo ){
         String[] array = new String[grupo.size()];
         array=(String[])grupo.toArray(new String[0]);
		for(int i=0;i<grupo.size();i++){
	            System.out.println(array[i]);
                }
    }
     
     
     //metodo que muestra las intersecciones entre conjuntos
     public void intersecciones (boolean J, boolean W, boolean C){
         if (J && W && C){
             Doble = Celulares;
             Doble.retainAll(Java);
             Doble.retainAll(Web);
             System.out.println("Los desarrolladores expertos en los tres ambientes son: \n ");
             mostrar(Doble);
         }
         else if (J && C){
             Doble= Java;
             Doble.retainAll(Celulares);
             System.out.println("Los desarrolladores expertos en Java y Celulares son: \n ");
             mostrar(Doble);
         }
         else if (J && W){
             Doble= Java;
             Doble.retainAll(Web);
             System.out.println("Los desarrolladores expertos en Java y Web son: \n ");
             mostrar(Doble);
         }
         else if (C && W){
             Doble= Celulares;
             Doble.retainAll(Web);
             System.out.println("Los desarrolladores expertos en Celulares y Web son: \n ");
             mostrar(Doble);
         }
     }
     
     //metodo que dice si los de java son subconjuntos de los de web
     public void subconjunto (){
         boolean vacio;
         
         Triple = Java;
         Triple.removeAll(Web);
         vacio = Triple.isEmpty();
         
         if(vacio == true){
             System.out.println("El conjunto de desarrolladores Java si es subconjunto de desarrolladores Web");
         }
         else{
             System.out.println("El conjunto de desarrolladores Java no es subconjunto de desarrolladores Web");
         }
     }
     
     
     //imprime el conjunto que tiene mayor numero de miembros 
     public void mayor (){
          int tam1 = Java.size();
          int tam2 = Celulares.size();
          int tam3 = Web.size();
          
          if (tam1 > tam2 && tam1> tam3){
              System.out.println("El conjunto mas grande es el de desarrolladores de Java");
              mostrar(Java);
          }
          else if ( tam2> tam1 && tam2 > tam3){
               System.out.println("El conjunto mas grande es el de desarrolladores de Celulares");
               mostrar(Celulares);
          }
          else {
              System.out.println("El conjunto mas grande es el de desarrolladores de Web");
              mostrar(Web);
               
          }
     }
}


