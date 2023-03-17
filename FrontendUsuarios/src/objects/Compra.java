package objects;

public class Compra{

    private int idCompra;
    private Entrada[] entradas;

    public Compra(int idCompra, Entrada[] entradas){
        this.idCompra= idCompra;
        this.entradas= entradas;
    }
    public int getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(int idCompra){
        this.idCompra= idCompra;
    }
    public Entrada[] getEntradas() {
        return entradas;
    }
    public void setEntradas(Entrada[] entradas){
        this.entradas= entradas;
    }
    
    
}