/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programacao Orientada a Objetos - Avancada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */

package model;

/**
 *
 * @author Décio
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBAeroFast {
 
    /**
     *con
     */
  public static Connection con;
  private static String url;
  private static String usuario;
  private static String senha;
  public static boolean acesso;
  public DBAeroFast(){
  
      url ="jdbc:derby://localhost:1527/Aerofast";
      //usuario ="DAC"; //EM CASA
      usuario ="dac";
      //senha = "12345";
      senha="12345";
      try{
          System.out.println("Tentativa de conexao");
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection(url, usuario, senha);
      System.out.println("Ok conexao com o banco: "+url +" estabelecida");
          acesso=true;
      }catch (ClassNotFoundException e){ 
      
      }catch (SQLException e){
      System.out.println("Falhou conexao");
            acesso=false;
      }
   
  }
  /**
   * método para inclusao de registros no Banco Tutor1
     * @param nome
     * @param nasc
     * @param ende
     * @param email
     * @param rg
     * @param cpf
     * @throws java.sql.SQLException
   */
  public void incluirDados(String nome, String nasc, String ende, String email, String rg, String cpf) throws SQLException{
     // url ="INSERT INTO ROOT.Cliente VALUES('"+nome+"','"+nasc+"','"+ende+"','"+email+"','"+rg+"','"+cpf+"')";  
      Statement stm = con.createStatement();
      stm.executeUpdate("INSERT INTO ROOT.Clientes VALUES('"+nome+"','"+nasc+"','"+ende+"','"+email+"','"+rg+"','"+cpf+"')");
  }
  
  public static Connection capturaConexao(){
       con = null;
      try{
          System.out.println("Tentativa de conexao");
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection(url, usuario, senha);
          // System.out.println("Ok conexao com o banco: "+url +" estabelecida");
         
      }catch (ClassNotFoundException e){ 
      
      }catch (SQLException e){
      //System.out.println("Falhou conexao");
            acesso=false;
      }
      
      return con;
  }
  
  /**
   * Classe booleana que verifica se o acesso a base de dados
   * Aerofast esta disponível e estabelecida
   * @return true caso consiga conectar ao banco Aerofast
   */
  public boolean verificaConexao(){
      boolean con1=false;
      url ="jdbc:derby://localhost:1527/Aerofast";
      usuario ="dac"; //em casa alterar para "DAC"
      senha = "12345";
      
      try{
          System.out.println("Tentativa de conexao");
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection(url, usuario, senha);
          //System.out.println("Ok conexao com o banco: "+url +" estabelecida");
          con1=true;
      }catch (ClassNotFoundException e){ 
      
      }catch (SQLException e){
      //System.out.println("Falhou conexao");
            con1=false;
      }
      
      return con1;
  }
  /**
   * método para criar tabelas no banco
     * @return Conexao
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
   */
   public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection con3;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con3 = DriverManager.getConnection("jdbc:derby://localhost:1527/Aerofast", "dac", "12345");
        //con = DriverManager.getConnection("jdbc:derby://localhost:1527/Aerofast", "DAC", "12345");
        return con3;
    }
    public static Connection getConnection1() throws ClassNotFoundException, SQLException{
        Connection con2;
        Class.forName("com.mysql.jdbc.Driver");
        con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aerofast", "DAC", "");
        return con2;
    }
  
  /**
     * 
     * @param user //login do novo usuário Derby
     * @param password  //senha do novo usuário Derby
     * @return true se criar novo usuário
     * @throws ClassNotFoundException 
     */
    public static boolean criarUsuarioDerby(String user, String password) throws ClassNotFoundException{
        boolean resultado;
        String propriedade;
        resultado = false;
        try{
            try { 
                Connection con1;
                con1 = getConnection();
            // Carregar a classe do driver cliente da rede do Derby
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // Definir as propriedades usuário e senha
            Properties properties = new Properties();
            properties.put(user, password);
            propriedade = properties.getProperty(user, url);
            System.out.println(propriedade);
            resultado = true;
            } catch (SQLException ex) {
                Logger.getLogger(DBAeroFast.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
        }
        catch (ClassNotFoundException e){
            
        }    
   
       return resultado;
    
    }
    
  public void criaTabelas(){
     /*Statement stm = con.createStatement();
     stm.executeUpdate("CREATE TABLE ROOT.Clientes ("
      +""
      +""
      +")"); */
      
  }
    
}
