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
import restaurante.Express;
import restaurante.Llevado;

/**
 *
 * @author Fabrizio
 */
public class SocketCliente{
        /**
         * Socket donde se realiza la transferencia de información
         */
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
        /**
         * Metodo encargado de enviar y recibir señales con el servidor
         * @param info
         * @throws IOException
         * @throws ClassNotFoundException 
         */
        public void mandarSignal(String info) throws IOException, ClassNotFoundException{
            this.socket=new Socket("127.0.0.1",6969);
            ObjectOutputStream OutStream=new ObjectOutputStream(this.socket.getOutputStream());
            ObjectInputStream InStream=new ObjectInputStream(this.socket.getInputStream());
            System.out.println(info);
            if(info.equals("Consecutivo"))
            {
                Mensaje mensaje=new Mensaje(info);
                OutStream.reset();
                OutStream.writeObject(mensaje);
            }
            else if(info.equals("Mierdu"))
            {
                Mensaje mensaje=new Mensaje(info);
                OutStream.reset();
                OutStream.writeObject(mensaje);
            }
            else if(info.equals("Consecutivo2"))
            {
                Mensaje mensaje=new Mensaje(info);
                OutStream.reset();
                OutStream.writeObject(mensaje);
            }
            else if(info.equals("Consecutivo3"))
            {
                Mensaje mensaje=new Mensaje(info);
                OutStream.reset();
                OutStream.writeObject(mensaje);
            }
            else if(info.equals("mandar"))
            {
                
                Mensaje mensaje=new Mensaje(info);
                mensaje.setPeticion(MainWindow.getPeticion());
                OutStream.reset();
                OutStream.writeObject(mensaje);
            }
            Mensaje mensa=(Mensaje)InStream.readObject();
            System.out.println(mensa.Conse);
            System.out.print(mensa.getMessage());
            if("Menu".equals(mensa.getMessage())){
                System.out.println(mensa.getMenu().size());
                VentanaCompra.getInstance().rellenarVentanas(mensa.getMenu());
            }
            else if("Consecutivo".equals(mensa.getMessage()))
            {
                MainWindow.getPeticion();
                MainWindow.getPeticion().setConsecutivoPedido(mensa.Conse);
            }
            else if("Consecutivo2".equals(mensa.getMessage()))
            {
                MainWindow.getPeticion().setConsecutivoPedido(mensa.Conse);
                 Express dog = (Express) MainWindow.getPeticion() ;
                 dog.setCobro(mensa.extra);
                 MainWindow.setPeticion(dog);
            }
            else if("Consecutivo3".equals(mensa.getMessage()))
            {
                MainWindow.getPeticion().setConsecutivoPedido(mensa.Conse);
                Llevado dog=(Llevado) MainWindow.getPeticion();
                dog.setEmpaque(mensa.getPorcentaje());
                MainWindow.setPeticion(dog);
            }
            socket.close();
        }
    }
//"Fabrizio se caga y no le llega a un destiny"
