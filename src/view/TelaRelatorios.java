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
    public static String numeroPassagem, nomePassageiro;
    /**
     * Creates new form TelaRelatorios
     */
    public TelaRelatorios() {
        initComponents();
    //populaJComboBox();
        populaJComboBoxGenerico("numeropassagem", 1);
        populaJComboBoxNome();
       // populaJComboBoxGenerico("datapassagem", 2);
       // populaJComboBoxGenerico("nomepassageiro", 3);
       // populaJComboBoxGenerico("rgpassageiro", 4);
        cbxNumeroPassagem.setSelectedIndex(-1);
       // cbxDataPassagem.setSelectedIndex(-1);
        cbxNomePassageiro.setSelectedIndex(-1);
       // cbxRgPassageiroPassagem.setSelectedIndex(-1);
    
    
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
    
    public void populaJComboBoxNome() {
        PassagemCtrl cPassagem = new PassagemCtrl();
        cbxNomePassageiro.removeAllItems(); //remove os itens atuais do comboBox.
        ArrayList lista = cPassagem.populaComboNomePassagem(); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            cbxNomePassageiro.addItem(String.valueOf(i.next()));
        }
    }
    private void populaJComboBoxGenerico(String campo, int item) {
        PassagemCtrl cPassagem = new PassagemCtrl();
        if (item == 1){
                cbxNumeroPassagem.removeAllItems();
            }
        else if(item == 2){
    //       cbxDataPassagem.removeAllItems(); 
        }
        else if(item == 3){
             cbxNomePassageiro.removeAllItems(); 
        }
        else if(item == 4){
      //     cbxRgPassageiroPassagem.removeAllItems(); 
        }
        
        ArrayList lista = cPassagem.populaComboGenerico(campo); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            if (item == 1){
              cbxNumeroPassagem.addItem(String.valueOf(i.next()));
            }
            else if(item == 2){
         //  cbxDataPassagem.addItem(String.valueOf(i.next()));
            }
            else if(item == 3){
              cbxNomePassageiro.addItem(String.valueOf(i.next()));
            }
            else if(item == 4){
        //   cbxRgPassageiroPassagem.addItem(String.valueOf(i.next()));
            }
        }
    }
    
    public void populaJListGenerico(String campo, int item) {
        PassagemCtrl cPassagem = new PassagemCtrl();
        if (item == 1){
                cbxNumeroPassagem.removeAllItems();
            }
        else if(item == 2){
          // cbxDataPassagem.removeAllItems(); 
        }
        else if(item == 3){
               cbxNomePassageiro.removeAllItems(); 
        }
        else if(item == 4){
          // cbxRgPassageiroPassagem.removeAllItems(); 
        }
        
        ArrayList lista = cPassagem.populaComboGenerico(campo); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
           if (item == 1){
           cbxNumeroPassagem.addItem(String.valueOf(i.next()));
           }
           else if(item == 2){
          // cbxDataPassagem.addItem(String.valueOf(i.next()));
            }
            else if(item == 3){
           cbxNomePassageiro.addItem(String.valueOf(i.next()));
            }
            else if(item == 4){
          // cbxRgPassageiroPassagem.addItem(String.valueOf(i.next()));
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPassagemTitulo = new javax.swing.JPanel();
        lblTelaPassagem = new javax.swing.JLabel();
        lblTituloTelaPassagem = new javax.swing.JLabel();
        PainelPassageiro = new javax.swing.JPanel();
        lblNumeroPassagem = new javax.swing.JLabel();
        cbxNumeroPassagem = new javax.swing.JComboBox();
        btnListarPassagem = new javax.swing.JButton();
        btnListarPassagemTodas = new javax.swing.JButton();
        lblNomePassageiroRelatorio = new javax.swing.JLabel();
        cbxNomePassageiro = new javax.swing.JComboBox();
        btnListarPassagemNome = new javax.swing.JButton();
        PanelPassagemBotoes = new javax.swing.JPanel();
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

        lblNumeroPassagem.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblNumeroPassagem.setForeground(new java.awt.Color(102, 102, 102));
        lblNumeroPassagem.setText("Número Passagem : ");

        cbxNumeroPassagem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNumeroPassagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNumeroPassagemItemStateChanged(evt);
            }
        });

        btnListarPassagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarPassagem.setText("Mostrar Passagem");
        btnListarPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPassagemActionPerformed(evt);
            }
        });

        btnListarPassagemTodas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarPassagemTodas.setText("Listar todas Passagens");
        btnListarPassagemTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPassagemTodasActionPerformed(evt);
            }
        });

        lblNomePassageiroRelatorio.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblNomePassageiroRelatorio.setForeground(new java.awt.Color(102, 102, 102));
        lblNomePassageiroRelatorio.setText("Nome Passageiro : ");

        cbxNomePassageiro.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNomePassageiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNomePassageiroItemStateChanged(evt);
            }
        });

        btnListarPassagemNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarPassagemNome.setText("Mostrar Passagem");
        btnListarPassagemNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPassagemNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPassageiroLayout = new javax.swing.GroupLayout(PainelPassageiro);
        PainelPassageiro.setLayout(PainelPassageiroLayout);
        PainelPassageiroLayout.setHorizontalGroup(
            PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPassageiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelPassageiroLayout.createSequentialGroup()
                        .addComponent(lblNumeroPassagem)
                        .addGap(18, 18, 18)
                        .addComponent(cbxNumeroPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnListarPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelPassageiroLayout.createSequentialGroup()
                        .addComponent(lblNomePassageiroRelatorio)
                        .addGap(18, 18, 18)
                        .addComponent(cbxNomePassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarPassagemNome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(btnListarPassagemTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPassageiroLayout.setVerticalGroup(
            PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPassageiroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnListarPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarPassagemTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelPassageiroLayout.createSequentialGroup()
                        .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxNumeroPassagem)
                            .addComponent(lblNumeroPassagem))
                        .addGap(2, 2, 2)))
                .addGap(40, 40, 40)
                .addGroup(PainelPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNomePassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomePassageiroRelatorio)
                    .addComponent(btnListarPassagemNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );

        PanelPassagemBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
                .addComponent(btnLimparPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                .addComponent(btnSairPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        PanelPassagemBotoesLayout.setVerticalGroup(
            PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addGap(0, 11, Short.MAX_VALUE)))
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
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxNumeroPassagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNumeroPassagemItemStateChanged

    }//GEN-LAST:event_cbxNumeroPassagemItemStateChanged

    private void btnLimparPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPassagemActionPerformed

    }//GEN-LAST:event_btnLimparPassagemActionPerformed

    private void btnSairPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPassagemActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairPassagemActionPerformed

    private void btnListarPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPassagemActionPerformed
       numeroPassagem = cbxNumeroPassagem.getSelectedItem().toString();
       PassagemCtrl cPassagem = new PassagemCtrl();
       FrameListaPassagem flp;
      // flp = new FrameListaPassagem(cPassagem.listarPassagens());
       flp = new FrameListaPassagem(cPassagem.listarPassagemNumero(numeroPassagem));
      
       flp.setVisible(true);
       flp.setLocation(120, 100);
       
           
    }//GEN-LAST:event_btnListarPassagemActionPerformed

    private void btnListarPassagemTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPassagemTodasActionPerformed
       // numeroPassagem = cbxNumeroPassagem.getSelectedItem().toString();
       PassagemCtrl cPassagem = new PassagemCtrl();
       FrameListaPassagem flp;
      // flp = new FrameListaPassagem(cPassagem.listarPassagens());
       flp = new FrameListaPassagem(cPassagem.listarPassagens());
      
       flp.setVisible(true);
       flp.setLocation(120, 100);
    }//GEN-LAST:event_btnListarPassagemTodasActionPerformed

    private void cbxNomePassageiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNomePassageiroItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNomePassageiroItemStateChanged

    private void btnListarPassagemNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPassagemNomeActionPerformed
       nomePassageiro = cbxNomePassageiro.getSelectedItem().toString();
        // numeroPassagem = cbxNumeroPassagem.getSelectedItem().toString();
       PassagemCtrl cPassagem = new PassagemCtrl();
       FrameListaPassagem flp;
      // flp = new FrameListaPassagem(cPassagem.listarPassagens());
       flp = new FrameListaPassagem(cPassagem.listarPassagemNome(nomePassageiro));
      
       flp.setVisible(true);
       flp.setLocation(120, 100); 
        
        
    }//GEN-LAST:event_btnListarPassagemNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPassageiro;
    private javax.swing.JPanel PainelPassagemTitulo;
    private javax.swing.JPanel PanelPassagemBotoes;
    private javax.swing.JButton btnLimparPassagem;
    private javax.swing.JButton btnListarPassagem;
    private javax.swing.JButton btnListarPassagemNome;
    private javax.swing.JButton btnListarPassagemTodas;
    private javax.swing.JButton btnSairPassagem;
    private javax.swing.JComboBox cbxNomePassageiro;
    private javax.swing.JComboBox cbxNumeroPassagem;
    private javax.swing.JLabel lblNomePassageiroRelatorio;
    private javax.swing.JLabel lblNumeroPassagem;
    private javax.swing.JLabel lblTelaPassagem;
    private javax.swing.JLabel lblTituloTelaPassagem;
    // End of variables declaration//GEN-END:variables
}