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
import static java.lang.Integer.parseInt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Classe Cliente DAO
 * @author deciodecarvalho
 */
public class ClienteDAO {
 public Connection conexao;
 public Statement stmt;
 public ResultSet rs;
    
    
    /**
     * método para encerrar Connection, Statement e ResutlSet
     */  
    public void close() {
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
     * Método que consulta se o cpf já está cadastrado no sistema Aerofast
     * @param cpf
     * @return boolean resposta
     */
    public boolean buscarExisteClienteCPF(String cpf){
      boolean resposta = true;
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
                 Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                rs = stmt.executeQuery("SELECT * FROM cliente WHERE cpf = '" + cpf + "'");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, reduzString(msg + ex));
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
     try {
         if (rs.first()) {
             close();
             resposta = false;
         }
     } catch (SQLException ex) {
         Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         msg=""+ex;
         JOptionPane.showMessageDialog(null, reduzString(msg));
         close();
         resposta = false;
     }
        
        return resposta;  
    }//Fim buscarExisteClienteCPF
    
    
      
    /**
     * Método para capturar dados clientes enviando cpf dele.
     * @param cpf
     * @return Retorna cliente se encontrar CPF no banco Aerofast
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
      public Cliente buscarClienteCPF(String cpf) throws ClassNotFoundException, SQLException{
        Cliente cliente = new Cliente();
        String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        //stmt = conexao.createStatement();
        stmt =conexao.createStatement(
                       ResultSet.TYPE_SCROLL_INSENSITIVE, 
                       ResultSet.CONCUR_READ_ONLY);
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
             close();
                     
            return cliente;
           
        } else {
           msg="Cliente não encontrado";
           JOptionPane.showMessageDialog(null, msg);
           close();
           return null;
       }
    
        
      }
    
     /**
     * Método para inserir novo Ciente ao Banco de Dados.
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
            stmt.execute(sql);
           
            msg = msg+"Dados do cliente inseridos com sucesso \n";
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
         
    }//fim inserir cliente
    
     public void alterarCliente(Cliente cliente, String vcpf) throws ClassNotFoundException, SQLException{
        String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        stmt = conexao.createStatement();
        /*
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

        //
        idCliente int not null, 
        nome VARCHAR(60)not null,
        nascimento VARCHAR(10)not null,
        endereco VARCHAR(60)not null,
        numero VARCHAR(30)not null,
        bairro VARCHAR(60)not null,
        cidade VARCHAR(60)not null,
        uf VARCHAR(2)not null,
        cep VARCHAR(10)not null,
        email VARCHAR(60)not null,
        telefone VARCHAR(18)not null,
        RG VARCHAR(16)not null,
        CPF VARCHAR(18)not null primary key
        */
        
        String sql = "UPDATE cliente c SET CPF = "+"'cliente.getCpf()'"+" WHERE "+"'vcpf'"+" = c.CPF";        
                
        
        
        System.out.println("sql = "+sql);
        try {
            stmt.execute(sql);
           
            msg = msg+"Dados do cliente inseridos com sucesso \n";
           // JOptionPane.showMessageDialog(null, msg );
        } catch (SQLException | HeadlessException e) {
            msg = reduzString(msg+e);
            msg = reduzString(msg);
            msg = msg+"Erro de gravação no BD \n";
           // JOptionPane.showMessageDialog(null,msg );
        }
        close();
        if (conexao.isClosed()){
         msg = msg+"Conexão ao banco fechada";
         JOptionPane.showMessageDialog(null,msg );   
        }
         
    }//fim inserir cliente
    
    
   
}
