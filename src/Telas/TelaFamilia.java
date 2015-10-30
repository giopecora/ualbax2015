
package Telas;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Banco.ConexaoBanco;
import Classes.Familia;
import Classes.FamiliaDAO;
public class TelaFamilia extends javax.swing.JFrame {
    private TelaPrincipal telaAnterior;
    Connection conexao = ConexaoBanco.getConexao();
    boolean alterado=false;
    
    private TelaFamilia()
    {
        initComponents();
    }
    
    public TelaFamilia(TelaPrincipal telaAnterior) {
        this();
        this.telaAnterior = telaAnterior;
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldDesc = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonPesq = new javax.swing.JButton();
        jButtonAlt = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Família");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jButton1.setText("Incluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldDesc.setEnabled(false);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonPesq.setText("Pesquisar");
        jButtonPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesqActionPerformed(evt);
            }
        });

        jButtonAlt.setText("Alterar");
        jButtonAlt.setEnabled(false);
        jButtonAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltActionPerformed(evt);
            }
        });

        jTextFieldID.setEnabled(false);

        jLabel2.setText("ID");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesq)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonPesq)
                    .addComponent(jButton4)
                    .addComponent(jButtonAlt)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      telaAnterior.setEnabled(true);
        
        
       
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldDesc.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonAlt.setEnabled(false);
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldDesc.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jTextFieldDesc.setText(null);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (alterado)
        {
            FamiliaDAO dao = new FamiliaDAO(conexao);
            
            dao.alterar(Integer.parseInt(jTextFieldID.getText()), 
                    jTextFieldDesc.getText());
            
            alterado=false;
        }
        else
        {
            Familia familia = new Familia(jTextFieldDesc.getText());
            FamiliaDAO dao = new FamiliaDAO(conexao);
            ResultSet rs = null;
            boolean nomeEncontrado = false;
            try {
                if(familia.verficaCampos(familia))
                {
                    rs = dao.pesquisar(jTextFieldDesc.getText());
                    while(rs.next())
                    {   
                        if (rs.getString("DESCRICAO").equalsIgnoreCase(jTextFieldDesc.getText()))
                        {
                            nomeEncontrado = true;
                        }
                        //String familia = rs.getString("DESCRICAO");
                        //System.out.println(familia + "\n");
                    }
                    if (nomeEncontrado) 
                    {
                        JOptionPane.showMessageDialog(null, "Família Já existe");
                    } 
                    else 
                    {
                        dao.adicionar(familia);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "O Campo está em branco");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaFamilia.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    jTextFieldDesc.setEnabled(false);
    jTextFieldDesc.setText(null);
    jTextFieldID.setText(null);
    jButtonSalvar.setEnabled(false);
    jButtonCancelar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        TelaFamilia.this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesqActionPerformed
        // TODO add your handling code here:
        boolean nomeEncontrado=false;
        FamiliaDAO dao = new FamiliaDAO(conexao);
        ResultSet rs = null;
        
        String descricao = JOptionPane.showInputDialog("Digite a descrição da familia");
        try {
            rs = dao.pesquisar(descricao);
            while(rs.next())
            {
                if (rs.getString("DESCRICAO").equalsIgnoreCase(descricao))
                {
                    nomeEncontrado = true;
                    jTextFieldID.setText(rs.getString("ID_FAMILIA")) ;
                }
                //String familia = rs.getString("DESCRICAO");
                //System.out.println(familia + "\n");
            }
            if (nomeEncontrado) 
            {
                jTextFieldDesc.setText(descricao);
                jButtonAlt.setEnabled(true);
                jButtonExcluir.setEnabled(true);
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Familia não encontrada!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesqActionPerformed

    private void jButtonAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltActionPerformed
        // TODO add your handling code here:
        alterado=true;
        jButton1.setEnabled(false);
        jButtonPesq.setEnabled(false);
        jTextFieldDesc.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonAltActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {
            FamiliaDAO dao = new FamiliaDAO(conexao);
            dao.excluir(Integer.parseInt(jTextFieldID.getText()));
            jTextFieldDesc.setEnabled(false);
            jTextFieldDesc.setText(null);
            jTextFieldID.setText(null);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
        } 

    

    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFamilia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAlt;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesq;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
