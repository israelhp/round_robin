/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round_robin;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author israe
 */
public class Proceso extends javax.swing.JFrame {
    private int cont = 0; 
    private int proceso = 0;
    private int rafaga = 0; 
    private int quantum = 0;
    private int residuo = 0;
    private int tiempo = 0;
    private int barra = 0;
    private int cantProcesos = 0;
    /**
     * Creates new form Proceso
     */
    public Proceso() {
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

        btn_ingresar = new javax.swing.JButton();
        btn_iniciar = new javax.swing.JButton();
        tf_quantum = new javax.swing.JTextField();
        tf_rafaga = new javax.swing.JTextField();
        lb_quantum = new javax.swing.JLabel();
        lb_rafaga = new javax.swing.JLabel();
        lb_title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_procesos = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        lb_porcentajes = new javax.swing.JLabel();
        lb_num = new javax.swing.JLabel();
        lb_aux = new javax.swing.JLabel();
        lb_title12 = new javax.swing.JLabel();
        lb_aux2 = new javax.swing.JLabel();
        lb_aux3 = new javax.swing.JLabel();
        lb_terminados = new javax.swing.JLabel();
        lb_time_process = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_ingresar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_iniciar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        tf_quantum.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        tf_rafaga.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        tf_rafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_rafagaActionPerformed(evt);
            }
        });

        lb_quantum.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        lb_quantum.setText("Quantum");

        lb_rafaga.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        lb_rafaga.setText("Rafaga");

        lb_title1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lb_title1.setText("Lista de Procesos");

        table_procesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Proceso", "Rafaga", "Quantum", "Residuo Rafaga", "Estado"
            }
        ));
        jScrollPane1.setViewportView(table_procesos);

        lb_porcentajes.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        lb_num.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        lb_aux.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        lb_aux.setText("Proceso ");

        lb_title12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lb_title12.setText("Historial de procesos");

        lb_aux2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        lb_aux2.setText("Procesos terminados");

        lb_aux3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        lb_aux3.setText("Tiempo de procesos ");

        lb_terminados.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        lb_time_process.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Proceso", "Rafaga", "Quantum ", "Tiempo Final", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_quantum)
                                    .addComponent(lb_rafaga))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_quantum, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(tf_rafaga))
                                .addGap(35, 35, 35)
                                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(lb_title1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(116, 116, 116))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lb_aux)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lb_num, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lb_porcentajes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lb_title12)
                                            .addGap(92, 92, 92)))
                                    .addGap(20, 20, 20)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lb_aux2)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_aux3)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_time_process, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_terminados, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_quantum)
                            .addComponent(tf_quantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_rafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_rafaga)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_porcentajes, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_num, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_aux))
                .addGap(27, 27, 27)
                .addComponent(lb_title12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_aux2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_terminados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_aux3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_time_process, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_rafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_rafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_rafagaActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        try{
            if(Integer.parseInt(this.tf_rafaga.getText())<100 && Integer.parseInt(this.tf_quantum.getText())> 0){
                ingresar();
                this.tf_quantum.setEnabled(false);
            }else if(Integer.parseInt(this.tf_quantum.getText())<= 0){
                JOptionPane.showMessageDialog(this, "El Quantum no puede ser menor a 1");
            }else if(Integer.parseInt(this.tf_rafaga.getText())>100){
                JOptionPane.showMessageDialog(this, "La rafaga no puede ser mayor a 100");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Llene las casillas en blanco");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        new Thread(new Hilo()).start();
        iniciar();
    }//GEN-LAST:event_btn_iniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proceso().setVisible(true);
            }
        });
    }
    
     public void iniciar(){ //Inicia la secuencia de procesos
        lb_quantum.setVisible(false);
        lb_rafaga.setVisible(false);
        tf_quantum.setVisible(false);
        tf_rafaga.setVisible(false);
        btn_ingresar.setVisible(false);
        btn_iniciar.setVisible(false);
    }
    public void ingresar(){
        DefaultTableModel model=(DefaultTableModel) table_procesos.getModel();
        cont++;
        model.addRow(new Object[]{cont,this.tf_rafaga.getText(),this.tf_quantum.getText(),this.tf_rafaga.getText(),"Listo"});
        tf_rafaga.setText(null);
    
    }
    public void obtener(int i) {
        this.proceso = (int) table_procesos.getValueAt(i,0);
        this.rafaga = Integer.parseInt((String) table_procesos.getValueAt(i,1));
        this.quantum =Integer.parseInt((String) table_procesos.getValueAt(i, 2));
        this.residuo = Integer.parseInt((String) table_procesos.getValueAt(i,3));
        
        lb_num.setText(String.valueOf(this.proceso)); 
        
    }
   public void porcentajeBarra(int rafaga, int residuo){ //Calcula porcentaje de la barra y su progreso
        int Rafaga=rafaga;
        int valor=100/rafaga;
        int porcentaje=100-(valor*residuo);
        barra=porcentaje;
        lb_num.setText(String.valueOf(barra+"%"));
}

    public void pintar(){
        jProgressBar1.setValue(barra);
        jProgressBar1.repaint();
    }
    
    public void dormir() {
        try {
            Thread.sleep(800); //Dormir sistema
        } catch (InterruptedException ex) {
            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrar(int c) { //Elimina los registros de la tabla procesos
        table_procesos.setValueAt(0, c, 0);
        table_procesos.setValueAt("0", c, 1);
        table_procesos.setValueAt("0", c, 2);
        table_procesos.setValueAt("0", c, 3);
        table_procesos.setValueAt("******", c, 4);
    }
    
    public void informe(int c) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        Object[] miTabla = new Object[5];
        miTabla[0] = c + 1;
        miTabla[1] = rafaga;
        miTabla[2] = quantum;
        miTabla[3] = tiempo + " Segundos";
        miTabla[4] = "Terminado";
        modelo.addRow(miTabla);
        jTable1.setModel(modelo);

        cantProcesos++;
        this.lb_terminados.setText(String.valueOf(cantProcesos + " Terminados"));
        this.lb_time_process.setText(String.valueOf(tiempo + " Segundos"));
    }

    private class Hilo implements Runnable{
        @Override
        public void run(){
            boolean estado = true; 
            int i = 0;
            while (estado) {
                while (i < cont) { //Recorrer las filas
                    obtener(i);
                    if (residuo != 0 && residuo > quantum) { //Ejecutando Procesos
                        for (int c = 1; c <= quantum; c++) {
                            table_procesos.setValueAt("Procesando", i, 4);
                            residuo--;
                            porcentajeBarra(rafaga, residuo);
                            pintar();
                            table_procesos.setValueAt(String.valueOf(residuo), i, 3);
                            tiempo++;
                            dormir();
                        }
                        table_procesos.setValueAt("Espera", i, 4);
                        if (residuo == 0) {
                            table_procesos.setValueAt("Terminado", i, 4);
                            pintar();
                            informe(i);
                            borrar(i);
                            jProgressBar1.setValue(0);
                        }
                    } else {
                        if (residuo > 0 && quantum != 0) {
                            while (residuo > 0) {
                                table_procesos.setValueAt("Procesando", i, 4);
                                residuo--;
                                porcentajeBarra(rafaga, residuo);
                                pintar();
                                table_procesos.setValueAt(String.valueOf(residuo), i, 3);
                                tiempo++;
                                dormir();
                            }
                            table_procesos.setValueAt("Espera", i, 4);
                            if (residuo == 0 && quantum != 0) {
                                table_procesos.setValueAt("Terminado", i, 4);
                                pintar();
                                informe(i);
                                borrar(i);
                                jProgressBar1.setValue(0);
                            }
                        } else {
                            if (residuo == 0 && quantum != 0) {
                                table_procesos.setValueAt("Terminado", i, 4);
                                pintar();
                                informe(i);
                                borrar(i);
                                jProgressBar1.setValue(0);
                            }
                        }
                    }
                    lb_num.setText(String.valueOf("")); //Borrar contenido
                    lb_porcentajes.setText(String.valueOf(""));
                    i++;
                }
                i = 0;
                lb_num.setText(String.valueOf("")); //Borrar contenido
                lb_porcentajes.setText(String.valueOf(""));
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_aux;
    private javax.swing.JLabel lb_aux2;
    private javax.swing.JLabel lb_aux3;
    private javax.swing.JLabel lb_num;
    private javax.swing.JLabel lb_porcentajes;
    private javax.swing.JLabel lb_quantum;
    private javax.swing.JLabel lb_rafaga;
    private javax.swing.JLabel lb_terminados;
    private javax.swing.JLabel lb_time_process;
    private javax.swing.JLabel lb_title1;
    private javax.swing.JLabel lb_title12;
    private javax.swing.JTable table_procesos;
    private javax.swing.JTextField tf_quantum;
    private javax.swing.JTextField tf_rafaga;
    // End of variables declaration//GEN-END:variables
}
