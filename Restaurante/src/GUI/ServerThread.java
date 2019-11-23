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
                this.OutStream.reset();
                System.out.print(informacion.message);
                Platillo Salchichón=new Platillo("Soy salchichón","Salchichón soy",12, (float) 0.5,19,true,23, "salchipapa");
                Platillo Chorizo=new Platillo("Soy Chorizo","Chorizo soy",12, (float) 0.5,19,true,23, "chorizin");
                if(informacion.message.equals("Fabrizio se caga y no le llega a un Heilo"))
                {
                    OutStream.writeObject(Salchichón);
                }
                else if(informacion.message.equals("Fabrizio se caga y no le llega a un destiny"))
                {
                    OutStream.writeObject(Chorizo);
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
