/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package view;

import model.DBAeroFast;

/**
 *
 * @author Dac
 */
public class TelaStatusBanco extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaStatusBanco
     */
    public TelaStatusBanco() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStatusBancoVoltar = new javax.swing.JButton();
        btnVerificarAcessoBanco = new javax.swing.JButton();
        lblConectado = new javax.swing.JLabel();

        btnStatusBancoVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnStatusBancoVoltar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnStatusBancoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnStatusBancoVoltar.setText("Voltar");
        btnStatusBancoVoltar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnStatusBancoVoltar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnStatusBancoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusBancoVoltarActionPerformed(evt);
            }
        });

        btnVerificarAcessoBanco.setBackground(new java.awt.Color(204, 204, 204));
        btnVerificarAcessoBanco.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVerificarAcessoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bdVerdeAlvo.png"))); // NOI18N
        btnVerificarAcessoBanco.setText("Verificar Conexão");
        btnVerificarAcessoBanco.setIconTextGap(2);
        btnVerificarAcessoBanco.setInheritsPopupMenu(true);
        btnVerificarAcessoBanco.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnVerificarAcessoBanco.setPreferredSize(new java.awt.Dimension(100, 50));
        btnVerificarAcessoBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarAcessoBancoActionPerformed(evt);
            }
        });

        lblConectado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConectado.setText("Click em verificar Conexão...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnVerificarAcessoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnStatusBancoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStatusBancoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarAcessoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusBancoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusBancoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnStatusBancoVoltarActionPerformed

    private void btnVerificarAcessoBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarAcessoBancoActionPerformed
        //meu codigo aqui
        DBAeroFast DB_Fast = new DBAeroFast();
        if (DB_Fast.verificaConexao()){ 
            lblConectado.setText("<html><font color="+"Green"+">Conectado ao Banco Aerofast</font></html>"); 
        }
        else{
           lblConectado.setText("<html><font color="+"Red"+">Desconectado ao Banco Aerofast</font></html>"); 
        }
    }//GEN-LAST:event_btnVerificarAcessoBancoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatusBancoVoltar;
    private javax.swing.JButton btnVerificarAcessoBanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConectado;
    // End of variables declaration//GEN-END:variables
}
