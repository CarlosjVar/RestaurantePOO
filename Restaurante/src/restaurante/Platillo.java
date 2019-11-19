package restaurante;

import java.util.*;

/**
 * 
 */
public class Platillo {

    public Platillo(String Codigo, String Descripcion, int Racion, float Calorias, int Precio, boolean activo, int Ventas) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Racion = Racion;
        this.Calorias = Calorias;
        this.Precio = Precio;
        this.activo = activo;
        this.Ventas = Ventas;
    }


    protected String Codigo;

    protected String Descripcion;

    protected int Racion;

    protected float Calorias;

    protected int Precio;

    protected boolean activo;

    protected int Ventas;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getRacion() {
        return Racion;
    }

    public void setRacion(int Racion) {
        this.Racion = Racion;
    }

    public float getCalorias() {
        return Calorias;
    }

    public void setCalorias(float Calorias) {
        this.Calorias = Calorias;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getVentas() {
        return Ventas;
    }

    public void setVentas(int Ventas) {
        this.Ventas = Ventas;
    }

}