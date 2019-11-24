package restaurante;

import java.util.*;
import java.lang.String;

/**
 * 
 */
public class Restaurante implements Observer {
    private ArrayList listaVentas;

    private int MontoExpress;

    private int MontoEmpaque;
    
    private ArrayList <Platillo> Menu;
    
    private static Restaurante RediPicsa=null;
    
    private Restaurante() {
    this.listaVentas = new ArrayList<Platillo>();
    this.MontoExpress = 0;
    this.MontoEmpaque = 0;
    this.Menu = new ArrayList<Platillo>();
    }

    private static Restaurante getInstance(){
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
           if(plat.getNombre()==nombre);
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
    public void BorrarPlatillo(String nombre) {
        Restaurante rediPicsa=getInstance();
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           Platillo plat=rediPicsa.Menu.get(i);
           if(plat.getNombre()==nombre);
                rediPicsa.Menu.remove(i);
        }
    }

    /**
     * 
     */
    public void ModificarPlatillo(String nomIni, String Codigo, String Descripcion, int Racion, float Calorias, int Precio, boolean activo, int Ventas, String nombre) {
        Restaurante rediPicsa=getInstance();
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           Platillo plat=rediPicsa.Menu.get(i);
           if(plat.getNombre()==nomIni);
                rediPicsa.Menu.remove(i);
        }
        boolean esta=false;
        for(int i=0; i<rediPicsa.Menu.size();i++)
        {
           Platillo plat=rediPicsa.Menu.get(i);
           if(plat.getNombre()==nombre);
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
           if(rediPicsa.Menu.get(i).getNombre()==nombre);{
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

    public ArrayList getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList Menu) {
        this.Menu = Menu;
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