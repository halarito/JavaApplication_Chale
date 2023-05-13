package BelarminoChaleProjectoJava;

import net.proteanit.sql.DbUtils;
import Modulo.Conexao;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author USER
 */
public class TaxasExploracaoAnual extends javax.swing.JFrame {

    /**
     * Creates new form TaxasExploracaoAnual
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TaxasExploracaoAnual() {
        initComponents();

        conexao = Modulo.Conexao.conector();

        preencher();
        preencherTaxas();
        }

    String sql;

        
    void preencher() {

        String sqlTudo = "Select t.cod as Codigo, t.nome as Titular, t.nuit, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id";

        String sqlG = "Select t.cod as Codigo, t.nome as Titular, t.nuit, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id where tf.tipo = ?";

        String sqlT = "Select t.cod as Codigo, t.nome as Titular, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id where tf.tipo = ?";
        
        String sqlV = "Select t.cod as Codigo, t.nome as Titular, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id where tf.tipo = ?";
        
                try {

            if (jComboBox5.getSelectedIndex() == 0) {

                sql = sqlTudo;
                pst = conexao.prepareStatement(sql);

            } else if (jComboBox5.getSelectedIndex() == 1) {

                sql = sqlG;
                pst = conexao.prepareStatement(sql);
                pst.setString(1, "gerador");

            } else if (jComboBox5.getSelectedIndex() == 2) {

                sql = sqlG;
                pst = conexao.prepareStatement(sql);
                pst.setString(1, "Transformador");

            } else if (jComboBox5.getSelectedIndex() == 3) {

                sql = sqlG;
                pst = conexao.prepareStatement(sql);
                pst.setString(1, "Vedação Eléctrica");

            }

            rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }

    void preencherNuit() {

        String sqlTudo = "Select t.cod as Codigo, t.nome as Titular, t.nuit, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id where t.nuit = ?";

        /*String sqlG = "Select t.cod as Codigo, t.nome as Titular, t nuit, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id where tf.tipo = ?";*/
        /*String sqlT = "Select t.cod as Codigo, t.nome as Titular, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id where tf.tipo = ?";
        
         String sqlV = "Select t.cod as Codigo, t.nome as Titular, r.nome as Representante, f.potencia, tf.tipo as Tipo, f.distrito, f.latitude, f.longitude from fontextitular ft inner join titular t on ft.cod_t = t.cod left join representante r on r.cod = t.cod_rep inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tf on tf.id = f.tipo_id where tf.tipo = ?";*/
        try {

            pst = conexao.prepareStatement(sqlTudo);

            pst.setString(1, jTextField18.getText());

            rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }
    
    double potencia;
    double pEst;
    double pExt;
    
        void preencherTaxas() {

        String sqlTudo = "select ft.cod_f as Nr, t.nome as Proprietário, f.potencia as Potência, tipo_f.tipo as Tipo, round(2*30*pow(f.potencia,2/3), 3) as TEst, round(4*30*pow(f.potencia,1/2), 3) as TExt, round(2*30*pow(f.potencia,2/3), 3) + round(4*30*pow(f.potencia,1/2), 3) as Total from fontextitular ft inner join titular t on t.cod = ft.cod_t inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tipo_f on tipo_f.id = f.tipo_id";
        
        String sqlG = "select ft.cod_f as Nr, t.nome as Proprietário, f.potencia as Potência, tipo_f.tipo as Tipo, round(2*30*pow(f.potencia,2/3), 3) as TEst, round(4*30*pow(f.potencia,1/2), 3) as TExt, round(2*30*pow(f.potencia,2/3), 3) + round(4*30*pow(f.potencia,1/2), 3) as Total from fontextitular ft inner join titular t on t.cod = ft.cod_t inner join fonte f on f.cod = ft.cod_f inner join tipo_fonte tipo_f on tipo_f.id = f.tipo_id where tipo_f.tipo = ?";

        try {

            if (jComboBox4.getSelectedIndex() == 0) {

                sql = sqlTudo;
                pst = conexao.prepareStatement(sql);

            } else if (jComboBox4.getSelectedIndex() == 1) {

                sql = sqlG;
                pst = conexao.prepareStatement(sql);
                pst.setString(1, "gerador");

            } else if (jComboBox4.getSelectedIndex() == 2) {

                sql = sqlG;
                pst = conexao.prepareStatement(sql);
                pst.setString(1, "Transformador");

            } else if (jComboBox4.getSelectedIndex() == 3) {

                sql = sqlG;
                pst = conexao.prepareStatement(sql);
                pst.setString(1, "Vedação Eléctrica");

            }  
            
            rs = pst.executeQuery();
            
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField18 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(40767, 40767));
        setPreferredSize(new java.awt.Dimension(800, 700));

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 700));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Gerador", "Transformador", "Cerca Electrica", " " }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fonte Energetica");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Empresa/Nr NUIT");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("FONTES ENERGETICAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 326, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator4))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Fontes Energeticas", jPanel2);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Gerador", "Transformador", "Vedação eléctrica" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Seleccionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fonte Energetica");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CALCULADORA DE TAXAS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(jSeparator5))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Calculadora de Taxas", jPanel4);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
        preencherTaxas();
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        // TODO add your handling code here:
        preencher();
    }//GEN-LAST:event_jComboBox5ItemStateChanged

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
            java.util.logging.Logger.getLogger(TaxasExploracaoAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaxasExploracaoAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaxasExploracaoAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaxasExploracaoAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxasExploracaoAnual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
}
