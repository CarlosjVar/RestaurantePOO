package restaurante;

import restaurante.Platillo;
import java.util.*;

/**
 * 
 */
public class Bebida extends Platillo {

    public Bebida(boolean Gaseosa, String Codigo, String Descripcion, int Racion, float Calorias, int Precio, boolean activo, int Ventas, String nombre) {
        super(Codigo, Descripcion, Racion, Calorias, Precio, nombre);
        this.Gaseosa = Gaseosa;
    }
    

    private boolean Gaseosa;

    public boolean getGaseosa() {
        return Gaseosa;
    }
    public void setGaseosa(boolean Gaseosa) {
        this.Gaseosa = Gaseosa;
    }




}