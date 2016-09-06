/*
 *Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 6
 * Joice Miranda
 * Luis Abadia
 */



import java.util.Scanner;   

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Desarrolladores miDesarrollador = new Desarrolladores(); //1 creas un objeto de tipo desarrolladores para poder implementar tdos los metodos
        
        //Declaracion de Variables
        int a = 1;
        int b = 1;
        int tipo1,tipo2;
        int opcion, opcion2,opcion3;
        String teclado="";
        int teclado2=0;
        String teclado3="";
        
        
        while(a==1){
//Primer menu seleccion de Hash
            System.out.println("************MENU Principal**************");
            System.out.println("Bienvenido al programa!");
            System.out.println("Que tipo desea utilizar:");
            System.out.println("1) HashSet");
            System.out.println("2) TreeSet");
            System.out.println("3) LinkedHashSet");
            System.out.println("4) Salir del Programa");
            System.out.println("***Ingrese solo caracteres numericos y enteros***");
            Scanner EntradaScanner = new Scanner(System.in);
            teclado = EntradaScanner.nextLine();
            
            System.out.println ("Entrada recibida por teclado es: \"" + teclado+"\"");
            opcion= Integer.parseInt(teclado);
            if(opcion==4){
                a=0;
            }
            
            miDesarrollador.TipoSet(opcion);
            while(b==1){
//Menu Secundario
                System.out.println("************MENU Secundario**************");
                System.out.println("¿Que accion desea Realiazar?");
                System.out.println("1) Ingresar Desarrolladores");
                System.out.println("2) Conjunto con mayor numero de miembros");
                System.out.println("3) Mostrar intersecciones");
                System.out.println("4) Salir");
                System.out.println("***Ingrese solo caracteres numericos y enteros***");
                Scanner EntradaScanner2 = new Scanner(System.in);
                teclado2 = EntradaScanner2.nextInt();
                opcion2= teclado2;
                
                if(opcion2==1){
        //En esta seccion ingresa los nombre de los desarrolladores y el tipo
                    System.out.println("por favor ingrese el nombre del desarrollador y el tipo");
                    System.out.println("Tipos:");
                    System.out.println("1) JAVA");
                    System.out.println("2) Celulares");
                    System.out.println("3) WEB");
                    
                    System.out.println("Nombre :");
                    Scanner EntradaScanner3 = new Scanner(System.in);
                    teclado3 = EntradaScanner3.nextLine();
                    System.out.println("Tipo");
                    Scanner EntradaScanner4 = new Scanner(System.in);
                    teclado2 = EntradaScanner4.nextInt();
                    tipo1 = teclado2;
                            
                    miDesarrollador.Ingresar(teclado3, tipo1);
                }
                if(opcion2==2){
        //En esta seccion selecciona que grupo es el mas grande en miembros
                    System.out.println("Grupo mas grande de miembros es: ");
                    miDesarrollador.mayor();
                }
                if(opcion2==3){
                    System.out.println("****Interseccion****");
                    System.out.println("¿Que interseccion desea ver");
                    System.out.println("1) Java, Web y Celulares");
                    System.out.println("2) Java y Web");
                    System.out.println("3) Java y Celulares");
                    System.out.println("4) Web y Celulares");
                    Scanner EntradaScanner5 = new Scanner(System.in);
                    teclado3 = EntradaScanner5.nextLine();
                    tipo2 = Integer.parseInt(teclado3);
                    
                    if(tipo2==1){
                        miDesarrollador.intersecciones(true, true, true);
                    }
                    if(tipo2==2){
                        miDesarrollador.intersecciones(true, true, false);
                    }
                    if(tipo2==3){
                        miDesarrollador.intersecciones(true, false, true);
                    }
                    if(tipo2==4){
                        miDesarrollador.intersecciones(false, true, true);
                    }
                }
                if(opcion2==4){
                    b=0;
                }  
            }
            
            b=1;
            
        }
        
 
    }
    
}
