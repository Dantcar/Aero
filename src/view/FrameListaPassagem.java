/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package view;

import java.util.List;
import model.Passagem;

/**
 *
 * @author deciodecarvalho
 */
public class FrameListaPassagem extends javax.swing.JFrame {

    public FrameListaPassagem() {
        initComponents();
    }

    /**
     * Creates new form FrameListaPassagem
     */
    public FrameListaPassagem(List<Passagem> lista) {
        initComponents();
        setLocation(50,50);
        carregarLista(lista);
       
        
    }
    
    private void carregarLista(List<Passagem> listaPassagens){
       String newline = System.getProperty("line.separator");
       String resultado = "";
       for (Passagem p : listaPassagens){
         resultado +="\n\n\t\t\tPASSAGEM AÉREA \n"
         +"\n\tEmpresa Aérea: " + p.getCiaAerea()+"\n"
         +"\n\tPassagem Número:  " + p.getNumeroPassagem()+ "\t\tAdquirida em: "+ p.getDataPassagem() + "\n"
         +"\n\tClasse : " + p.getClasse() + "\tNúmero Assento: "+ p.getAssentoNumero() + "\n"
         +"\n\tPassageiro: "+ p.getNomePassageiro() + "\tRG: "+ p.getRgPassageiro()+"\n"
         +"\n\tData Voo: "+p.getPartidaData() + "\tHora Voo: "+ p.getPartidaHora() +"\tEmbarque pelo Portão: "+ p.getPartidaPortao()+"\n"
         +"\n\t Voo número: "+ p.getVooNumero() + "\n"
         +"\n\tAeroporto Partida: " + p.getPartidaAeroporto()+"\n"
         +"\n\tAeroporto Destino: " + p.getChegadaAeroporto()+"\n"
         +"\n\tStatus desta passagem: "+ p.getReserva() + "\n";
         resultado += newline;
       }
       txtPassagem.setText(resultado);
       
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelRelatoriosPassagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPassagem = new javax.swing.JTextArea();
        btnImprimirRelatorioPassagem = new javax.swing.JButton();
        btnSairPassagemRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPassagem.setEditable(false);
        txtPassagem.setBackground(new java.awt.Color(242, 239, 19));
        txtPassagem.setColumns(20);
        txtPassagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPassagem.setRows(7);
        txtPassagem.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));
        jScrollPane1.setViewportView(txtPassagem);

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

        btnSairPassagemRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        btnSairPassagemRelatorio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSairPassagemRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnSairPassagemRelatorio.setText("Voltar");
        btnSairPassagemRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSairPassagemRelatorio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSairPassagemRelatorio.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSairPassagemRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairPassagemRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelRelatoriosPassagemLayout = new javax.swing.GroupLayout(PainelRelatoriosPassagem);
        PainelRelatoriosPassagem.setLayout(PainelRelatoriosPassagemLayout);
        PainelRelatoriosPassagemLayout.setHorizontalGroup(
            PainelRelatoriosPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelatoriosPassagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelRelatoriosPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimirRelatorioPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(btnSairPassagemRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelRelatoriosPassagemLayout.setVerticalGroup(
            PainelRelatoriosPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelatoriosPassagemLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(PainelRelatoriosPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelRelatoriosPassagemLayout.createSequentialGroup()
                        .addComponent(btnSairPassagemRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimirRelatorioPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelRelatoriosPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelRelatoriosPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairPassagemRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPassagemRelatorioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairPassagemRelatorioActionPerformed

    private void btnImprimirRelatorioPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioPassagemActionPerformed

    }//GEN-LAST:event_btnImprimirRelatorioPassagemActionPerformed

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
            java.util.logging.Logger.getLogger(FrameListaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameListaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameListaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameListaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListaPassagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelRelatoriosPassagem;
    private javax.swing.JButton btnImprimirRelatorioPassagem;
    private javax.swing.JButton btnSairPassagemRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtPassagem;
    // End of variables declaration//GEN-END:variables
}