/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programacao Orientada a Objetos - Avancada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */

package Control;


import model.DBAeroFast;
import view.TelaAbout;
import view.TelaAeronave;
import view.TelaCadastro;
import view.TelaCliente;
import view.TelaNovoVoo;
//import view.TelaPassageiro;
//import view.TelaPassagem;
import view.TelaNovaPassagem;
import view.TelaNovoPassageiro;
//import view.TelaVoo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author Décio
 */
public class Cadastro{

    private static String titulo;
    private static String tituloCliente;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DBAeroFast db;
        db = new DBAeroFast();
        montaTelaPrincipal();  
    }

    public Cadastro() {
   
    
    }
      
    /**
     * método para criar a tela inicial
     */
    public static void montaTelaPrincipal(){
        Cadastro.titulo = "Passagens Aéreas FastFly";
        
        TelaCadastro tela = new TelaCadastro();
        tela.setTitle(Cadastro.titulo);
       
        //tela.setLocation(300, 200);
        
        tela.setVisible(true);

        if (!DBAeroFast.acesso)
            tela.lblConexao.setText("Desconectado");
        else
            tela.lblConexao.setText("Conectado");  
    }
     /**
     * método para criar a tela inicial
     */
    public static void montaTelaCliente(){
        Cadastro.tituloCliente = "Cadastro de Clientes";
        
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setTitle(Cadastro.tituloCliente);
        telaCliente.setVisible(true);
        telaCliente.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCliente.setLocation(50, 50);
       
    }
     public static void montaTelaNovoPassageiro(){
        Cadastro.tituloCliente = "Cadastro de Passageiro";
        
        TelaNovoPassageiro telaPassageiro = new TelaNovoPassageiro();
        telaPassageiro.setTitle(Cadastro.tituloCliente);
        telaPassageiro.setVisible(true);
        telaPassageiro.setDefaultCloseOperation(1);
        telaPassageiro.setLocation(50, 50);
       
    }
     /**
      * A chamada a tela abaixo foi substituida pela telaNovaPassagem
      */
     /*public static void montaTelaPassagem(){
        Cadastro.tituloCliente = "Venda Passagem";
        
        TelaPassagem telaPassagem = new TelaPassagem();
        telaPassagem.setTitle(Cadastro.tituloCliente);
        telaPassagem.setVisible(true);
        telaPassagem.setDefaultCloseOperation(1);
        telaPassagem.setLocation(50, 50);
       
    }*/
    
     public static void montaTelaNovaPassagem(){
        Cadastro.tituloCliente = "Venda Passagem";
        Cadastro.titulo = "Passagens Aéreas FastFly";
        
        TelaNovaPassagem tela = new TelaNovaPassagem();
        tela.setTitle(Cadastro.titulo);
        tela.setResizable(false);
        //tela.setAlwaysOnTop(true);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(1);
        tela.setLocation(50, 10);
       
    }
     /*
    public static void montaTelaPassagem(String P){
        Cadastro.tituloCliente = "Consulta Passagem";
        TelaPassagem telaPassagem = new TelaPassagem();
        telaPassagem.setTitle(Cadastro.tituloCliente);
        telaPassagem.setVisible(true);
        telaPassagem.setDefaultCloseOperation(1);
        telaPassagem.setLocation(50, 50);
    }
    */
     
    public static void montaTelaAbout(){
        Cadastro.tituloCliente = "About AeroFast";
        
        TelaAbout telaAbout = new TelaAbout();
        telaAbout.setTitle(Cadastro.tituloCliente);
        telaAbout.setVisible(true);
        telaAbout.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAbout.setLocation(50, 50);
       
    }
    public static void montaTelaAeronave(){
        Cadastro.tituloCliente = "Cadastro Aeronave";
        
        TelaAeronave telaAero = new TelaAeronave();
        telaAero.setTitle(Cadastro.tituloCliente);
        telaAero.setVisible(true);
        telaAero.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAero.setLocation(50, 50);
        
    }
    
    /*public static void montaTelaVoo(){
        Cadastro.tituloCliente = "Cadastro Voo";
        
        TelaVoo telaVoo = new TelaVoo();
        telaVoo.setTitle(Cadastro.tituloCliente);
        telaVoo.setVisible(true);
        telaVoo.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaVoo.setLocation(50, 50);
        
    }*/
    
    public static void montaTelaNewVoo(){
        Cadastro.tituloCliente = "Cadastro Voo";
        
        TelaNovoVoo telaNewVoo = new TelaNovoVoo();
        telaNewVoo.setTitle(Cadastro.tituloCliente);
        telaNewVoo.setVisible(true);
        telaNewVoo.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaNewVoo.setLocation(50, 50);
        
    }
}
