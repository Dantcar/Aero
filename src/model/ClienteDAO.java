/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programacao Orientada a Objetos - Avancada
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

/**
 * 
 * @author deciodecarvalho
 */
public class ClienteDAO {
 private Connection conexao;
 private Statement stmt;
 private ResultSet rs;
 public int idClienteNow = 0;
    public ClienteDAO() {
    }
    
    
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
          String msg = "" + e;
          JOptionPane.showMessageDialog(null, reduzString(msg));
    }
    }//fim close()
     
    /**
     * Método para atualizar com o idCliente de 
     * maior valor ao iniciar o programa
     * @return 
     */
 @SuppressWarnings("null")
    public int buscarIdClienteAtual(){
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
                 Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                rs = stmt.executeQuery("SELECT * FROM cliente ORDER BY 1 DESC"); //select * from DAC.CLIENTE order BY 1 DESC
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, reduzString(msg + ex));
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
     try {
         if (rs.first()) {
             idClienteNow = rs.getInt(1);
             resposta = idClienteNow;
             
             close();
            }
     } catch (SQLException ex) {
         Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         msg=""+ex;
         JOptionPane.showMessageDialog(null, reduzString(msg));
         close();
         resposta = 0;
     }
     
     return resposta;
    }//fim buscar idClienteAtual
    
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
    
        
      }// fim buscar cliente CPF
    
      
       public Cliente buscarClienteRG(String rg) throws ClassNotFoundException, SQLException{
        Cliente cliente = new Cliente();
        String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        //stmt = conexao.createStatement();
        stmt =conexao.createStatement(
                       ResultSet.TYPE_SCROLL_INSENSITIVE, 
                       ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT * FROM cliente WHERE rg = '" + rg + "'");
       if(rs.first()){
        
            cliente.setIdCliente(rs.getString(1));
            cliente.setNome(rs.getString(2));
            cliente.setNascimento(rs.getString(3));
            cliente.setEndereco(rs.getString(4));
            cliente.setNumero(rs.getString(5));
            cliente.setBairro(rs.getString(6));
            cliente.setCidade(rs.getString(7));
            cliente.setUf(rs.getString(8));
            cliente.setCep(rs.getString(9));
            cliente.setEmail(rs.getString(10));
            cliente.setTelefone(rs.getString(11));
            cliente.setRg(rs.getString(12));
            cliente.setCpf(rs.getString(13));
             close();
                        
            return cliente;
           
        } else {
           msg="Cliente não encontrado";
           JOptionPane.showMessageDialog(null, msg);
           close();
           return null;
       }
    
        
      }// fim buscar cliente
     /**
     * Método para inserir novo Ciente ao Banco de Dados.
     * @param cliente
     * @throws ClassNotFoundException
     * @throws SQLException 
     */  
    public void inserirNovoCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        String msg;
        
        int idCliente = buscarIdClienteAtual();
        //System.out.println(idCliente);
        idCliente = idCliente + 1;
        
        //System.out.println("\nEste id vai pro banco :"+idCliente);
        msg="";
        conexao = DBAeroFast.getConnection();
        stmt = conexao.createStatement();
        String sql = "INSERT INTO cliente VALUES ("
                //+ parseInt(cliente.getIdCliente()) +", "
                + idCliente +", "
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
    
    /**
     * método para realizar qualquer ateração no cadastro do cliente.
     * @param cliente
     * @param vcpf
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
     public void alterarCliente(Cliente cliente, String vcpf) throws ClassNotFoundException, SQLException{
        String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        stmt = conexao.createStatement();
        
        //String sql = "UPDATE cliente SET " + "CPF = '"+ cliente.getCpf()+ "' WHERE CPF = '" + vcpf + "'" ;    
        String sql = "UPDATE cliente SET "
                //+ "idCliente = "+ parseInt(cliente.getIdCliente())+", "
                + "nome = '" + cliente.getNome() + "', "
                + "nascimento = '" + cliente.getNascimento() + "', "
                + "endereco = '" + cliente.getEndereco() + "', "
                + "numero = '" + cliente.getNumero() + "', "
                + "bairro = '" + cliente.getBairro() + "', "
                + "cidade = '" + cliente.getCidade() + "', "
                + "uf = '" + cliente.getUf() + "', "
                + "cep = '" + cliente.getCep() + "', "
                + "email = '" + cliente.getEmail() + "', "
                + "telefone = '"+ cliente.getTelefone() + "', "
                + "RG = '"+ cliente.getRg() + "', "
                + "CPF = '"+ cliente.getCpf()+ "' "
                + " WHERE CPF = '" + vcpf + "'";
        
        try {
            stmt.execute(sql);
           
            msg = msg+"Dados do cliente alterados com sucesso \n";
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
         
    }//fim alterar cliente

    /**
     * método para deletar o cliente selecionado após nova confirmação.
     * @param cliente
     * @param cpf 
     */
     public void deletarCliente(Cliente cliente, String vcpf) throws SQLException {
        String msg;
        msg="";
        
        conexao = DBAeroFast.getConnection();
     try {
         stmt = conexao.createStatement();
     } catch (SQLException ex) {
         msg = msg+ex;
         msg = reduzString(msg);
         Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        String sql ="DELETE FROM cliente WHERE CPF = '" + vcpf + "'";
               
        try {
            int n = JOptionPane.showConfirmDialog(
            null,
            "Confirma Deletar Cliente?",
            "Confirmar Deletar Cliente",
            JOptionPane.YES_NO_OPTION);
            if(true){
            stmt.execute(sql);
            }
            
            msg = msg+"Dados do cliente excluidos com sucesso \n";
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
        
    }//fim deletar cliente
    
} // final da classe ClienteDAO
