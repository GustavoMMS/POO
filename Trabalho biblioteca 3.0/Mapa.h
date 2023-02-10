#ifndef MAPA_H
#define MAPA_H

#include "Acervo.h"

class Mapa : public Acervo
{
	private:
		int numPaginas;
		float tamanhoPag;
		
	public:
		Mapa();
		Mapa(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, int numPaginas, float tamanhoPag);
		~Mapa();
		
		int getNumPaginas();
		float getTamanhoPag();
		
		void setNumPaginas(int numPaginas);
		void setTamanhoPag(float tamanhoPag);
		
		void fichaCatalografica();
		
	protected:
};

#endif
