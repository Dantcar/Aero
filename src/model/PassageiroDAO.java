/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package model;

import static Control.Util.reduzString;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class PassageiroDAO {
private Connection conexao;
private Statement stmt;
private ResultSet rs;
public int idPassageiroNow = 0;
/**
     * método para encerrar Connection, Statement e ResutlSet
     */  
    private void close() {
        try {
            if (rs != null) {
            rs.close();
            }
            
            if (stmt != null) {
            stmt.close();
            }
            
            if (conexao != null) {
            conexao.close();
            }
        } catch (Exception e) {
        }
    }//fim close()

/**
     * Método para atualizar com o idCliente de 
     * maior valor ao iniciar o programa
     * @return 
     */
 @SuppressWarnings("null")
    public int buscarIdPassageiroAtual(){
      int resposta=0;  
      String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
            try {
                 stmt =conexao.createStatement(
                 ResultSet.TYPE_SCROLL_INSENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, reduzString(msg + ex));
                 Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                rs = stmt.executeQuery("SELECT * FROM passageiro ORDER BY 1 DESC"); //select * from DAC.CLIENTE order BY 1 DESC
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, reduzString(msg + ex));
                Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
     try {
         if (rs.first()) {
             idPassageiroNow = rs.getInt(1);
             resposta = idPassageiroNow;
             
             close();
            }
     } catch (SQLException ex) {
         Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE, null, ex);
         msg=""+ex;
         JOptionPane.showMessageDialog(null, reduzString(msg));
         close();
         resposta = 0;
     }
     
     return resposta;
    }//fim buscar idPassageiroAtual
    
    public void inserirNovoPassageiro(Passageiro passageiro) throws ClassNotFoundException, SQLException{
        String msg;
        
                
        int idPassageiro = buscarIdPassageiroAtual();
        System.out.println(idPassageiro);
        idPassageiro = idPassageiro + 1;
        
        System.out.println("\nEste id vai pro banco :"+idPassageiro);
        msg="";
        conexao = DBAeroFast.getConnection();
        stmt = conexao.createStatement();
        String sql = "INSERT INTO passageiro VALUES ("
                //+ parseInt(passageiro.getIdCliente()) +", "
                + idPassageiro +", "
                + "'" + passageiro.getNomePassageiro() + "', "
                + "'" + passageiro.getNascimentoPassageiro() + "', "
                + "'" + passageiro.getRgPassageiro()+ "', "
                + "'" + passageiro.getTelefonePassageiro() + "', "
                + "'" + passageiro.getEmailPassageiro() + "', "
                + "'" + passageiro.getContatoNome() + "', "
                + "'" + passageiro.getResponsavelFinanceiro() + "', "
                + "'" + passageiro.getResponsavelCPF() + "')";

        try {
            stmt.execute(sql);
           
            msg = msg+"Dados do passageiro inseridos com sucesso \n";
           // JOptionPane.showMessageDialog(null, msg );
        } catch (SQLException | HeadlessException e) {
            msg = reduzString(msg+e);
            msg = msg+"Erro de gravação no BD \n";
           // JOptionPane.showMessageDialog(null,msg );
        }
        close();
        if (conexao.isClosed()){
         msg = msg+"Conexão ao banco fechada";
         JOptionPane.showMessageDialog(null,msg );   
        }
         
    }//fim inserir passageiro
    
    


}
