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
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dac
 */
public class PassagemDAO {

    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idPassagemNow = 0;
    public int numPassagemNow = 0;

    public PassagemDAO() {
    }

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
            msg = msg + e + "\n";
            msg = reduzString(msg);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        msg = "";
    }//fim close()

    /**
     * Método para buscar o idPassagem atual
     *
     * @return
     */
    public int buscarIdPassagemAtual() {
        int resposta = 0;
        String msg = "";
        String sql = "SELECT * FROM passagem ORDER BY 1 DESC";
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
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                idPassagemNow = rs.getInt(1);
                resposta = idPassagemNow;
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();

        try {
            if (conexao.isClosed()) {
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        msg = "";

        return resposta;
    }//fim método buscarIDPassagemAtual

    /**
     * Método que encontra a passagem se existir passando como parametro o
     * número da passagem.
     *
     * @param numeroPassagem
     * @return
     */
    public boolean buscarExistePassagemNumero(String numeroPassagem) {
        boolean resposta = false;

        String msg = "";
        String sql = "SELECT * FROM passagem WHERE prefixo = '" + numeroPassagem + "'";
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
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                resposta = false;
            }
        } catch (SQLException ex) {
            msg = "" + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();

        try {
            if (!conexao.isClosed()) {
                msg = msg + "Conexão ao banco nao  fechada.\n";
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, reduzString(msg));
        }
        msg = "";

        return resposta;
    }// fim buscarExistePassagemNumero

    /**
     * Método para inserir nova passagem a base de dados Aerofast
     *
     * @param passagem
     */
    public void inserirNovaPassagem(Passagem passagem) {
        String msg = "";
        String sql;

        int idPassagem = buscarIdPassagemAtual();
        int numPassagem = buscarNumPassagemAtual();
        //System.out.println(idVoo);
        idPassagem = idPassagem + 1;

        conexao = DBAeroFast.getConnection();

        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        String starifa;

        float tarifa;
        tarifa = 0;
        starifa = Util.retiraPonto(passagem.getTarifa().trim());

        if (starifa != null) {
            tarifa = tarifa + Float.parseFloat(starifa);
        } else {
            tarifa = 0;
        }

        sql = "INSERT INTO passagem VALUES ("
                + idPassagem + ", "
                + "'" + passagem.getNumeroPassagem() + "', "
                + "'" + passagem.getNomePassageiro() + "', "
                + "'" + passagem.getRgPassageiro() + "', "
                + "'" + passagem.getReserva() + "', "
                + "'" + passagem.getVooNumero() + "', "
                + "'" + passagem.getCiaAerea() + "', "
                + "'" + passagem.getAssentoNumero() + "', "
                + "'" + passagem.getClasse() + "', "
                + passagem.getTarifa() + ", "
                + "'" + passagem.getDataPassagem() + "', "
                + "'" + passagem.getPartidaAeroporto() + "', "
                + "'" + passagem.getPartidaSiglaAeroporto() + "', "
                + "'" + passagem.getPartidaData() + "', "
                + "'" + passagem.getPartidaHora() + "', "
                + "'" + passagem.getPartidaPortao() + "', "
                + "'" + passagem.getChegadaAeroporto() + "', "
                + "'" + passagem.getChegadaSiglaAeroporto() + "', "
                + "'" + passagem.getChegadaData() + "', "
                + "'" + passagem.getChegadaHora() + "', "
                + "'" + passagem.getChegadaPortao() + "', "
                + "'" + passagem.getEscalasVoo() + "', "
                + "'" + passagem.getObservacaoPassagem() + "')";
        System.out.println(sql);
        try {
            stmt.executeUpdate(sql);
            msg = msg + "Dados do Voo inseridos com sucesso. \n";
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = msg + "Erro de gravação no BD. \n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();

        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada.\n";

            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
    }//fim InserirNovaPassagem

    /**
     * Método que busca uma Passagem pelo número da passagem
     *
     * @param numeroPassagem
     * @return
     */
    public Passagem buscarPassagemNumero(String numeroPassagem) {
        Passagem passagem = new Passagem();
        String msg = "";
        String sql = "SELECT * FROM passagem WHERE numeropassagem = '" + numeroPassagem + "'";

        conexao = DBAeroFast.getConnection();
        ResultSet rs = null;

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            if (rs.first()) {
                passagem.setIdPassagem(rs.getString("idpassagem"));
                passagem.setNumeroPassagem(rs.getString("numeropassagem"));
                passagem.setNomePassageiro(rs.getString("nomepassageiro"));
                passagem.setRgPassageiro(rs.getString("rgpassageiro"));
                passagem.setReserva(rs.getString("reserva"));
                passagem.setVooNumero(rs.getString("voonumero"));
                passagem.setCiaAerea(rs.getString("ciaaerea"));
                passagem.setAssentoNumero(rs.getString("assentonumero"));
                passagem.setClasse(rs.getString("classe"));
                passagem.setTarifa(rs.getString("tarifa"));
                passagem.setDataPassagem(rs.getString("datapassagem"));
                passagem.setPartidaAeroporto(rs.getString("partidaaeroporto"));
                passagem.setPartidaSiglaAeroporto(rs.getString("partidasiglaaeroporto"));
                passagem.setPartidaData(rs.getString("partidadata"));
                passagem.setPartidaHora(rs.getString("partidahora"));
                passagem.setPartidaPortao(rs.getString("partidaportao"));
                passagem.setChegadaAeroporto(rs.getString("chegadaaeroporto"));
                passagem.setChegadaSiglaAeroporto(rs.getString("chegadasiglaaeroporto"));
                passagem.setChegadaData(rs.getString("chegadadata"));
                passagem.setChegadaHora(rs.getString("chegadahora"));
                passagem.setChegadaPortao(rs.getString("chegadaportao"));
                passagem.setEscalasVoo(rs.getString("escalasvoo"));
                passagem.setObservacaoPassagem(rs.getString("observacaopassagem"));

            } else {
                passagem = null;
            }

        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();

        try {
            if (conexao.isClosed()) {
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        return passagem;
    }

    public void alterarPassagem(Passagem passagem, String vnumeroPassagem) {
        String msg = "";
        conexao = DBAeroFast.getConnection();

        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE passagem SET "
                + "numeropassagem = '" + passagem.getNumeroPassagem() + "', "
                + "nomepassageiro = '" + passagem.getNomePassageiro() + "', "
                + "rgpassageiro = '" + passagem.getRgPassageiro() + "', "
                + "reserva = '" + passagem.getReserva() + "', "
                + "voonumero = '" + passagem.getVooNumero() + "', "
                + "ciaaerea = '" + passagem.getCiaAerea() + "', "
                + "assentonumero = '" + passagem.getAssentoNumero() + "', "
                + "classe = '" + passagem.getClasse() + "',"
                + "tarifa = " + passagem.getTarifa() + ", "
                + "datapassagem = '" + passagem.getDataPassagem() + "', "
                + "partidaaeroporto = '" + passagem.getPartidaAeroporto() + "', "
                + "partidasiglaaeroporto = '" + passagem.getPartidaSiglaAeroporto() + "', "
                + "partidadata = '" + passagem.getPartidaData() + "', "
                + "partidaportao = '" + passagem.getPartidaPortao() + "', "
                + "chegadaaeroporto = '" + passagem.getChegadaAeroporto() + "', "
                + "chegadasiglaaeroporto = '" + passagem.getChegadaSiglaAeroporto() + "', "
                + "chegadadata = '" + passagem.getChegadaData() + "', "
                + "chegadahora = '" + passagem.getChegadaHora() + "', "
                + "chegadaportao = '" + passagem.getChegadaPortao() + "', "
                + "escalasvoo = '" + passagem.getEscalasVoo() + "', "
                + "OBSERVACAOPASSAGEM = '" + passagem.getObservacaoPassagem() + "' "
                + " WHERE numeropassagem = '" + vnumeroPassagem + "'";

        try {
            System.out.println("Esta é minha SQL: " + sql);
            stmt.executeUpdate(sql);

            msg = msg + "Dados da passagem alterados com sucesso. \n";
        } catch (SQLException ex) {
            msg = reduzString(msg + ex);
            msg = reduzString(msg);
            msg = msg + "Erro de gravação no BD. \n"; // JOptionPane.showMessageDialog(null,msg );
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();
        try {
            if (conexao.isClosed()) {
                msg = msg + "Conexão ao banco fechada" + "\n";
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        msg = "";
    }// fim método alterarPassagem

    public void deletarPassagem(String vnumeroPassagem) {
        String msg = "";
        String sql = "DELETE FROM passagem WHERE numeropassagem = '" + vnumeroPassagem + "'";

        if ((JOptionPane.showConfirmDialog(
                null,
                "Confirma Deletar Passagem Número: " + vnumeroPassagem + "?",
                "Confirmar Deletar Passagem",
                JOptionPane.YES_NO_OPTION))
                == JOptionPane.YES_OPTION) {

            conexao = DBAeroFast.getConnection();

            try {
                stmt = conexao.createStatement();
            } catch (SQLException ex) {
                msg = msg + ex;
                msg = reduzString(msg);
                Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                stmt.executeUpdate(sql);
                msg = msg + "Dados da Passagem excluidos com sucesso \n";
            } catch (SQLException ex) {
                msg = reduzString(msg + ex);
                msg = reduzString(msg);
                msg = msg + "Erro de gravação no BD \n";
                Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        msg = "";
    }//fim deletarPassagem

    public int buscarNumPassagemAtual() {
        int resposta = 0;
        String msg = "";
        String sql = "SELECT * FROM passagem ORDER BY 1 DESC";
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
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                numPassagemNow = parseInt(rs.getString("numeropassagem"));
                resposta = numPassagemNow;
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();

        try {
            if (conexao.isClosed()) {
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        msg = "";

        return resposta;
    }

    public float buscarValorPassagemVoo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void populaComboBoxNumeroPassagem() {

    }

    public ArrayList findComboNumeroPassagem() {
        String msg = "";
        String sql = "SELECT numeropassagem FROM passagem ORDER BY 1 DESC";
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
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        lista = new ArrayList();
        try {
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        return lista;
    }// fim método findComboNumeroPassagem

    public ArrayList findComboGenericoPassagem(String campo) {
        String msg = "";
        String sql = "SELECT " + campo + " FROM passagem ORDER BY 1 DESC";
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
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        lista = new ArrayList();
        try {
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        return lista;
    }// fim método findComboNumeroPassagem

}//fim Classe PassagemDAO 
