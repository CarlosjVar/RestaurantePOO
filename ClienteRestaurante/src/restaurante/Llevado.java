package restaurante;


import java.util.*;

/**
 * 
 */
public class Llevado extends Pedido {

    
    private String Recolector;
    private String NumeroRecolector;
    private int Valor;

    public Llevado(String Recolector, String NumeroRecolector, int Valor, String Fecha, String ClientePedido, int ConsecutivoPedido) {
        super(Fecha, ClientePedido);
        this.Recolector = Recolector;
        this.NumeroRecolector = NumeroRecolector;
        this.Valor = Valor;
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

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public static int getConsecutivo() {
        return Consecutivo;
    }

    public static void setConsecutivo(int Consecutivo) {
        Pedido.Consecutivo = Consecutivo;
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