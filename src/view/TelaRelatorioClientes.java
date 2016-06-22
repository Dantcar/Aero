/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
  * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
  *  do Curso de Analise de Sistemas da Fatec - Ipiranga
  * Ano 2016 - Janeiro a Junho 
  * Aluno Decio Antonio de Carvalho  * 
 */
package view;

import Control.ClienteCtrl;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author deciocarvalho
 */
public class TelaRelatorioClientes extends javax.swing.JInternalFrame {

    public static String rgCliente, nomeCliente;

    /**
     * Creates new form TelaRelatorioClientes
     */
    public TelaRelatorioClientes() {
        initComponents();
        populaJComboBoxClienteNome();

        //Limpar ComboBox
        cbxNomeCliente.setSelectedIndex(-1);
    }

    public void populaJComboBoxClienteNome() {
        ClienteCtrl cCliente = new ClienteCtrl();
        cbxNomeCliente.removeAllItems(); //remove os itens atuais do comboBox.
        ArrayList lista = cCliente.populaComboClienteNome(); //retorna os nomes dos clientes do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            cbxNomeCliente.addItem(String.valueOf(i.next()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelRelTituloCliente = new javax.swing.JPanel();
        lblTituloRelatorioCliente = new javax.swing.JLabel();
        lblTelaRelatorioCliente = new javax.swing.JLabel();
        PanelRelClientesBotoes = new javax.swing.JPanel();
        btnSairPassagem = new javax.swing.JButton();
        btnLimparPassagem = new javax.swing.JButton();
        PainelRelOpcoesCliente = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        cbxNomeCliente = new javax.swing.JComboBox();
        btnListarCliente = new javax.swing.JButton();
        btnListarClientesTodos = new javax.swing.JButton();

        PainelRelTituloCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblTituloRelatorioCliente.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTituloRelatorioCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloRelatorioCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRelatorioCliente.setText("Aerofast - Clientes");

        lblTelaRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pessoaFisica.jpeg"))); // NOI18N

        javax.swing.GroupLayout PainelRelTituloClienteLayout = new javax.swing.GroupLayout(PainelRelTituloCliente);
        PainelRelTituloCliente.setLayout(PainelRelTituloClienteLayout);
        PainelRelTituloClienteLayout.setHorizontalGroup(
            PainelRelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelTituloClienteLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lblTelaRelatorioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelRelTituloClienteLayout.setVerticalGroup(
            PainelRelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelTituloClienteLayout.createSequentialGroup()
                .addGroup(PainelRelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelRelTituloClienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTelaRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelRelTituloClienteLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTituloRelatorioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelRelClientesBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSairPassagem.setBackground(new java.awt.Color(204, 204, 204));
        btnSairPassagem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSairPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnSairPassagem.setText("Voltar");
        btnSairPassagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSairPassagem.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSairPassagem.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSairPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairPassagemActionPerformed(evt);
            }
        });

        btnLimparPassagem.setBackground(new java.awt.Color(204, 204, 204));
        btnLimparPassagem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLimparPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/oopsRed.png"))); // NOI18N
        btnLimparPassagem.setText("Limpar");
        btnLimparPassagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimparPassagem.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLimparPassagem.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLimparPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPassagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRelClientesBotoesLayout = new javax.swing.GroupLayout(PanelRelClientesBotoes);
        PanelRelClientesBotoes.setLayout(PanelRelClientesBotoesLayout);
        PanelRelClientesBotoesLayout.setHorizontalGroup(
            PanelRelClientesBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRelClientesBotoesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnLimparPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398)
                .addComponent(btnSairPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        PanelRelClientesBotoesLayout.setVerticalGroup(
            PanelRelClientesBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRelClientesBotoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelRelClientesBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelRelOpcoesCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblNomeCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblNomeCliente.setText("Nome Cliente: ");

        cbxNomeCliente.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNomeCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNomeClienteItemStateChanged(evt);
            }
        });

        btnListarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarCliente.setText("Mostrar Cliente");
        btnListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClienteActionPerformed(evt);
            }
        });

        btnListarClientesTodos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarClientesTodos.setText("Listar todos Clientes");
        btnListarClientesTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelRelOpcoesClienteLayout = new javax.swing.GroupLayout(PainelRelOpcoesCliente);
        PainelRelOpcoesCliente.setLayout(PainelRelOpcoesClienteLayout);
        PainelRelOpcoesClienteLayout.setHorizontalGroup(
            PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeCliente)
                .addGap(18, 18, 18)
                .addComponent(cbxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnListarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnListarClientesTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelRelOpcoesClienteLayout.setVerticalGroup(
            PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnListarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarClientesTodos))
                    .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                        .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCliente))
                        .addGap(2, 2, 2)))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelRelClientesBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelRelTituloCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelRelOpcoesCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelRelTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelRelOpcoesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRelClientesBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPassagemActionPerformed
        //Limpar ComboBox
        cbxNomeCliente.setSelectedIndex(-1);
    }//GEN-LAST:event_btnLimparPassagemActionPerformed

    private void btnSairPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPassagemActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairPassagemActionPerformed

    private void cbxNomeClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNomeClienteItemStateChanged

    }//GEN-LAST:event_cbxNomeClienteItemStateChanged

    private void btnListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClienteActionPerformed
        nomeCliente = cbxNomeCliente.getSelectedItem().toString();
        ClienteCtrl cCliente = new ClienteCtrl();
        FrameListaClientes flc;
        flc = new FrameListaClientes(cCliente.listaClientesNome(nomeCliente));

        flc.setVisible(true);
        flc.setLocation(120, 100);


    }//GEN-LAST:event_btnListarClienteActionPerformed

    private void btnListarClientesTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesTodosActionPerformed
        ClienteCtrl cCliente = new ClienteCtrl();
        FrameListaClientes flc;
        flc = new FrameListaClientes(cCliente.listarClientes());

        flc.setVisible(true);
        flc.setLocation(120, 100);

    }//GEN-LAST:event_btnListarClientesTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelRelOpcoesCliente;
    private javax.swing.JPanel PainelRelTituloCliente;
    private javax.swing.JPanel PanelRelClientesBotoes;
    private javax.swing.JButton btnLimparPassagem;
    private javax.swing.JButton btnListarCliente;
    private javax.swing.JButton btnListarClientesTodos;
    private javax.swing.JButton btnSairPassagem;
    private javax.swing.JComboBox cbxNomeCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblTelaRelatorioCliente;
    private javax.swing.JLabel lblTituloRelatorioCliente;
    // End of variables declaration//GEN-END:variables
}