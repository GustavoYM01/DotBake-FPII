package telas;

import conexao.MySQL;
import javax.swing.JOptionPane;


public class Tela_AddReceitas extends javax.swing.JFrame {
    
    MySQL connect = new MySQL(); // FAZ A INSTÂNCIA DO OBJ. MYSQL. DESSA FORMA, É POSSIVEL ACESSAR OS MÉTODOS DA CLASSE MYSQL.

    public Tela_AddReceitas() {
        initComponents();
    }

    
    private void insereReceita() {
        this.connect.conectaBanco();
        
        String titulo = CampoInsereTituloReceita.getText();
        String descricao = CampoInsereDetalhesReceita.getText();
        
        try {
            this.connect.insertSQL("INSERT INTO receitas (titulo, descricao) VALUES (" 
                    + "'" + titulo + "'," + "'" + descricao + "'" + ")" + ";");
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

        CampoInsereTituloReceita = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        BotaoPesquisa1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BotaoEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoInsereDetalhesReceita = new javax.swing.JTextArea();
        BotaoHome1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoInsereTituloReceita.setBackground(new java.awt.Color(255, 227, 205));
        CampoInsereTituloReceita.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CampoInsereTituloReceita.setBorder(null);
        CampoInsereTituloReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoInsereTituloReceitaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoInsereTituloReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 39, 640, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/darkDeleteButton-dotBake.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 370, 40, 40));

        BotaoPesquisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/searchButtonDark-dotbake.png"))); // NOI18N
        BotaoPesquisa1.setBorder(null);
        BotaoPesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisa1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 470, 40, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/correctExitButton-dotbake.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 80, 50));

        BotaoEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/correct-submit-dotbake.png"))); // NOI18N
        BotaoEnviar.setBorder(null);
        BotaoEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 630, 140, 80));

        CampoInsereDetalhesReceita.setBackground(new java.awt.Color(255, 227, 205));
        CampoInsereDetalhesReceita.setColumns(20);
        CampoInsereDetalhesReceita.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        CampoInsereDetalhesReceita.setLineWrap(true);
        CampoInsereDetalhesReceita.setRows(5);
        CampoInsereDetalhesReceita.setSelectionColor(new java.awt.Color(255, 227, 205));
        jScrollPane1.setViewportView(CampoInsereDetalhesReceita);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 98, 640, 490));

        BotaoHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/HomeButtonDark-dotbake.png"))); // NOI18N
        BotaoHome1.setBorder(null);
        BotaoHome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHome1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 280, 40, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/correctRefreshButtonDotbake.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 540, 50, 50));

        jLabel1.setBackground(new java.awt.Color(255, 227, 205));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/tela inicial-dotbake.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoInsereTituloReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoInsereTituloReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoInsereTituloReceitaActionPerformed

    private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarActionPerformed
        if(verificaCampos()) {
            Tela_Erro te = new Tela_Erro();
            te.setVisible(true);
        }
        else {
            insereReceita();
            Tela_Receitas tr = new Tela_Receitas();
            tr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BotaoEnviarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotaoHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHome1ActionPerformed
        Tela_Receitas tr = new Tela_Receitas();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoHome1ActionPerformed

    private void BotaoPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisa1ActionPerformed
        Tela_Pesquisa_Receita tpr = new Tela_Pesquisa_Receita();
        tpr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoPesquisa1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tela_Deleta_Receita tdr = new Tela_Deleta_Receita();
        tdr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela_Atualiza_Receita tar = new Tela_Atualiza_Receita();
        tar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_AddReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_AddReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_AddReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_AddReceitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_AddReceitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JButton BotaoHome1;
    private javax.swing.JButton BotaoPesquisa1;
    private javax.swing.JTextArea CampoInsereDetalhesReceita;
    private javax.swing.JTextField CampoInsereTituloReceita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
