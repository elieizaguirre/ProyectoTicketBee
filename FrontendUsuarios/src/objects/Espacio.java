package objects;

public class Espacio{

    private int idEspacio;
    private String nombre;
    private String direccion;

    public Espacio(int idEspacio, String nombre, String direccion){
        this.idEspacio= idEspacio;
        this.nombre= nombre;
        this.direccion= direccion;
    }
    public int getIdEspacio() {
        return idEspacio;
    }
    public void setIdEspacio(int idEspacio){
        this.idEspacio= idEspacio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
     public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    
}