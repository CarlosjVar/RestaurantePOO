/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.Serializable;
import restaurante.Platillo;

/**
 *
 * @author Edgar
 */
public class Mensaje implements Serializable {

    public String message;
   
    public Platillo peticion;
    
    public Mensaje(String mensaje, Platillo peticion) {
        this.message = mensaje;
        this.peticion = peticion;
    }
    
    public Mensaje(String mensaje) {
        this.message = mensaje;
    }
        
    public Mensaje(Platillo peticion) {
        this.peticion = peticion;
    }
   

    public Platillo getPeticion() {
        return peticion;
    }

    public void setPeticion(Platillo peticion) {
        this.peticion = peticion;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}