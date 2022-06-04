package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import conexao.MySQL;

public class Tela_Atualiza_Receita extends javax.swing.JFrame {

    public Tela_Atualiza_Receita() {
        initComponents();
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            
            String SQL = "SELECT * FROM receitas;";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next()) {
              String titulo = rs.getString("titulo");
              Area_Receitas.append(titulo.toUpperCase());
              String separador = ": ";
              Area_Receitas.append(separador);
              Area_Receitas.append("\n");
              String descricao = rs.getString("descricao");
              Area_Receitas.append(descricao);
              Area_Receitas.append("\n======================================\n\n");
            }
        } catch (Exception e) {
            System.out.println("Erro " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
    private void AtualizaReceita() {
        MySQL connect = new MySQL();
        connect.conectaBanco();
        
        String tituloAtual = CampoTituloAtual.getText();
        String novoTitulo = CampoNovoTitulo.getText();
        String receita = Area_Nova_Receita.getText();
        
        try {
            connect.updateSQL("UPDATE receitas SET titulo = " + "'" + novoTitulo + "'," + "descricao = " + "'" + receita + "'" + "WHERE titulo = " + "'" + tituloAtual + "'" + ";");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a receita");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoHome = new javax.swing.JButton();
        BotaoPesquisa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_Receitas = new javax.swing.JTextArea();
        CampoNovoTitulo = new javax.swing.JTextField();
        CampoTituloAtual = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area_Nova_Receita = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/HomeButtonDark-dotbake.png"))); // NOI18N
        BotaoHome.setBorder(null);
        BotaoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 220, 40, 40));

        BotaoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/searchButtonDark-dotbake.png"))); // NOI18N
        BotaoPesquisa.setBorder(null);
        BotaoPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 410, 40, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/refreshButtonLight-dotBake.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 490, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/darkDeleteButton-dotBake.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 310, 40, 40));

        Area_Receitas.setEditable(false);
        Area_Receitas.setBackground(new java.awt.Color(255, 227, 205));
        Area_Receitas.setColumns(20);
        Area_Receitas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Area_Receitas.setLineWrap(true);
        Area_Receitas.setRows(5);
        jScrollPane1.setViewportView(Area_Receitas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, 440, 650));

        CampoNovoTitulo.setBackground(new java.awt.Color(255, 227, 205));
        CampoNovoTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoNovoTitulo.setBorder(null);
        CampoNovoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNovoTituloActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNovoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 640, 50));

        CampoTituloAtual.setBackground(new java.awt.Color(255, 227, 205));
        CampoTituloAtual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoTituloAtual.setBorder(null);
        CampoTituloAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTituloAtualActionPerformed(evt);
            }
        });
        getContentPane().add(CampoTituloAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 640, 50));

        Area_Nova_Receita.setBackground(new java.awt.Color(255, 227, 205));
        Area_Nova_Receita.setColumns(20);
        Area_Nova_Receita.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Area_Nova_Receita.setLineWrap(true);
        Area_Nova_Receita.setRows(5);
        Area_Nova_Receita.setBorder(null);
        jScrollPane2.setViewportView(Area_Nova_Receita);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 640, 490));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/updateButton-dotBake.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 660, 70, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/correctExitButton-dotbake.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 80, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/tela atualiza receita.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHomeActionPerformed
        Tela_Receitas tr = new Tela_Receitas();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoHomeActionPerformed

    private void BotaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisaActionPerformed
        Tela_Pesquisa_Receita tpr = new Tela_Pesquisa_Receita();
        tpr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoPesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CampoTituloAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTituloAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTituloAtualActionPerformed

    private void CampoNovoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNovoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNovoTituloActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AtualizaReceita();
        this.dispose();
        Tela_Receitas tr = new Tela_Receitas();
        tr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tela_Deleta_Receita tdr = new Tela_Deleta_Receita();
        tdr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Atualiza_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Atualiza_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Atualiza_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Atualiza_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Atualiza_Receita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_Nova_Receita;
    private javax.swing.JTextArea Area_Receitas;
    private javax.swing.JButton BotaoHome;
    private javax.swing.JButton BotaoPesquisa;
    private javax.swing.JTextField CampoNovoTitulo;
    private javax.swing.JTextField CampoTituloAtual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
