/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import restaurante.Platillo;

/**
 *
 * @author Fabrizio
 */
public class ServerThread extends Thread {

    Socket socket;
    
    public ServerThread(Socket sock) {
        this.socket = sock;
    }
    
    @Override
    public void run(){
        Mensaje informacion;
        try{
            ObjectOutputStream OutStream=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream InStream=new ObjectInputStream(socket.getInputStream());
            while((informacion =(Mensaje)InStream.readObject())!=null){
                System.out.print(informacion.message);
                Platillo Salchichón=new Platillo("Soy salchichón","Salchichón soy",12, (float) 0.5,19,true,23, "salchipapa");
                int Precio = Salchichón.getPrecio();
                if(informacion.message.equals("Fabrizio se caga y no le llega a un destiny"))
                {
                    OutStream.writeObject(Salchichón);
                }
            }
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }
   
}
