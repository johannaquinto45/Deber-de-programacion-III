
package tareaprogramacion;


public class Arreglos {
    public static void main(String[] args) {
        Persona pr1 = new Persona(1001);
        pr1.setNombre("Antonela");
        pr1.setLocalizacion("Guayaquil");
        pr1.setEdad(23);
        
        Persona pr2 = new Persona (1002, "ana", "daule", 29);
        Persona pr3 = new Persona (1003, "jose", "nobol", 19);
        
        Persona[] personas = new Persona [3];
        //personas[0] = pr2;
        //personas[1] = pr1;
        //personas[2]= pr2;
        
        //personas[2].setEdad(10);
        //Persona temp = personas [2];
        //temp.setEdad(11);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
}

