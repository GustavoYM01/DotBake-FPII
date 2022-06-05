package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import objetos.PesquisaReceita;
import java.awt.Color;

public class Tela_Pesquisa_Receita_Usuarios extends javax.swing.JFrame {

    public Tela_Pesquisa_Receita_Usuarios() {
        initComponents();
        setBackground(new Color(0,0,0,0));
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
                Tela_Receita_Encontrada_Usuarios treu = new Tela_Receita_Encontrada_Usuarios();
                treu.setVisible(true);
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

        Botao_Home = new javax.swing.JButton();
        Botao_Pesquisa = new javax.swing.JButton();
        BotaoBuscar = new javax.swing.JButton();
        CampoInserePesquisa = new javax.swing.JTextField();
        Botao_Fechar = new javax.swing.JButton();
        logoff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botao_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/HomeButtonDark-dotbake.png"))); // NOI18N
        Botao_Home.setBorder(null);
        Botao_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, 40, 40));

        Botao_Pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/searchButtonLight-dotbake.png"))); // NOI18N
        Botao_Pesquisa.setBorder(null);
        Botao_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_PesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 390, -1, -1));

        BotaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/sideButtonsearch-dotbake.png"))); // NOI18N
        BotaoBuscar.setBorder(null);
        BotaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 50, 60));

        CampoInserePesquisa.setBackground(new java.awt.Color(255, 227, 205));
        CampoInserePesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoInserePesquisa.setBorder(null);
        CampoInserePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoInserePesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoInserePesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 359, 720, 40));

        Botao_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewCloseButton-dotbake.png"))); // NOI18N
        Botao_Fechar.setBorder(null);
        Botao_Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, 50));

        logoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/logoff2-dotbake.png"))); // NOI18N
        logoff.setBorder(null);
        logoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffActionPerformed(evt);
            }
        });
        getContentPane().add(logoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1185, 480, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/tela pesquisa (user).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_PesquisaActionPerformed

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
        if(verificaCampo()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
        }
        else {
            pesquisaTituloReceita();
        }
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void Botao_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_Botao_FecharActionPerformed

    private void CampoInserePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoInserePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoInserePesquisaActionPerformed

    private void Botao_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_HomeActionPerformed
        Tela_Receitas_Usuarios tru = new Tela_Receitas_Usuarios();
        tru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botao_HomeActionPerformed

    private void logoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffActionPerformed
        Tela_Login tl = new Tela_Login();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoffActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Receita_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Pesquisa_Receita_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JButton Botao_Fechar;
    private javax.swing.JButton Botao_Home;
    private javax.swing.JButton Botao_Pesquisa;
    private javax.swing.JTextField CampoInserePesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoff;
    // End of variables declaration//GEN-END:variables
}
