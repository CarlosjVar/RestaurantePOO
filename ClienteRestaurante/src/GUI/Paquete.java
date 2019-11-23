/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Paquete implements Serializable {
    String message;
    public Paquete(String message){
        this.message=message;
    }
    
}
