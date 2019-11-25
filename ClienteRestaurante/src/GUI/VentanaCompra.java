/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import restaurante.Pedido;
import restaurante.Platillo;

/**
 *
 * @author Fabrizio
 */
public class VentanaCompra extends javax.swing.JFrame {
    DefaultListModel<String> model = new DefaultListModel<>();

    public Pedido getEleccion() {
        return eleccion;
    }

    public void setEleccion(Pedido eleccion) {
        this.eleccion = eleccion;
    }

    public ArrayList<Platillo> getMenuBusqueda() {
        return menuBusqueda;
    }

    public void setMenuBusqueda(ArrayList<Platillo> menuBusqueda) {
        this.menuBusqueda = menuBusqueda;
    }

    /**
     * Creates new form VentanaCompra
     */
    
    private static VentanaCompra ventanacion=null;
    
    private Pedido eleccion;
    
    private ArrayList<Platillo> menuBusqueda;

    public JTable getTablaBebidas() {
        return TablaBebidas;
    }

    public void setTablaBebidas(JTable TablaBebidas) {
        this.TablaBebidas = TablaBebidas;
    }

    public JTable getTablaPostres() {
        return TablaPostres;
    }

    public void setTablaPostres(JTable TablaPostres) {
        this.TablaPostres = TablaPostres;
    }

    public JTable getTablaEntradas() {
        return tablaEntradas;
    }

    public void setTablaEntradas(JTable tablaEntradas) {
        this.tablaEntradas = tablaEntradas;
    }

    public JTable getTablaPF() {
        return tablaPF;
    }

    public void setTablaPF(JTable tablaPF) {
        this.tablaPF = tablaPF;
    }
    
    public static VentanaCompra getInstance(){
        if(ventanacion==null)
            ventanacion=new VentanaCompra();
        return ventanacion;
    }
    
    public void rellenarVentanas(ArrayList<Platillo> Menu){
        setMenuBusqueda(Menu);
        CBBeb.removeAll();
        CBBeb.setEnabled(false);
        SBeb.setEnabled(false);
        SEntradas.setEnabled(false);
        SPF.setEnabled(false);
        SPostres.setEnabled(false);
        CBEntradas.removeAll();
        CBEntradas.setEnabled(false);
        CBPF.removeAll();
        CBPF.setEnabled(false);
        CBPostres.removeAll();
        CBPostres.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) TablaBebidas.getModel();
        model.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) TablaPostres.getModel();
        model2.setRowCount(0);
        DefaultTableModel model3 = (DefaultTableModel) tablaEntradas.getModel();
        model3.setRowCount(0);
        DefaultTableModel model4 = (DefaultTableModel) tablaPF.getModel();
        model4.setRowCount(0);
        for(Platillo comida:Menu){
            System.out.println(comida.getCodigo().substring(0, 3));
            if("ENT".equals(comida.getCodigo().substring(0, 3)))
            {
                ArrayList<Object> fila=new ArrayList<Object>();
                fila.add(comida.getNombre());
                fila.add(comida.getDescripcion());
                fila.add(comida.getRacion());
                fila.add(comida.getCalorias());
                fila.add(comida.getPrecio());
                Object[]filaConv=fila.toArray();
                model3.addRow(filaConv);
                CBEntradas.addItem(comida.getCodigo()+" "+comida.getNombre());
            }
            else if("PRN".equals(comida.getCodigo().substring(0, 3)))
            {
                ArrayList<Object> fila=new ArrayList<Object>();
                fila.add(comida.getNombre());
                fila.add(comida.getDescripcion());
                fila.add(comida.getRacion());
                fila.add(comida.getCalorias());
                fila.add(comida.getPrecio());
                Object[]filaConv=fila.toArray();
                model4.addRow(filaConv);
                CBPF.addItem(comida.getCodigo()+" "+comida.getNombre());
            }
            else if("PTR".equals(comida.getCodigo().substring(0, 3)))
            {
                ArrayList<Object> fila=new ArrayList<Object>();
                fila.add(comida.getNombre());
                fila.add(comida.getDescripcion());
                fila.add(comida.getRacion());
                fila.add(comida.getCalorias());
                fila.add(comida.getPrecio());
                Object[]filaConv=fila.toArray();
                model2.addRow(filaConv);
                CBPostres.addItem(comida.getCodigo()+" "+comida.getNombre());
            }
            else if("BEB".equals(comida.getCodigo().substring(0, 3)))
            {
                ArrayList<Object> fila=new ArrayList<Object>();
                fila.add(comida.getNombre());
                fila.add(comida.getDescripcion());
                fila.add(comida.getRacion());
                fila.add(comida.getCalorias());
                fila.add(comida.getPrecio());
                Object[]filaConv=fila.toArray();
                model.addRow(filaConv);
                CBBeb.addItem(comida.getCodigo()+" "+comida.getNombre());
            }
        } 
    }

    private VentanaCompra(){
        initComponents();
        
        this.jList1.setModel(this.model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntradas = new javax.swing.JTable();
        CBEntradas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        SEntradas = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPostres = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaBebidas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPF = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CBPF = new javax.swing.JComboBox<>();
        CBBeb = new javax.swing.JComboBox<>();
        CBPostres = new javax.swing.JComboBox<>();
        SPF = new javax.swing.JSpinner();
        SBeb = new javax.swing.JSpinner();
        SPostres = new javax.swing.JSpinner();
        Terminar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Racion", "Calorias P/R", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaEntradas.setRowHeight(30);
        jScrollPane1.setViewportView(tablaEntradas);

        CBEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEntradasActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Menu de Compras");

        TablaPostres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Racion", "Calorias P/R", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPostres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaPostres.setRowHeight(30);
        jScrollPane3.setViewportView(TablaPostres);

        TablaBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Racion", "Calorias P/R", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaBebidas.setRowHeight(30);
        jScrollPane4.setViewportView(TablaBebidas);

        tablaPF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Racion", "Calorias P/R", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaPF.setRowHeight(30);
        jScrollPane5.setViewportView(tablaPF);

        jLabel2.setText("Postres");

        jLabel3.setText("Entradas");

        jLabel4.setText("Platos Fuertes");

        jLabel5.setText("Bebidas");

        jButton1.setText("Elegir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Elegir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Elegir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Elegir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Eleccion de producto");

        CBPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPFActionPerformed(evt);
            }
        });

        CBBeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBebActionPerformed(evt);
            }
        });

        CBPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPostresActionPerformed(evt);
            }
        });

        Terminar.setText("Terminar Compra");
        Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarActionPerformed(evt);
            }
        });

        jButton6.setText("Pedir Platillo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel3)
                .addGap(101, 101, 101)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(216, 216, 216)
                                        .addComponent(jLabel2)
                                        .addGap(87, 87, 87)
                                        .addComponent(jButton2))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(jButton5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(CBPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(SPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CBBeb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CBPF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CBEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(SEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SPF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SBeb, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(Terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57)
                        .addComponent(jButton3)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBBeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBPostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEntradasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CBEntradasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CBBeb.setEnabled(false);
        SBeb.setEnabled(false);
        SEntradas.setEnabled(true);
        SPF.setEnabled(false);
        SPostres.setEnabled(false);
        CBEntradas.setEnabled(true);
        CBPF.setEnabled(false);
        CBPostres.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CBBeb.setEnabled(false);
        SBeb.setEnabled(false);
        SEntradas.setEnabled(false);
        SPF.setEnabled(true);
        SPostres.setEnabled(false);
        CBEntradas.setEnabled(false);
        CBPF.setEnabled(true);
        CBPostres.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CBBeb.setEnabled(true);
        SBeb.setEnabled(true);
        SEntradas.setEnabled(false);
        SPF.setEnabled(false);
        SPostres.setEnabled(false);
        CBEntradas.setEnabled(false);
        CBPF.setEnabled(false);
        CBPostres.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CBBeb.setEnabled(false);
        SBeb.setEnabled(false);
        SEntradas.setEnabled(false);
        SPF.setEnabled(false);
        SPostres.setEnabled(true);
        CBEntradas.setEnabled(false);
        CBPF.setEnabled(false);
        CBPostres.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CBPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPFActionPerformed

    private void CBBebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBBebActionPerformed

    private void CBPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPostresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPostresActionPerformed

    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed

    }//GEN-LAST:event_TerminarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             // TODO add your handling code here:
        DefaultListModel<String> model = this.model;
        //JList<String>jList1 = new JList<>(model);
      
        if(CBEntradas.isEnabled()){
            for(Platillo plat:menuBusqueda){
                 boolean Esta=false;
                if(plat.getCodigo() == null ? CBEntradas.getSelectedItem().toString().substring(0, 7) == null : plat.getCodigo().equals(CBEntradas.getSelectedItem().toString().substring(0, 7)))
                {
                    for(Platillo plato:MainWindow.getPeticion().getCompras())
                    {
                        if(plato.getCodigo()==plat.getCodigo())
                        {
                            Esta=true;
                            plato.setVentas(plato.getVentas()+(Integer)SPF.getValue());
                        }
                    }
                    if(!Esta)
                    {
                    MainWindow.getPeticion().getCompras().add(plat);
                    }
                    model.addElement(CBPF.getSelectedItem().toString()+"- - - -"+ SPF.getValue().toString());
                    
                }
            }
        }else if(CBPF.isEnabled()){
            for(Platillo plat:menuBusqueda){
                boolean Esta=false;
                if(plat.getCodigo() == null ? CBPF.getSelectedItem().toString().substring(0, 7) == null : plat.getCodigo().equals(CBPF.getSelectedItem().toString().substring(0, 7)))
                {
                    for(Platillo plato:MainWindow.getPeticion().getCompras())
                    {
                        if(plato.getCodigo()==plat.getCodigo())
                        {
                            Esta=true;
                            plato.setVentas(plato.getVentas()+(Integer)SPF.getValue());
                        }
                    }
                    if(!Esta)
                    {
                    MainWindow.getPeticion().getCompras().add(plat);
                    }
                    model.addElement(CBPF.getSelectedItem().toString()+"- - - -"+ SPF.getValue().toString());
                }
            }
        }else if(CBBeb.isEnabled()){
            for(Platillo plat:menuBusqueda){
                boolean Esta=false;
                if(plat.getCodigo() == null ? CBBeb.getSelectedItem().toString().substring(0, 7) == null : plat.getCodigo().equals(CBBeb.getSelectedItem().toString().substring(0, 7)))
                {
                    if(plat.getCodigo() == null ? CBPF.getSelectedItem().toString().substring(0, 7) == null : plat.getCodigo().equals(CBPF.getSelectedItem().toString().substring(0, 7)))
                    {
                    for(Platillo plato:MainWindow.getPeticion().getCompras())
                       {
                            if(plato.getCodigo()==plat.getCodigo())
                            {
                                Esta=true;
                                plato.setVentas(plato.getVentas()+(Integer)SPF.getValue());
                            }
                    }
                    if(!Esta)
                    {
                    MainWindow.getPeticion().getCompras().add(plat);
                    }
                    model.addElement(CBPF.getSelectedItem().toString()+"- - - -"+ SPF.getValue().toString());
                }
                }
            }
        }else if(CBPostres.isEnabled()){
            for(Platillo plat:menuBusqueda){
                boolean Esta=false;
                if(plat.getCodigo() == null ? CBPostres.getSelectedItem().toString().substring(0, 7) == null : plat.getCodigo().equals(CBPostres.getSelectedItem().toString().substring(0, 7)))
                {
                    if(plat.getCodigo() == null ? CBPF.getSelectedItem().toString().substring(0, 7) == null : plat.getCodigo().equals(CBPF.getSelectedItem().toString().substring(0, 7)))
                    {
                    for(Platillo plato:MainWindow.getPeticion().getCompras())
                       {
                            if(plato.getCodigo()==plat.getCodigo())
                            {
                                Esta=true;
                                plato.setVentas(plato.getVentas()+(Integer)SPF.getValue());
                            }
                    }
                    if(!Esta)
                    {
                    MainWindow.getPeticion().getCompras().add(plat);
                    }
                    model.addElement(CBPF.getSelectedItem().toString()+"- - - -"+ SPF.getValue().toString());   
                }
            }
        }
        }
         jList1.setModel(model);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBBeb;
    private javax.swing.JComboBox<String> CBEntradas;
    private javax.swing.JComboBox<String> CBPF;
    private javax.swing.JComboBox<String> CBPostres;
    private javax.swing.JSpinner SBeb;
    private javax.swing.JSpinner SEntradas;
    private javax.swing.JSpinner SPF;
    private javax.swing.JSpinner SPostres;
    private javax.swing.JTable TablaBebidas;
    private javax.swing.JTable TablaPostres;
    private javax.swing.JButton Terminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaEntradas;
    private javax.swing.JTable tablaPF;
    // End of variables declaration//GEN-END:variables
}
