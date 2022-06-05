package telas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import objetos.PesquisaReceita;

public class Tela_Pesquisa_Receita extends javax.swing.JFrame {

    public Tela_Pesquisa_Receita() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }
    
    private void pesquisaTituloReceita() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            
            PesquisaReceita pr = new PesquisaReceita();
            
            pr.setTituloProcurado(CampoInserePesquisa.getText());
            
            String SQL = "SELECT titulo FROM receitas where titulo LIKE " + "'%" + pr.getTituloProcurado() + "%'" + ";";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next()) {
                Tela_Receita_Encontrada tre = new Tela_Receita_Encontrada();
                tre.setVisible(true);
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Receita não encontrada");
            }
            
        } catch (Exception e) {
            System.out.println("Erro " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
    private boolean verificaCampo(){
        String c1 = CampoInserePesquisa.getText();
        return c1.isEmpty();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoInserePesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        BotaoHome = new javax.swing.JButton();
        BotaoBuscar = new javax.swing.JButton();
        Botão_Deleta = new javax.swing.JButton();
        Botao_Atualiza = new javax.swing.JButton();
        Botao_Pesquisa = new javax.swing.JButton();
        BotaoBuscar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoInserePesquisa.setBackground(new java.awt.Color(255, 227, 205));
        CampoInserePesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoInserePesquisa.setBorder(null);
        CampoInserePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoInserePesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoInserePesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 720, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewCloseButton-dotbake.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 60, 50));

        BotaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/HomeButtonDark-dotbake.png"))); // NOI18N
        BotaoHome.setBorder(null);
        BotaoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 40, 40));

        BotaoBuscar.setBackground(new java.awt.Color(255, 214, 182));
        BotaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/correct-buscarButton-dotbake.png"))); // NOI18N
        BotaoBuscar.setBorder(null);
        BotaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 150, 80));

        Botão_Deleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/darkDeleteButton-dotBake.png"))); // NOI18N
        Botão_Deleta.setText("jButton2");
        Botão_Deleta.setBorder(null);
        Botão_Deleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botão_Deleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_DeletaActionPerformed(evt);
            }
        });
        getContentPane().add(Botão_Deleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 390, 60, 40));

        Botao_Atualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/correctRefreshButtonDotbake.png"))); // NOI18N
        Botao_Atualiza.setText("jButton1");
        Botao_Atualiza.setBorder(null);
        Botao_Atualiza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Atualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_AtualizaActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Atualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 490, 50, 50));

        Botao_Pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/searchButtonLight-dotbake.png"))); // NOI18N
        Botao_Pesquisa.setBorder(null);
        Botao_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_PesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, -1, -1));

        BotaoBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/sideButtonsearch-dotbake.png"))); // NOI18N
        BotaoBuscar1.setBorder(null);
        BotaoBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 50, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/tela pesquisa (admin).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
        if(verificaCampo()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
        }
        else {
            pesquisaTituloReceita();
        }
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void BotaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHomeActionPerformed
        Tela_Receitas tr = new Tela_Receitas();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoHomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CampoInserePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoInserePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoInserePesquisaActionPerformed

    private void Botão_DeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_DeletaActionPerformed
        Tela_Deleta_Receita tdr = new Tela_Deleta_Receita();
        tdr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botão_DeletaActionPerformed

    private void Botao_AtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_AtualizaActionPerformed
        Tela_Atualiza_Receita tar = new Tela_Atualiza_Receita();
        tar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botao_AtualizaActionPerformed

    private void Botao_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_PesquisaActionPerformed

    private void BotaoBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscar1ActionPerformed
        if(verificaCampo()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
        }
        else {
            pesquisaTituloReceita();
        }
    }//GEN-LAST:event_BotaoBuscar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Pesquisa_Receita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JButton BotaoBuscar1;
    private javax.swing.JButton BotaoHome;
    private javax.swing.JButton Botao_Atualiza;
    private javax.swing.JButton Botao_Pesquisa;
    private javax.swing.JButton Botão_Deleta;
    private javax.swing.JTextField CampoInserePesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
