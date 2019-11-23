package restaurante;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
 public class Platillo implements Serializable{

    public Platillo(String Codigo, String Descripcion, int Racion, float Calorias, int Precio, boolean activo, int Ventas, String nombre) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Racion = Racion;
        this.Calorias = Calorias;
        this.Precio = Precio;
        this.activo = activo;
        this.Ventas = Ventas;
        this.Nombre = nombre;
    }


    protected String Codigo;

    protected String Descripcion;

    protected int Racion;

    protected float Calorias;

    protected int Precio;

    protected boolean activo;

    protected int Ventas;
    
    protected String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
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