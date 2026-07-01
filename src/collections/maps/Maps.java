package collections.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {
    
    // Map<k:V> k: key, V: value
    // Map<tipo de dato clave, tipo de dato valor>
    // Map<String, Integer> map = new HashMap<>();

    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        System.out.println("Tamaño del mapa: " + mapa.size());
        System.out.println("Diccioonario: ");
        System.out.println("Valores del mapa: " + mapa);

        for(int i=0; i<mapa.size(); i++){
            System.out.println(mapa.values().toArray()[i]);
        }

        for(String key : mapa.keySet()){
            System.out.println(key);
        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("F"));

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println("Valores del mapa: " + mapa);

        return mapa;
    }

    public Map<String, Integer> construirLInkedHashMap() {
        Map<String, Integer> mapaDos = new LinkedHashMap<>();
        mapaDos.put("A", 10);
        mapaDos.put("B", 20);
        mapaDos.put("C", 30);
        mapaDos.put("A", 50);

        System.out.println("Tamaño del mapa: " + mapaDos.size());
        System.out.println("Diccioonario: ");
        System.out.println("Valores del mapa: " + mapaDos);

        for(int i=0; i<mapaDos.size(); i++){
            System.out.println(mapaDos.values().toArray()[i]);
        }

        for(String key : mapaDos.keySet()){
            System.out.println(key);
        }

        System.out.println(mapaDos.get("A"));
        System.out.println(mapaDos.get("B"));
        System.out.println(mapaDos.get("F"));

        mapaDos.putIfAbsent("F", 100);
        mapaDos.putIfAbsent("A", 200);
        System.out.println("Valores del mapa: " + mapaDos);

        return mapaDos;
    }

    public Map<String, Integer> construirTreeMap() {
        Map<String, Integer> mapaTres = new TreeMap<>();
        mapaTres.put("A", 10);
        mapaTres.put("B", 20);
        mapaTres.put("C", 30);
        mapaTres.put("A", 50);

        System.out.println("Tamaño del mapa: " + mapaTres.size());
        System.out.println("Diccioonario: ");
        System.out.println("Valores del mapa: " + mapaTres);

        for(int i=0; i<mapaTres.size(); i++){
            System.out.println(mapaTres.values().toArray()[i]);
        }

        for(String key : mapaTres.keySet()){
            System.out.println(key);
        }

        System.out.println(mapaTres.get("A"));
        System.out.println(mapaTres.get("B"));
        System.out.println(mapaTres.get("F"));

        mapaTres.putIfAbsent("F", 100);
        mapaTres.putIfAbsent("A", 200);
        System.out.println("Valores del mapa: " + mapaTres);

        return mapaTres;
    }

    public Set<Contacto> ordenarUnicos(List<Contacto> contactos) {
        // Retornar contactos unicos
        // Unicos solo por el nombre

        Set<Contacto> contactosUnicos = new TreeSet<>((c1, c2) -> {if(c1.getNombre().equals(c2.getNombre())) { return 0; } return c1.getApellido().compareTo(c2.getApellido());});
        for(Contacto contacto : contactos) {
            contactosUnicos.add(contacto);
        }
        return contactosUnicos;

        // ordenarsegun el apellido de manera descendente

    }
}
