/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Acervo;
import view.TelaItens;

/**
 *
 * @author Gustavo
 */
public class ListaController {

    private TelaItens ti;
    private ArrayList<Acervo> listAcervo;

    public ListaController(TelaItens ti, ArrayList<Acervo> listAcervo) {
        this.ti = ti;
        this.listAcervo = listAcervo;
        setAllItens();
    }

    public void setAllItens() {
        for (Acervo acervo : getListAcervo()) {
            DefaultTableModel model = (DefaultTableModel) getTi().gettItens().getModel();
            model.addRow(new Object[]{acervo.getId(), acervo.getTitulo(), acervo.getEditora(), acervo.getCdu()});
        }
    }

    public Acervo retornarAcervoTabela() {
        DefaultTableModel model = (DefaultTableModel) getTi().gettItens().getModel();
        Acervo acervo = criarItemParaBusca(model);

        int index = listAcervo.indexOf(acervo);

        if (index > -1) {
            acervo = listAcervo.get(index);
        }

        return acervo;
    }

    public Acervo criarItemParaBusca(DefaultTableModel model) {
        String cdu = (String) model.getValueAt(getTi().gettItens().getSelectedRow(), 3);
        Integer id = (Integer) model.getValueAt(getTi().gettItens().getSelectedRow(), 0);

        Acervo acervo = new Acervo();
        acervo.setId(id);
        acervo.setCdu(cdu);

        return acervo;
    }

    /**
     * @return the ti
     */
    public TelaItens getTi() {
        return ti;
    }

    /**
     * @param ti the ti to set
     */
    public void setTi(TelaItens ti) {
        this.ti = ti;
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

}
