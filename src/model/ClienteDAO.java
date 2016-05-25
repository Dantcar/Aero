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
    
      public Cliente buscarClienteCPF(String cpf) throws ClassNotFoundException, SQLException{
        Cliente cliente = new Cliente();
        String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM cliente WHERE cpf = '" + cpf + "'");
       if(rs.first()){
            //cliente.idCliente
            cliente.setIdCliente(rs.getString(1));
            //cliente.nome;
            cliente.setNome(rs.getString(2));
            //cliente.nascimento;
            cliente.setNascimento(rs.getString(3));
            //cliente.endereco;
            cliente.setEndereco(rs.getString(4));
            //clente.Numero;
            cliente.setNumero(rs.getString(5));
            //cliente.Bairro;
            cliente.setBairro(rs.getString(6));
            //cliente.cidade;
            cliente.setCidade(rs.getString(7));
            //cliente.uf;
            cliente.setUf(rs.getString(8));
            //cliente.cep;
            cliente.setCep(rs.getString(9));
            //cliente.email;
            cliente.setEmail(rs.getString(10));
            //cliente.telefone;
            cliente.setTelefone(rs.getString(11));
            //cliente.rg;
            cliente.setRg(rs.getString(12));
            //cliente.cpf;
            cliente.setCpf(rs.getString(13));
            return cliente;
        } else {
           msg="Cliente não encontrado";
           JOptionPane.showMessageDialog(null, msg);
           return null;
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
