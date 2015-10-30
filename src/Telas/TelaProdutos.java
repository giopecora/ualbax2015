package Telas;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Banco.ConexaoBanco;
import Classes.FamiliaDAO;
import Classes.Produtos;
import Classes.ProdutosDAO;
import java.sql.ResultSet;

public class TelaProdutos extends javax.swing.JFrame {

    Connection conexao = ConexaoBanco.getConexao();
    private TelaPrincipal telaAnterior;
    int idFamilia;
    public TelaProdutos() {
        initComponents();
    }

    public TelaProdutos(TelaPrincipal telaAnterior) {
        this();
        this.telaAnterior = telaAnterior;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        descricaoField = new javax.swing.JTextField();
        familiaField = new javax.swing.JTextField();
        botãoIncluir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoProcuraFamilia = new javax.swing.JButton();
        botaoExecutar = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        vMinimoField = new javax.swing.JTextField();
        vMaximoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saldoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        jLabel3.setText("Familia");

        codigoField.setEnabled(false);

        descricaoField.setEnabled(false);

        familiaField.setEnabled(false);

        botãoIncluir.setText("Incluir");
        botãoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoIncluirActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.setEnabled(false);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoProcuraFamilia.setText("...");
        botaoProcuraFamilia.setEnabled(false);
        botaoProcuraFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcuraFamiliaActionPerformed(evt);
            }
        });

        botaoExecutar.setText("Executar");
        botaoExecutar.setEnabled(false);
        botaoExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExecutarActionPerformed(evt);
            }
        });

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor Mínimo");

        vMinimoField.setEnabled(false);

        vMaximoField.setEnabled(false);
        vMaximoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vMaximoFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Máximo");

        saldoField.setEnabled(false);

        jLabel6.setText("Saldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botãoIncluir)
                        .addGap(40, 40, 40)
                        .addComponent(botaoPesquisar)
                        .addContainerGap(337, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoExecutar)
                                .addGap(39, 39, 39)
                                .addComponent(botaoCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(descricaoField)
                                    .addComponent(familiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoProcuraFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigoField)
                                .addGap(291, 291, 291)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(saldoField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vMinimoField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vMaximoField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botãoIncluir)
                    .addComponent(botaoPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vMinimoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vMaximoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familiaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcuraFamilia)
                    .addComponent(saldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoExecutar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        String descricao = descricaoField.getText();
        int familia = idFamilia;
        double vMin = Double.parseDouble(vMinimoField.getText());
        double vMax = Double.parseDouble(vMaximoField.getText());

        Produtos produto = new Produtos(descricao, familia, vMin, vMax);
        ProdutosDAO dao = new ProdutosDAO(conexao);

        try {
            dao.adicionar(produto);
        } catch (SQLException ex) {
            Logger.getLogger(TelaFamilia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            codigoField.setEnabled(false);
            codigoField.setText(null);
            descricaoField.setEnabled(false);
            descricaoField.setText(null);
            botaoSalvar.setEnabled(false);
            botaoCancelar.setEnabled(false);
            vMinimoField.setEnabled(false);
            vMinimoField.setText(null);
            familiaField.setText(null);
            vMaximoField.setEnabled(false);
            vMaximoField.setText(null);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botãoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoIncluirActionPerformed
        descricaoField.setEnabled(true);
        botaoSalvar.setEnabled(true);
        botaoCancelar.setEnabled(true);
        botaoProcuraFamilia.setEnabled(true);
        vMinimoField.setEnabled(true);
        vMaximoField.setEnabled(true);
        
    }//GEN-LAST:event_botãoIncluirActionPerformed

    private void botaoProcuraFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcuraFamiliaActionPerformed

        familiaField.setText(null);
        Connection conexao = ConexaoBanco.getConexao();
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
                    idFamilia = Integer.parseInt(rs.getString("ID_FAMILIA"));
                }
                //String familia = rs.getString("DESCRICAO");
                //System.out.println(familia + "\n");
            }
            if (nomeEncontrado) 
            {
                familiaField.setText(descricao);
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Familia não encontrada!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoProcuraFamiliaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed

        codigoField.setEnabled(false);
        descricaoField.setEnabled(false);
        familiaField.setEnabled(false);
        botaoSalvar.setEnabled(false);
        botaoCancelar.setEnabled(false);
        botaoProcuraFamilia.setEnabled(false);

    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExecutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExecutarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        boolean nomeEncontrado = false;
        ProdutosDAO dao = new ProdutosDAO(conexao);
        ResultSet rs = null;
        
        String descricao = JOptionPane.showInputDialog("Digite a descrição do produto");
        try{
            rs = dao.pesquisar(descricao);
            while(rs.next()){
                if(rs.getString("DESCRICAO").equalsIgnoreCase(descricao)){
                    nomeEncontrado = true;
                    codigoField.setText(rs.getString("ID_CODIGO"));
                    vMinimoField.setText(rs.getString("SALDO_MIN"));
                    vMaximoField.setText(rs.getString("SALDO_MAX"));
                    saldoField.setText(rs.getString("SALDO_ATUAL"));
                    
                }
            }
            if(nomeEncontrado){
                descricaoField.setText(descricao);
            }else{
                JOptionPane.showMessageDialog(this, "Produto não encontrado!");
            }
        }catch(SQLException ex){
            Logger.getLogger(TelaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void vMaximoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vMaximoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vMaximoFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExecutar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoProcuraFamilia;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botãoIncluir;
    private javax.swing.JTextField codigoField;
    private javax.swing.JTextField descricaoField;
    private javax.swing.JTextField familiaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField saldoField;
    private javax.swing.JTextField vMaximoField;
    private javax.swing.JTextField vMinimoField;
    // End of variables declaration//GEN-END:variables
}
