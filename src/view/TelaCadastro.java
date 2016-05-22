/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programacao Orientada a Objetos - Avancada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package view;

import Control.Cadastro;import javax.swing.JLayeredPane;
;
/*
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
*/


/**
 *
 * @author deciodecarvalho
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        
        initComponents();
       
       // lblConexao.setText("Conectado");
        
        //this.setResizable(false);
        this.setBounds(0, 0, 1200, 800);
        this.setIconImage(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConexao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        novaPassagem = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        MenuCliente = new javax.swing.JMenuItem();
        MenuPassageiro = new javax.swing.JMenuItem();
        MenuVoo = new javax.swing.JMenu();
        MenuNovoVoo = new javax.swing.JMenuItem();
        MenuVooAeronaveCadastrar = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuSobreTela = new javax.swing.JMenuItem();
        menuSobreVerificaStatusBanco = new javax.swing.JMenuItem();
        jMenu1Sair = new javax.swing.JMenu();
        jMenuSairSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AeroFast");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(400, 200));
        setPreferredSize(new java.awt.Dimension(510, 420));

        lblConexao.setText(" ");

        jMenuArquivo.setText("Passagem");
        jMenuArquivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        novaPassagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        novaPassagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        novaPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/passagem 40x40.jpg"))); // NOI18N
        novaPassagem.setText("Vender Passagem");
        novaPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaPassagemActionPerformed(evt);
            }
        });
        jMenuArquivo.add(novaPassagem);

        jMenuBar1.add(jMenuArquivo);

        jMenuCadastro.setText(" Cliente/Passageiro ");
        jMenuCadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        MenuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        MenuCliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Cliente mulher laranja 40x40.jpg"))); // NOI18N
        MenuCliente.setText("Cliente ");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(MenuCliente);

        MenuPassageiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuPassageiro.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        MenuPassageiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Cliente verde 40x40.jpg"))); // NOI18N
        MenuPassageiro.setText("Passageiro");
        MenuPassageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPassageiroActionPerformed(evt);
            }
        });
        jMenuCadastro.add(MenuPassageiro);

        jMenuBar1.add(jMenuCadastro);

        MenuVoo.setText(" Voo / Aeronave ");
        MenuVoo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        MenuNovoVoo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        MenuNovoVoo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuNovoVoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voos-on-line.png"))); // NOI18N
        MenuNovoVoo.setText("VOO");
        MenuNovoVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNovoVooActionPerformed(evt);
            }
        });
        MenuVoo.add(MenuNovoVoo);

        MenuVooAeronaveCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        MenuVooAeronaveCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuVooAeronaveCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/aeronave 40x40.jpg"))); // NOI18N
        MenuVooAeronaveCadastrar.setText("Cadastrar Aeronave");
        MenuVooAeronaveCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVooAeronaveCadastrarActionPerformed(evt);
            }
        });
        MenuVoo.add(MenuVooAeronaveCadastrar);

        jMenuBar1.add(MenuVoo);

        jMenuSobre.setText("Sobre");
        jMenuSobre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuSobreTela.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        jMenuSobreTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/informcaoVerdinho i 40x40.png"))); // NOI18N
        jMenuSobreTela.setText("Sobre");
        jMenuSobreTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreTelaActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuSobreTela);

        menuSobreVerificaStatusBanco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSobreVerificaStatusBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/inserir.png"))); // NOI18N
        menuSobreVerificaStatusBanco.setText("Verifica Conexão Banco");
        menuSobreVerificaStatusBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreVerificaStatusBancoActionPerformed(evt);
            }
        });
        jMenuSobre.add(menuSobreVerificaStatusBanco);

        jMenuBar1.add(jMenuSobre);

        jMenu1Sair.setText("Sair");
        jMenu1Sair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuSairSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuSairSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/SairBotao 40x40 vermelho.png"))); // NOI18N
        jMenuSairSair.setText("Sair");
        jMenuSairSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairSairActionPerformed(evt);
            }
        });
        jMenu1Sair.add(jMenuSairSair);

        jMenuBar1.add(jMenu1Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblConexao)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblConexao)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSairSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairSairActionPerformed

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
      // Cadastro.montaTelaCliente();
        String tituloCliente;
        tituloCliente = "Gestão Cliente";
        
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setTitle(tituloCliente);
        telaCliente.setVisible(true);
        add(telaCliente, JLayeredPane.DEFAULT_LAYER);
        
        telaCliente.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCliente.setLocation(40, 5); //(ponto inicial apartir lateral,altura)
        
        /* 
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setTitle(Cadastro.tituloCliente);
        telaCliente.setVisible(true);
        telaCliente.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCliente.setLocation(50, 50);
        */
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
     
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void MenuPassageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPassageiroActionPerformed
       Cadastro.montaTelaNovoPassageiro();
    }//GEN-LAST:event_MenuPassageiroActionPerformed

    private void jMenuSobreTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreTelaActionPerformed
        // TODO add your handling code here:
        Cadastro.montaTelaAbout();
    }//GEN-LAST:event_jMenuSobreTelaActionPerformed

    private void MenuVooAeronaveCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVooAeronaveCadastrarActionPerformed
        Cadastro.montaTelaAeronave();
    }//GEN-LAST:event_MenuVooAeronaveCadastrarActionPerformed

    private void novaPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaPassagemActionPerformed
        Cadastro.montaTelaNovaPassagem();
    }//GEN-LAST:event_novaPassagemActionPerformed

    private void MenuNovoVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNovoVooActionPerformed
       Cadastro.montaTelaNewVoo();
    }//GEN-LAST:event_MenuNovoVooActionPerformed

    private void menuSobreVerificaStatusBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreVerificaStatusBancoActionPerformed
        //Cadastro.montaTelaVerificaStatusBanco();
        String tituloStatus;
        tituloStatus = "Verifica Conexao ao Banco de Dados";
        
        TelaStatusBanco telaStatus = new TelaStatusBanco();
        telaStatus.setTitle(tituloStatus);
        telaStatus.setVisible(true);
        add(telaStatus, JLayeredPane.DEFAULT_LAYER);
        
        telaStatus.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaStatus.setLocation(50, 50);
    }//GEN-LAST:event_menuSobreVerificaStatusBancoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        new TelaCadastro().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenuItem MenuNovoVoo;
    private javax.swing.JMenuItem MenuPassageiro;
    private javax.swing.JMenu MenuVoo;
    private javax.swing.JMenuItem MenuVooAeronaveCadastrar;
    private javax.swing.JMenu jMenu1Sair;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuSairSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenuItem jMenuSobreTela;
    public javax.swing.JLabel lblConexao;
    private javax.swing.JMenuItem menuSobreVerificaStatusBanco;
    private javax.swing.JMenuItem novaPassagem;
    // End of variables declaration//GEN-END:variables
}
