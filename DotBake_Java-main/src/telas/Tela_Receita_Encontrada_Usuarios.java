package telas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import objetos.PesquisaReceita;

public class Tela_Receita_Encontrada_Usuarios extends javax.swing.JFrame {

    public Tela_Receita_Encontrada_Usuarios() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");
            
            Statement stmt = con.createStatement();
            
            PesquisaReceita pr = new PesquisaReceita();
            
            pr.getTituloProcurado();
            
            String SQL = "SELECT * FROM receitas where titulo LIKE " + "'%" + pr.getTituloProcurado() + "%'" + ";";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next()) {
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
            System.out.println("Erro ao buscar receita " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar receita");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CampoReceitas = new javax.swing.JTextArea();
        Botao_Home = new javax.swing.JButton();
        Botao_Pesquisar = new javax.swing.JButton();
        Botao_Fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoReceitas.setBackground(new java.awt.Color(255, 227, 205));
        CampoReceitas.setColumns(20);
        CampoReceitas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoReceitas.setLineWrap(true);
        CampoReceitas.setRows(5);
        jScrollPane1.setViewportView(CampoReceitas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 48, 840, 650));

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

        Botao_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewCloseButton-dotbake.png"))); // NOI18N
        Botao_Fechar.setBorder(null);
        Botao_Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/tela resultado da pesquisa (user).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_HomeActionPerformed
        Tela_Receitas_Usuarios tru = new Tela_Receitas_Usuarios();
        tru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botao_HomeActionPerformed

    private void Botao_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_PesquisarActionPerformed
        Tela_Pesquisa_Receita_Usuarios tpru = new Tela_Pesquisa_Receita_Usuarios();
        tpru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Botao_PesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Receita_Encontrada_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Receita_Encontrada_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Receita_Encontrada_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Receita_Encontrada_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Receita_Encontrada_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Fechar;
    private javax.swing.JButton Botao_Home;
    private javax.swing.JButton Botao_Pesquisar;
    private javax.swing.JTextArea CampoReceitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
