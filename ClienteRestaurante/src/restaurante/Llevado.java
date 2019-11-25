package restaurante;


import java.util.*;

/**
 * 
 */
public class Llevado extends Pedido  {

    
    private String Recolector;
    private String NumeroRecolector;

    public Llevado(String Recolector, String NumeroRecolector, String Fecha, String ClientePedido) {
        super(Fecha, ClientePedido);
        this.Recolector = Recolector;
        this.NumeroRecolector = NumeroRecolector;
    }


    private int empaque; 

    public int getEmpaque() {
        return empaque;
    }

    public void setEmpaque(int empaque) {
        this.empaque = empaque;
    }
            
    public String getRecolector() {
        return Recolector;
    }

    public void setRecolector(String Recolector) {
        this.Recolector = Recolector;
    }

    public String getNumeroRecolector() {
        return NumeroRecolector;
    }

    public void setNumeroRecolector(String NumeroRecolector) {
        this.NumeroRecolector = NumeroRecolector;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    

    public String getClientePedido() {
        return ClientePedido;
    }

    public void setClientePedido(String ClientePedido) {
        this.ClientePedido = ClientePedido;
    }

    public int getConsecutivoPedido() {
        return ConsecutivoPedido;
    }

    public void setConsecutivoPedido(int ConsecutivoPedido) {
        this.ConsecutivoPedido = ConsecutivoPedido;
    }
    
}