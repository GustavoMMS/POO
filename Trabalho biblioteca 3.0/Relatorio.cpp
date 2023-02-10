#include "Relatorio.h"

Relatorio::Relatorio()
{
}

Relatorio::Relatorio(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, string isbn, int numPaginas, float tamanhoPag) : Acervo(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao){
	setIsbn(isbn);
	setNumPaginas(numPaginas);
	setTamanhoPag(tamanhoPag);
}

Relatorio::~Relatorio()
{
}

string Relatorio::getIsbn(){
	return isbn;
}
int Relatorio::getNumPaginas(){
	return numPaginas;
}
float Relatorio::getTamanhoPag(){
	return tamanhoPag;
}

void Relatorio::setIsbn(string isbn){
	this->isbn = isbn;
}
void Relatorio::setNumPaginas(int numPaginas){
	this->numPaginas = numPaginas;
}
void Relatorio::setTamanhoPag(float tamanhoPag){
	this->tamanhoPag = tamanhoPag;
}

void Relatorio::fichaCatalografica(){
	Acervo::fichaCatalografica();
	
	cout << numPaginas << "pág. : " << tamanhoPag << "cm\n";
	cout << "ISBN: " << isbn << endl;
	
	Acervo::fichaCatalograficaFinal();
}
