package restaurante;


import java.util.*;

/**
 * 
 */
public class Pedido {
    
    protected String Fecha;

    protected static int Consecutivo;

    protected String ClientePedido;

    protected int ConsecutivoPedido;
    
    public Pedido(String Fecha, String ClientePedido, int ConsecutivoPedido) {
    this.Fecha = Fecha;
    this.ClientePedido = ClientePedido;
    this.ConsecutivoPedido = ConsecutivoPedido;
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