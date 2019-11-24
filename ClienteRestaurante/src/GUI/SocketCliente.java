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
class SocketCliente{
        
        Socket socket;
        public SocketCliente() throws IOException, ClassNotFoundException
        {
            //this.socket=new Socket("127.0.0.1",6969);
//            ObjectOutputStream OutStream=new ObjectOutputStream(socket.getOutputStream());
//            ObjectInputStream InStream=new ObjectInputStream(socket.getInputStream());
//            Mensaje mensaje=new Mensaje("Fabrizio se caga y no le llega a un destiny");
//            OutStream.writeObject(mensaje);
//            Platillo platilloX=(Platillo)InStream.readObject();
//            System.out.print(platilloX.getDescripcion());
//            OutStream.close();
            //socket.close();
        }
        public void mandarSignal(String info) throws IOException, ClassNotFoundException{
           this.socket=new Socket("127.0.0.1",6969);
           ObjectOutputStream OutStream=new ObjectOutputStream(this.socket.getOutputStream());
           ObjectInputStream InStream=new ObjectInputStream(this.socket.getInputStream());
//            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//            String readerInput=buffer.readLine();
           Mensaje mensaje=new Mensaje(info);
           OutStream.reset();
           OutStream.writeObject(mensaje);
           Platillo platilloX=(Platillo)InStream.readObject();
           System.out.print(platilloX.getDescripcion());
           
        }
    }
//"Fabrizio se caga y no le llega a un destiny"
