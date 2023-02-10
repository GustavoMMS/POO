#include "Mapa.h"

Mapa::Mapa()
{
}

Mapa::Mapa(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, int numPaginas, float tamanhoPag) : Acervo(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao){
	setNumPaginas(numPaginas);
	setTamanhoPag(tamanhoPag);
}


Mapa::~Mapa()
{
}

int Mapa::getNumPaginas(){
	return numPaginas;
}
float Mapa::getTamanhoPag(){
	return tamanhoPag;
}

void Mapa::setNumPaginas(int numPaginas){
	this->numPaginas = numPaginas;
}
void Mapa::setTamanhoPag(float tamanhoPag){
	this->tamanhoPag = tamanhoPag;
}

void Mapa::fichaCatalografica(){
	Acervo::fichaCatalografica();
	
	cout << numPaginas << "pág. : " << tamanhoPag << "cm\n";
	
	Acervo::fichaCatalograficaFinal();
}
