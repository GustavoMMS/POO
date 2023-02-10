#include "Cartaz.h"

Cartaz::Cartaz()
{
}

Cartaz::Cartaz(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, int numPaginas, float tamanhoPag) : Acervo(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao){
	setNumPaginas(numPaginas);
	setTamanhoPag(tamanhoPag);
}

Cartaz::~Cartaz()
{
}

int Cartaz::getNumPaginas(){
	return numPaginas;
}
float Cartaz::getTamanhoPag(){
	return tamanhoPag;
}

void Cartaz::setNumPaginas(int numPaginas){
	this->numPaginas = numPaginas;
}
void Cartaz::setTamanhoPag(float tamanhoPag){
	this->tamanhoPag = tamanhoPag;
}

void Cartaz::fichaCatalografica(){
	Acervo::fichaCatalografica();
	
	cout << numPaginas << "pág. : " << tamanhoPag << "cm\n";
	
	Acervo::fichaCatalograficaFinal();
}
