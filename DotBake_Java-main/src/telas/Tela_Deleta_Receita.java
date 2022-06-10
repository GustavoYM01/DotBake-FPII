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
import objetos.ConfirmaExclusao;

public class Tela_Deleta_Receita extends javax.swing.JFrame {

    public Tela_Deleta_Receita() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dot_bake", "root", "123456");

            Statement stmt = con.createStatement();

            String SQL = "SELECT * FROM receitas;";

            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                String titulo = rs.getString("titulo");
                Area_Receitas.append(titulo.toUpperCase());
                String separador = ": ";
                Area_Receitas.append(separador);
                Area_Receitas.append("\n");
                String descricao = rs.getString("descricao");
                Area_Receitas.append(descricao);
                Area_Receitas.append("\n=====================================\n\n");
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

    private void deletaReceita() {
        MySQL connect = new MySQL(); // FAZ A INSTÂNCIA DO OBJ. MYSQL. DESSA FORMA, É POSSIVEL ACESSAR OS MÉTODOS DA CLASSE MYSQL.
        connect.conectaBanco();

        String campo1 = Campo_Titulo_Deletar.getText();

        try {
            connect.updateSQL("DELETE FROM receitas WHERE titulo = " + "'" + campo1 + "'" + ";");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a receita");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoHome = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Campo_Titulo_Deletar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_Receitas = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BotaoPesquisa1 = new javax.swing.JButton();
        logoff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/HomeButtonDark-dotbake.png"))); // NOI18N
        BotaoHome.setBorder(null);
        BotaoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 40, 40));

        jButton2.setForeground(new java.awt.Color(255, 214, 182));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/deleteButtonDotbake.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 390, 50, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/correctRefreshButtonDotbake.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 480, 50, 50));

        Campo_Titulo_Deletar.setBackground(new java.awt.Color(255, 227, 205));
        Campo_Titulo_Deletar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Campo_Titulo_Deletar.setBorder(null);
        Campo_Titulo_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Titulo_DeletarActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Titulo_Deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 640, 50));

        Area_Receitas.setEditable(false);
        Area_Receitas.setBackground(new java.awt.Color(255, 227, 205));
        Area_Receitas.setColumns(20);
        Area_Receitas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Area_Receitas.setLineWrap(true);
        Area_Receitas.setRows(5);
        jScrollPane1.setViewportView(Area_Receitas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, 440, 650));

        jButton4.setBackground(new java.awt.Color(255, 214, 182));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewButtonDelete-dotbake.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 630, 160, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/NewCloseButton-dotbake.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, 50));

        BotaoPesquisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/searchButtonDark-dotbake.png"))); // NOI18N
        BotaoPesquisa1.setBorder(null);
        BotaoPesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisa1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, 40, -1));

        logoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/logoff2-dotbake.png"))); // NOI18N
        logoff.setBorder(null);
        logoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffActionPerformed(evt);
            }
        });
        getContentPane().add(logoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1185, 570, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_img/tela deleta receita (admin).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_Titulo_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Titulo_DeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Titulo_DeletarActionPerformed

    private void BotaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHomeActionPerformed
        Tela_Receitas tr = new Tela_Receitas();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoHomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ConfirmaExclusao ce = new ConfirmaExclusao();
        Tela_Confirmacao_Exclusao tce = new Tela_Confirmacao_Exclusao();
        tce.setVisible(true);

//        ConfirmaExclusao ce = new ConfirmaExclusao();
//        boolean op = ce.getOpcao();
//
//        if (op == true) {
//            deletaReceita();
//            Tela_Popup_Receita_Deletada tprd = new Tela_Popup_Receita_Deletada();
//            tprd.setVisible(true);
//        }
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);

                    boolean op = ce.getOpcao();

                    System.out.println(op);

                    if (op == false) {
                        tce.dispose();
                    } else if (op == true) {
                        deletaReceita();
                        Tela_Popup_Receita_Deletada tprd = new Tela_Popup_Receita_Deletada();
                        tprd.setVisible(true);
                        Thread.sleep(1500);
                        tprd.dispose();
                        Tela_Receitas tr = new Tela_Receitas();
                        tr.setVisible(true);
                        dispose();
                    }
                    ce.setOpcao(false);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela_Atualiza_Receita tar = new Tela_Atualiza_Receita();
        tar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotaoPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisa1ActionPerformed
        Tela_Pesquisa_Receita tpr = new Tela_Pesquisa_Receita();
        tpr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoPesquisa1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Deleta_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Deleta_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Deleta_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Deleta_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Deleta_Receita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_Receitas;
    private javax.swing.JButton BotaoHome;
    private javax.swing.JButton BotaoPesquisa1;
    private javax.swing.JTextField Campo_Titulo_Deletar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoff;
    // End of variables declaration//GEN-END:variables
}
