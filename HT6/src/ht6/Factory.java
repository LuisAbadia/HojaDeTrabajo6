/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
/**
 *
 * @author JoiceAndrea
 */
public class Factory <E>{
    
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
