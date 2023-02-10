#include "Periodico.h"

Periodico::Periodico()
{
}

Periodico::Periodico(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao, string isbn, int numPaginas, float tamanhoPag, char tipoPeriodico) : Acervo(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao){
	setIsbn(isbn);
	setTipoPeriodico(tipoPeriodico);
	setNumPaginas(numPaginas);
	setTamanhoPag(tamanhoPag);
}

Periodico::~Periodico()
{
}

char Periodico::getTipoPeriodico(){
	return tipoPeriodico;
}
int Periodico::getNumPaginas(){
	return numPaginas;
}
float Periodico::getTamanhoPag(){
	return tamanhoPag;
}
string Periodico::getIsbn(){
	return isbn;
}

void Periodico::setTipoPeriodico(char tipoPeriodico){
	switch(tipoPeriodico){
		case 'R':
			this->tipoPeriodico = 'R';
			break;
		case 'J':
			this->tipoPeriodico = 'J';
			break;
		case 'r':
			this->tipoPeriodico = 'R';
			break;
		case 'j':
			this->tipoPeriodico = 'J';
			break;
	}
}
void Periodico::setNumPaginas(int numPaginas){
	this->numPaginas = numPaginas;
}
void Periodico::setTamanhoPag(int tamanhoPag){
	this->tamanhoPag = tamanhoPag;
}
void Periodico::setIsbn(string isbn){
	this->isbn = isbn;
}

void Periodico::fichaCatalografica(){
	Acervo::fichaCatalografica();
	
	cout << numPaginas << "pág. : " << tamanhoPag << "cm\n";
	cout << "ISBN: " << isbn << endl;
	
	Acervo::fichaCatalograficaFinal();
}
