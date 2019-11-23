/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import restaurante.Platillo;

/**
 *
 * @author Fabrizio
 */
public class ClienteGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClienteGUI
     */
    public ClienteGUI() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
        SocketCliente sock=new SocketCliente();
        sock.mandarSignal();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
    class SocketCliente{
        
        Socket socket;
        public SocketCliente() throws IOException, ClassNotFoundException
        {
            this.socket=new Socket("127.0.0.1",6969);
//            ObjectOutputStream OutStream=new ObjectOutputStream(socket.getOutputStream());
//            ObjectInputStream InStream=new ObjectInputStream(socket.getInputStream());
//            Mensaje mensaje=new Mensaje("Fabrizio se caga y no le llega a un destiny");
//            OutStream.writeObject(mensaje);
//            Platillo platilloX=(Platillo)InStream.readObject();
//            System.out.print(platilloX.getDescripcion());
//            OutStream.close();
            //socket.close();
        }
        public void mandarSignal() throws IOException, ClassNotFoundException{
            ObjectOutputStream OutStream=new ObjectOutputStream(this.socket.getOutputStream());
            ObjectInputStream InStream=new ObjectInputStream(this.socket.getInputStream());
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String readerInput=buffer.readLine();
            Mensaje mensaje=new Mensaje(readerInput);
            OutStream.writeObject(mensaje);
            Platillo platilloX=(Platillo)InStream.readObject();
            System.out.print(platilloX.getDescripcion());
            //OutStream.close();
        }
    }
//"Fabrizio se caga y no le llega a un destiny"
