#ifndef ACERVO_H
#define ACERVO_H

#include <iostream>

using namespace std;

class Acervo
{
	private:
		string autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu;
		int ano, id, edicao;
		char emprestimo;
		
	public:
		Acervo();
		Acervo(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao);
		~Acervo();
		
		string getAutor1();
		string getAutor2();
		string getTitulo();
		string getEditora();
		string getAssunto();
		string getPalavraChave1();
		string getPalavraChave2();
		string getCidade();
		string getCdu();
		int getAno();
		int getId();
		int getEdicao();
		char getEmprestimo();
		
		void setAutor1(string autor1);
		void setAutor2(string autor2);
		void setTitulo(string titulo);
		void setEditora(string editora);
		void setAssunto(string assunto);
		void setPalavraChave1(string palavraChave1);
		void setPalavraChave2(string palavraChave2);
		void setCidade(string cidade);
		void setCdu(string cdu);
		void setAno(int ano);
		void setId(int id);
		void setEdicao(int edicao);
		void setEmprestimo(char emprestimo);
		
		void imprimirInformacoes();
		virtual void fichaCatalografica();
		void fichaCatalograficaFinal();
		
	protected:
};

#endif
