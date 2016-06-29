/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programacao Orientada a Objetos - Avancada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package view;

import Control.Cadastro;import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JLayeredPane;
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
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/Icones/iconePrincipal.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
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
        Menu_Relatorios = new javax.swing.JMenu();
        MenuRelatorioPassagem = new javax.swing.JMenuItem();
        MenuRelatorioClientes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuSobreTela = new javax.swing.JMenuItem();
        jMenu1Sair = new javax.swing.JMenu();
        jMenuSairSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AeroFast");
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusTraversalPolicyProvider(true);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(400, 200));

        jPanel1.setLayout(new java.awt.BorderLayout());

        lblConexao.setText(" ");
        lblConexao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblConexao.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jPanel1.add(lblConexao, java.awt.BorderLayout.CENTER);

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

        MenuNovoVoo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        MenuNovoVoo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuNovoVoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voos-on-line.png"))); // NOI18N
        MenuNovoVoo.setText("VOO");
        MenuNovoVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNovoVooActionPerformed(evt);
            }
        });
        MenuVoo.add(MenuNovoVoo);

        MenuVooAeronaveCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        MenuVooAeronaveCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuVooAeronaveCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/aeronave 40x40.jpg"))); // NOI18N
        MenuVooAeronaveCadastrar.setText("Aeronave");
        MenuVooAeronaveCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVooAeronaveCadastrarActionPerformed(evt);
            }
        });
        MenuVoo.add(MenuVooAeronaveCadastrar);

        jMenuBar1.add(MenuVoo);

        Menu_Relatorios.setText("Relatórios");
        Menu_Relatorios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        MenuRelatorioPassagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuRelatorioPassagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuRelatorioPassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/infraero/aeroshopping.png"))); // NOI18N
        MenuRelatorioPassagem.setText("Passagem");
        MenuRelatorioPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioPassagemActionPerformed(evt);
            }
        });
        Menu_Relatorios.add(MenuRelatorioPassagem);

        MenuRelatorioClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuRelatorioClientes.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        MenuRelatorioClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Cliente verde 40x40.jpg"))); // NOI18N
        MenuRelatorioClientes.setText("Cliente");
        MenuRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioClientesActionPerformed(evt);
            }
        });
        Menu_Relatorios.add(MenuRelatorioClientes);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/aeronave 40x40.jpg"))); // NOI18N
        jMenuItem1.setText("Voos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu_Relatorios.add(jMenuItem1);

        jMenuBar1.add(Menu_Relatorios);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2831, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        add(telaCliente, JLayeredPane.DRAG_LAYER);
        
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
      // Cadastro.montaTelaNovoPassageiro();
        String tituloPassageiro ;
        tituloPassageiro = "Gestão Passageiro";
        
        TelaNovoPassageiro telaPassageiro = new TelaNovoPassageiro();
        telaPassageiro.setTitle(tituloPassageiro);
        telaPassageiro.setVisible(true);
        //add(telaPassageiro, JLayeredPane.DRAG_LAYER);
        add(telaPassageiro, JLayeredPane.DEFAULT_LAYER);
        telaPassageiro.setDefaultCloseOperation(1);
        telaPassageiro.setLocation(40, 5);
    }//GEN-LAST:event_MenuPassageiroActionPerformed

    private void jMenuSobreTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreTelaActionPerformed
        // TODO add your handling code here:
        Cadastro.montaTelaAbout();
    }//GEN-LAST:event_jMenuSobreTelaActionPerformed

    private void MenuVooAeronaveCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVooAeronaveCadastrarActionPerformed
        //Cadastro.montaTelaAeronave();
        String tituloAeronave;
        tituloAeronave = "Gestão Aeronave";
        
        TelaAeronave telaAeronave = new TelaAeronave();
        telaAeronave.setTitle(tituloAeronave);
        telaAeronave.setVisible(true);
        add(telaAeronave, JLayeredPane.DEFAULT_LAYER);      
        telaAeronave.setDefaultCloseOperation(1);
        telaAeronave.setLocation(40, 5);
    }//GEN-LAST:event_MenuVooAeronaveCadastrarActionPerformed

    private void novaPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaPassagemActionPerformed
       //Cadastro.montaTelaNovaPassagem();
       
        String tituloPassagem;
        tituloPassagem = "Gestão Passagem";
        
        TelaNovaPassagem telaPassagem = new TelaNovaPassagem();
        telaPassagem.setTitle(tituloPassagem);
        telaPassagem.setVisible(true);
        add(telaPassagem, JLayeredPane.DEFAULT_LAYER);      
        telaPassagem.setDefaultCloseOperation(1);
        telaPassagem.setLocation(40, 5);
        
    }//GEN-LAST:event_novaPassagemActionPerformed

    private void MenuNovoVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNovoVooActionPerformed
      //Cadastro.montaTelaNewVoo();
        
        String tituloStatus;
        tituloStatus ="Gestão Voo";
        
        TelaNovoVoo telaVoo = new TelaNovoVoo();
        telaVoo.setTitle(tituloStatus);
        telaVoo.setVisible(true);
        add(telaVoo, JLayeredPane.DEFAULT_LAYER);
        telaVoo.setDefaultCloseOperation(1);
        telaVoo.setLocation(40, 5);
    }//GEN-LAST:event_MenuNovoVooActionPerformed

    private void MenuRelatorioPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioPassagemActionPerformed
        String tituloStatus;
        tituloStatus = "Relatórios Passagens";
        
        TelaRelatorioPassagem relPassagem = new TelaRelatorioPassagem();
        relPassagem.setTitle(tituloStatus);
        relPassagem.setVisible(true);
        add(relPassagem, JLayeredPane.DEFAULT_LAYER);
        relPassagem.setDefaultCloseOperation(1);
        relPassagem.setLocation(40, 50);
    }//GEN-LAST:event_MenuRelatorioPassagemActionPerformed

    private void MenuRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioClientesActionPerformed
        String tituloStatus;
        tituloStatus = "Relatórios Clientes";
        
        TelaRelatorioClientes relCliente = new TelaRelatorioClientes();
        relCliente.setTitle(tituloStatus);
        relCliente.setVisible(true);
        add(relCliente, JLayeredPane.DEFAULT_LAYER);
        relCliente.setDefaultCloseOperation(1);
        relCliente.setLocation(40, 50);
        
        
    }//GEN-LAST:event_MenuRelatorioClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        String tituloStatus;
        tituloStatus = "Relatórios Voos";
        
        TelaRelatorioVoo relVoo = new TelaRelatorioVoo();
        relVoo.setTitle(tituloStatus);
        relVoo.setVisible(true);
        add(relVoo, JLayeredPane.DEFAULT_LAYER);
        relVoo.setDefaultCloseOperation(1);
        relVoo.setLocation(40, 50);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenuItem MenuRelatorioClientes;
    private javax.swing.JMenuItem MenuRelatorioPassagem;
    private javax.swing.JMenu MenuVoo;
    private javax.swing.JMenuItem MenuVooAeronaveCadastrar;
    private javax.swing.JMenu Menu_Relatorios;
    private javax.swing.JMenu jMenu1Sair;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuSairSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenuItem jMenuSobreTela;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblConexao;
    private javax.swing.JMenuItem novaPassagem;
    // End of variables declaration//GEN-END:variables
}
