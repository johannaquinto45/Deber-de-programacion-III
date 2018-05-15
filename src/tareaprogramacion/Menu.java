
package tareaprogramacion;

import java.util.List;
import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args) {
      Scanner menu= new Scanner(System.in);
        int op;
        PersonaRepository pr= new PersonaRepository();
        Persona p= new Persona();
        
         do{ 
            System.out.println("-----------Menu-----------");
            System.out.println("1.-Agregar nueva persona");
            System.out.println("2.-Mostrar");
            System.out.println("3.-Buscar por id");
            System.out.println("4.-Buscar persona por rando de edad");
            System.out.println("5.-Buscar persona por nombre");
            System.out.println("6.-Salir");
            System.out.print("Introdusca un numero:");
            op = menu.nextInt();
        

            switch(op){
                case 1:
                    System.out.println("Ingresa ");
                    int id = menu.nextInt();
                    System.out.println("Ingresa");
                    String nombre= menu.next();
                    p.setNombre(nombre);
                    System.out.println("Ingresa");
                    String localizacion= menu.next();
                    p.setLocalizacion(localizacion);
                    System.out.println("Ingresa");
                    int edad= menu.nextInt();
                    p.setEdad(edad);
                    pr.agregar(p);
                    break;
                case 2:
                    .println("Ingrse la persona:");
                    public Persona getPersona (int id);
                    for (persona.getId()==id)
                    return persona;
                    
                    break;
                case 3:
                    System.err.println("Ingrese el id de busquedad:");
                    int i= menu.nextInt();
                    Persona result = pr.getPersona(i);
                    System.err.println(result);
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.err.println("Ingrese el rango del nombre:");
                    String name= menu.next();
                    List <Persona> ListFilter = pr.getPorNombre(name);
                    System.err.println(ListFilter);
                    break;
                case 6:
                    
                    break;
                   
                    
            }
                       
             }while(op >6);
    }

}
