package objetos;
import java.util.Date;

public class Evento{

    private int idEvento;
    private String titulo;
    private String descripcion;
    private Date fecha_hora;
    private int aforo;
    private Espacio espacio;
    private Artista[] artistas;
    private Precio[] precios;

    public Evento(int idEvento, String titulo, String descripcion, Date fecha_hora, int aforo, Espacio espacio, Artista[] artistas, Precio[] precios){
        this.idEvento = idEvento;
        this.titulo= titulo;
        this.descripcion= descripcion;
        this.fecha_hora= fecha_hora;
        this.aforo = aforo;
        this.espacio = espacio;
        this.artistas= artistas;
        this.precios= precios;
    }
    public int getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(int idEvento){
        this.idEvento= idEvento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
     public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
     public Date getFecha_hora() {
        return fecha_hora;
    }
    public void setFecha_hora(Date fecha_hora){
        this.fecha_hora= fecha_hora;
    }
    public int getAforo() {
        return aforo;
    }
    public void setAforo(int aforo){
        this.aforo= aforo;
    }
    public Espacio getEspacio() {
        return espacio;
    }
    public void setEspacio(Espacio espacio){
        this.espacio= espacio;
    }
    public Artista[] getArtistas() {
        return artistas;
    }
    public void setArtistas(Artista[] artistas){
        this.artistas= artistas;
    }
    public Precio[] getPrecios() {
        return precios;
    }
    public void setPrecios(Precio[] precios){
        this.precios= precios;
    }
}