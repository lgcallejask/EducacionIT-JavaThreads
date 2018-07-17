package clase05;

import static clase05.Estado.*;
import static clase05.Genero.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaR {
    private List<Persona> lista;
    public PersonaR() {
        lista=new ArrayList();
        lista.add(new Persona("Lucas","Monte",MASCULINO,CASADO));
        lista.add(new Persona("Maria","Gomes",FEMENINO,CASADO));
    }
    public void save(Persona p){
        lista.add(p);
    }
    public List<Persona> getAll(){
        return lista;
    }
    
}
