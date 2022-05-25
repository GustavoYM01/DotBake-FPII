package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import objetos.PesquisaReceita;

public class Tela_Pesquisa_Receita extends javax.swing.JFrame {

    public Tela_Pesquisa_Receita() {
        initComponents();
    }
    
    private void pesquisaTituloReceita() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            
            PesquisaReceita pr = new PesquisaReceita();
            
            pr.setTituloProcurado(CampoInserePesquisa.getText());
            
            //String campoTituloReceita = CampoInserePesquisa.getText();
            
            String SQL = "SELECT titulo FROM receitas where titulo LIKE " + "'%" + pr.getTituloProcurado() + "%'" + ";";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next()) {
                Tela_Receita_Encontrada tre = new Tela_Receita_Encontrada();
                tre.setVisible(true);
            }
            else {
                Tela_Receitas tr = new Tela_Receitas();
                JOptionPane.showMessageDialog(null, "Receita não encontrada");
                //tr.setVisible(true);
                //this.dispose();
            }
            
        } catch (Exception e) {
            System.out.println("Erro " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoInserePesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        BotaoHome = new javax.swing.JButton();
        BotaoPesquisa = new javax.swing.JButton();
        BotaoBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoInserePesquisa.setBackground(new java.awt.Color(255, 227, 205));
        CampoInserePesquisa.setBorder(null);
        getContentPane().add(CampoInserePesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 89, 630, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/correctExitButton-dotbake.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 80, 50));

        BotaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/HomeButtonDark-dotbake.png"))); // NOI18N
        BotaoHome.setBorder(null);
        BotaoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 280, 40, 40));

        BotaoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/searchButtonLight-dotbake.png"))); // NOI18N
        BotaoPesquisa.setBorder(null);
        BotaoPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 470, 40, 30));

        BotaoBuscar.setBackground(new java.awt.Color(255, 214, 182));
        BotaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/correct-buscarButton-dotbake.png"))); // NOI18N
        BotaoBuscar.setBorder(null);
        BotaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 150, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/tela pesquisa-dotbake.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
       pesquisaTituloReceita();
       //this.dispose();
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void BotaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHomeActionPerformed
        Tela_Receitas tr = new Tela_Receitas();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoHomeActionPerformed

    private void BotaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPesquisaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton BotaoHome;
    private javax.swing.JButton BotaoPesquisa;
    private javax.swing.JTextField CampoInserePesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
