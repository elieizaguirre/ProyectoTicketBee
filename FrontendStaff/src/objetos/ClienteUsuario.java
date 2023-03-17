package objetos;
public class ClienteUsuario{

    private int idClienteUsuario;
    private String nombre;
    private String email;
    private String contrasenya;

    public ClienteUsuario(int idClienteUsuario, String nombre, String email, String contrasenya){
        this.idClienteUsuario= idClienteUsuario;
        this.nombre= nombre;
        this.email= email;
        this.contrasenya= contrasenya;
    }
    public int getIdClienteUsuario() {
        return idClienteUsuario;
    }
    public void setIdClienteUsuario(int idClienteUsuario){
        this.idClienteUsuario= idClienteUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
     public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email= email;
    }
     public String getContrasenya() {
        return contrasenya;
    }
    public void setContrasenya(String contrasenya){
        this.contrasenya= contrasenya;
    }
}