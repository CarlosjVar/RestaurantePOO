package restaurante;

import java.util.*;


/**
 * 
 */
public class Express extends Pedido {
    /**
     * Crea un pedido Express
     * @param Telefono
     * @param Direccion
     * @param Fecha
     * @param ClientePedido 
     */
    public Express(String Telefono, String Direccion, String Fecha, String ClientePedido) {
        super(Fecha, ClientePedido);
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    /**
     * Cobro por envío express
     */
    private int Cobro;
    /**
     * Retorna el cobro de envío express
     * @return 
     */
    public int getCobro() {
        return Cobro;
    }
    /**
     * Asigna el costo del cobro del envío express
     * @param Cobro 
     */
    public void setCobro(int Cobro) {
        this.Cobro = Cobro;
    }
    /**
     * Teléfono del receptor
     */
    private String Telefono;
    /**
     * Dirección de entrega
     */
    private String Direccion;
    /**
     *Costo total del pedido
     */
    private int Valor;
    /**
     * Retorna el telefono
     * @return
     */

    public String getTelefono() {
        return Telefono;
    }
    /**
     * Asigna el teléfono
     * @param Telefono 
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    /**
     * Retorna la dirección
     * @return 
     */
    public String getDireccion() {
        return Direccion;
    }
    /**
     * Asigna la dirección del pedido
     * @param Direccion 
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    /**
     * Retorna el costo total del pedido
     * @return 
     */
    public int getValor() {
        return Valor;
    }
    /**
     * Asigna un costo al pedido
     * @param Valor 
     */
    public void setValor(int Valor) {
        this.Valor = Valor;
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
     * Retorna el consecutivo de factura del pedido
     * @return 
     */
    public int getConsecutivoPedido() {
        return ConsecutivoPedido;
    }
    /**
     * Configura el consecutivo de factura del pedido
     * @param ConsecutivoPedido 
     */
    public void setConsecutivoPedido(int ConsecutivoPedido) {
        this.ConsecutivoPedido = ConsecutivoPedido;
    }

    /**
     * Default constructor
     */

}