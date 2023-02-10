#ifndef TC_H
#define TC_H

#include "Acervo.h"

class TC : public Acervo
{
	private:
		string isbn;
		char tipoTC;
		int numPaginas;
		float tamanhoPag;
	public:
		TC();
		TC(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, string isbn, int numPaginas, float tamanhoPag, char tipoTC);
		~TC();
		
		string getIsbn();
		char getTipoTC();
		int getNumPaginas();
		float getTamanhoPag();
		
		void setIsbn(string isbn);
		void setTipoTC(char tipoTC);
		void setNumPaginas(int numPaginas);
		void setTamanhoPag(float tamanhoPag);
		
		void fichaCatalografica();
		
	protected:
};

#endif
