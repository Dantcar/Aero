/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package view;

import Control.PassagemCtrl;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author deciodecarvalho
 */
public class TelaRelatorios extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRelatorios
     */
    public TelaRelatorios() {
        initComponents();
    //populaJComboBox();
        populaJComboBoxGenerico("numeropassagem", 1);        
        populaJComboBoxGenerico("datapassagem", 2);
        populaJComboBoxGenerico("nomepassageiro", 3);
        populaJComboBoxGenerico("rgpassageiro", 4);
        cbxNumeroPassagem.setSelectedIndex(-1);
        cbxDataPassagem.setSelectedIndex(-1);
        cbxNomePassageiro.setSelectedIndex(-1);
        cbxRgPassageiroPassagem.setSelectedIndex(-1);
    
    
    }

    public void populaJComboBox() {
        PassagemCtrl cPassagem = new PassagemCtrl();
        cbxNumeroPassagem.removeAllItems(); //remove os itens atuais do comboBox.
        ArrayList lista = cPassagem.populaComboNumeroPassagem(); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            cbxNumeroPassagem.addItem(String.valueOf(i.next()));
        }
    }
    private void populaJComboBoxGenerico(String campo, int item) {
        PassagemCtrl cPassagem = new PassagemCtrl();
        if (item == 1){
                cbxNumeroPassagem.removeAllItems();
            }
        else if(item == 2){
           cbxDataPassagem.removeAllItems(); 
        }
        else if(item == 3){
           cbxNomePassageiro.removeAllItems(); 
        }
        else if(item == 4){
           cbxRgPassageiroPassagem.removeAllItems(); 
        }
        
        ArrayList lista = cPassagem.populaComboGenerico(campo); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            if (item == 1){
              cbxNumeroPassagem.addItem(String.valueOf(i.next()));
            }
            else if(item == 2){
           cbxDataPassagem.addItem(String.valueOf(i.next()));
            }
            else if(item == 3){
           cbxNomePassageiro.addItem(String.valueOf(i.next()));
            }
            else if(item == 4){
           cbxRgPassageiroPassagem.addItem(String.valueOf(i.next()));
            }
        }
    }
    
    public void populaJListGenerico(String campo, int item) {
        PassagemCtrl cPassagem = new PassagemCtrl();
        if (item == 1){
                cbxNumeroPassagem.removeAllItems();
            }
        else if(item == 2){
           cbxDataPassagem.removeAllItems(); 
        }
        else if(item == 3){
           cbxNomePassageiro.removeAllItems(); 
        }
        else if(item == 4){
           cbxRgPassageiroPassagem.removeAllItems(); 
        }
        
        ArrayList lista = cPassagem.populaComboGenerico(campo); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
           if (item == 1){
           cbxNumeroPassagem.addItem(String.valueOf(i.next()));
           }
           else if(item == 2){
           cbxDataPassagem.addItem(String.valueOf(i.next()));
            }
            else if(item == 3){
           cbxNomePassageiro.addItem(String.valueOf(i.next()));
            }
            else if(item == 4){
           cbxRgPassageiroPassagem.addItem(String.valueOf(i.next()));
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPassagemTitulo = new javax.swing.JPanel();
        lblTelaPassagem = new javax.swing.JLabel();
        lblTituloTelaPassagem = new javax.swing.JLabel();
        PainelPassageiro = new javax.swing.JPanel();
        lblPassagemNome = new javax.swing.JLabel();
        lblRgPassagem = new javax.swing.JLabel();
        lblNumeroPassagem = new javax.swing.JLabel();
        cbxNumeroPassagem = new javax.swing.JComboBox();
        cbxNomePassageiro = new javax.swing.JComboBox();
        cbxRgPassageiroPassagem = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabRelatorioPassagem = new javax.swing.JTable();
        cbxDataPassagem = new javax.swing.JComboBox();
        PanelPassagemBotoes = new javax.swing.JPanel();
        btnImprimirRelatorioPassagem = new javax.swing.JButton();
        btnPesquisarPassagem = new javax.swing.JButton();
        btnLimparPassagem = new javax.swing.JButton();
        btnSairPassagem = new javax.swing.JButton();

        PainelPassagemTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTelaPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/passagem 40x40.jpg"))); // NOI18N

        lblTituloTelaPassagem.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTituloTelaPassagem.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloTelaPassagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTelaPassagem.setText("Passagem Aérea");

        javax.swing.GroupLayout PainelPassagemTituloLayout = new javax.swing.GroupLayout(PainelPassagemTitulo);
        PainelPassagemTitulo.setLayout(PainelPassagemTituloLayout);
        PainelPassagemTituloLayout.setHorizontalGroup(
            PainelPassagemTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPassagemTituloLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lblTelaPassagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloTelaPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPassagemTituloLayout.setVerticalGroup(
            PainelPassagemTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPassagemTituloLayout.createSequentialGroup()
                .addGroup(PainelPassagemTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelPassagemTituloLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTelaPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelPassagemTituloLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTituloTelaPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PainelPassageiro.setBorder(javax.swing.BorderFactory.createTitledBorder("Passagem Aérea - Passageiro"));

        lblPassagemNome.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblPassagemNome.setForeground(new java.awt.Color(102, 102, 102));
        lblPassagemNome.setText("Passageiro :");

        lblRgPassagem.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblRgPassagem.setForeground(new java.awt.Color(102, 102, 102));
        lblRgPassagem.setText("RG :");

        lblNumeroPassagem.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblNumeroPassagem.setForeground(new java.awt.Color(102, 102, 102));
        lblNumeroPassagem.setText("Número Passagem : ");

        cbxNumeroPassagem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNumeroPassagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNumeroPassagemItemStateChanged(evt);
            }
        });

        cbxNomePassageiro.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNomePassageiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNomePassageiroItemStateChanged(evt);
            }
        });

        cbxRgPassageiroPassagem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxRgPassageiroPassagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRgPassageiroPassagemItemStateChanged(evt);
            }
        });

        tabRelatorioPassagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabRelatorioPassagem);

        javax.swing.GroupLayout PainelPassageiroLayout = new javax.swing.GroupLayout(PainelPassageiro);
        PainelPassageiro.setLayout(PainelPassageiroLayout);
        PainelPassageiroLayout.setHorizontalGroup(
            PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPassageiroLayout.createSequentialGroup()
                .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPassageiroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroPassagem)
                            .addComponent(lblPassagemNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRgPassagem, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPassageiroLayout.createSequentialGroup()
                                .addComponent(cbxNumeroPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cbxDataPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxNomePassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxRgPassageiroPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelPassageiroLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPassageiroLayout.setVerticalGroup(
            PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPassageiroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroPassagem)
                    .addComponent(cbxNumeroPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDataPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassagemNome)
                    .addComponent(cbxNomePassageiro, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRgPassagem)
                    .addComponent(cbxRgPassageiroPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        PanelPassagemBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnImprimirRelatorioPassagem.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirRelatorioPassagem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImprimirRelatorioPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ticarGreen_1.png"))); // NOI18N
        btnImprimirRelatorioPassagem.setText("Imprimir");
        btnImprimirRelatorioPassagem.setToolTipText("Salvar Alterações");
        btnImprimirRelatorioPassagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimirRelatorioPassagem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnImprimirRelatorioPassagem.setIconTextGap(2);
        btnImprimirRelatorioPassagem.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnImprimirRelatorioPassagem.setPreferredSize(new java.awt.Dimension(100, 50));
        btnImprimirRelatorioPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioPassagemActionPerformed(evt);
            }
        });

        btnPesquisarPassagem.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisarPassagem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPesquisarPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lupaVermelha 40x40.png"))); // NOI18N
        btnPesquisarPassagem.setText("Pesquisar");
        btnPesquisarPassagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPesquisarPassagem.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesquisarPassagem.setPreferredSize(new java.awt.Dimension(100, 50));
        btnPesquisarPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPassagemActionPerformed(evt);
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

        javax.swing.GroupLayout PanelPassagemBotoesLayout = new javax.swing.GroupLayout(PanelPassagemBotoes);
        PanelPassagemBotoes.setLayout(PanelPassagemBotoesLayout);
        PanelPassagemBotoesLayout.setHorizontalGroup(
            PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPassagemBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImprimirRelatorioPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnLimparPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnPesquisarPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnSairPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        PanelPassagemBotoesLayout.setVerticalGroup(
            PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnImprimirRelatorioPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisarPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnLimparPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSairPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelPassagemTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelPassageiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelPassagemBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPassagemTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPassagemBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxNumeroPassagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNumeroPassagemItemStateChanged

    }//GEN-LAST:event_cbxNumeroPassagemItemStateChanged

    private void cbxNomePassageiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNomePassageiroItemStateChanged

    }//GEN-LAST:event_cbxNomePassageiroItemStateChanged

    private void cbxRgPassageiroPassagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRgPassageiroPassagemItemStateChanged

    }//GEN-LAST:event_cbxRgPassageiroPassagemItemStateChanged

    private void btnImprimirRelatorioPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioPassagemActionPerformed

    }//GEN-LAST:event_btnImprimirRelatorioPassagemActionPerformed

    private void btnPesquisarPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPassagemActionPerformed

    }//GEN-LAST:event_btnPesquisarPassagemActionPerformed

    private void btnLimparPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPassagemActionPerformed

    }//GEN-LAST:event_btnLimparPassagemActionPerformed

    private void btnSairPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPassagemActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairPassagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPassageiro;
    private javax.swing.JPanel PainelPassagemTitulo;
    private javax.swing.JPanel PanelPassagemBotoes;
    private javax.swing.JButton btnImprimirRelatorioPassagem;
    private javax.swing.JButton btnLimparPassagem;
    private javax.swing.JButton btnPesquisarPassagem;
    private javax.swing.JButton btnSairPassagem;
    private javax.swing.JComboBox cbxDataPassagem;
    private javax.swing.JComboBox cbxNomePassageiro;
    private javax.swing.JComboBox cbxNumeroPassagem;
    private javax.swing.JComboBox cbxRgPassageiroPassagem;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumeroPassagem;
    private javax.swing.JLabel lblPassagemNome;
    private javax.swing.JLabel lblRgPassagem;
    private javax.swing.JLabel lblTelaPassagem;
    private javax.swing.JLabel lblTituloTelaPassagem;
    private javax.swing.JTable tabRelatorioPassagem;
    // End of variables declaration//GEN-END:variables
}
