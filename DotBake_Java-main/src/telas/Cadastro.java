package telas;

import conexao.MySQL;
import javax.swing.JOptionPane;
import objetos.Usuario;

public class Cadastro extends javax.swing.JFrame {
    
    MySQL connect = new MySQL(); // FAZ A INSTÂNCIA DO OBJ. MYSQL. DESSA FORMA, É POSSIVEL ACESSAR OS MÉTODOS DA CLASSE MYSQL.
    Usuario novoUsuario = new Usuario(); // FAZ A INSTÂNCIA DO OBJ. USUARIO. ASSIM, PODE-SE ACESSAR OS MÉTODOS DA CLASSE USUARIO.
    
    public Cadastro() {
        initComponents();
    }
    
    private void cadastraUsuario(Usuario novoUsuario) {
        
        this.connect.conectaBanco();
        
        novoUsuario.setNome_Usuario(CampoNomeCadastro1.getText());
        novoUsuario.setEmail(CampoEmailCadastro.getText());
        novoUsuario.setSenha(CampoSenhaCadastro.getText());
        
        try {
            this.connect.insertSQL("INSERT INTO usuarios"
                + " VALUES (" + "'" + novoUsuario.getNome_Usuario() + "',"
                + "'" + novoUsuario.getEmail() + "'," + "'" + novoUsuario.getSenha() + "'" + ");");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");
        } 
        finally {
            this.connect.fechaBanco();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
        }
    }
    
    private boolean VerificaCampos() {
        String t = CampoNomeCadastro1.getText();
        String t2 = CampoEmailCadastro.getText();
        String t3 = CampoSenhaCadastro.getText();
        String t4 = CampoConfirmaSenha.getText();
        return t.isEmpty() || t2.isEmpty() || t3.isEmpty() || t4.isEmpty();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CampoEmailCadastro = new javax.swing.JTextField();
        CampoNomeCadastro1 = new javax.swing.JTextField();
        CampoSenhaCadastro = new javax.swing.JPasswordField();
        CampoConfirmaSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoEmailCadastro.setBackground(new java.awt.Color(255, 227, 205));
        CampoEmailCadastro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoEmailCadastro.setBorder(null);
        CampoEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(CampoEmailCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 470, 40));

        CampoNomeCadastro1.setBackground(new java.awt.Color(255, 227, 205));
        CampoNomeCadastro1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoNomeCadastro1.setBorder(null);
        CampoNomeCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeCadastro1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNomeCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 470, 40));

        CampoSenhaCadastro.setBackground(new java.awt.Color(255, 227, 205));
        CampoSenhaCadastro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoSenhaCadastro.setBorder(null);
        CampoSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 470, 40));

        CampoConfirmaSenha.setBackground(new java.awt.Color(255, 227, 205));
        CampoConfirmaSenha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoConfirmaSenha.setBorder(null);
        CampoConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoConfirmaSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 470, 40));

        jButton1.setBackground(new java.awt.Color(255, 214, 182));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/CADASTRAR.png"))); // NOI18N
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/Cadastro.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoSenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaCadastroActionPerformed

    private void CampoConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoConfirmaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoConfirmaSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            if(VerificaCampos()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
          }
            else {
                cadastraUsuario(novoUsuario);
                Tela_Login tl = new Tela_Login();
                tl.setVisible(true);
                this.dispose();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CampoNomeCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeCadastro1ActionPerformed

    private void CampoEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoConfirmaSenha;
    private javax.swing.JTextField CampoEmailCadastro;
    private javax.swing.JTextField CampoNomeCadastro1;
    private javax.swing.JPasswordField CampoSenhaCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
