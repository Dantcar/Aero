/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
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
    
    public void inserirNovoCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql = "INSERT INTO cliente VALUES ("
                + "'" + cliente.getNome() + "', "
                + "'" + cliente.getCpf() + "', "
                //+ "" + cliente.getRenda() + ", "
                + "" + cliente.getEmail() + ")";
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados do cliente inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Erro de gravação no BD");
    }
    
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection con;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Aerofast", "DAC", "12345");
        return con;
    }
    public Connection getConnection1() throws ClassNotFoundException, SQLException{
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aerofast", "DAC", "");
        return con;
    }
}
