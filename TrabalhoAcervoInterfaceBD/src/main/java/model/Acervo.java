/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Gustavo
 */
public class Acervo implements InterfaceAcervo {

    private String autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu;
    private int ano, edicao;
    private Integer id;
    private boolean emprestimo;

    public Acervo() {
    }

    public Acervo(String autor1, String autor2, String titulo, String editora, String assunto, String palavraChave1, String palavraChave2, String cidade, String cdu, int ano, Integer id, int edicao, boolean emprestimo) {
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.titulo = titulo;
        this.editora = editora;
        this.assunto = assunto;
        this.palavraChave1 = palavraChave1;
        this.palavraChave2 = palavraChave2;
        this.cidade = cidade;
        this.cdu = cdu;
        this.ano = ano;
        this.id = id;
        this.edicao = edicao;
        this.emprestimo = emprestimo;
    }
    
    @Override
    public void alterarDadosItem(String autor1, String autor2, String titulo, String editora, String assunto, String palavraChave1, String palavraChave2, String cidade, String cdu, int ano, Integer id, int edicao, boolean emprestimo) {
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.titulo = titulo;
        this.editora = editora;
        this.assunto = assunto;
        this.palavraChave1 = palavraChave1;
        this.palavraChave2 = palavraChave2;
        this.cidade = cidade;
        this.cdu = cdu;
        this.ano = ano;
        this.id = id;
        this.edicao = edicao;
        this.emprestimo = emprestimo;
    }

    /**
     * @return the autor1
     */
    public String getAutor1() {
        return autor1;
    }

    /**
     * @param autor1 the autor1 to set
     */
    public void setAutor1(String autor1) {
        this.autor1 = autor1;
    }

    /**
     * @return the autor2
     */
    public String getAutor2() {
        return autor2;
    }

    /**
     * @param autor2 the autor2 to set
     */
    public void setAutor2(String autor2) {
        this.autor2 = autor2;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return the palavraChave1
     */
    public String getPalavraChave1() {
        return palavraChave1;
    }

    /**
     * @param palavraChave1 the palavraChave1 to set
     */
    public void setPalavraChave1(String palavraChave1) {
        this.palavraChave1 = palavraChave1;
    }

    /**
     * @return the palavraChave2
     */
    public String getPalavraChave2() {
        return palavraChave2;
    }

    /**
     * @param palavraChave2 the palavraChave2 to set
     */
    public void setPalavraChave2(String palavraChave2) {
        this.palavraChave2 = palavraChave2;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cdu
     */
    public String getCdu() {
        return cdu;
    }

    /**
     * @param cdu the cdu to set
     */
    public void setCdu(String cdu) {
        this.cdu = cdu;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the edicao
     */
    public int getEdicao() {
        return edicao;
    }

    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    /**
     * @return the emprestimo
     */
    public boolean getEmprestimo() {
        return emprestimo;
    }

    /**
     * @param emprestimo the emprestimo to set
     */
    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Acervo) obj).hashCode()==hashCode();
    }
    
    @Override
    public int hashCode(){
        int hash=7;
        hash = 59 * hash + Objects.hashCode(this.cdu);
        hash = 59 * hash + Objects.hashCode(this.id);
        
        return hash;
    }

}
