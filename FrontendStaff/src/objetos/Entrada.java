package objetos;
public class Entrada{

    private int idEntrada;
    private String nombre;
    private int dni;
    private Evento evento;
    private String codigoQr;

    public Entrada(int idEntrada, String nombre, int dni, Evento evento, String codigoQr){
        this.idEntrada= idEntrada;
        this.nombre= nombre;
        this.dni= dni;
        this.evento= evento;
        this.codigoQr = codigoQr;
    }
    public int getIdEntrada() {
        return idEntrada;
    }
    public void setIdEntrada(int idEntrada){
        this.idEntrada= idEntrada;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
     public int getDni() {
        return dni;
    }
    public void setDni(int dni){
        this.dni= dni;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento){
        this.evento= evento;
    }
     public String getCodigoQr() {
        return codigoQr;
    }
    public void setCodigoQr(String codigoQr){
        this.codigoQr= codigoQr;
    }
}