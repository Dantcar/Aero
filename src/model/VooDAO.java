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
public class VooDAO {
    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idVooNow=0;

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
     * Método para buscar o último id de voo para usar na inclusão de voo
     * @return 
     */
    public int buscarIdVooAtual(){
        int resposta = 0;
        String msg="";
        String sql = "SELECT * FROM voo ORDER BY 1 DESC";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
        
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if (rs.first()){
                idVooNow = rs.getInt("voo");
                resposta = idVooNow;                
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        return resposta;
    }// fim método buscarIdVooAtual
    
    /**
     * Consultar se existe um determinado numero de voo.
     * @param vooNumero
     * @return 
     */
    public boolean buscarIdVooNumero(String vooNumero){
      boolean resposta = true;
      String msg = "";
      String sql ="SELECT * FROM voo WHERE numerovoo = '" + vooNumero + "'";
      conexao = DBAeroFast.getConnection();
      ResultSet rs;
      rs = null;
      
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        try {
            if(rs.first()){ 
                resposta = false;
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      return resposta;
    }//fim do método BuscarIdVooNumero
    
    /**
     * Método para enviar um voo através da entrada de seu número.
     * @param vooNumero
     * @return
     * @throws SQLException 
     */
    public Voo buscarVooNumero(String vooNumero) throws SQLException{
        Voo voo = new Voo();
        String msg = "";
        String sql = "SELECT * FROM voo WHERE numerovoo = '" + vooNumero + "'";
        
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        stmt = conexao.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery(sql);
                
        if(rs.first()){
         voo.setIdVoo(rs.getString("idvoo"));
         voo.setNumeroVoo(rs.getString("numerovoo"));
         voo.setCiaAerea(rs.getString("ciaaerea"));
         voo.setPrefixoAeronaveVoo(rs.getString("prefixoaeronavevoo"));
         voo.setDataPartida(rs.getString("datapartida"));
         voo.setHoraPartida(rs.getString("horaPartida"));
         voo.setAeroportoPartida(rs.getString("aeroportopartida"));
         voo.setAeroportoPartidaSigla(rs.getString("aeroportopartidasigla"));
         voo.setPortaoPartida(rs.getString("portaopartida"));
         voo.setDataChegada(rs.getString("datachegada"));
         voo.setHoraChegada(rs.getString("horachegada"));
         voo.setAeroportoPartida(rs.getString("aeroportochegada"));
         voo.setAeroportoChegadaSigla(rs.getString("aeroportochegadasigla"));
         voo.setPortaoPartida(rs.getString("portaochegada"));
        }else {
            voo = null;
        }
        
        return voo;
    }// fim método buscarVooNumero
    
    public void inserirVoo(Voo voo){
        String msg="";
        String sql;
        
        int idVoo = buscarIdVooAtual();
        System.out.println(idVoo);
        
        idVoo = idVoo + 1;
        
        conexao = DBAeroFast.getConnection();
        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sql = "INSERT INTO voo VALUES ("
                + idVoo + ", "
                + "'" + voo.getNumeroVoo() + "', "
                + "'" + voo.getCiaAerea()+ "', "
                + "'" + voo.getPrefixoAeronaveVoo() + "', "
                + "'" + voo.getDataPartida() + "', "
                + "'" + voo.getHoraPartida() + "', "
                + "'" + voo.getAeroportoPartida() + "', "
                + "'" + voo.getAeroportoPartidaSigla() + "', "
                + "'" + voo.getPortaoPartida() + "', "
                + "'" + voo.getDataChegada() + "', "
                + "'" + voo.getHoraChegada() + "', "
                + "'" + voo.getAeroportoChegada() + "', "
                + "'" + voo.getAeroportoChegadaSigla() + "', "
                + "'" + voo.getPortaoChegada() + "', "
                + "'" + voo.getEscalasVoo() + "', " 
                + "'" + voo.getTarifaE() + "', "
                + "'" + voo.getTarifaB() + "', "
                + "'" + voo.getTarifaF() + "')";
        
        try {
            if(stmt.execute(sql)){
                msg = msg +"Dados do Voo inseridos com sucesso \n"; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        close();
        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada";
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    
    

}//fim classe VooDAO
