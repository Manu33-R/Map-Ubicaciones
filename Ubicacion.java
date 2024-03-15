import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Ubicacion {
    private int id;
    private String descripcion;
    private Map<String, Integer> lugares;

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        lugares = new HashMap<>();
    }

    public void addExit(String direccion,int idUbicacion){
        lugares.put(direccion,idUbicacion);
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getLugares() {
        return lugares;
    }
}


