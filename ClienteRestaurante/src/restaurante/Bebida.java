package restaurante;

import restaurante.Platillo;
import java.util.*;

/**
 * 
 */
public class Bebida extends Platillo {
    /**
     * Crea una bebida
     * @param Gaseosa
     * @param Codigo
     * @param Descripcion
     * @param Racion
     * @param Calorias
     * @param Precio
     * @param activo
     * @param Ventas
     * @param nombre 
     */
    public Bebida(boolean Gaseosa, String Codigo, String Descripcion, int Racion, float Calorias, int Precio, boolean activo, int Ventas, String nombre) {
        super(Codigo, Descripcion, Racion, Calorias, Precio, nombre);
        this.Gaseosa = Gaseosa;
    }
    
    /**
     * Identifica si es bebida natural o gaseosa
     */
    private boolean Gaseosa;
    /**
     * Retorna el boolean gaseosa
     * @return 
     */
    public boolean getGaseosa() {
        return Gaseosa;
    }
    /**
     * Asigna valor al boolean gaseosa
     * @param Gaseosa 
     */
    public void setGaseosa(boolean Gaseosa) {
        this.Gaseosa = Gaseosa;
    }




}