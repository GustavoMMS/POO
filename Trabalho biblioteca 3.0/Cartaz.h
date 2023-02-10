#ifndef CARTAZ_H
#define CARTAZ_H

#include "Acervo.h"

class Cartaz : public Acervo
{
	private:
		int numPaginas;
		float tamanhoPag;
		
	public:
		Cartaz();
		Cartaz(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, int numPaginas, float tamanhoPag);
		~Cartaz();
		
		int getNumPaginas();
		float getTamanhoPag();
		
		void setNumPaginas(int numPaginas);
		void setTamanhoPag(float tamanhoPag);
		
		void fichaCatalografica();
		
	protected:
};

#endif
