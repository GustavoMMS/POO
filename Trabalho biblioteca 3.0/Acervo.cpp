#include "Acervo.h"

Acervo::Acervo()
{
	autor2 = "";
	palavraChave2 = "";
	emprestimo = 0;
}

Acervo::Acervo(string autor1, string autor2, string titulo, string editora, string assunto, string palavraChave1, string palavraChave2, string cidade, string cdu, int ano, int id, char emprestimo, int edicao){
	setAutor1(autor1);
	setAutor2(autor2);
	setTitulo(titulo);
	setEditora(editora);
	setAssunto(assunto);
	setPalavraChave1(palavraChave1);
	setPalavraChave2(palavraChave2);
	setCidade(cidade);
	setCdu(cdu);
	setAno(ano);
	setId(id);
	setEdicao(edicao);
	setEmprestimo(emprestimo);
}

Acervo::~Acervo()
{
}

string Acervo::getAutor1(){
	return autor1;
}
string Acervo::getAutor2(){
	return autor2;
}
string Acervo::getTitulo(){
	return titulo;
}
string Acervo::getEditora(){
	return editora;
}
string Acervo::getAssunto(){
	return assunto;
}
string Acervo::getPalavraChave1(){
	return palavraChave1;
}
string Acervo::getPalavraChave2(){
	return palavraChave2;
}
string Acervo::getCidade(){
	return cidade;
}
string Acervo::getCdu(){
	return cdu;
}
int Acervo::getAno(){
	return ano;
}
int Acervo::getId(){
	return id;
}
int Acervo::getEdicao(){
	return edicao;
}
char Acervo::getEmprestimo(){
	return emprestimo;
}

void Acervo::setAutor1(string autor1){
	this->autor1 = autor1;
}
void Acervo::setAutor2(string autor2){
	this->autor2 = autor2;
}
void Acervo::setTitulo(string titulo){
	this->titulo = titulo; 
}
void Acervo::setEditora(string editora){
	this->editora = editora;
}
void Acervo::setAssunto(string assunto){
	this->assunto = assunto;
}
void Acervo::setPalavraChave1(string palavraChave1){
	this->palavraChave1 = palavraChave1;
}
void Acervo::setPalavraChave2(string palavraChave2){
	this->palavraChave2 = palavraChave2;
}
void Acervo::setCidade(string cidade){
	this->cidade = cidade;
}
void Acervo::setCdu(string cdu){
	this->cdu = cdu;
}
void Acervo::setAno(int ano){
	this->ano = ano;
}
void Acervo::setId(int id){
	this->id = id;
}
void Acervo::setEdicao(int edicao){
	this->edicao = edicao;
}
void Acervo::setEmprestimo(char emprestimo){
	this->emprestimo = emprestimo;
}

void Acervo::imprimirInformacoes(){
	cout << "ID: " << id << "		Titulo: " << titulo << endl;;
}

void Acervo::fichaCatalografica(){
	cout << "-------------------------------------------------------------------------------------\n\n";
	cout << "Autor 1: " << autor1;
	
	if(autor2 != ""){
		cout << ". Autor 2: " << autor2 << "." << endl;
		cout << titulo << " - " << cidade << " : " << editora << ", " << ano << endl;
	}else{
		cout << endl << titulo << " - " << edicao << "ª Edição - " << cidade << " : " << editora << ", " << ano << endl;
	}
}

void Acervo::fichaCatalograficaFinal(){
	cout << "1. " << assunto << ". I. " << palavraChave1;
	
	if(palavraChave2 != ""){
		cout << ". II. " << palavraChave2;
		cout << ". III. " << titulo << ".\n";
		cout << "						CDU: " << cdu << endl << endl;
		cout << "-------------------------------------------------------------------------------------\n\n";
	}else{
		cout << endl << ". III. " << titulo << ".\n";
		cout << "						CDU: " << cdu << endl << endl;
		cout << "-------------------------------------------------------------------------------------\n\n";
	}
}
