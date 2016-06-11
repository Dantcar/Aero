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

/**
 * *
 *
 * @author deciodecarvalho
 */
public class AeronaveDAO {

    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idAeronaveNow = 0;

    /**
     * método para encerrar Connection, Statement e ResutlSet
     */
    private void close() {
        String msg ="";
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
            msg = msg + e + "\n";
            msg = reduzString(msg);
        }
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        msg="";
    }//fim close()

    /**
     * Método para buscar ultimo idAeronave
     * Revisao 0.1
     * @return
     */
    public int buscarIdAeronaveAtual() {
        int resposta = 0;
        String msg = "";
        String sql = "SELECT * FROM aeronave ORDER BY 1 DESC";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql); //select * from DAC.AERONAVE order BY 1 DESC

        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                idAeronaveNow = rs.getInt(1);
                resposta = idAeronaveNow;
            }
        } catch (SQLException ex) {
           msg = msg + ex + "\n";
           msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        try {
            if(conexao.isClosed()){   
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        msg="";
        return resposta;

    }//fim buscar idAeronaveAtual

    /**
     * Método para verificar se existe a aernovae pelo prefixo
     *
     * @param prefixo
     * @return
     */
    public boolean buscarExisteAeronavePrefixo(String prefixo) {
        boolean resposta = true;
        String msg = "";
        String sql ="SELECT * FROM aeronave WHERE prefixo = '" + prefixo + "'";
        
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
        
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                resposta = false;
            }
        } catch (SQLException ex) {
            msg = "" + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();

        try {
            if (!conexao.isClosed()) {
                msg = msg + "Conexão ao banco nao  fechada.\n";
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, reduzString(msg)); 
        }
        msg="";
        
        return resposta;
    }// fim buscarExisteAeronavePrefixo

    /**
     * Método para buscar uma aeronave enviando o prefixo
     *
     * @param prefixo
     * @return
     */
    public Aeronave buscarAeronavePrefixo(String prefixo) {
        Aeronave aeronave = new Aeronave();
        String msg = "";
        String sql = "SELECT * FROM aeronave WHERE prefixo = '" + prefixo + "'";

        conexao = DBAeroFast.getConnection();
        ResultSet rs = null;
        
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if (rs.first()) {
                aeronave.setIdAeronave(rs.getString(1));
                aeronave.setPrefixo(rs.getString(2));
                aeronave.setSeatEconomyClasse(rs.getInt(3));
                aeronave.setSeatFirstClasse(rs.getInt(4));
                aeronave.setSeatBusinesClasse(rs.getInt(5));
                aeronave.setModelo(rs.getString(6));
                aeronave.setFabricante(rs.getString(7));
                aeronave.setOperadora(rs.getString(8));
            } else {
                aeronave = null;
            }
            
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        
        try {
            if (conexao.isClosed()) {   
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        
        msg="";
        return aeronave;
    }//fim buscarAeronavePrefixo

    /**
     * Método para inserir nova aeronave na base de dados Aerofast
     *
     * @param aeronave
     * @throws SQLException
     */
    public void inserirNovaAeronave(Aeronave aeronave) {
        String msg = "";
        String sql;
        
        int idAeronave = buscarIdAeronaveAtual();
        System.out.println(idAeronave);
        idAeronave = idAeronave + 1;
        int bc = aeronave.getSeatBusinesClasse();
        int fc = aeronave.getSeatFirstClasse();
        int ec = aeronave.getSeatEconomyClasse();

        //System.out.println("\nEste id vai pro banco:" + idAeronave + "bc: "+ bc+"fc: "+fc+"ec: "+ec);

        conexao = DBAeroFast.getConnection();
        
        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
             msg = msg + ex + "\n";
             msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql = "INSERT INTO aeronave VALUES ("
                + idAeronave + ", "
                + "'" + aeronave.getPrefixo() + "', "
                +  ec + ", "
                +  fc + ", "
                +  bc + ", "
                + "'" + aeronave.getModelo() + "', "
                + "'" + aeronave.getFabricante() + "', "
                + "'" + aeronave.getOperadora() + "')";

        try {
            //System.out.println("Esta é minha SQL: " + sql);
            if (stmt.execute(sql));
            msg = msg + "Dados da aeronave inseridos com sucesso. \n";
        } catch (SQLException e) {
            msg = msg + e + "\n";
            msg = msg + "Erro de gravação no BD. \n";
            msg = reduzString(msg);
        }
        close();
        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada.\n";
                
            }
        } catch (SQLException ex) {
                msg = msg + ex;
                msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        msg="";
    } //fim inserirAeronave

    /**
     * Método para realizar alterações na Base dados Aeronave
     * @versao 0.1
     * @param aeronave
     * @param vprefixo
     * @throws SQLException
     */
    public void alterarAeronave(Aeronave aeronave, String vprefixo)  {
        String msg = "";
        conexao = DBAeroFast.getConnection();
        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "UPDATE aeronave SET "
                + "prefixo = '" + aeronave.getPrefixo() + "', "
                + "seateconomyclasse = " + aeronave.getSeatEconomyClasse() + ", "
                + "seatfirstclasse = " + aeronave.getSeatFirstClasse() + ", "
                + "seatbusinesclasse = " + aeronave.getSeatBusinesClasse() + ", "
                + "modelo = '" + aeronave.getModelo() + "', "
                + "fabricante = '" + aeronave.getFabricante() + "', "
                + "operadora = '" + aeronave.getOperadora() + "' "
                + " WHERE prefixo = '" + vprefixo + "'";

        try {
            stmt.executeUpdate(sql);
            System.out.println("Esta é minha SQL: " + sql);
            msg = msg + "Dados da aeronave alterados com sucesso. \n";
           
        } catch (SQLException | HeadlessException e) {
            msg = reduzString(msg + e);
            msg = reduzString(msg);
            msg = msg + "Erro de gravação no BD. \n"; // JOptionPane.showMessageDialog(null,msg );
        }
        close();
        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada" +"\n";
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        msg = "";
    }//fim método alterarAeronave v0.1

    /**
     * Método para deletar uma aeronave do banco Aerofast enviando o seu prefixo
     *
     * @param aeronave
     * @param vprefixo
     */
    public void deletarAeronave(Aeronave aeronave, String vprefixo) {
        String msg = "";
        String sql = "DELETE FROM aeronave WHERE prefixo = '" + vprefixo + "'";
                          
        if ((JOptionPane.showConfirmDialog(
                    null,
                    "Confirma Deletar Aeronave Prefixo: "+ vprefixo +"?",
                    "Confirmar Deletar Aeronave",
                    JOptionPane.YES_NO_OPTION))          
            == JOptionPane.YES_OPTION){
            
            conexao = DBAeroFast.getConnection();
            
            try {
                    stmt = conexao.createStatement();
                 } catch (SQLException ex) {
                    msg = msg + ex;
                    msg = reduzString(msg);
                    Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            try {
                    stmt.executeUpdate(sql); 
                    msg = msg + "Dados da aeronave excluidos com sucesso \n";
                    
                } catch (SQLException | HeadlessException e) {
                    msg = reduzString(msg + e);
                    msg = reduzString(msg);
                    msg = msg + "Erro de gravação no BD \n";
                   
                }
                        
            } else { 
             
            }         
             
        close();
       
        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada\n";
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
         msg = "";
    }//fim deletarAeronave

}
