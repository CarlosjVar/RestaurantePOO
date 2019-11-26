package restaurante;


import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Pedido implements Serializable {
    /**
     * Retorna las calorias del pedido
     * @return 
     */
    public int getCalorias() {
        return Calorias;
    }
    /**
     * Asigna las calorías del pedido
     * @param Calorias 
     */
    public void setCalorias(int Calorias) {
        this.Calorias = Calorias;
    }
    /**
     * Calorias del pedido
     */
    private int Calorias=0;
    /**
     * Fecha del pedido
     */
    protected String Fecha;
    /**
     * Costo total del pedido
     */
    private int valor;
    /**
     * Retorna el costo total del pedido
     * @return 
     */
    public int getValor() {
        return valor;
    }
    /**
     * Asigna el costo total del pedido
     * @param valor 
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    /**
     * Nombre del cliente del pedido
     */
    protected String ClientePedido;
    /**
     * Consecutivo del pedido
     */
    protected int ConsecutivoPedido;
    /**
     * ArrayList que contiene los platillos del pedido
     */
    private ArrayList <Platillo> compras;
    /**
     * Constructor del pedido con string y nombre del cliente
     * @param Fecha
     * @param ClientePedido 
     */
    public Pedido(String Fecha, String ClientePedido) {
        this.Fecha = Fecha;
        this.ClientePedido = ClientePedido;
        this.compras=new ArrayList<Platillo>();
    }
    /**
     * Constructor sin parametos
     */
    public Pedido() {
        this.compras=new ArrayList<Platillo>();
    }
    /**
     * Retorna la fecha del pedido
     * @return 
     */
    public String getFecha() {
        return Fecha;
    }
    /**
     * Asigna la fecha del pedido
     * @param Fecha 
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    /**
     * Retorna el nombre del cliente del pedido
     * @return 
     */
    public String getClientePedido() {
        return ClientePedido;
    }
    /**
     * Asigna el nombre del cliente del pedido
     * @param ClientePedido 
     */
    public void setClientePedido(String ClientePedido) {
        this.ClientePedido = ClientePedido;
    }
    /**
     * Retorna el consecutivo del pedido
     * @return 
     */
    public int getConsecutivoPedido() {
        return ConsecutivoPedido;
    }
    /**
     * Asigna el consecutivo del pedido
     * @param ConsecutivoPedido 
     */
    public void setConsecutivoPedido(int ConsecutivoPedido) {
        this.ConsecutivoPedido = ConsecutivoPedido;
    }
    /**
     * Retorna el arraylist de compras
     * @return 
     */
    public ArrayList<Platillo> getCompras() {
        return compras;
    }
    /**
     * Asigna el arraylist de platillos del pedido
     * @param Menu 
     */
    public void setCompras(ArrayList<Platillo> Menu) {
        this.compras = Menu;
    }
}