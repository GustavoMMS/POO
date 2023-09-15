/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.FichaController;

/**
 *
 * @author Gustavo
 */
public class TelaFicha extends javax.swing.JFrame {
    
    private FichaController control;

    /**
     * Creates new form TelaFicha
     */
    public TelaFicha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lAutor1 = new javax.swing.JLabel();
        lAutor2 = new javax.swing.JLabel();
        lTitulo1 = new javax.swing.JLabel();
        lHifien1 = new javax.swing.JLabel();
        lEdicao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lHifien2 = new javax.swing.JLabel();
        lCidade = new javax.swing.JLabel();
        lPonto1 = new javax.swing.JLabel();
        lPonto2 = new javax.swing.JLabel();
        lDoisPontos = new javax.swing.JLabel();
        lEditora = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lAno = new javax.swing.JLabel();
        lPonto3 = new javax.swing.JLabel();
        lPagina = new javax.swing.JLabel();
        lIsbn = new javax.swing.JLabel();
        lIsbnSet = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lAssunto = new javax.swing.JLabel();
        lPontoI = new javax.swing.JLabel();
        lPalavraChave1 = new javax.swing.JLabel();
        lPontoII = new javax.swing.JLabel();
        lPalavraChave2 = new javax.swing.JLabel();
        lPontoIII = new javax.swing.JLabel();
        lTitulo2 = new javax.swing.JLabel();
        lCdu = new javax.swing.JLabel();
        lCduSet = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lFichaCatalografica = new javax.swing.JLabel();

        jLabel7.setText("-");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lAutor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lAutor1.setText("Autor 1");

        lAutor2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lAutor2.setText("Autor 2");

        lTitulo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lTitulo1.setText("Titulo da obra");

        lHifien1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lHifien1.setText("-");

        lEdicao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lEdicao.setText("numero");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Edição");

        lHifien2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lHifien2.setText("-");

        lCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCidade.setText("Cidade");

        lPonto1.setText(".");

        lPonto2.setText(".");

        lDoisPontos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lDoisPontos.setText(":");

        lEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lEditora.setText("Editora");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText(",");

        lAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lAno.setText("Ano");

        lPonto3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPonto3.setText(".");

        lPagina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPagina.setText("nnn");

        lIsbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lIsbn.setText("ISBN:");

        lIsbnSet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lIsbnSet.setText("nnn");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("1.");

        lAssunto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lAssunto.setText("Assunto");

        lPontoI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPontoI.setText(". I.");

        lPalavraChave1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPalavraChave1.setText("Palavra-chave 1");

        lPontoII.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPontoII.setText(". II.");

        lPalavraChave2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPalavraChave2.setText("Palavra-chave 2");

        lPontoIII.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lPontoIII.setText(". III.");

        lTitulo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lTitulo2.setText("Titulo");

        lCdu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCdu.setText("CDU:");

        lCduSet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCduSet.setText("nnn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPonto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAutor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPonto2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lIsbn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lIsbnSet))
                                            .addComponent(lPagina))
                                        .addGap(197, 197, 197))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lTitulo1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lHifien1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lEdicao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lHifien2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lCidade)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lDoisPontos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lEditora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPonto3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lCdu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAssunto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPontoI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPalavraChave1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPontoII)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lPalavraChave2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lPontoIII)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lTitulo2))
                            .addComponent(lCduSet))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAutor2)
                    .addComponent(lPonto1)
                    .addComponent(lPonto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTitulo1)
                    .addComponent(lHifien1)
                    .addComponent(lEdicao)
                    .addComponent(jLabel6)
                    .addComponent(lHifien2)
                    .addComponent(lCidade)
                    .addComponent(lDoisPontos)
                    .addComponent(lEditora)
                    .addComponent(jLabel14)
                    .addComponent(lAno)
                    .addComponent(lPonto3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPagina)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIsbn)
                    .addComponent(lIsbnSet))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lAssunto)
                    .addComponent(lPontoI)
                    .addComponent(lPalavraChave1)
                    .addComponent(lPontoII)
                    .addComponent(lPalavraChave2)
                    .addComponent(lPontoIII)
                    .addComponent(lTitulo2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCdu)
                            .addComponent(lCduSet))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        lFichaCatalografica.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        lFichaCatalografica.setText("Ficha Catalográfica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lFichaCatalografica, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFichaCatalografica, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lAno;
    private javax.swing.JLabel lAssunto;
    private javax.swing.JLabel lAutor1;
    private javax.swing.JLabel lAutor2;
    private javax.swing.JLabel lCdu;
    private javax.swing.JLabel lCduSet;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lDoisPontos;
    private javax.swing.JLabel lEdicao;
    private javax.swing.JLabel lEditora;
    private javax.swing.JLabel lFichaCatalografica;
    private javax.swing.JLabel lHifien1;
    private javax.swing.JLabel lHifien2;
    private javax.swing.JLabel lIsbn;
    private javax.swing.JLabel lIsbnSet;
    private javax.swing.JLabel lPagina;
    private javax.swing.JLabel lPalavraChave1;
    private javax.swing.JLabel lPalavraChave2;
    private javax.swing.JLabel lPonto1;
    private javax.swing.JLabel lPonto2;
    private javax.swing.JLabel lPonto3;
    private javax.swing.JLabel lPontoI;
    private javax.swing.JLabel lPontoII;
    private javax.swing.JLabel lPontoIII;
    private javax.swing.JLabel lTitulo1;
    private javax.swing.JLabel lTitulo2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the control
     */
    public FichaController getControl() {
        return control;
    }

    /**
     * @param control the control to set
     */
    public void setControl(FichaController control) {
        this.control = control;
    }

    /**
     * @return the jLabel14
     */
    public javax.swing.JLabel getjLabel14() {
        return jLabel14;
    }

    /**
     * @param jLabel14 the jLabel14 to set
     */
    public void setjLabel14(javax.swing.JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    /**
     * @return the jLabel20
     */
    public javax.swing.JLabel getjLabel20() {
        return jLabel20;
    }

    /**
     * @param jLabel20 the jLabel20 to set
     */
    public void setjLabel20(javax.swing.JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the lAno
     */
    public javax.swing.JLabel getlAno() {
        return lAno;
    }

    /**
     * @param lAno the lAno to set
     */
    public void setlAno(javax.swing.JLabel lAno) {
        this.lAno = lAno;
    }

    /**
     * @return the lAssunto
     */
    public javax.swing.JLabel getlAssunto() {
        return lAssunto;
    }

    /**
     * @param lAssunto the lAssunto to set
     */
    public void setlAssunto(javax.swing.JLabel lAssunto) {
        this.lAssunto = lAssunto;
    }

    /**
     * @return the lAutor1
     */
    public javax.swing.JLabel getlAutor1() {
        return lAutor1;
    }

    /**
     * @param lAutor1 the lAutor1 to set
     */
    public void setlAutor1(javax.swing.JLabel lAutor1) {
        this.lAutor1 = lAutor1;
    }

    /**
     * @return the lAutor2
     */
    public javax.swing.JLabel getlAutor2() {
        return lAutor2;
    }

    /**
     * @param lAutor2 the lAutor2 to set
     */
    public void setlAutor2(javax.swing.JLabel lAutor2) {
        this.lAutor2 = lAutor2;
    }

    /**
     * @return the lCdu
     */
    public javax.swing.JLabel getlCdu() {
        return lCdu;
    }

    /**
     * @param lCdu the lCdu to set
     */
    public void setlCdu(javax.swing.JLabel lCdu) {
        this.lCdu = lCdu;
    }

    /**
     * @return the lCduSet
     */
    public javax.swing.JLabel getlCduSet() {
        return lCduSet;
    }

    /**
     * @param lCduSet the lCduSet to set
     */
    public void setlCduSet(javax.swing.JLabel lCduSet) {
        this.lCduSet = lCduSet;
    }

    /**
     * @return the lCidade
     */
    public javax.swing.JLabel getlCidade() {
        return lCidade;
    }

    /**
     * @param lCidade the lCidade to set
     */
    public void setlCidade(javax.swing.JLabel lCidade) {
        this.lCidade = lCidade;
    }

    /**
     * @return the lDoisPontos
     */
    public javax.swing.JLabel getlDoisPontos() {
        return lDoisPontos;
    }

    /**
     * @param lDoisPontos the lDoisPontos to set
     */
    public void setlDoisPontos(javax.swing.JLabel lDoisPontos) {
        this.lDoisPontos = lDoisPontos;
    }

    /**
     * @return the lEdicao
     */
    public javax.swing.JLabel getlEdicao() {
        return lEdicao;
    }

    /**
     * @param lEdicao the lEdicao to set
     */
    public void setlEdicao(javax.swing.JLabel lEdicao) {
        this.lEdicao = lEdicao;
    }

    /**
     * @return the lEditora
     */
    public javax.swing.JLabel getlEditora() {
        return lEditora;
    }

    /**
     * @param lEditora the lEditora to set
     */
    public void setlEditora(javax.swing.JLabel lEditora) {
        this.lEditora = lEditora;
    }

    /**
     * @return the lFichaCatalografica
     */
    public javax.swing.JLabel getlFichaCatalografica() {
        return lFichaCatalografica;
    }

    /**
     * @param lFichaCatalografica the lFichaCatalografica to set
     */
    public void setlFichaCatalografica(javax.swing.JLabel lFichaCatalografica) {
        this.lFichaCatalografica = lFichaCatalografica;
    }

    /**
     * @return the lHifien1
     */
    public javax.swing.JLabel getlHifien1() {
        return lHifien1;
    }

    /**
     * @param lHifien1 the lHifien1 to set
     */
    public void setlHifien1(javax.swing.JLabel lHifien1) {
        this.lHifien1 = lHifien1;
    }

    /**
     * @return the lHifien2
     */
    public javax.swing.JLabel getlHifien2() {
        return lHifien2;
    }

    /**
     * @param lHifien2 the lHifien2 to set
     */
    public void setlHifien2(javax.swing.JLabel lHifien2) {
        this.lHifien2 = lHifien2;
    }

    /**
     * @return the lIsbn
     */
    public javax.swing.JLabel getlIsbn() {
        return lIsbn;
    }

    /**
     * @param lIsbn the lIsbn to set
     */
    public void setlIsbn(javax.swing.JLabel lIsbn) {
        this.lIsbn = lIsbn;
    }

    /**
     * @return the lIsbnSet
     */
    public javax.swing.JLabel getlIsbnSet() {
        return lIsbnSet;
    }

    /**
     * @param lIsbnSet the lIsbnSet to set
     */
    public void setlIsbnSet(javax.swing.JLabel lIsbnSet) {
        this.lIsbnSet = lIsbnSet;
    }

    /**
     * @return the lPagina
     */
    public javax.swing.JLabel getlPagina() {
        return lPagina;
    }

    /**
     * @param lPagina the lPagina to set
     */
    public void setlPagina(javax.swing.JLabel lPagina) {
        this.lPagina = lPagina;
    }

    /**
     * @return the lPalavraChave1
     */
    public javax.swing.JLabel getlPalavraChave1() {
        return lPalavraChave1;
    }

    /**
     * @param lPalavraChave1 the lPalavraChave1 to set
     */
    public void setlPalavraChave1(javax.swing.JLabel lPalavraChave1) {
        this.lPalavraChave1 = lPalavraChave1;
    }

    /**
     * @return the lPalavraChave2
     */
    public javax.swing.JLabel getlPalavraChave2() {
        return lPalavraChave2;
    }

    /**
     * @param lPalavraChave2 the lPalavraChave2 to set
     */
    public void setlPalavraChave2(javax.swing.JLabel lPalavraChave2) {
        this.lPalavraChave2 = lPalavraChave2;
    }

    /**
     * @return the lPonto1
     */
    public javax.swing.JLabel getlPonto1() {
        return lPonto1;
    }

    /**
     * @param lPonto1 the lPonto1 to set
     */
    public void setlPonto1(javax.swing.JLabel lPonto1) {
        this.lPonto1 = lPonto1;
    }

    /**
     * @return the lPonto2
     */
    public javax.swing.JLabel getlPonto2() {
        return lPonto2;
    }

    /**
     * @param lPonto2 the lPonto2 to set
     */
    public void setlPonto2(javax.swing.JLabel lPonto2) {
        this.lPonto2 = lPonto2;
    }

    /**
     * @return the lPonto3
     */
    public javax.swing.JLabel getlPonto3() {
        return lPonto3;
    }

    /**
     * @param lPonto3 the lPonto3 to set
     */
    public void setlPonto3(javax.swing.JLabel lPonto3) {
        this.lPonto3 = lPonto3;
    }

    /**
     * @return the lPontoI
     */
    public javax.swing.JLabel getlPontoI() {
        return lPontoI;
    }

    /**
     * @param lPontoI the lPontoI to set
     */
    public void setlPontoI(javax.swing.JLabel lPontoI) {
        this.lPontoI = lPontoI;
    }

    /**
     * @return the lPontoII
     */
    public javax.swing.JLabel getlPontoII() {
        return lPontoII;
    }

    /**
     * @param lPontoII the lPontoII to set
     */
    public void setlPontoII(javax.swing.JLabel lPontoII) {
        this.lPontoII = lPontoII;
    }

    /**
     * @return the lPontoIII
     */
    public javax.swing.JLabel getlPontoIII() {
        return lPontoIII;
    }

    /**
     * @param lPontoIII the lPontoIII to set
     */
    public void setlPontoIII(javax.swing.JLabel lPontoIII) {
        this.lPontoIII = lPontoIII;
    }

    /**
     * @return the lTitulo1
     */
    public javax.swing.JLabel getlTitulo1() {
        return lTitulo1;
    }

    /**
     * @param lTitulo1 the lTitulo1 to set
     */
    public void setlTitulo1(javax.swing.JLabel lTitulo1) {
        this.lTitulo1 = lTitulo1;
    }

    /**
     * @return the lTitulo2
     */
    public javax.swing.JLabel getlTitulo2() {
        return lTitulo2;
    }

    /**
     * @param lTitulo2 the lTitulo2 to set
     */
    public void setlTitulo2(javax.swing.JLabel lTitulo2) {
        this.lTitulo2 = lTitulo2;
    }
}
