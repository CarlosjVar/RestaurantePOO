package restaurante;


import java.util.*;

/**
 * 
 */
public class Llevado extends Pedido  {

    /**
     * Nombre del recolector del platillo
     */
    private String Recolector;
    /**
     * Numero del recolector del pedido
     */
    private String NumeroRecolector;
    /**
     * Constructor del pedido
     * @param Recolector
     * @param NumeroRecolector
     * @param Fecha
     * @param ClientePedido 
     */
    public Llevado(String Recolector, String NumeroRecolector, String Fecha, String ClientePedido) {
        super(Fecha, ClientePedido);
        this.Recolector = Recolector;
        this.NumeroRecolector = NumeroRecolector;
    }

    /**
     * Costo por empaque
     */
    private int empaque; 
    /**
     * Retorna el porcentaje del empaque
     * @return 
     */
    public int getEmpaque() {
        return empaque;
    }
    /**
     * Asigna el valor del porcentaje de empaque
     * @param empaque 
     */
    public void setEmpaque(int empaque) {
        this.empaque = empaque;
    }
    /**
     * Retorna el nombre del recolector
     * @return 
     */
    public String getRecolector() {
        return Recolector;
    }
    /**
     * Asigna el recolector
     * @param Recolector 
     */
    public void setRecolector(String Recolector) {
        this.Recolector = Recolector;
    }
    /**
     * Retorna el número del recolector
     * @return 
     */
    public String getNumeroRecolector() {
        return NumeroRecolector;
    }
    /**
     * Asigna el número del recolector
     * @param NumeroRecolector 
     */
    public void setNumeroRecolector(String NumeroRecolector) {
        this.NumeroRecolector = NumeroRecolector;
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
     * Retorna el cliente del pedido
     * @return 
     */
    public String getClientePedido() {
        return ClientePedido;
    }
    /**
     * Asigna un cliente al pedido
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
    
}