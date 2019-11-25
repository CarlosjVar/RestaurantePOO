package restaurante;

import java.util.*;


/**
 * 
 */
public class Express extends Pedido {

    public Express(String Telefono, String Direccion, String Fecha, String ClientePedido) {
        super(Fecha, ClientePedido);
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }


    private int Cobro;

    public int getCobro() {
        return Cobro;
    }

    public void setCobro(int Cobro) {
        this.Cobro = Cobro;
    }
    private String Telefono;
    /**
     * 
     */
    private String Direccion;
    /**
     * 
     */
    private int Valor;
    /**
     * @return
     */

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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

    /**
     * Default constructor
     */

}