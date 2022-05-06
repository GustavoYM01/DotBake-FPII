package telas;


public class Tela_Cadastro extends javax.swing.JFrame {

    public Tela_Cadastro() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoEmailCadastro = new javax.swing.JTextField();
        CampoNomeCadastro1 = new javax.swing.JTextField();
        CampoSenhaCadastro = new javax.swing.JPasswordField();
        CampoConfirmaSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoEmailCadastro.setBackground(new java.awt.Color(255, 227, 205));
        CampoEmailCadastro.setBorder(null);
        CampoEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(CampoEmailCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 470, 40));

        CampoNomeCadastro1.setBackground(new java.awt.Color(255, 227, 205));
        CampoNomeCadastro1.setBorder(null);
        CampoNomeCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeCadastro1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNomeCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 470, 40));

        CampoSenhaCadastro.setBackground(new java.awt.Color(255, 227, 205));
        CampoSenhaCadastro.setBorder(null);
        CampoSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 470, 40));

        CampoConfirmaSenha.setBackground(new java.awt.Color(255, 227, 205));
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
        String campo1 = CampoNomeCadastro1.getText(); // OBTÉM O CONTEÚDO DO NOME DE USUÁRIO
        String campo2 = CampoEmailCadastro.getText(); // OBTÉM O CONTEÚDO DO EMAIL DO USUÁRIO
        String campo3 = CampoSenhaCadastro.getText(); // OBTÉM O CONTEÚDO DA SENHA DO USUÁRIO
        
        
        
        //Cadastro cadastro = new Cadastro(); // FAZ A INSTÂNCIA DA CLASSE Cadastro
        //Lista_Dados_Usuarios listaDeUsuarios = new Lista_Dados_Usuarios(); // FAZ A INSTÂNCIA DA LISTA DE DADOS DOS USUÁRIOS
        
        //cadastro.setUserName(campo1); // "SETA" O ATRIBUTO USER NAME NA CLASSE Cadastro COM O TEXTO OBTIDO NA VAR CAMPO1
        //cadastro.setUserEmail(campo2); // "SETA" O ATRIBUTO USER EMAIL NA CLASSE Cadastro COM O TEXTO OBTIDO NA VAR CAMPO2
        //cadastro.setUserPassword(campo3); // "SETA" O ATRIBUTO USER PASSWORD NA CLASSE Cadastro COM O TEXTO OBTIDO NA VAR CAMPO3
        
        //String c1 = cadastro.getUserName(); // ARMAZENA O OBTER USER NAME EM UMA VARIÁVEL
        //String c2 = cadastro.getUserEmail(); // ARMAZENA O OBTER USER EMAIL EM UMA VARIÁVEL
        //String c3 = cadastro.getUserPassword(); // ARMAZENA O OBTER USER PASSWORD EM UMA VARIÁVEL
        
        //listaDeUsuarios.addUsuario(c1); // ADICIONA O NOME DE USUÁRIO À LISTA
        //listaDeUsuarios.addEmailUsuario(c2); // ADICIONA O EMAIL DO USUÁRIO À LISTA
        //listaDeUsuarios.addSenhaUsuario(c3); // ADICIONA A SENHA DO USUÁRIO À LISTA
        
        Tela_Login tl = new Tela_Login(); // FAZ A INSTÂNCIA DA TELA DE LOGIN
        tl.setVisible(true); // DEIXA VISÍVEL A TELA DE LOGIN
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
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro().setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}
