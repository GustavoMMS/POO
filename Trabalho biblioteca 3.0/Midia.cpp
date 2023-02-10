#include "Midia.h"

Midia::Midia()
{
}

Midia::Midia(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, char tipoMidia) : Acervo(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao){
	setTipoMidia(tipoMidia);
}


Midia::~Midia()
{
}

char Midia::getTipoMidia(){
	return tipoMidia;
}

void Midia::setTipoMidia(char tipoMidia){
	switch(tipoMidia){
		case 'F':
			this->tipoMidia = 'F';
			break;
		case 'V':
			this->tipoMidia = 'V';
			break;
		case 'C':
			this->tipoMidia = 'C';
			break;
		case 'D':
			this->tipoMidia = 'D';
		case 'f':
			this->tipoMidia = 'F';
			break;
		case 'v':
			this->tipoMidia = 'V';
			break;
		case 'c':
			this->tipoMidia = 'C';
			break;
		case 'd':
			this->tipoMidia = 'D';
	}
}

void Midia::fichaCatalografica(){
	Acervo::fichaCatalografica();
	
	Acervo::fichaCatalograficaFinal();
}
