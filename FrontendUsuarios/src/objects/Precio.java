package objects;

public class Precio{

    private int idPrecio;
    private String nombre;
    private int precio;
    private int disponibles;
    private int ofertadas;

    public Precio(int idPrecio, String nombre, int precio, int disponibles, int ofertadas){
        this.idPrecio= idPrecio;
        this.nombre= nombre;
        this.precio= precio;
        this.disponibles= disponibles;
        this.ofertadas= ofertadas;
    }
    public int getIdPrecio() {
        return idPrecio;
    }
    public void setIdPrecio(int idPrecio){
        this.idPrecio= idPrecio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
     public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio){
        this.precio= precio;
    }
    public int getDisponibles() {
        return disponibles;
    }
    public void setDisponibles(int disponibles){
        this.disponibles= disponibles;
    }
     public int getOfertadas() {
        return ofertadas;
    }
    public void setOfertadas(int ofertadas){
        this.ofertadas= ofertadas;
    }
}