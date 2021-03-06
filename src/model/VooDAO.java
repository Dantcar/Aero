/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package model;

import Control.Util;
import static Control.Util.reduzString;
import static java.lang.Float.parseFloat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
    public int idVooNow = 0;

    /**
     * método para encerrar Connection, Statement e ResutlSet
     */
    private void close() {
        String msg = "";
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
            msg = "" + e + "\n";
            msg = reduzString(msg);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
    }//fim close()

    public int buscarNumeroVoo() {
        int resposta = 0;
        String msg = "";
        String sql = "SELECT numerovoo FROM voo ORDER BY 1 DESC";
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
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                idVooNow = rs.getInt("numerovoo");
                resposta = idVooNow + 1;
            } else {
                resposta = 1000;
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        try {
            if (conexao.isClosed()) {
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        return resposta;
    }// fim método buscarNuemroVoo

    /**
     * Método para buscar o último id de voo para usar na inclusão de voo
     *
     * @return
     */
    public int buscarIdVooAtual() {
        int resposta = 0;
        String msg = "";
        String sql = "SELECT * FROM voo ORDER BY 1 DESC";
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
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                idVooNow = rs.getInt("numerovoo");
                resposta = idVooNow;
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        try {
            if (conexao.isClosed()) {
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        return resposta;
    }// fim método buscarIdVooAtual

    /**
     * Consultar se existe um determinado numero de voo.
     *
     * @param vooNumero
     * @return
     */
    public boolean buscarExisteVooNumero(String vooNumero) {
        boolean resposta = true;
        String msg = "";
        String sql = "SELECT * FROM voo WHERE numerovoo = '" + vooNumero + "'";

        conexao = DBAeroFast.getConnection();
        ResultSet rs = null;

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                resposta = false;
            }
        } catch (SQLException ex) {
            msg = "" + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();

        try {
            if (!conexao.isClosed()) {
                msg = msg + "Conexão ao banco nao  fechada.\n";
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, reduzString(msg));
        }
        return resposta;
    }//fim do método BuscarExisteVooNumero

    /**
     * Método para enviar um voo através da entrada de seu número.
     *
     * @param vooNumero
     * @return
     */
    public Voo buscarVooNumero(String vooNumero) {
        Voo voo = new Voo();
        String msg = "";
        String sql = "SELECT * FROM voo WHERE numerovoo = '" + vooNumero + "'";

        conexao = DBAeroFast.getConnection();
        ResultSet rs = null;

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                voo.setIdVoo(rs.getString("idvoo"));
                voo.setNumeroVoo(rs.getString("numerovoo"));
                voo.setCiaAerea(rs.getString("ciaaerea"));
                voo.setPrefixoAeronaveVoo(rs.getString("prefixo"));
                voo.setDataPartida(rs.getString("datapartida"));
                voo.setHoraPartida(rs.getString("horaPartida"));
                voo.setAeroportoPartida(rs.getString("aeroportopartida"));
                voo.setAeroportoPartidaSigla(rs.getString("aeroportopartidasigla"));
                voo.setPortaoPartida(rs.getString("portaopartida"));
                voo.setDataChegada(rs.getString("datachegada"));
                voo.setHoraChegada(rs.getString("horachegada"));
                voo.setAeroportoChegada(rs.getString("aeroportochegada"));
                voo.setAeroportoChegadaSigla(rs.getString("aeroportochegadasigla"));
                voo.setPortaoChegada(rs.getString("portaochegada"));
                voo.setEscalasVoo(rs.getString("escalasvoo"));
                voo.setTarifaE(rs.getString("tarifae"));
                voo.setTarifaB(rs.getString("tarifab"));
                voo.setTarifaF(rs.getString("tarifaf"));

            } else {
                voo = null;
            }

        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        try {
            if (conexao.isClosed()) {
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        return voo;
    }// fim método buscarVooNumero

    /**
     * Método para inserir novo voo na base de dados AeroFast
     *
     * @param voo
     */
    public void inserirVoo(Voo voo) {
        String msg = "";
        String sql;

        int idVoo = buscarIdVooAtual();
        //System.out.println(idVoo);
        idVoo = idVoo + 1;

        conexao = DBAeroFast.getConnection();

        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String starifae, starifab, starifaf;

        float tarifaE, tarifaB, tarifaF;
        tarifaE = 0;
        tarifaB = 0;
        tarifaF = 0;
        starifae = Util.retiraPonto(voo.getTarifaE().trim());
        starifab = Util.retiraPonto(voo.getTarifaB().trim());
        starifaf = Util.retiraPonto(voo.getTarifaF().trim());

        if (starifae != null) {
            tarifaE = tarifaE + Float.parseFloat(starifae);
        } else {
            tarifaE = 0;
        }

        if (starifab != null) {
            tarifaB = tarifaB + Float.parseFloat(starifab);
        } else {
            tarifaB = 0;
        }

        if (starifaf != null) {
            tarifaF = tarifaF + Float.parseFloat(starifaf);
        } else {
            tarifaF = 0;
        }

        //System.out.println(tarifaE + " - " + tarifaB + " - " + tarifaF);
        sql = "INSERT INTO voo VALUES ("
                + idVoo + ", "
                + "'" + voo.getNumeroVoo() + "', "
                + "'" + voo.getCiaAerea() + "', "
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
                + tarifaE + ", "
                + tarifaB + ", "
                + tarifaF + ")";
        //System.out.println(sql);
        try {
            stmt.executeUpdate(sql);
            msg = msg + "Dados do Voo inseridos com sucesso. \n";
            //JOptionPane.showMessageDialog(null, msg); 

        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = msg + "Erro de gravação no BD. \n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();
        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada.\n";

            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
    }//fim do método inserirVoo

    /**
     * Método para alterar um voo existente encontrando pelo número do voo.
     *
     * @param voo
     * @param vooNumero
     */
    public void alterarVoo(Voo voo, String vooNumero) {
        String msg = "";
        String sql;
        conexao = DBAeroFast.getConnection();
        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        String starifae, starifab, starifaf;

        float tarifaE, tarifaB, tarifaF;
        tarifaE = 0;
        tarifaB = 0;
        tarifaF = 0;
        starifae = Util.retiraPonto(voo.getTarifaE().trim());
        starifab = Util.retiraPonto(voo.getTarifaB().trim());
        starifaf = Util.retiraPonto(voo.getTarifaF().trim());

        if (starifae != null) {
            tarifaE = tarifaE + Float.parseFloat(starifae);
        } else {
            tarifaE = 0;
        }

        if (starifab != null) {
            tarifaB = tarifaB + Float.parseFloat(starifab);
        } else {
            tarifaB = 0;
        }

        if (starifaf != null) {
            tarifaF = tarifaF + Float.parseFloat(starifaf);
        } else {
            tarifaF = 0;
        }

        sql = "UPDATE voo SET "
                + "numerovoo = '" + voo.getNumeroVoo() + "', "
                + "ciaaerea = '" + voo.getCiaAerea() + "', "
                + "prefixo = '" + voo.getPrefixoAeronaveVoo() + "', "
                + "datapartida = '" + voo.getDataPartida() + "', "
                + "horapartida = '" + voo.getHoraPartida() + "', "
                + "aeroportopartida = '" + voo.getAeroportoPartida() + "', "
                + "aeroportopartidasigla = '" + voo.getAeroportoPartidaSigla() + "', "
                + "portaopartida = '" + voo.getPortaoPartida() + "', "
                + "datachegada = '" + voo.getDataChegada() + "', "
                + "horachegada = '" + voo.getHoraChegada() + "', "
                + "aeroportochegada = '" + voo.getAeroportoChegada() + "', "
                + "aeroportochegadasigla = '" + voo.getAeroportoChegadaSigla() + "', "
                + "portaochegada = '" + voo.getPortaoChegada() + "', "
                + "escalasvoo = '" + voo.getEscalasVoo() + "', "
                + "tarifae = " + tarifaE + ", "
                + "tarifab = " + tarifaB + ", "
                + "tarifaf = " + tarifaF + " "
                + " WHERE numerovoo = '" + vooNumero + "'";

        try {
            //System.out.println(sql);
            stmt.executeUpdate(sql);
            //System.out.println("Esta é minha SQL: " + sql);
            msg = msg + "Dados da aeronave alterados com sucesso. \n";
        } catch (SQLException ex) {
            msg = reduzString(msg + ex);
            msg = reduzString(msg);
            msg = msg + "Erro de gravação no BD. \n";
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada";

            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
    }// fim alterarVoo

    /**
     * Método para excluir um Voo da base de dados Aerofast enviando um número
     * de voo como parametro
     *
     * @param voo
     * @param vooNumero
     */
    public void deletarVoo(Voo voo, String vooNumero) {
        String msg = "";
        String sql = "DELETE FROM voo WHERE numerovoo = '" + vooNumero + "'";

        if ((JOptionPane.showConfirmDialog(
                null,
                "Confirma Deletar Este Voo: " + vooNumero + "?",
                "Confirmar Deletar Voo",
                JOptionPane.YES_NO_OPTION))
                == JOptionPane.YES_OPTION) {

            conexao = DBAeroFast.getConnection();

            try {
                stmt = conexao.createStatement();
            } catch (SQLException ex) {
                msg = msg + ex;
                msg = reduzString(msg);
                Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                stmt.executeUpdate(sql);
                msg = msg + "Dados do voo excluidos com sucesso \n";

            } catch (SQLException ex) {
                msg = msg + ex;
                msg = reduzString(msg);
                msg = msg + "Erro de gravação no BD. \n";
                Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
    }//fim do método deletarVoo

    public List<Voo> listarVoos() {
        List<Voo> listaVoos = new ArrayList<>();
        String msg = "";
        String sql = "SELECT * FROM voo ORDER BY 1 ASC";
        System.out.println(sql);
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
        ArrayList lista;
        lista = null;

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (rs.next()) {
                Voo v = new Voo();
                v.setIdVoo(rs.getString("idvoo"));
                v.setNumeroVoo(rs.getString("numerovoo"));
                v.setCiaAerea(rs.getString("ciaaerea"));
                v.setPrefixoAeronaveVoo(rs.getString("prefixo"));
                v.setAeroportoPartidaSigla(rs.getString("aeroportopartidasigla"));
                v.setAeroportoPartida(rs.getString("aeroportopartida"));
                v.setDataPartida(rs.getString("datapartida"));
                v.setHoraPartida(rs.getString("horapartida"));
                v.setPortaoPartida(rs.getString("portaopartida"));
                v.setAeroportoChegadaSigla(rs.getString("aeroportochegadasigla"));
                v.setAeroportoChegada(rs.getString("aeroportochegada"));
                v.setDataChegada(rs.getString("datachegada"));
                v.setHoraChegada(rs.getString("horachegada"));
                v.setPortaoChegada(rs.getString("portaochegada"));
                v.setEscalasVoo(rs.getString("escalasvoo"));
                v.setTarifaE(rs.getString("tarifae"));
                v.setTarifaB(rs.getString("tarifab"));
                v.setTarifaF(rs.getString("tarifaf"));
                listaVoos.add(v);

            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        close();
        
        
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
            msg = "";
        }

        return listaVoos;
    }// Fim método listarVoos

    public ArrayList listarVooNumero() {
        String msg = "";
        String sql = "SELECT numerovoo FROM voo ORDER BY 1 ASC";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;

        ArrayList lista;
        lista = null;

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        lista = new ArrayList();

        try {
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        return lista;
    }//Fil listarVooNumero

    public List<Voo> listarVooNumero(String vooNumero) {
        List<Voo> listaVoo = new ArrayList<>();
        String msg = "";
        String sql = "SELECT * FROM voo WHERE numerovoo = '" + vooNumero + "'";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;

        ArrayList lista;
        lista = null;

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        try {
            while (rs.next()) {
                Voo v = new Voo();
                v.setIdVoo(rs.getString("idvoo"));
                v.setNumeroVoo(rs.getString("numerovoo"));
                v.setCiaAerea(rs.getString("ciaaerea"));
                v.setPrefixoAeronaveVoo(rs.getString("prefixo"));
                v.setAeroportoPartidaSigla(rs.getString("aeroportopartidasigla"));
                v.setAeroportoPartida(rs.getString("aeroportopartida"));
                v.setDataPartida(rs.getString("datapartida"));
                v.setHoraPartida(rs.getString("horapartida"));
                v.setPortaoPartida(rs.getString("portaopartida"));
                v.setAeroportoChegadaSigla(rs.getString("aeroportochegadasigla"));
                v.setAeroportoChegada(rs.getString("aeroportochegada"));
                v.setDataChegada(rs.getString("datachegada"));
                v.setHoraChegada(rs.getString("horachegada"));
                v.setPortaoChegada(rs.getString("portaochegada"));
                v.setEscalasVoo(rs.getString("escalasvoo"));
                v.setTarifaE(rs.getString("tarifae"));
                v.setTarifaB(rs.getString("tarifab"));
                v.setTarifaF(rs.getString("tarifaf"));
                listaVoo.add(v); 
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        close();
                
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        return listaVoo;
        

    }

}//fim classe VooDAO

