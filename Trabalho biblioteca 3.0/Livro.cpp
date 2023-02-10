#include "Livro.h"

Livro::Livro()
{
}

Livro::Livro(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, string isbn, int numPaginas, float tamanhoPag) : Acervo(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao){
	setIsbn(isbn);
	setNumPaginas(numPaginas);
	setTamanhoPag(tamanhoPag);
}

Livro::~Livro()
{
}

string Livro::getIsbn(){
	return isbn;
}
int Livro::getNumPaginas(){
	return numPaginas;
}
float Livro::getTamanhoPag(){
	return tamanhoPag;
}

void Livro::setIsbn(string isbn){
	this->isbn = isbn;
}
void Livro::setNumPaginas(int numPaginas){
	this->numPaginas = numPaginas;
}
void Livro::setTamanhoPag(float tamanhoPag){
	this->tamanhoPag = tamanhoPag;
}

void Livro::fichaCatalografica(){
	Acervo::fichaCatalografica();
	
	cout << numPaginas << "pág. : " << tamanhoPag << "cm\n";
	cout << "ISBN: " << isbn << endl;
	
	Acervo::fichaCatalograficaFinal();
}
