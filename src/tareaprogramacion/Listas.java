/
package tareaprogramacion;

import java.util.ArrayList;
import java.util.List;


public class Listas {
    public static void main(String[] args) {
        Persona pr1 = new Persona(1001);
        pr1.setNombre("Antonela");
        pr1.setLocalizacion("Guayaquil");
        pr1.setEdad(40);
        
        Persona pr2 = new Persona (1002, "ana", "daule", 29);
        Persona pr3 = new Persona (1003, "jose", "nobol", 19);
        
        List <Persona> personas = new ArrayList <>();
        personas.add(pr1);
        personas.add(pr2);
        personas.add(pr3);
        System.out.println("size:" + personas.size());
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
           // System.out.println(i+": "+ personas.get(i));
            System.out.println(i+ ": "+ persona);
                
        }
        int edades=0;
        for(Persona persona : personas){
            //foreach
            edades += persona.getEdad();
            System.out.println(persona);
            }
        System.out.println("Edad total:"+ edades);
        }
    }
