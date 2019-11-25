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
    
    private ArrayList <Platillo> compras;
    
    public Pedido(String Fecha, String ClientePedido) {
        this.Fecha = Fecha;
        this.ClientePedido = ClientePedido;
        this.compras=new ArrayList<Platillo>();
    }
    public Pedido() {
        this.compras=new ArrayList<Platillo>();
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

    public ArrayList<Platillo> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Platillo> Menu) {
        this.compras = Menu;
    }
}