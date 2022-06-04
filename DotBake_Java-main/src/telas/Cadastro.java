package telas;

import conexao.MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import objetos.Usuario;
import java.awt.Color;

public class Cadastro extends javax.swing.JFrame {
    
    MySQL connect = new MySQL();
    Usuario novoUsuario = new Usuario();
    
    public Cadastro() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }
    
    private void cadastraUsuario(Usuario novoUsuario) {
        
        this.connect.conectaBanco();
        
        novoUsuario.setNome_Usuario(CampoNomeCadastro1.getText());
        novoUsuario.setEmail(CampoEmailCadastro.getText());
        novoUsuario.setSenha(CampoSenhaCadastro.getText());
        
        try {
            this.connect.insertSQL("INSERT INTO usuarios (nome_usuario, email, senha)"
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
    
    private boolean verificaCampos() {
        String t = CampoNomeCadastro1.getText();
        String t2 = CampoEmailCadastro.getText();
        String t3 = CampoSenhaCadastro.getText();
        String t4 = CampoConfirmaSenha.getText();
        return t.isEmpty() || t2.isEmpty() || t3.isEmpty() || t4.isEmpty();
    }
    
    private boolean verificaUsuario(){
        
        boolean bool = false;
        String campoEmail = CampoEmailCadastro.getText();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            
            String SQL = "SELECT email FROM usuarios WHERE email = " + "'" + campoEmail + "';";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Email já cadastrado!");
                bool = true;
            }
            
        } catch (Exception e) {
            System.out.println("Erro " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro");
        }
        return bool;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CampoEmailCadastro = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        CampoNomeCadastro1 = new javax.swing.JTextField();
        CampoSenhaCadastro = new javax.swing.JPasswordField();
        CampoConfirmaSenha = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
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
        getContentPane().add(CampoEmailCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 320, 30));

        jButton4.setBackground(new java.awt.Color(255, 214, 182));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/possuiCadastro-dotbake_1.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHideActionText(true);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 270, 70));

        CampoNomeCadastro1.setBackground(new java.awt.Color(255, 227, 205));
        CampoNomeCadastro1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoNomeCadastro1.setBorder(null);
        CampoNomeCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeCadastro1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNomeCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 320, 30));

        CampoSenhaCadastro.setBackground(new java.awt.Color(255, 227, 205));
        CampoSenhaCadastro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoSenhaCadastro.setBorder(null);
        CampoSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 320, 30));

        CampoConfirmaSenha.setBackground(new java.awt.Color(255, 227, 205));
        CampoConfirmaSenha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoConfirmaSenha.setBorder(null);
        CampoConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoConfirmaSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 320, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewCloseButton-dotbake.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, 50));

        jButton1.setBackground(new java.awt.Color(255, 214, 182));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/cadastrar2.png"))); // NOI18N
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/Cadastro2.png"))); // NOI18N
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
            if(verificaCampos()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
          }
            else {
                if(verificaUsuario()){
                    Tela_Login tl = new Tela_Login();
                    tl.setVisible(true);
                    this.dispose();
                }
                else {
                    cadastraUsuario(novoUsuario);
                    Tela_Login tl = new Tela_Login();
                    tl.setVisible(true);
                    this.dispose();
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CampoNomeCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeCadastro1ActionPerformed

    private void CampoEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailCadastroActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tela_Login tl = new Tela_Login();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
