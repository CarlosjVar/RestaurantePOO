package restaurante;

import java.util.*;
import java.lang.String;

/**
 * 
 */
public class Restaurante implements Observable {
    private ArrayList <Pedido> pedidos;
    private ArrayList <Platillo> listaVentas;

    private static int MontoExpress;

    private static int MontoEmpaque;
    
    private ArrayList <Platillo> Menu;
    
    private static Restaurante RediPicsa=null;
        
    private ArrayList <String> registro;
    private ArrayList <Observer> observers;

    public static int getConsecutivo() {
        return Consecutivo;
    }

    public static void setConsecutivo(int Consecutivo) {
        Restaurante.Consecutivo = Consecutivo;
    }   
    public static int Consecutivo;
    
    private Restaurante() {
    this.listaVentas = new ArrayList<Platillo>();
    this.MontoExpress = 0;
    this.MontoEmpaque = 0;
    this.Menu = new ArrayList<Platillo>();
    this.registro=new ArrayList<String>();
    this.pedidos = new ArrayList <Pedido> (); 
    this.observers = new ArrayList <Observer> ();
    }
    
    @Override
    public void updateObservers () {
        cleanObservers();
        for (Observer observador : observers){
            observador.update();
        }
    }
    
    private void cleanObservers () {
        for (Observer observador : observers){
            if (observador==null)
                observers.remove(observador);
        }
    }
    
    public void addObserver (Observer observador) {
        this.observers.add(observador);
    }
    
    @Override
    public void removeObserver (int index) {
        this.observers.remove(index);
    }
    
    @Override
    public void removeObserver (Observer observer) {
        this.observers.remove(observer);
    }
    
    
    @Override
    public ArrayList <Observer> getObservers () {
        return observers;
    }
    
    public ArrayList<String> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<String> registro) {
        this.registro = registro;
    }

    public static Restaurante getInstance(){
        if(RediPicsa==null)
            RediPicsa=new Restaurante();
        return RediPicsa;
    }
    
    public void AgregarPlatillo(String Codigo, String Descripcion, int Racion, float Calorias, int Precio, String nombre) {
        Restaurante rediPicsa=getInstance();
        boolean esta=false;
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           Platillo plat=rediPicsa.Menu.get(i);
           if(plat.getCodigo().equals(Codigo))
                esta=true;
        }
        if(!esta)
        {
            Platillo comida=new Platillo(Codigo, Descripcion, Racion, Calorias, Precio, nombre);
            rediPicsa.Menu.add(comida);
        }
    }

    /**
     * 
     */
    public boolean BorrarPlatillo(String codigo) {
        Restaurante rediPicsa=getInstance();
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           Platillo plat=rediPicsa.Menu.get(i);
           if(plat.getCodigo().equals(codigo));
                rediPicsa.Menu.remove(i);
                return true;
        }
        return false;
    }

    /**
     * 
     */
    public void ModificarPlatillo(String nomIni, String Codigo, String Descripcion, int Racion, float Calorias, int Precio, boolean activo, int Ventas, String nombre) {
        Restaurante rediPicsa=getInstance();
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           Platillo plat=rediPicsa.Menu.get(i);
           if(plat.getCodigo().equals(Codigo));
                rediPicsa.Menu.remove(i);
        }
        boolean esta=false;
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           Platillo plat=rediPicsa.Menu.get(i);
           if(plat.getCodigo().equals(Codigo));
                esta=true;
        }
        if(!esta)
        {
            Platillo comida=new Platillo(Codigo, Descripcion, Racion, Calorias, Precio, nombre);
            rediPicsa.Menu.add(comida);
        }
    }

    /**
     * 
     */
    public void HabilitarProducto(String nombre) {
        Restaurante rediPicsa=getInstance();
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           if(rediPicsa.Menu.get(i).getNombre().equals(nombre));{
                if(rediPicsa.Menu.get(i).isActivo()){
                    rediPicsa.Menu.get(i).setActivo(false);
                }
                else
                    rediPicsa.Menu.get(i).setActivo(true);
            }
                
        }
    }

    /**
     * 
     */
    public void RegistrarMontoExpress(int nuevMonto) {
        Restaurante rediPicsa=getInstance();
        rediPicsa.setMontoExpress(nuevMonto);
    }

    /**
     * 
     */
    public void RegistrarMontoEmpaque(int nuevMonto) {
        Restaurante rediPicsa=getInstance();
        rediPicsa.setMontoExpress(nuevMonto);
    }

    /**
     * 
     */
    public void ModificarMontoExpress(int nuevMonto) {
        Restaurante rediPicsa=getInstance();
        rediPicsa.setMontoExpress(nuevMonto);
    }

    /**
     * 
     */
    public void ModificarMontoEmpaque(int nuevMonto) {
        Restaurante rediPicsa=getInstance();
        rediPicsa.setMontoExpress(nuevMonto);
    }

    public ArrayList<Platillo> getMenu() {
        return Menu;
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setMenu(ArrayList Menu) {
        this.Menu = Menu;
    }

    public ArrayList<Platillo> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList listaVentas) {
        this.listaVentas = listaVentas;
    }

    public  static int getMontoExpress() {
        return MontoExpress;
    }

    public static void setMontoExpress(int MontoExpress) {
        MontoExpress = MontoExpress;
    }

    public static int getMontoEmpaque() {
        return MontoEmpaque;
    }

    public static void setMontoEmpaque(int MontoEmpaque) {
        MontoEmpaque = MontoEmpaque;
    }  
}