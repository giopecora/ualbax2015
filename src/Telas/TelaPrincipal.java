package Telas;

import javax.swing.ImageIcon;

public class TelaPrincipal extends javax.swing.JFrame {
        
        
    public TelaPrincipal() {
        initComponents();
   }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        botaoFamilia = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        botaoUsuario = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        botaoProduto = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        botaoMovimentacao = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        botaoFornecedores = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ualbax");

        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);

        botaoFamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images Ualbax/Folder-red.png"))); // NOI18N
        botaoFamilia.setMaximumSize(new java.awt.Dimension(60, 45));
        botaoFamilia.setMinimumSize(new java.awt.Dimension(60, 45));
        botaoFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFamiliaActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoFamilia);
        jToolBar1.add(jSeparator2);

        botaoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images Ualbax/Admin-User.png"))); // NOI18N
        botaoUsuario.setMaximumSize(new java.awt.Dimension(60, 45));
        botaoUsuario.setMinimumSize(new java.awt.Dimension(60, 45));
        botaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoUsuario);
        jToolBar1.add(jSeparator3);

        botaoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images Ualbax/botaoMais.jpg"))); // NOI18N
        botaoProduto.setMaximumSize(new java.awt.Dimension(65, 45));
        botaoProduto.setMinimumSize(new java.awt.Dimension(65, 45));
        botaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoProduto);
        jToolBar1.add(jSeparator4);

        botaoMovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images Ualbax/movimentacoes.png"))); // NOI18N
        botaoMovimentacao.setMaximumSize(new java.awt.Dimension(80, 45));
        botaoMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMovimentacaoActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoMovimentacao);
        jToolBar1.add(jSeparator5);

        botaoFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images Ualbax/Delivery-Truck.png"))); // NOI18N
        botaoFornecedores.setMaximumSize(new java.awt.Dimension(65, 45));
        botaoFornecedores.setMinimumSize(new java.awt.Dimension(65, 45));
        botaoFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFornecedoresActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoFornecedores);
        jToolBar1.add(jSeparator6);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setText("UALBAX");

        jLabel2.setText("Entrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        setBounds(0, 0, 423, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFornecedoresActionPerformed
        new TelaFornecedor(this).setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botaoFornecedoresActionPerformed

    private void botaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoActionPerformed
        new TelaProdutos(this).setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botaoProdutoActionPerformed

    private void botaoFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFamiliaActionPerformed
        /*Através desse comando eu torno a tela atual invisivel*/
        this.setEnabled(false); 
        /* Criando a Tela de Familia e enviando essa tela como parametro
        Dessa forma posso chamar essa tela posteriormente*/
        new TelaFamilia(this).setVisible(true);
               
        
    }//GEN-LAST:event_botaoFamiliaActionPerformed

    private void botaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsuarioActionPerformed
        /* Criando a Tela de Familia e enviando essa tela como parametro
        Dessa forma posso chamar essa tela posteriormente*/
        new TelaUsuario(this).setVisible(true);
        /*Através desse comando eu torno a tela atual invisivel*/
        this.setEnabled(false); 
    }//GEN-LAST:event_botaoUsuarioActionPerformed

    private void botaoMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMovimentacaoActionPerformed
        new TelaMovimentacao(this).setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botaoMovimentacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFamilia;
    private javax.swing.JButton botaoFornecedores;
    private javax.swing.JButton botaoMovimentacao;
    private javax.swing.JButton botaoProduto;
    private javax.swing.JButton botaoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
