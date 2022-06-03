package telas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import objetos.Usuario;

public class Tela_Receitas_Usuarios extends javax.swing.JFrame {

    Usuario user = new Usuario();
    
    public Tela_Receitas_Usuarios() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        
        String nomeUsuario = "";
        
        String emailUsuario = user.getEmailUsuario();
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            Statement stmt2 = con.createStatement();
            
            String SQL = "SELECT * FROM receitas;";
            String SQL2 = "SELECT nome_usuario FROM usuarios WHERE email = " + "'" + emailUsuario + "';";
            
            ResultSet rs = stmt.executeQuery(SQL);
            ResultSet rs2 = stmt2.executeQuery(SQL2);
    
            if(rs2.next()) { 
                nomeUsuario = rs2.getString("nome_usuario");
                String titulo = "Usuário: ";
                Campo_usuario.append(titulo);
                Campo_usuario.append(nomeUsuario);
                user.setNomeUsuario2(nomeUsuario); 
            }
            
            while(rs.next()) {
              String respons_receita = "RESPONSÁVEL PELA RECEITA: ";
              String nome_usuario = rs.getString("respons_receita");
              CampoReceitas.append(respons_receita);
              CampoReceitas.append(nome_usuario);
              CampoReceitas.append("\n\n");
              String titulo = rs.getString("titulo");
              CampoReceitas.append(titulo.toUpperCase());
              String separador = ": ";
              CampoReceitas.append(separador);
              CampoReceitas.append("\n");
              String descricao = rs.getString("descricao");
              CampoReceitas.append(descricao);
              CampoReceitas.append("\n==========================================================================\n\n");
            }
        } catch (Exception e) {
            System.out.println("Erro " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botao_Home = new javax.swing.JButton();
        Botao_Pesquisa = new javax.swing.JButton();
        Botao_AddReceita = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoReceitas = new javax.swing.JTextArea();
        Botao_Fechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Campo_usuario = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botao_Home.setBackground(new java.awt.Color(255, 214, 182));
        Botao_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/correctHomeButtonLight-dotbake.png"))); // NOI18N
        Botao_Home.setBorder(null);
        Botao_Home.setBorderPainted(false);
        Botao_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Botao_Home.setFocusPainted(false);
        Botao_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 290, 50, 40));

        Botao_Pesquisa.setBackground(new java.awt.Color(255, 214, 182));
        Botao_Pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/searchButtonDark-dotbake.png"))); // NOI18N
        Botao_Pesquisa.setBorder(null);
        Botao_Pesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_PesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 390, 40, -1));

        Botao_AddReceita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/NewAddReceitaButton-dotbake.png"))); // NOI18N
        Botao_AddReceita.setBorder(null);
        Botao_AddReceita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_AddReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_AddReceitaActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_AddReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 630, 80, -1));

        CampoReceitas.setBackground(new java.awt.Color(255, 227, 205));
        CampoReceitas.setColumns(20);
        CampoReceitas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoReceitas.setLineWrap(true);
        CampoReceitas.setRows(5);
        CampoReceitas.setBorder(null);
        jScrollPane1.setViewportView(CampoReceitas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 48, 840, 650));

        Botao_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewCloseButton-dotbake.png"))); // NOI18N
        Botao_Fechar.setBorder(null);
        Botao_Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, 50));

        Campo_usuario.setEditable(false);
        Campo_usuario.setBackground(new java.awt.Color(255, 227, 205));
        Campo_usuario.setColumns(20);
        Campo_usuario.setLineWrap(true);
        Campo_usuario.setRows(5);
        Campo_usuario.setBorder(null);
        jScrollPane2.setViewportView(Campo_usuario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/tela receitas (user).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_PesquisaActionPerformed
        Tela_Pesquisa_Receita_Usuarios tpru = new Tela_Pesquisa_Receita_Usuarios();
        tpru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botao_PesquisaActionPerformed

    private void Botao_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_HomeActionPerformed

    private void Botao_AddReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_AddReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_AddReceitaActionPerformed

    private void Botao_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_Botao_FecharActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Receitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Receitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Receitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Receitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Receitas_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_AddReceita;
    private javax.swing.JButton Botao_Fechar;
    private javax.swing.JButton Botao_Home;
    private javax.swing.JButton Botao_Pesquisa;
    private javax.swing.JTextArea CampoReceitas;
    private javax.swing.JTextArea Campo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
