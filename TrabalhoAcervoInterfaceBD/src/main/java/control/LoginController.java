/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JOptionPane;
import view.TelaLogin;
import view.TelaPrincipal;

/**
 *
 * @author Gustavo
 */
public class LoginController {
    private TelaLogin tl;
    private TelaPrincipal tp;
    
    private String user="admin";
    private String pass="123";
    
    public LoginController(TelaLogin tl, TelaPrincipal tp){
        this.tl=tl;
        this.tp=tp;
    }
    
    public void logar(){
        String usuario, senha;
        usuario=getTl().getTxtUsuario().getText();
        senha=String.valueOf(getTl().getPfSenha().getPassword());
        
        if(usuario.equalsIgnoreCase(getUser()) && senha.equalsIgnoreCase(getPass())){
            getTp().getMiCaddastrar().setEnabled(true);
            getTp().getMiItens().setEnabled(true);
            getTp().getMiLogar().setEnabled(false);
            getTl().setVisible(false);
        }else{
            JOptionPane.showMessageDialog(getTl(), "Usuário e/ou senha incorretos!", "Erro ao logar no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @return the tl
     */
    public TelaLogin getTl() {
        return tl;
    }

    /**
     * @param tl the tl to set
     */
    public void setTl(TelaLogin tl) {
        this.tl = tl;
    }

    /**
     * @return the tp
     */
    public TelaPrincipal getTp() {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(TelaPrincipal tp) {
        this.tp = tp;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
}
