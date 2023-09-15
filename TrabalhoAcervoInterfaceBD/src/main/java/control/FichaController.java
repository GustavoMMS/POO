/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import model.Acervo;
import model.Cartaz;
import model.Livro;
import model.Mapa;
import model.Midia;
import model.Periodico;
import model.Relatorio;
import model.TC;
import view.TelaFicha;
import view.TelaItens;

/**
 *
 * @author Gustavo
 */
public class FichaController {
    private TelaFicha Tf;
    private Acervo item;
    private ArrayList<Acervo> listAcervo;

    public FichaController(TelaFicha Tf, Acervo item, ArrayList<Acervo> listAcervo) {
        this.Tf = Tf;
        this.item = item;
        this.listAcervo = listAcervo;
        setInformacoes();
    }
    
    public void setInformacoes(){
        getTf().getlAutor1().setText(item.getAutor1());
        getTf().getlAutor2().setText(item.getAutor2());
        getTf().getlTitulo1().setText(item.getTitulo());
        
        String edicao = String.valueOf(item.getEdicao());
        getTf().getlEdicao().setText(edicao);
        
        getTf().getlCidade().setText(item.getCidade());
        getTf().getlEditora().setText(item.getEditora());
        
        String ano = String.valueOf(item.getAno());
        getTf().getlAno().setText(ano);
        
        getTf().getlCduSet().setText(item.getCdu());
        getTf().getlAssunto().setText(item.getAssunto());
        getTf().getlPalavraChave1().setText(item.getPalavraChave1());
        getTf().getlPalavraChave2().setText(item.getPalavraChave2());
        getTf().getlTitulo2().setText(item.getTitulo());
        
        if (item instanceof Livro livro) {
            getTf().getlIsbnSet().setText(livro.getIsbn());
            getTf().getlPagina().setText(livro.getTamanhoPag());
        } 
        else if (item instanceof Periodico periodico) {
            getTf().getlIsbnSet().setText(periodico.getIsbn());
            getTf().getlPagina().setText(periodico.getTamanhoPag());
        } 
        else if (item instanceof TC tcc) {
            getTf().getlIsbnSet().setText(tcc.getIsbn());
            getTf().getlPagina().setText(tcc.getTamanhoPag());
        } 
        else if (item instanceof Relatorio relatorio) {
            getTf().getlIsbnSet().setText(relatorio.getIsbn());
            getTf().getlPagina().setText(relatorio.getTamanhoPag());
        }  
        else if (item instanceof Cartaz cartaz) {
            getTf().getlPagina().setText(cartaz.getTamanhoPag());
        } 
        else if (item instanceof Mapa mapa) {
            getTf().getlPagina().setText(mapa.getTamanhoPag());
        }
        
    }

    /**
     * @return the Tf
     */
    public TelaFicha getTf() {
        return Tf;
    }

    /**
     * @param Tf the Tf to set
     */
    public void setTf(TelaFicha Tf) {
        this.Tf = Tf;
    }

    /**
     * @return the listAcervo
     */
    public ArrayList<Acervo> getListAcervo() {
        return listAcervo;
    }

    /**
     * @param listAcervo the listAcervo to set
     */
    public void setListAcervo(ArrayList<Acervo> listAcervo) {
        this.listAcervo = listAcervo;
    }

    /**
     * @return the item
     */
    public Acervo getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Acervo item) {
        this.item = item;
    }
    
    
}
