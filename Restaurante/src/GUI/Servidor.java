package GUI;

import GUI.ServerThread;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Servidor{
    public static final int PORT=6969;
    private ExecutorService pool=Executors.newFixedThreadPool(10);
    public Servidor(){
    }
    public void iniciarServidor() throws IOException, ClassNotFoundException{
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Servidor conectado");
        while(true){
            Socket socket=serverSocket.accept();//Mantiene la conexión
            ServerThread socketsote=new ServerThread(socket);
            pool.execute(socketsote);
        }
    }
}