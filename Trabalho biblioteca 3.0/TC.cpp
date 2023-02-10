#include "TC.h"

TC::TC()
{
}

TC::TC(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, string isbn, int numPaginas, float tamanhoPag, char tipoTC) : Acervo(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao){
	setIsbn(isbn);
	setTipoTC(tipoTC);
	setNumPaginas(numPaginas);
	setTamanhoPag(tamanhoPag);
}

TC::~TC()
{
}

string TC::getIsbn(){
	return isbn;
}
char TC::getTipoTC(){
	return tipoTC;
}
int TC::getNumPaginas(){
	return numPaginas;
}
float TC::getTamanhoPag(){
	return tamanhoPag;
}

void TC::setIsbn(string isbn){
	this->isbn = isbn;
}
void TC::setTipoTC(char tipoTC){
	switch(tipoTC){
		case 'M':
			this->tipoTC = 'M';
			break;
		case 'D':
			this->tipoTC = 'D';
			break;
		case 'T':
			this->tipoTC = 'T';
			break;
		case 'm':
			this->tipoTC = 'M';
			break;
		case 'd':
			this->tipoTC = 'D';
			break;
		case 't':
			this->tipoTC = 'T';
			break;
	}
}
void TC::setNumPaginas(int numPaginas){
	this->numPaginas = numPaginas;
}
void TC::setTamanhoPag(float tamanhoPag){
	this->tamanhoPag = tamanhoPag;
}

void TC::fichaCatalografica(){
	Acervo::fichaCatalografica();
	
	cout << numPaginas << "pág. : " << tamanhoPag << "cm\n";
	cout << "ISBN: " << isbn << endl;
	
	Acervo::fichaCatalograficaFinal();
}
