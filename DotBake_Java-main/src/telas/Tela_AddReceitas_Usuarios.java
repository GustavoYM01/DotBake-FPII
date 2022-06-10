package telas;
import conexao.MySQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.Usuario;

/**
 *
 * @author Unknown User
 */
public class Tela_AddReceitas_Usuarios extends javax.swing.JFrame {

    MySQL connect = new MySQL(); // FAZ A INSTÂNCIA DO OBJ. MYSQL. DESSA FORMA, É POSSIVEL ACESSAR OS MÉTODOS DA CLASSE MYSQL.
    Usuario user = new Usuario();
    
    public Tela_AddReceitas_Usuarios() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        jScrollPane1.setBorder(null);
    }
    
    private void insereReceita() {
        
        String emailUsuario = user.getEmailUsuario();
        
        this.connect.conectaBanco();
        
        String titulo = CampoInsereTituloReceita.getText();
        String descricao = CampoInsereDetalhesReceita.getText();
        
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            
            String SQL = "SELECT nome_usuario FROM usuarios WHERE email = " + "'" + emailUsuario + "';";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next()) {
                String nome_usuario = rs.getString("nome_usuario");
                this.connect.insertSQL("INSERT INTO receitas (titulo, descricao, respons_receita) VALUES (" 
                    + "'" + titulo + "'," + "'" + descricao + "'," + "'" + nome_usuario + "'" + ")" + ";");
            }
            
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Tela_Popup_Receita_Add tpra = new Tela_Popup_Receita_Add();
                        tpra.setVisible(true);
                        
                        Thread.sleep(2000);
                        
                        Tela_Receitas_Usuarios tra = new Tela_Receitas_Usuarios();
                        tra.setVisible(true);
                        
                        tpra.dispose();
                        dispose();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            t.start();
            
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar receita " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar receita");
        } finally {
            this.connect.fechaBanco();
        }
    }
    
    private boolean verificaCampos() {
        String c1 = CampoInsereTituloReceita.getText();
        String c2 = CampoInsereDetalhesReceita.getText();
        return c1.isEmpty() || c2.isEmpty();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botao_Home = new javax.swing.JButton();
        Botao_Pesquisar = new javax.swing.JButton();
        CampoInsereTituloReceita = new javax.swing.JTextField();
        Botao_Fechar = new javax.swing.JButton();
        Botao_Enviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoInsereDetalhesReceita = new javax.swing.JTextArea();
        logoff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botao_Home.setBackground(new java.awt.Color(255, 214, 182));
        Botao_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/HomeButtonDark-dotbake.png"))); // NOI18N
        Botao_Home.setBorder(null);
        Botao_Home.setBorderPainted(false);
        Botao_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Home.setFocusPainted(false);
        Botao_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 290, -1, 40));

        Botao_Pesquisar.setBackground(new java.awt.Color(255, 214, 182));
        Botao_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/searchButtonDark-dotbake.png"))); // NOI18N
        Botao_Pesquisar.setBorder(null);
        Botao_Pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 390, 40, -1));

        CampoInsereTituloReceita.setBackground(new java.awt.Color(255, 227, 205));
        CampoInsereTituloReceita.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoInsereTituloReceita.setBorder(null);
        CampoInsereTituloReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoInsereTituloReceitaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoInsereTituloReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 100, 630, 30));

        Botao_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewCloseButton-dotbake.png"))); // NOI18N
        Botao_Fechar.setBorder(null);
        Botao_Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, 50));

        Botao_Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewSubmitButton-dotbake.png"))); // NOI18N
        Botao_Enviar.setBorder(null);
        Botao_Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 610, 170, 100));

        CampoInsereDetalhesReceita.setBackground(new java.awt.Color(255, 227, 205));
        CampoInsereDetalhesReceita.setColumns(20);
        CampoInsereDetalhesReceita.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoInsereDetalhesReceita.setLineWrap(true);
        CampoInsereDetalhesReceita.setRows(5);
        jScrollPane1.setViewportView(CampoInsereDetalhesReceita);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 640, 480));

        logoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/logoff2-dotbake.png"))); // NOI18N
        logoff.setBorder(null);
        logoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffActionPerformed(evt);
            }
        });
        getContentPane().add(logoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1185, 480, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/Add receita (user).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_PesquisarActionPerformed
        Tela_Pesquisa_Receita_Usuarios tpru = new Tela_Pesquisa_Receita_Usuarios();
        tpru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botao_PesquisarActionPerformed

    private void Botao_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_HomeActionPerformed
        Tela_Receitas_Usuarios tru = new Tela_Receitas_Usuarios();
        tru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botao_HomeActionPerformed

    private void CampoInsereTituloReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoInsereTituloReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoInsereTituloReceitaActionPerformed

    private void Botao_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_Botao_FecharActionPerformed

    private void Botao_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EnviarActionPerformed
        if(verificaCampos()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
        }
        else {
            insereReceita();
        }
    }//GEN-LAST:event_Botao_EnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_AddReceitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_AddReceitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_AddReceitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_AddReceitas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_AddReceitas_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Enviar;
    private javax.swing.JButton Botao_Fechar;
    private javax.swing.JButton Botao_Home;
    private javax.swing.JButton Botao_Pesquisar;
    private javax.swing.JTextArea CampoInsereDetalhesReceita;
    private javax.swing.JTextField CampoInsereTituloReceita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoff;
    // End of variables declaration//GEN-END:variables
}
