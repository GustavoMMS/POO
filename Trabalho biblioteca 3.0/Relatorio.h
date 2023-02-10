#ifndef RELATORIO_H
#define RELATORIO_H

#include "Acervo.h"

class Relatorio : public Acervo
{
	private:
		string isbn;
		int numPaginas;
		float tamanhoPag;
		
	public:
		Relatorio();
		Relatorio(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, string isbn, int numPaginas, float tamanhoPag);

		~Relatorio();
		
		string getIsbn();
		int getNumPaginas();
		float getTamanhoPag();
		
		void setIsbn(string isbn);
		void setNumPaginas(int numPaginas);
		void setTamanhoPag(float tamanhoPag);
		
		void fichaCatalografica();
		
	protected:
};

#endif
