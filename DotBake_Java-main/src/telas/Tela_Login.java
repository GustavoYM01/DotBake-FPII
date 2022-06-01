package telas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import objetos.Usuario;

public class Tela_Login extends javax.swing.JFrame {
    
    Usuario us = new Usuario();

    public Tela_Login() {
        initComponents();
    }
    
    private void iniciaSessao() {        
        
        String test1 = CampoEmailLogin.getText();
        String test2 = CampoSenhaLogin.getText();
        
        us.setEmailUsuario(CampoEmailLogin.getText());
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            
            String SQL = "SELECT * FROM usuarios WHERE email = " + "'" + test1 + "'" + 
                    " AND senha = " + "'" + test2 + "'" + ";";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next()) {
                Tela_Receitas tr = new Tela_Receitas();
                tr.setVisible(true);
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Senha ou email inválido(a)");
            }
        } catch (Exception e) {
            System.out.println("Erro " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro");
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
        }
    }
    
    private boolean verificaCampos() {
        String c1 = CampoEmailLogin.getText();
        String c2 = CampoSenhaLogin.getText();
        return c1.isEmpty() || c2.isEmpty();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoEmailLogin = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        CampoSenhaLogin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoEmailLogin.setBackground(new java.awt.Color(255, 227, 205));
        CampoEmailLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoEmailLogin.setBorder(null);
        CampoEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailLoginActionPerformed(evt);
            }
        });
        getContentPane().add(CampoEmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 470, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/correctExitButton-dotbake.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 80, 50));

        CampoSenhaLogin.setBackground(new java.awt.Color(255, 227, 205));
        CampoSenhaLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoSenhaLogin.setBorder(null);
        CampoSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 470, 40));

        jButton1.setBackground(new java.awt.Color(255, 214, 182));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NÃO POSSUO CADASTRO.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHideActionText(true);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 270, 50));

        jButton2.setBackground(new java.awt.Color(255, 214, 182));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/INICIAR SESSÃO.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHideActionText(true);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 180, 50));

        jLabel1.setBackground(new java.awt.Color(255, 227, 205));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/Login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cadastro c = new Cadastro();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(verificaCampos()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
        }
        else {
            iniciaSessao();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CampoEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoEmailLogin;
    private javax.swing.JPasswordField CampoSenhaLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
