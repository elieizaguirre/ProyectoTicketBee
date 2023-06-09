package objects;

import java.util.Date;

public class Artista{

    private int idArtista;
    private String nombre;
    private String descripcion;
    private Date fec_nac;


    public Artista(int idArtista, String nombre, String descripcion, Date fec_nac){
        this.idArtista= idArtista;
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.fec_nac= fec_nac;
    }
    public int getIdArtista() {
        return idArtista;
    }
    public void setIdArtista(int idArtista){
        this.idArtista= idArtista;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
     public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
     public Date getFec_nac() {
        return fec_nac;
    }
    public void setFec_nac(Date fec_nac){
        this.fec_nac= fec_nac;
    }
}