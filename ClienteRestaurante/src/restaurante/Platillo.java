package restaurante;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Platillo implements Serializable{

    /**
     * Constructor de platillo con todos los datos necesarios
     * @param Codigo
     * @param Descripcion
     * @param Racion
     * @param Calorias
     * @param Precio
     * @param nombre 
     */
    public Platillo(String Codigo, String Descripcion, int Racion, float Calorias, int Precio, String nombre) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Racion = Racion;
        this.Calorias = Calorias;
        this.Precio = Precio;
        this.activo = true;
        this.Ventas = 0;
        this.Nombre = nombre;
    }

    /**
     * Código único de platillo
     */
    protected String Codigo;
    /**
     * Descripcion del platillo
     */
    protected String Descripcion;
    /**
     * Numero de raciones con las que cuenta el pedido
     */
    protected int Racion;
    /**
     * Número de raciones del platillo
     */
    protected float Calorias;
    /**
     * Número de calorias por porción
     */
    protected int Precio;
    /**
     * Precio del producto
     */
    protected boolean activo;
    /**
     * Boolean que indica si un producto está activo
     */
    protected int Ventas;
    /**
     * Número de ventas de un platillo
     */
    protected String Nombre;
    /**
     * Nombre del pedido
     * @return 
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * Asignar el nombre de un producto
     * @param Nombre 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * Retorna el código del platillo
     * @return 
     */
    public String getCodigo() {
        return Codigo;
    }
    /**
     * Asigna el código del platillo
     * @param Codigo 
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    /**
     * Retorna la descripción 
     * @return 
     */
    public String getDescripcion() {
        return Descripcion;
    }
    /**
     * Asigna un descripción del platillo
     * @param Descripcion 
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    /**
     * Retorna las raciones por platillo
     * @return 
     */
    public int getRacion() {
        return Racion;
    }
    /**
     * Asigna un valor a las raciones de un platillo
     * @param Racion 
     */
    public void setRacion(int Racion) {
        this.Racion = Racion;
    }
    /**
     * Retorna el valor de calorías por porción
     * @return 
     */
    public float getCalorias() {
        return Calorias;
    }
    /**
     * Asigna las calorías de un platillo
     * @param Calorias 
     */
    public void setCalorias(float Calorias) {
        this.Calorias = Calorias;
    }
    /**
     * Retorna el precio del platillo
     * @return 
     */
    public int getPrecio() {
        return Precio;
    }
    /**
     * Asigna el precio a un platillo
     * @param Precio 
     */
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    /**
     * Retorna si el platillo está activo
     * @return 
     */
    public boolean isActivo() {
        return activo;
    }
    /**
     * Asigna el valor boolean del platillo
     * @param activo 
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    /**
     * Retorna el número de ventas de un platillo
     * @return 
     */
    public int getVentas() {
        return Ventas;
    }
    /**
     * Asigna el número de ventas de un platillo
     * @param Ventas 
     */
    public void setVentas(int Ventas) {
        this.Ventas = Ventas;
    }
}