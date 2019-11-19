package restaurante;

import java.util.*;

/**
 * 
 */
public class Restaurante implements Observer {

    public Restaurante(ArrayList listaVentas, int MontoExpress, int MontoEmpaque) {
        this.listaVentas = listaVentas;
        this.MontoExpress = MontoExpress;
        this.MontoEmpaque = MontoEmpaque;
    }


    private ArrayList listaVentas;

    private int MontoExpress;

    private int MontoEmpaque;

    public void AgregarPlatillo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void BorrarPlatillo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void ModificarPlatillo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void HabilitarProducto() {
        // TODO implement here
    }

    /**
     * 
     */
    public void DeshabilitarProducto() {
        // TODO implement here
    }

    /**
     * 
     */
    public void RegistrarMontoExpress() {
        // TODO implement here
    }

    /**
     * 
     */
    public void RegistrarMontoEmpaque() {
        // TODO implement here
    }

    /**
     * 
     */
    public void ModificarMontoExpress() {
        // TODO implement here
    }

    /**
     * 
     */
    public void ModificarMontoEmpaque() {
        // TODO implement here
    }

    public ArrayList getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList listaVentas) {
        this.listaVentas = listaVentas;
    }

    public int getMontoExpress() {
        return MontoExpress;
    }

    public void setMontoExpress(int MontoExpress) {
        this.MontoExpress = MontoExpress;
    }

    public int getMontoEmpaque() {
        return MontoEmpaque;
    }

    public void setMontoEmpaque(int MontoEmpaque) {
        this.MontoEmpaque = MontoEmpaque;
    }

    
    public void Operation1() {
        // TODO implement here
    }

}