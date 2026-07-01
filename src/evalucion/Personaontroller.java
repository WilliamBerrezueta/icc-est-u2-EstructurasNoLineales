package evalucion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Personaontroller {
    public Set<Persona> filtrarYOrdenar(Set<Persona> personas, int edadMinima) {
        // Filtrar las personas que tienen una edad mayor o igual a la edad mínima
        // Ordenar las personas filtradas por edad de manera descendente
        // si la edad es igual, ordenar por nombre de manera ascendente

        Set<Persona> personasFiltradas = new TreeSet<>((p1, p2) -> {
            int compE = Integer.compare(p2.getEdad(), p1.getEdad());
            if (compE != 0) {
                return compE;
            }
            int compN = p1.getNombre().compareToIgnoreCase(p2.getNombre());
            return compN;
            
        });
        for(Persona p : personas) {
            if (p.getEdad() >= edadMinima) {
                personasFiltradas.add(p);
            }
        }


    return personasFiltradas;
    }

    public Map<String, Set<String>> contarPersonasPorNombre(List<Persona> personas) {
        String nombre = "Juan Perez";

        String[] palabras = nombre.split(" ");
        String primerNombre = palabras[0]; // "Juan"
        // ["Juan", "Perez"]


        return null;
        
    }
}
