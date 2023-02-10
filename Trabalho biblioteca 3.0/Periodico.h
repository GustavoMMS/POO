#ifndef PERIODICO_H
#define PERIODICO_H

#include "Acervo.h"

class Periodico : public Acervo
{
	private:
		char tipoPeriodico;
		int numPaginas;
		float tamanhoPag;
		string isbn;
		
	public:
		Periodico();
		Periodico(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, string isbn, int numPaginas, float tamanhoPag, char tipoPeriodico);
		~Periodico();
		
		char getTipoPeriodico();
		int getNumPaginas();
		float getTamanhoPag();
		string getIsbn();
		
		void setTipoPeriodico(char tipoPeriodico);
		void setNumPaginas(int numPaginas);
		void setTamanhoPag(int tamanhoPag);
		void setIsbn(string isbn);
		
		void fichaCatalografica();
		
	protected:
};

#endif
