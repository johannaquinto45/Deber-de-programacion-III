
package tareaprogramacion;

import java.util.ArrayList;
import java.util.List;



public class PersonaRepository {
  private List<Persona> personas = new ArrayList();
  public PersonaRepository(){
     Persona pr1 = new Persona(1001);
        pr1.setNombre("Andy");
        pr1.setLocalizacion("Guayaquil");
        pr1.setEdad(40);
        
        Persona pr2 = new Persona (1002, "Gabriel", "Manta", 25);
        Persona pr3 = new Persona (1003, "Gabriela", "Manta", 26);
        
//        List <Persona> personas = new ArrayList <>();
        personas.add(pr1);
        personas.add(pr2);
        personas.add(pr3);
}
  //crear objeto llamado agregar
  public void agregar (Persona persona){
      personas.add(persona);
      }
  public List<Persona> getPersonas(){
      return personas;
  }
  public Persona getPersona(int id){
      for (Persona persona : personas) {
          if(persona.getId()==id) 
             return persona; 
          
          
      }
      return null;
 }
  //completar 
  //AGregar
  // mostrar lsita persn
  // buscar persopnas por el rangop de edad 
  //buscar pèrsona por el nombre
  // por el id
  public List<Persona> getPorRangoEdad (int inicio, int fin){
      List<Persona> result = new ArrayList<>();
      for (Persona persona : personas) {
          if (persona.getEdad() >=inicio && persona.getEdad()<= fin){
            result.add(persona);  
          }
          
      }
      
      return result;
      }
   public List<Persona> getPorNombre (String nombre){
      List<Persona> result = new ArrayList<>();
       for (Persona persona : personas) {
           if (persona.getNombre().contains(nombre)) 
               result.add(persona);
               
           }
          return result; 
       }
      
      }
  
