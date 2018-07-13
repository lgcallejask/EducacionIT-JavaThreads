package clase03;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapaDirecciones {
    /*
        Implementaciones de mapa NO safe thread
        -------
        HashMap: es la más veloz, no garantiza el orden de los elementos.
        LinkedHashMap:  almacena los elementos en una lista enlazada por orden de ingreso.
        TreeMap: almacena los elementos en un árbol por orden natural.

        Impls Safe Thread
        -------
        Map<String,String> mapa= new Map();
        Se utiliza la clase Collections.synchronizedMap(mapa);
    */
    public static Map<String,String>getMap(){
        Map<String,String> mapa = new LinkedHashMap();

        mapa.put("CarlosProfe", "192.168.0.20");
        mapa.put("LucasS", "192.168.0.45");
        mapa.put("Juan", "192.168.0.30");
        mapa.put("Guido", "192.168.0.43");
        mapa.put("LucasC", "192.168.0.49");
        mapa.put("GonzaloB", "192.168.0.32");
        mapa.put("Federico", "192.168.2.103");
        mapa.put("SergioV", "192.168.2.106");
        mapa.put("Joaquin", "192.168.0.44");
        mapa.put("Marcos", "192.168.0.48");
        mapa.put("GonzaloM", "192.168.0.24");
        mapa.put("Stefano", "192.168.0.46");
        mapa.put("SergioG", "192.168.0.28");
        mapa.put("Leandro", "192.168.0.25");
        mapa.put("Alexis", "192.168.0.27");
        mapa.put("Nacho", "192.168.0.31");
	mapa.put("Magali", "192.168.0.22");
        
        return mapa;
    }
}
