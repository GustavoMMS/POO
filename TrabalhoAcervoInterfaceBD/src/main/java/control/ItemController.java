/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Acervo;
import model.Cartaz;
import model.Livro;
import model.Mapa;
import model.Midia;
import model.Periodico;
import model.Relatorio;
import model.TC;
import view.TelaCadastroItem;

/**
 *
 * @author Gustavo
 */
public class ItemController {

    private TelaCadastroItem tci;
    private ArrayList<Acervo> listAcervo;
    private boolean emprestimo;

    public ItemController(TelaCadastroItem tci, ArrayList<Acervo> listAcervo) throws SQLException {
        this.tci = tci;
        this.listAcervo = listAcervo;
        emprestimo = false;
        Livro.getAllItens(listAcervo);
        Periodico.getAllItens(listAcervo);
        TC.getAllItens(listAcervo);
        Relatorio.getAllItens(listAcervo);
        Midia.getAllItens(listAcervo);
        Cartaz.getAllItens(listAcervo);
        Mapa.getAllItens(listAcervo);
        setAllItens();
    }

    public void setAllItens() {
        for (Acervo acervo : getListAcervo()) {
            DefaultTableModel model = (DefaultTableModel) getTci().gettItem().getModel();
            model.addRow(new Object[]{acervo.getId(), acervo.getTitulo(), acervo.getEditora(), acervo.getCdu()});
        }
    }

    public void setCategoriaByTipo() {
        getTci().getCbCategoria().setModel(new DefaultComboBoxModel<>());

        switch (getTci().getCbTipo().getSelectedIndex()) {
            case 0: //livro
                getTci().getCbCategoria().addItem("Sem categoria");
                break;
            case 1: //periodico
                getTci().getCbCategoria().addItem("Revista");
                getTci().getCbCategoria().addItem("Jornal");
                break;
            case 2: //tcc
                getTci().getCbCategoria().addItem("Monografia");
                getTci().getCbCategoria().addItem("Dissertação");
                getTci().getCbCategoria().addItem("Tese");
                break;
            case 3: //relatorio
                getTci().getCbCategoria().addItem("Sem categoria");
                break;
            case 4: //midia
                getTci().getCbCategoria().addItem("Fita");
                getTci().getCbCategoria().addItem("VHS");
                getTci().getCbCategoria().addItem("CD");
                getTci().getCbCategoria().addItem("DVD");
                break;
            case 5: //cartaz
                getTci().getCbCategoria().addItem("Sem categoria");
                break;
            case 6: //mapa
                getTci().getCbCategoria().addItem("Sem categoria");
                break;
        }
    }

    public void inserirItem(Integer id) {

        if (validarCampos()) {
            String autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, isbn, tamPagina, tipo, categoria;
            int ano, edicao;
            boolean emprestado;
            String aux;
            int aux2 = getTci().getCbTipo().getSelectedIndex();

            autor1 = getTci().getTxtAutor1().getText();
            autor2 = getTci().getTxtAutor2().getText();
            titulo = getTci().getTxtTitulo().getText();
            editora = getTci().getTxtEditora().getText();
            assunto = getTci().getTxtAssunto().getText();
            palavraChave1 = getTci().getTxtPalavrachave1().getText();
            palavraChave2 = getTci().getTxtPalavrachave2().getText();
            cidade = getTci().getTxtCidade().getText();
            cdu = getTci().getFtfCdu().getText();

            aux = getTci().getTxtEdicao().getText();
            edicao = Integer.parseInt(aux);

            emprestado = getTci().getCbxEmprestado().isSelected();
            isbn = getTci().getFtfISBN().getText();
            tamPagina = getTci().getFtfPagina().getText();
            tipo = (String) getTci().getCbTipo().getSelectedItem();
            categoria = (String) getTci().getCbCategoria().getSelectedItem();

            aux = getTci().getTxtAno().getText();
            ano = Integer.parseInt(aux);

            Acervo item = null;

            if (!emprestimo) {
                try {
                    switch (aux2) {
                        case 0:
                            item = new Livro(isbn, tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);
                            listAcervo.add(item);
                            
                            Livro livro = (Livro) item;
                            
                            if (livro.inserirBD()) {
                                    JOptionPane.showMessageDialog(getTci(), "Item cadastrado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                                }

                            break;
                        case 1:
                            item = new Periodico(tipo, tamPagina, isbn, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);

                            listAcervo.add(item);
                            
                            Periodico periodico = (Periodico) item;
                            
                            if (periodico.inserirBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item cadastrado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                            break;
                        case 2:
                            item = new TC(isbn, tipo, tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);
                            listAcervo.add(item);
                            
                            TC tcc = (TC) item;
                            
                            if (tcc.inserirBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item cadastrado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                            break;
                        case 3:
                            item = new Relatorio(isbn, tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);
                            listAcervo.add(item);
                            
                            Relatorio relatorio = (Relatorio) item;
                            
                            if (relatorio.inserirBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item cadastrado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                            break;
                        case 4:
                            item = new Midia(tipo, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);
                            listAcervo.add(item);

                            Midia midia = (Midia) item;

                            if (midia.inserirBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item cadastrado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                            break;
                        case 5:
                            item = new Cartaz(tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);
                            listAcervo.add(item);

                            Cartaz cartaz = (Cartaz) item;

                            if (cartaz.inserirBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item cadastrado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                            break;
                        case 6:
                            item = new Mapa(tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestado);
                            listAcervo.add(item);

                            Mapa mapa = (Mapa) item;

                            if (mapa.inserirBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item cadastrado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                            break;
                    }

                    DefaultTableModel model = (DefaultTableModel) getTci().gettItem().getModel();
                    model.addRow(new Object[]{item.getId(), item.getTitulo(), item.getEditora(), item.getCdu()});

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(getTci(), "Erro ao acessar o banco de dados!" + ex.getMessage(), "Erro no banco de dados", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                try {
                    DefaultTableModel model = (DefaultTableModel) getTci().gettItem().getModel();

                    Acervo acervo = criarItemParaBusca(model);

                    int index = listAcervo.indexOf(acervo);

                    if (index > -1) {
                        acervo = listAcervo.get(index);

                        if (acervo instanceof Livro livro) {
                            livro.alterarDadosItem(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo, isbn, tamPagina);
                            model.setValueAt(livro.getTitulo(), getTci().gettItem().getSelectedRow(), 1);
                            model.setValueAt(livro.getEditora(), getTci().gettItem().getSelectedRow(), 2);

                            if (livro.alterarBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item alterado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else if (acervo instanceof Periodico periodico) {
                            periodico.alterarDadosItem(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo, isbn, tamPagina, tipo);
                            model.setValueAt(periodico.getTitulo(), getTci().gettItem().getSelectedRow(), 1);
                            model.setValueAt(periodico.getEditora(), getTci().gettItem().getSelectedRow(), 2);

                            if (periodico.alterarBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item alterado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else if (acervo instanceof TC tcc) {
                            tcc.alterarDadosItem(isbn, tipo, tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
                            model.setValueAt(tcc.getTitulo(), getTci().gettItem().getSelectedRow(), 1);
                            model.setValueAt(tcc.getEditora(), getTci().gettItem().getSelectedRow(), 2);

                            if (tcc.alterarBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item alterado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else if (acervo instanceof Relatorio relatorio) {
                            relatorio.alterarDadosItem(isbn, tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
                            model.setValueAt(relatorio.getTitulo(), getTci().gettItem().getSelectedRow(), 1);
                            model.setValueAt(relatorio.getEditora(), getTci().gettItem().getSelectedRow(), 2);

                            if (relatorio.alterarBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item alterado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else if (acervo instanceof Midia midia) {
                            midia.alterarDadosItem(tipo, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
                            model.setValueAt(midia.getTitulo(), getTci().gettItem().getSelectedRow(), 1);
                            model.setValueAt(midia.getEditora(), getTci().gettItem().getSelectedRow(), 2);

                            if (midia.alterarBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item alterado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else if (acervo instanceof Cartaz cartaz) {
                            cartaz.alterarDadosItem(tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
                            model.setValueAt(cartaz.getTitulo(), getTci().gettItem().getSelectedRow(), 1);
                            model.setValueAt(cartaz.getEditora(), getTci().gettItem().getSelectedRow(), 2);

                            if (cartaz.alterarBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item alterado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else if (acervo instanceof Mapa mapa) {
                            mapa.alterarDadosItem(tamPagina, autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, edicao, emprestimo);
                            model.setValueAt(mapa.getTitulo(), getTci().gettItem().getSelectedRow(), 1);
                            model.setValueAt(mapa.getEditora(), getTci().gettItem().getSelectedRow(), 2);

                            if (mapa.alterarBD()) {
                                JOptionPane.showMessageDialog(getTci(), "Item alterado com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                            }

                        }

                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(getTci(), "Erro ao acessar o banco de dados!", "Erro no banco de dados", JOptionPane.ERROR_MESSAGE);
                }

            }

            limparDados();
        } else {
            JOptionPane.showMessageDialog(getTci(), "Você não pode cadastrar o mesmo item duas vezes!", "Erro ao cadastrar item", JOptionPane.ERROR_MESSAGE);
        }

    }

    public boolean validarCampos() {
        if (getTci().getTxtAutor1().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtAutor2().getText().isBlank()) {
            return false;
        }
        if (getTci().getlTitulo().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtEditora().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtEdicao().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtEditora().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtAssunto().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtPalavrachave1().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtPalavrachave2().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtCidade().getText().isBlank()) {
            return false;
        }
        if (getTci().getFtfCdu().getText().isBlank()) {
            return false;
        }
        if (getTci().getFtfISBN().getText().isBlank()) {
            return false;
        }
        if (getTci().getFtfPagina().getText().isBlank()) {
            return false;
        }
        if (getTci().getTxtAno().getText().isBlank()) {
            return false;
        }

        Acervo acervo = new Acervo();
        acervo.setCdu(getTci().getFtfCdu().getText());

        if (listAcervo.contains(acervo) && !emprestimo) {
            return false;
        }

        return true;
    }

    public Acervo criarItemParaBusca(DefaultTableModel model) {
        String cdu = (String) model.getValueAt(getTci().gettItem().getSelectedRow(), 3);
        Integer id = (Integer) model.getValueAt(getTci().gettItem().getSelectedRow(), 0);

        Acervo acervo = new Acervo();
        acervo.setId(id);
        acervo.setCdu(cdu);

        return acervo;
    }

    public void limparDados() {
        getTci().getTxtAutor1().setText("");
        getTci().getTxtAutor2().setText("");
        getTci().getTxtTitulo().setText("");
        getTci().getTxtEditora().setText("");
        getTci().getTxtAssunto().setText("");
        getTci().getTxtPalavrachave1().setText("");
        getTci().getTxtPalavrachave2().setText("");
        getTci().getTxtCidade().setText("");
        getTci().getTxtAno().setText("");
        getTci().getTxtEdicao().setText("");
        getTci().getFtfCdu().setText("");
        getTci().getFtfISBN().setText("");
        getTci().getFtfPagina().setText("");
        getTci().getCbxEmprestado().setSelected(false);
        getTci().getCbTipo().setSelectedIndex(0);

        emprestimo = false;

        limparSelecaoTabela();

        getTci().gettItem().setEnabled(true);
        getTci().getFtfCdu().setEnabled(true);
    }

    public void limparSelecaoTabela() {
        if (!emprestimo) {
            getTci().gettItem().clearSelection();
        }

        getTci().getBtnExcluir().setEnabled(false);
        getTci().getBtnEmprestimo().setEnabled(false);
    }

    public void excluirDados() {
        if (getTci().gettItem().getSelectedRow() >= 0) {
            try {
                DefaultTableModel model = (DefaultTableModel) getTci().gettItem().getModel();
                Integer tipo;
                Acervo acervo = criarItemParaBusca(model);

                int index = listAcervo.indexOf(acervo);

                if (index > -1) {
                    acervo = listAcervo.get(index);
                }

                listAcervo.remove(acervo);

                model.removeRow(getTci().gettItem().getSelectedRow());
                getTci().getBtnExcluir().setEnabled(false);
                getTci().getBtnEmprestimo().setEnabled(false);

                if (acervo instanceof Livro livro) {
                    if (livro.exlcuirBD()) {
                        JOptionPane.showMessageDialog(getTci(), "Item excluido com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (acervo instanceof Periodico periodico) {
                    if (periodico.exlcuirBD()) {
                        JOptionPane.showMessageDialog(getTci(), "Item excluido com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (acervo instanceof TC tcc) {
                    if (tcc.exlcuirBD()) {
                        JOptionPane.showMessageDialog(getTci(), "Item excluido com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (acervo instanceof Relatorio relatorio) {
                    if (relatorio.exlcuirBD()) {
                        JOptionPane.showMessageDialog(getTci(), "Item excluido com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (acervo instanceof Midia midia) {
                    if (midia.exlcuirBD()) {
                        JOptionPane.showMessageDialog(getTci(), "Item excluido com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (acervo instanceof Cartaz cartaz) {
                    if (cartaz.exlcuirBD()) {
                        JOptionPane.showMessageDialog(getTci(), "Item excluido com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (acervo instanceof Mapa mapa) {
                    if (mapa.exlcuirBD()) {
                        JOptionPane.showMessageDialog(getTci(), "Item excluido com sucesso!", "Cadastro de item", JOptionPane.INFORMATION_MESSAGE);
                    }

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(getTci(), "Erro ao acessar o banco de dados!", "Erro no banco de dados", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void realizarEmprestimo() {
        if (getTci().gettItem().getSelectedRow() >= 0) {
            DefaultTableModel model = (DefaultTableModel) getTci().gettItem().getModel();
            Acervo acervo = criarItemParaBusca(model);

            int index = listAcervo.indexOf(acervo);

            if (index > -1) {
                acervo = listAcervo.get(index);
                setInfoAcervo(acervo);
            }

            getTci().getFtfCdu().setEnabled(false);
            getTci().getBtnEmprestimo().setEnabled(false);
            getTci().getBtnExcluir().setEnabled(false);
            emprestimo = true;
        }
    }

    public void setInfoAcervo(Acervo acervo) {
        getTci().getTxtAutor1().setText(acervo.getAutor1());
        getTci().getTxtAutor2().setText(acervo.getAutor2());
        getTci().getTxtTitulo().setText(acervo.getTitulo());
        getTci().getTxtEditora().setText(acervo.getEditora());
        getTci().getTxtAssunto().setText(acervo.getAssunto());
        getTci().getTxtPalavrachave1().setText(acervo.getPalavraChave1());
        getTci().getTxtPalavrachave2().setText(acervo.getPalavraChave2());
        getTci().getTxtCidade().setText(acervo.getCidade());

        String ano = String.valueOf(acervo.getAno());
        getTci().getTxtAno().setText(ano);

        String edicao = String.valueOf(acervo.getEdicao());
        getTci().getTxtEdicao().setText(edicao);

        getTci().getFtfCdu().setText(acervo.getCdu());

        if (acervo instanceof Livro livro) {
            getTci().getFtfISBN().setText(livro.getIsbn());
            getTci().getFtfPagina().setText(livro.getTamanhoPag());
            getTci().getCbTipo().setSelectedIndex(0);
        } else if (acervo instanceof Periodico periodico) {
            getTci().getFtfISBN().setText(periodico.getIsbn());
            getTci().getFtfPagina().setText(periodico.getTamanhoPag());
            getTci().getCbTipo().setSelectedIndex(1);
            setInfoPeriodico(periodico);
        } else if (acervo instanceof TC tcc) {
            getTci().getFtfISBN().setText(tcc.getIsbn());
            getTci().getFtfPagina().setText(tcc.getTamanhoPag());
            getTci().getCbTipo().setSelectedIndex(2);
            setInfoTcc(tcc);
        } else if (acervo instanceof Relatorio relatorio) {
            getTci().getFtfISBN().setText(relatorio.getIsbn());
            getTci().getFtfPagina().setText(relatorio.getTamanhoPag());
            getTci().getCbTipo().setSelectedIndex(3);
        } else if (acervo instanceof Midia midia) {
            getTci().getFtfPagina().setText("");
            getTci().getCbTipo().setSelectedIndex(4);
            setInfoMidia(midia);
        } else if (acervo instanceof Cartaz cartaz) {
            getTci().getFtfPagina().setText(cartaz.getTamanhoPag());
            getTci().getCbTipo().setSelectedIndex(0);
        } else if (acervo instanceof Mapa mapa) {
            getTci().getFtfPagina().setText(mapa.getTamanhoPag());
            getTci().getCbTipo().setSelectedIndex(0);
        }

        getTci().getCbxEmprestado().setSelected(false);
    }

    public void setInfoPeriodico(Periodico periodico) {
        if (periodico.getTipoPeriodico().equalsIgnoreCase("Revista")) {
            getTci().getCbCategoria().setSelectedIndex(0);
        } else {
            getTci().getCbCategoria().setSelectedIndex(1);
        }
    }

    public void setInfoTcc(TC tcc) {
        if (tcc.getTipoTC().equalsIgnoreCase("Monografia")) {
            getTci().getCbCategoria().setSelectedIndex(0);
        } else if (tcc.getTipoTC().equalsIgnoreCase("Dissertação")) {
            getTci().getCbCategoria().setSelectedIndex(1);
        } else {
            getTci().getCbCategoria().setSelectedIndex(2);
        }
    }

    public void setInfoMidia(Midia midia) {
        if (midia.getTipoMidia().equalsIgnoreCase("Fita")) {
            getTci().getCbCategoria().setSelectedIndex(0);
        } else if (midia.getTipoMidia().equalsIgnoreCase("VHS")) {
            getTci().getCbCategoria().setSelectedIndex(1);
        } else if (midia.getTipoMidia().equalsIgnoreCase("CD")) {
            getTci().getCbCategoria().setSelectedIndex(2);
        } else {
            getTci().getCbCategoria().setSelectedIndex(3);
        }
    }

    /**
     * @return the tci
     */
    public TelaCadastroItem getTci() {
        return tci;
    }

    /**
     * @param tci the tci to set
     */
    public void setTci(TelaCadastroItem tci) {
        this.tci = tci;
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
     * @return the emprestimo
     */
    public boolean isEmprestimo() {
        return emprestimo;
    }

    /**
     * @param emprestimo the emprestimo to set
     */
    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
}
