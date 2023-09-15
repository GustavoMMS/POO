/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import singleton.MySqlConnectionSingleton;

/**
 *
 * @author Gustavo
 */
public class Midia extends Acervo {

    private String tipoMidia;

    public Midia() {
    }

    public Midia(String tipoMidia, String autor1, String autor2, String titulo, String editora, String assunto, String palavraChave1, String palavraChave2, String cidade, String cdu, int ano, Integer id, int edicao, boolean emprestimo) {
        super(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
        this.tipoMidia = tipoMidia;
    }

    public void alterarDadosItem(String tipoMidia, String autor1, String autor2, String titulo, String editora, String assunto, String palavraChave1, String palavraChave2, String cidade, String cdu, int ano, Integer id, int edicao, boolean emprestimo) {
        super.alterarDadosItem(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
        this.tipoMidia = tipoMidia;
    }

    /**
     * @return the tipoMidia
     */
    public String getTipoMidia() {
        return tipoMidia;
    }

    /**
     * @param tipoMidia the tipoMidia to set
     */
    public void setTipoMidia(String tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    public boolean inserirBD() throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = "insert into midia (id, autor1, autor2, titulo, edicao, cidade, editora, ano, emprestado, cdu, assunto, palavraChave1, palavraChave2, tipo)";
        sql += "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, getId());
        ps.setString(2, getAutor1());
        ps.setString(3, getAutor2());
        ps.setString(4, getTitulo());
        ps.setInt(5, getEdicao());
        ps.setString(6, getCidade());
        ps.setString(7, getEditora());
        ps.setInt(8, getAno());
        ps.setBoolean(9, getEmprestimo());
        ps.setString(10, getCdu());
        ps.setString(11, getAssunto());
        ps.setString(12, getPalavraChave1());
        ps.setString(13, getPalavraChave2());
        ps.setString(14, getTipoMidia());

        ps.execute();

        return true;
    }

    public boolean alterarBD() throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = "update midia set id=?, autor1=?, autor2=?, titulo=?, edicao=?, cidade=?, editora=?, ano=?, emprestado=?, cdu=?, assunto=?, palavraChave1=?, palavraChave2=?, tipo=?";
        sql += "where id=?";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, getId());
        ps.setString(2, getAutor1());
        ps.setString(3, getAutor2());
        ps.setString(4, getTitulo());
        ps.setInt(5, getEdicao());
        ps.setString(6, getCidade());
        ps.setString(7, getEditora());
        ps.setInt(8, getAno());
        ps.setBoolean(9, getEmprestimo());
        ps.setString(10, getCdu());
        ps.setString(11, getAssunto());
        ps.setString(12, getPalavraChave1());
        ps.setString(13, getPalavraChave2());
        ps.setString(14, getTipoMidia());

        ps.execute();

        return true;
    }

    public boolean exlcuirBD() throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = "delete from midia where id = ?";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, getId());

        ps.execute();

        return true;
    }

    public static void getAllItens(ArrayList<Acervo> listAcervo) throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = "select * from midia";

        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String autor1 = rs.getString("autor1");
            String autor2 = rs.getString("autor2");
            String titulo = rs.getString("titulo");
            int edicao = rs.getInt("edicao");
            String cidade = rs.getString("cidade");
            String editora = rs.getString("editora");
            int ano = rs.getInt("ano");
            Boolean emprestado = rs.getBoolean("emprestado");
            String cdu = rs.getString("cdu");
            String assunto = rs.getString("assunto");
            String palavraChave1 = rs.getString("palavraChave1");
            String palavraChave2 = rs.getString("palavraChave2");
            String tipo = rs.getString("tipo");

            Acervo acervo = new Midia(tipo, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);

            listAcervo.add(acervo);
        }

    }

}
