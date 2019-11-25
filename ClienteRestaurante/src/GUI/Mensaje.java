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

    public ArrayList getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList Menu) {
        this.Menu = Menu;
    }
     public int getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(int Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }
    public int extra;
    public int Porcentaje;

    public String message;
   
    public Pedido peticion;
    
    public ArrayList Menu;
    public int Conse;

    public int getConse() {
        return Conse;
    }

    public void setConse(int Conse) {
        this.Conse = Conse;
    }
    
    public Mensaje(String mensaje, Pedido peticion) {
        this.message = mensaje;
        this.peticion = peticion;
        this.Menu= new ArrayList<Platillo>();
    }
    
    public Mensaje(String mensaje) {
        this.message = mensaje;
    }
        
    public Mensaje(Pedido peticion) {
        this.peticion = peticion;
    }
   
    public Mensaje(ArrayList Ana_Rey)
    {
        this.Menu=Ana_Rey;
    }
    public Mensaje(String info,int Consecutivo)
    {
        this.message=info;
        this.Conse=Consecutivo;
    }

    public Pedido getPeticion() {
        return peticion;
    }

    public void setPeticion(Pedido peticion) {
        this.peticion = peticion;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}