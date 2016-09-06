/*
 *Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 6
 * Joice Miranda
 * Luis Abadia
 */

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Factory <E> {
     public Set getFactory(int opc){
		 
		 if(opc == 0){
			 return new HashSet<E>();
		 }
		 if(opc == 1){
			 return new TreeSet<E>();
		 }
		 if(opc == 2){
			 return new LinkedHashSet<E>();
		 }
		return null;  
	 }   

}
