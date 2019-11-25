/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import restaurante.Platillo;
import restaurante.Restaurante;

/**
 *
 * @author Fabrizio
 */
public class ServerThread implements Runnable {

    Socket socket;
    ObjectOutputStream OutStream;
    ObjectInputStream InStream;
    
    public ServerThread(Socket sock) throws IOException {
        this.socket = sock;
        this.OutStream=new ObjectOutputStream(socket.getOutputStream());
        this.InStream=new ObjectInputStream(socket.getInputStream());
        
    }
    
    @Override
    public void run(){
        Mensaje informacion;
        try{
        while((informacion =(Mensaje)InStream.readObject())!=null){
            System.out.println(informacion.message);

            if(informacion.message.equals("Mierdu"))
            {
                ArrayList<Platillo>MenuGeneral=Restaurante.getInstance().getMenu();
                ArrayList<Platillo>Menusote = new ArrayList<Platillo>();
                for(Platillo plato:MenuGeneral){
                    if(plato.isActivo())
                    {
                        Menusote.add(plato);
                    }
                }
                Restaurante.getInstance().getRegistro().add("Se ha enviado el menu");
                Mensaje mensaje=new Mensaje(Menusote);
                mensaje.setMessage("Menu");
                OutStream.writeObject(mensaje);
            }
            else if (informacion.message.equals("Consecutivo")) {
                int consecutivo=Restaurante.getConsecutivo();
                Restaurante.setConsecutivo(Restaurante.getConsecutivo()+1);
                Mensaje mensaje=new Mensaje("Consecutivo",consecutivo);
                Restaurante.getInstance().getRegistro().add("Se ha creado un nuevo pedido");
                OutStream.writeObject(mensaje);              
            }
            else if(informacion.message.equals("Consecutivo2"))
            {
                int consecutivo=Restaurante.getConsecutivo();
                Restaurante.setConsecutivo(Restaurante.getConsecutivo()+1);
                Mensaje mensaje=new Mensaje("Consecutivo2",consecutivo);
                mensaje.setExtra(Restaurante.getMontoExpress());
                OutStream.writeObject(mensaje);        
                Restaurante.getInstance().getRegistro().add("Se ha creado un nuevo pedido");
            }
            else if(informacion.message.equals("Consecutivo3"))
            {
                int consecutivo=Restaurante.getConsecutivo();
                Restaurante.setConsecutivo(Restaurante.getConsecutivo()+1);
                Mensaje mensaje=new Mensaje("Consecutivo3",consecutivo);
                mensaje.setPorcentaje(Restaurante.getMontoEmpaque());
                OutStream.writeObject(mensaje);  
                Restaurante.getInstance().getRegistro().add("Se ha creado un nuevo pedido");
            }
            else if(informacion.message.equals("mandar"))
            {
                Restaurante.getInstance().getPedidos().add(informacion.getPeticion());
                for(Platillo platillo:informacion.getPeticion().getCompras())
                {
                    if(Restaurante.getInstance().getListaVentas().isEmpty())
                    {
                        Restaurante.getInstance().getListaVentas().add(platillo);
                    }
                    else
                    {
                        for(Platillo platote:Restaurante.getInstance().getListaVentas())
                        {
                            if(platote.getCodigo().equals(platillo.getCodigo()))
                            {
                                platote.setVentas(platote.getVentas()+platillo.getVentas());
                            }
                        }
                    }
                 for(Platillo plato:Restaurante.getInstance().getMenu())
                 {
                     if(platillo.getCodigo().equals(plato.getCodigo()))
                     {
                         plato.setVentas(plato.getVentas()+platillo.getVentas());
                         break;
                     }
                 }
                 Restaurante.getInstance().getRegistro().add("Se ha vendido "+platillo.getNombre());
                }
                Mensaje mensaje=new Mensaje("((づ◔ ͜ʖ◔)づ)");
                OutStream.writeObject(mensaje);  
            }
        }
        Restaurante.getInstance().updateObservers();
        socket.close();
        }catch(EOFException e){
            
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }
   
}