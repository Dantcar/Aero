/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package model;

import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author deciodecarvalho
 */
public class ClienteDAO {
 Connection conexao;
    Statement stmt;
    ResultSet rs;
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
    }
    /**
     * Método para inserir novo Ciente ao Banco de Dados
     * @param cliente
     * @throws ClassNotFoundException
     * @throws SQLException 
     */  
    public void inserirNovoCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        stmt = conexao.createStatement();
        String sql = "INSERT INTO cliente VALUES ("
                + parseInt(cliente.getIdCliente()) +", "
                + "'" + cliente.getNome() + "', "
                + "'" + cliente.getNascimento() + "', "
                + "'" + cliente.getEndereco() + "', "
                + "'" + cliente.getNumero() + "', "
                + "'" + cliente.getBairro() + "', "
                + "'" + cliente.getCidade() + "', "
                + "'" + cliente.getUf() + "', "
                + "'" + cliente.getCep() + "', "
                + "'" + cliente.getEmail() + "', "
                + "'" + cliente.getTelefone() + "', "
                + "'" + cliente.getRg() + "', "
                + "'" + cliente.getCpf() + "')";
        System.out.println("sql = "+sql);
        try {
            stmt.executeUpdate(sql);
           
            msg = msg+"Dados do cliente inseridos com sucesso \n";
           // JOptionPane.showMessageDialog(null, msg );
        } catch (SQLException | HeadlessException e) {
            msg = msg+"Erro de gravação no BD \n"+e+"\n";
           // JOptionPane.showMessageDialog(null,msg );
        }
        close();
        if (conexao.isClosed()){
         msg = msg+"Conexão ao banco fechada";
         JOptionPane.showMessageDialog(null,msg );   
        }
        
        /*
        if(stmt.executeUpdate(sql) > 0){
            JOptionPane.showMessageDialog(null, "Dados do cliente inseridos com sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro de gravação no BD");
        }
        */   
         
    }
    
    
   
}
