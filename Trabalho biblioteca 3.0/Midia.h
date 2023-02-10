#ifndef MIDIA_H
#define MIDIA_H

#include "Acervo.h"

class Midia : public Acervo
{
	private:
		char tipoMidia;
		
	public:
		Midia();
		Midia(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, char tipoMidia);
		~Midia();
		
		char getTipoMidia();
		
		void setTipoMidia(char tipoMidia);
		
		void fichaCatalografica();
		
	protected:
};

#endif
