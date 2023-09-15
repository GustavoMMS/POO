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
public class Cartaz extends Acervo {

    private String tamanhoPag;

    public Cartaz() {
    }

    public Cartaz(String tamanhoPag, String autor1, String autor2, String titulo, String editora, String assunto, String palavraChave1, String palavraChave2, String cidade, String cdu, int ano, Integer id, int edicao, boolean emprestimo) {
        super(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
        this.tamanhoPag = tamanhoPag;
    }

    public void alterarDadosItem(String tamanhoPag, String autor1, String autor2, String titulo, String editora, String assunto, String palavraChave1, String palavraChave2, String cidade, String cdu, int ano, Integer id, int edicao, boolean emprestimo) {
        super.alterarDadosItem(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
        this.tamanhoPag = tamanhoPag;
    }

    /**
     * @return the tamanhoPag
     */
    public String getTamanhoPag() {
        return tamanhoPag;
    }

    /**
     * @param tamanhoPag the tamanhoPag to set
     */
    public void setTamanhoPag(String tamanhoPag) {
        this.tamanhoPag = tamanhoPag;
    }

    public boolean inserirBD() throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = "insert into livro (id, autor1, autor2, titulo, edicao, cidade, editora, ano, pagina, emprestado, cdu, assunto, palavraChave1, palavraChave2)";
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
        ps.setString(9, getTamanhoPag());
        ps.setBoolean(10, getEmprestimo());
        ps.setString(11, getCdu());
        ps.setString(12, getAssunto());
        ps.setString(13, getPalavraChave1());
        ps.setString(14, getPalavraChave2());

        ps.execute();

        return true;
    }

    public boolean alterarBD() throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = ""
                + "update cartaz set id=?, autor1=?, autor2=?, titulo=?, edicao=?, cidade=?, editora=?, ano=?, pagina=?, emprestado=?, cdu=?, assunto=?, palavraChave1=?, palavraChave2=?";
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
        ps.setString(9, getTamanhoPag());
        ps.setBoolean(10, getEmprestimo());
        ps.setString(11, getCdu());
        ps.setString(12, getAssunto());
        ps.setString(13, getPalavraChave1());
        ps.setString(14, getPalavraChave2());

        ps.execute();

        return true;
    }

    public boolean exlcuirBD() throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = "delete from cartaz where id = ?";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, getId());

        ps.execute();

        return true;
    }

    public static void getAllItens(ArrayList<Acervo> listAcervo) throws SQLException {
        Connection conn = MySqlConnectionSingleton.getInstance().getConnection();

        String sql = "select * from cartaz";

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
            String pagina = rs.getString("pagina");
            Boolean emprestado = rs.getBoolean("emprestado");
            String cdu = rs.getString("cdu");
            String assunto = rs.getString("assunto");
            String palavraChave1 = rs.getString("palavraChave1");
            String palavraChave2 = rs.getString("palavraChave2");
            String tipo = rs.getString("tipo");

            Acervo acervo = new Cartaz(pagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);

            listAcervo.add(acervo);
        }

    }

}
