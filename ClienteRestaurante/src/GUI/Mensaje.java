/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.Serializable;
import java.util.ArrayList;
import restaurante.Pedido;
import restaurante.Platillo;

/**
 *
 * @author Edgar
 */
public class Mensaje implements Serializable {
    /**
     * Devuelve el menu
     * @return 
     */
    public ArrayList getMenu() {
        return Menu;
    }
    /**
     * Configura el menu
     * @param Menu 
     */
    public void setMenu(ArrayList Menu) {
        this.Menu = Menu;
    }
    /**
     * Devuelve el porcentaje de empaque
     * @return 
     */
     public int getPorcentaje() {
        return Porcentaje;
    }
     /**
      * Configura porcentaje
      * @param Porcentaje 
      */
    public void setPorcentaje(int Porcentaje) {
        this.Porcentaje = Porcentaje;
    }
    /**
     * Devuelve el extra por envío
     * @return 
     */
    public int getExtra() {
        return extra;
    }
    /**
     * Configura el extra
     * @param extra 
     */
    public void setExtra(int extra) {
        this.extra = extra;
    }
    /**
     * Extra por express
     */
    public int extra;
    /**
     * Porcentaje por empaque
     */
    public int Porcentaje;
    /**
     * Mensaje para el servidor
     */
    public String message;
   /**
    * Pedido del cliente
    */
    public Pedido peticion;
    /**
     * Menu de platillos
     */
    public ArrayList Menu;
    /**
     * Consecutivo del pedido
     */
    public int Conse;
    /**
     * Devuelve el consecutivo estático
     * @return 
     */
    public int getConse() {
        return Conse;
    }
    /**
     * Configura el consecutivo estático
     * @param Conse 
     */
    public void setConse(int Conse) {
        this.Conse = Conse;
    }
    /**
     * Constructor de mensaje con pedido
     * @param mensaje
     * @param peticion 
     */
    public Mensaje(String mensaje, Pedido peticion) {
        this.message = mensaje;
        this.peticion = peticion;
        this.Menu= new ArrayList<Platillo>();
    }
    /**
     * Constructor de Mensajes solo con string
     * @param mensaje 
     */
    public Mensaje(String mensaje) {
        this.message = mensaje;
    }
    /**
     * Constructor de mensaje solo con pedido
     * @param peticion 
     */
    public Mensaje(Pedido peticion) {
        this.peticion = peticion;
    }
   /**
    * Constructor de mensaje con ArrayList de Platillos
    * @param Ana_Rey 
    */
    public Mensaje(ArrayList Ana_Rey)
    {
        this.Menu=Ana_Rey;
    }
    /**
     * Constructor de mensaje con consecutivo y string
     * @param info
     * @param Consecutivo 
     */
    public Mensaje(String info,int Consecutivo)
    {
        this.message=info;
        this.Conse=Consecutivo;
    }
    /**
     * Devuelve el pedido asignado a la ventana
     * @return 
     */
    public Pedido getPeticion() {
        return peticion;
    }
    /**
     * Asigna el pedido de el cliente a la ventana
     * @param peticion 
     */
    public void setPeticion(Pedido peticion) {
        this.peticion = peticion;
    }
    /**
     * Retorna el string de un mensaje
     * @return 
     */
    public String getMessage() {
        return message;
    }
    /**
     * Configura el string del mensaje
     * @param message 
     */
    public void setMessage(String message) {
        this.message = message;
    }
}