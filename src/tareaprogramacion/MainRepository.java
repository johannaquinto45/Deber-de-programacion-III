
package tareaprogramacion;

import java.util.List;


public class MainRepository {
    public static void main(String[] args) {
        PersonaRepository repository = new  PersonaRepository ();
        Persona pr4 = new Persona (1004,"Mabel", "Machala",50);
        repository.agregar(pr4);
        List <Persona> list = repository.getPersonas();
        for (Persona persona: list) {
            System.out.println(persona);
        }
        System.out.println("");
        Persona result = repository.getPersona(1009);
        System.out.println(result);
        String nombre="a";
        System.out.println("Busquieda por filtro"+ nombre);
        
        List <Persona> listfiltre = repository.getPorNombre(nombre);
        System.out.println(listfiltre);
    }
}
