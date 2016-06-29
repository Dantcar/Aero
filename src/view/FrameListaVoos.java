/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
  * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
  *  do Curso de Analise de Sistemas da Fatec - Ipiranga
  * Ano 2016 - Janeiro a Junho 
  * Aluno Decio Antonio de Carvalho  * 
 */
package view;

import static Control.Util.reduzString;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Voo;


/**
 *
 * @author deciocarvalho
 */
public class FrameListaVoos extends javax.swing.JFrame {

    /**
     * Creates new form FrameListaVoos
     */
    public FrameListaVoos() {
        initComponents();
    }
    
    public FrameListaVoos(List<Voo> lista) {
        String title="Relatórios Voo";
        initComponents();
        this.setLocation(10,10);
        this.carregarListaVoo(lista);
        this.setTitle(title);
       
        
    }//Fim construtor list
    
    /**
     * Método para carregar a listagem de voos conforme formato abaixo
     * @param ListaVoos 
     */
    private void carregarListaVoo(List<Voo> ListaVoos){
      String newline = System.getProperty("line.separator"); //verificar propriedades de System.getProperty
      String resultado = "";
      
      for (Voo v : ListaVoos){
          
          resultado +=""
                    +"\n\tNumero Voo: "+ v.getNumeroVoo()+"\n"
                    +"\n\tCompanhia Aérea: "+ v.getCiaAerea()+ "\n"
                    +"\n\tPrefixo: "+ v.getPrefixoAeronaveVoo()+ "\n"
                    +"\tData Voo: "+ v.getDataPartida()+ "\n"
                    +"\tHora Voo: "+ v.getHoraPartida()+ "\n"
                    +"\tPartida Aeroporto: "+ v.getAeroportoPartidaSigla().trim() + "- "+ v.getAeroportoPartida().trim() +"\n"
                    +"\tDestino Aeroporto: "+ v.getAeroportoChegadaSigla().trim() + "- "+ v.getAeroportoChegada().trim() + "\n"
                    +"\n\tEscalas: "+ v.getEscalasVoo().trim() +"\n"
                    +"\tTarifas:\tEconomica\tEmpresarial\tPrimeira Classe\n"
                    +"\tValor:  \tR$ "+v.getTarifaE()+"\tR$ "+v.getTarifaB()+"\tR$ "+v.getTarifaF()+"\n"
                    +"\t------------------------------------------------------------------------------------------------------------------------"
                  
        ;
        resultado +=newline;  
      }
      resultado="\n\n\t\t\t RELATÓRIOS VOOS\n"+resultado;
      txtVoo.setText(resultado);
      txtVoo.setEditable(false);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSairVooRelatorio = new javax.swing.JButton();
        btnImprimirRelatorioVoo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVoo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(10, 10));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSairVooRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        btnSairVooRelatorio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSairVooRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnSairVooRelatorio.setText("Voltar");
        btnSairVooRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSairVooRelatorio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSairVooRelatorio.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSairVooRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairVooRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSairVooRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 171, -1));

        btnImprimirRelatorioVoo.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirRelatorioVoo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImprimirRelatorioVoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/infraero/pdf2.png"))); // NOI18N
        btnImprimirRelatorioVoo.setText("Imprimir em PDF");
        btnImprimirRelatorioVoo.setToolTipText("Salvar Alterações");
        btnImprimirRelatorioVoo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimirRelatorioVoo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnImprimirRelatorioVoo.setIconTextGap(2);
        btnImprimirRelatorioVoo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnImprimirRelatorioVoo.setPreferredSize(new java.awt.Dimension(100, 50));
        btnImprimirRelatorioVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioVooActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimirRelatorioVoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 171, -1));

        txtVoo.setBackground(new java.awt.Color(184, 230, 206));
        txtVoo.setColumns(20);
        txtVoo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtVoo.setRows(7);
        txtVoo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));
        jScrollPane1.setViewportView(txtVoo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 791, 308));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/relVoo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairVooRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairVooRelatorioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairVooRelatorioActionPerformed

    private void btnImprimirRelatorioVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioVooActionPerformed
        //criamos um documento vazio
        String msg ="";
        String tituloMsg = "Relatório PDF";
        String passagemTexto = txtVoo.getText();
        
        Document documento = new Document();

        try {
            //criar o documento no diretório do projeto Netbeans AeroFast
            PdfWriter.getInstance(documento, new FileOutputStream("RelatorioAeroFastVoos.pdf"));

            //abrir o documento criado.
            documento.open();

            //ajustar o tamanho da pagina
            documento.setPageSize(PageSize.A4);

            //Adicionar um paragrafo
            documento.add(new Paragraph(passagemTexto));
            
            
        } catch (DocumentException | FileNotFoundException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(FrameListaPassagem.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            documento.close();

            if (!"".equals(msg)){
                JOptionPane.showMessageDialog(this, msg, tituloMsg, JOptionPane.WARNING_MESSAGE);
                msg="";
            }else
            {
                msg = "Relatório criado em PDF com sucesso";
                JOptionPane.showMessageDialog(this, msg, tituloMsg, JOptionPane.WARNING_MESSAGE);
                msg="";
            }
        }
    }//GEN-LAST:event_btnImprimirRelatorioVooActionPerformed

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
            java.util.logging.Logger.getLogger(FrameListaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameListaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameListaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameListaVoos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListaVoos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirRelatorioVoo;
    private javax.swing.JButton btnSairVooRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtVoo;
    // End of variables declaration//GEN-END:variables
}
