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
import static Control.Util.reduzString;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Passagem;

/**
 *
 * @author deciodecarvalho
 */
public class TelaRelatorioPassagem extends javax.swing.JInternalFrame {

    public static String numeroPassagem, nomePassageiro;

    /**
     * Creates new form TelaRelatorios
     */
    public TelaRelatorioPassagem() {
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
        if (item == 1) {
            cbxNumeroPassagem.removeAllItems();
        } else if (item == 2) {
            //       cbxDataPassagem.removeAllItems(); 
        } else if (item == 3) {
            cbxNomePassageiro.removeAllItems();
        } else if (item == 4) {
            //     cbxRgPassageiroPassagem.removeAllItems(); 
        }

        ArrayList lista = cPassagem.populaComboGenerico(campo); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            if (item == 1) {
                cbxNumeroPassagem.addItem(String.valueOf(i.next()));
            } else if (item == 2) {
                //  cbxDataPassagem.addItem(String.valueOf(i.next()));
            } else if (item == 3) {
                cbxNomePassageiro.addItem(String.valueOf(i.next()));
            } else if (item == 4) {
                //   cbxRgPassageiroPassagem.addItem(String.valueOf(i.next()));
            }
        }
    }

    public void populaJListGenerico(String campo, int item) {
        PassagemCtrl cPassagem = new PassagemCtrl();
        if (item == 1) {
            cbxNumeroPassagem.removeAllItems();
        } else if (item == 2) {
            // cbxDataPassagem.removeAllItems(); 
        } else if (item == 3) {
            cbxNomePassageiro.removeAllItems();
        } else if (item == 4) {
            // cbxRgPassageiroPassagem.removeAllItems(); 
        }

        ArrayList lista = cPassagem.populaComboGenerico(campo); //retorna os numeros de passagem do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            if (item == 1) {
                cbxNumeroPassagem.addItem(String.valueOf(i.next()));
            } else if (item == 2) {
                // cbxDataPassagem.addItem(String.valueOf(i.next()));
            } else if (item == 3) {
                cbxNomePassageiro.addItem(String.valueOf(i.next()));
            } else if (item == 4) {
                // cbxRgPassageiroPassagem.addItem(String.valueOf(i.next()));
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPassagemTitulo = new javax.swing.JPanel();
        lblTelaPassagem = new javax.swing.JLabel();
        lblTituloTelaPassagem = new javax.swing.JLabel();
        PanelPassagemBotoes = new javax.swing.JPanel();
        btnLimparPassagem = new javax.swing.JButton();
        btnSairPassagem = new javax.swing.JButton();
        btnImprimirRelatorioPassagem = new javax.swing.JButton();
        PanelRelPassagem = new javax.swing.JTabbedPane();
        PainelPassageiro = new javax.swing.JPanel();
        lblNumeroPassagem = new javax.swing.JLabel();
        cbxNumeroPassagem = new javax.swing.JComboBox();
        btnListarPassagem = new javax.swing.JButton();
        btnListarPassagemTodas = new javax.swing.JButton();
        lblNomePassageiroRelatorio = new javax.swing.JLabel();
        cbxNomePassageiro = new javax.swing.JComboBox();
        btnListarPassagemNome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PainelRelImpresso = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPassagem = new javax.swing.JTextArea();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(283, 283, 283)
                .addComponent(lblTelaPassagem)
                .addGap(78, 78, 78)
                .addComponent(lblTituloTelaPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        PainelPassagemTituloLayout.setVerticalGroup(
            PainelPassagemTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPassagemTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelPassagemTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloTelaPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelaPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PainelPassagemTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 970, -1));

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

        btnImprimirRelatorioPassagem.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirRelatorioPassagem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImprimirRelatorioPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/infraero/pdf2.png"))); // NOI18N
        btnImprimirRelatorioPassagem.setText("Imprimir em PDF");
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

        javax.swing.GroupLayout PanelPassagemBotoesLayout = new javax.swing.GroupLayout(PanelPassagemBotoes);
        PanelPassagemBotoes.setLayout(PanelPassagemBotoesLayout);
        PanelPassagemBotoesLayout.setHorizontalGroup(
            PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPassagemBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimparPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnImprimirRelatorioPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                .addComponent(btnSairPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        PanelPassagemBotoesLayout.setVerticalGroup(
            PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPassagemBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPassagemBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirRelatorioPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSairPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PanelPassagemBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 980, 80));

        PainelPassageiro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PainelPassageiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumeroPassagem.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblNumeroPassagem.setForeground(new java.awt.Color(102, 102, 102));
        lblNumeroPassagem.setText("Número Passagem : ");
        PainelPassageiro.add(lblNumeroPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        cbxNumeroPassagem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNumeroPassagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNumeroPassagemItemStateChanged(evt);
            }
        });
        cbxNumeroPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNumeroPassagemActionPerformed(evt);
            }
        });
        PainelPassageiro.add(cbxNumeroPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 160, 30));

        btnListarPassagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarPassagem.setText("Mostrar Passagem");
        btnListarPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPassagemActionPerformed(evt);
            }
        });
        PainelPassageiro.add(btnListarPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, 30));

        btnListarPassagemTodas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarPassagemTodas.setText("Listar todas Passagens");
        btnListarPassagemTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPassagemTodasActionPerformed(evt);
            }
        });
        PainelPassageiro.add(btnListarPassagemTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 190, 30));

        lblNomePassageiroRelatorio.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblNomePassageiroRelatorio.setForeground(new java.awt.Color(102, 102, 102));
        lblNomePassageiroRelatorio.setText("Nome Passageiro : ");
        PainelPassageiro.add(lblNomePassageiroRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        cbxNomePassageiro.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNomePassageiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNomePassageiroItemStateChanged(evt);
            }
        });
        cbxNomePassageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNomePassageiroActionPerformed(evt);
            }
        });
        PainelPassageiro.add(cbxNomePassageiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 320, 30));

        btnListarPassagemNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarPassagemNome.setText("Passagens do Passageiro");
        btnListarPassagemNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPassagemNomeActionPerformed(evt);
            }
        });
        PainelPassageiro.add(btnListarPassagemNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/relPassageiro.jpg"))); // NOI18N
        PainelPassageiro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 350));

        PanelRelPassagem.addTab("Relatório Passagens", PainelPassageiro);

        txtPassagem.setEditable(false);
        txtPassagem.setBackground(new java.awt.Color(242, 239, 19));
        txtPassagem.setColumns(20);
        txtPassagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPassagem.setRows(7);
        txtPassagem.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));
        jScrollPane1.setViewportView(txtPassagem);

        javax.swing.GroupLayout PainelRelImpressoLayout = new javax.swing.GroupLayout(PainelRelImpresso);
        PainelRelImpresso.setLayout(PainelRelImpressoLayout);
        PainelRelImpressoLayout.setHorizontalGroup(
            PainelRelImpressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        PainelRelImpressoLayout.setVerticalGroup(
            PainelRelImpressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        PanelRelPassagem.addTab("Relatório Passagens", PainelRelImpresso);

        getContentPane().add(PanelRelPassagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 980, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxNumeroPassagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNumeroPassagemItemStateChanged

    }//GEN-LAST:event_cbxNumeroPassagemItemStateChanged

    private void btnLimparPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPassagemActionPerformed
        cbxNumeroPassagem.setSelectedIndex(-1);
        // cbxDataPassagem.setSelectedIndex(-1);
        cbxNomePassageiro.setSelectedIndex(-1);
        // cbxRgPassageiroPassagem.setSelectedIndex(-1);
        txtPassagem.setText("");
    }//GEN-LAST:event_btnLimparPassagemActionPerformed

    private void btnSairPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPassagemActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairPassagemActionPerformed

    private void btnListarPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPassagemActionPerformed
        String title = "Relatórios Passagem - Aerofast";
        numeroPassagem = cbxNumeroPassagem.getSelectedItem().toString();
        PassagemCtrl cPassagem = new PassagemCtrl();
        PanelRelPassagem.setSelectedIndex(1);
        List passagem = cPassagem.listarPassagemNumero(numeroPassagem);
        this.carregarLista(passagem);
       


    }//GEN-LAST:event_btnListarPassagemActionPerformed

    private void btnListarPassagemTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPassagemTodasActionPerformed
        String title = "Relatórios Passagem - Aerofast";
        PassagemCtrl cPassagem = new PassagemCtrl();
        PanelRelPassagem.setSelectedIndex(1);
        List passagem = cPassagem.listarPassagens();
        this.carregarLista(passagem);
    }//GEN-LAST:event_btnListarPassagemTodasActionPerformed

    private void cbxNomePassageiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNomePassageiroItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNomePassageiroItemStateChanged

    private void btnListarPassagemNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPassagemNomeActionPerformed
        nomePassageiro = cbxNomePassageiro.getSelectedItem().toString();
        PassagemCtrl cPassagem = new PassagemCtrl();
        PanelRelPassagem.setSelectedIndex(1);
        List passagem = cPassagem.listarPassagemNome(nomePassageiro);
         this.carregarLista(passagem);
    }//GEN-LAST:event_btnListarPassagemNomeActionPerformed

    private void btnImprimirRelatorioPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioPassagemActionPerformed
        //criamos um documento vazio
        String msg = "";
        String tituloMsg = "Relatório PDF";
        String passagemTexto = txtPassagem.getText();
        Document documento = new Document();

        try {
            //criar o documento no diretório do projeto Netbeans AeroFast
            PdfWriter.getInstance(documento, new FileOutputStream("documentoAeroFastPassagem.pdf"));

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

        } finally {
            documento.close();

            if (!"".equals(msg)) {
                JOptionPane.showMessageDialog(this, msg, tituloMsg, JOptionPane.WARNING_MESSAGE);
                msg = "";
            } else {
                msg = "Relatório criado em PDF com sucesso";
                JOptionPane.showMessageDialog(this, msg, tituloMsg, JOptionPane.WARNING_MESSAGE);
                msg = "";
            }
        }

    }//GEN-LAST:event_btnImprimirRelatorioPassagemActionPerformed

    private void cbxNumeroPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNumeroPassagemActionPerformed
       if((cbxNumeroPassagem.getSelectedIndex())!=-1){
          btnListarPassagem.setEnabled(true);
       }else{
         btnListarPassagem.setEnabled(false);  
       }
    }//GEN-LAST:event_cbxNumeroPassagemActionPerformed

    private void cbxNomePassageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNomePassageiroActionPerformed
      if((cbxNomePassageiro.getSelectedIndex())!=-1){
          btnListarPassagemNome.setEnabled(true);
       }else{
         btnListarPassagemNome.setEnabled(false);  
       }
    }//GEN-LAST:event_cbxNomePassageiroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPassageiro;
    private javax.swing.JPanel PainelPassagemTitulo;
    private javax.swing.JPanel PainelRelImpresso;
    private javax.swing.JPanel PanelPassagemBotoes;
    private javax.swing.JTabbedPane PanelRelPassagem;
    private javax.swing.JButton btnImprimirRelatorioPassagem;
    private javax.swing.JButton btnLimparPassagem;
    private javax.swing.JButton btnListarPassagem;
    private javax.swing.JButton btnListarPassagemNome;
    private javax.swing.JButton btnListarPassagemTodas;
    private javax.swing.JButton btnSairPassagem;
    private javax.swing.JComboBox cbxNomePassageiro;
    private javax.swing.JComboBox cbxNumeroPassagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomePassageiroRelatorio;
    private javax.swing.JLabel lblNumeroPassagem;
    private javax.swing.JLabel lblTelaPassagem;
    private javax.swing.JLabel lblTituloTelaPassagem;
    private javax.swing.JTextArea txtPassagem;
    // End of variables declaration//GEN-END:variables

    private void carregarLista(List<Passagem> listaPassagens) {
        String newline = System.getProperty("line.separator");
        String resultado = "";
        for (Passagem p : listaPassagens) {
            resultado += "\n\n\t\t\t PASSAGEM AÉREA \n"
                    + "\n\tStatus Passagem: " + p.getReserva() + "\n"
                    + "\n\tEmpresa Aérea: " + p.getCiaAerea()
                    + "\n\tPassagem Número:  " + p.getNumeroPassagem() + "\t\t Adquirida em: " + p.getDataPassagem() + "\n"
                    + "\n\tClasse : " + p.getClasse() + "\t Número Assento: " + p.getAssentoNumero() + "\n"
                    + "\n\tPassageiro: " + p.getNomePassageiro() + "\t RG: " + p.getRgPassageiro() + "\n"
                    + "\n\tVoo número: " + p.getVooNumero()
                    + "\n\tData Voo: " + p.getPartidaData() + "\t Hora Voo: " + p.getPartidaHora()
                    + "\n\tEmbarque pelo Portão: " + p.getPartidaPortao() + "\n"
                    + "\n\tAeroporto Partida:"
                    + "\n\t" + p.getPartidaAeroporto()
                    + "\n\tAeroporto Destino"
                    + "\n\t" + p.getChegadaAeroporto()+"\n";
            resultado += newline;
        }
        txtPassagem.setText(resultado);

    }

}
