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
            System.out.print(informacion.message);

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
            else if(informacion.message.equals("Vergenta")){
                
                
            }
            else if (informacion.message.equals("Consecutivo")) {
                int consecutivo=Restaurante.getConsecutivo();
                Restaurante.setConsecutivo(Restaurante.getConsecutivo()+1);
                Mensaje mensaje=new Mensaje("Consecutivo",consecutivo);
                OutStream.writeObject(mensaje);              
            }
            else if(informacion.message.equals("Consecutivo2"))
            {
                int consecutivo=Restaurante.getConsecutivo();
                Restaurante.setConsecutivo(Restaurante.getConsecutivo()+1);
                Mensaje mensaje=new Mensaje("Consecutivo",consecutivo);
                mensaje.setExtra(consecutivo);
                OutStream.writeObject(mensaje);              
            }
                }
        socket.close();
        }catch(EOFException e){
            
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }
   
}