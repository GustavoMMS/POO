#include <iostream>
#include <locale>
#include <vector>

#include "Livro.h"
#include "Periodico.h"
#include "Relatorio.h"
#include "TC.h"
#include "Cartaz.h"
#include "Midia.h"
#include "Mapa.h"
#include "DadosAcervo.h"

void cadastroItem(Acervo *acervo, int *id){
	(*id)+=1;
	acervo->setId((*id));
	
	cout << "Digite o nome do autor: ";
	string autor1;
	getline(cin, autor1);
	acervo->setAutor1(autor1);
	cin.clear();
	fflush(stdin);
	
	char op;
	
	do{
		cout << "Possui outro autor (S/N): ";
		cin >> op;
		cin.clear();
		fflush(stdin);
		
		if(op != 'S' && op != 's' && op !='N' && op!='n'){
			cout << "Opção inválida!\n";
		}
		else if(op == 's' || op == 'S'){
			cout << "Digite o nome do segundo autor: ";
			string autor2;
			getline(cin, autor2);
			acervo->setAutor2(autor2);
			cin.clear();
			fflush(stdin);
		}
	}while(op != 'S' && op != 's' && op !='N' && op!='n');
	
	cout << "Digite o titulo do livro: ";
	string titulo;
	getline(cin, titulo);
	acervo->setTitulo(titulo);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o número da edição: ";
	int edicao;
	cin >> edicao;
	acervo->setEdicao(edicao);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o nome da editora: ";
	string editora;
	getline(cin, editora);
	acervo->setEditora(editora);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o assunto: ";
	string assunto;
	getline(cin, assunto);
	acervo->setAssunto(assunto);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite uma palavra chave: ";
	string palavraChave1;
	getline(cin, palavraChave1);
	acervo->setPalavraChave1(palavraChave1);
	cin.clear();
	fflush(stdin);
	
	do{
		cout << "Possui outra palavra chave (S/N): ";
		cin >> op;
		cin.clear();
		fflush(stdin);
		
		if(op != 'S' && op != 's' && op !='N' && op!='n'){
			cout << "Opção inválida!\n";
		}
		else if(op == 's' || op == 'S'){
			cout << "Digite a segunda palavra chave: ";
			string palavraChave2;
			getline(cin, palavraChave2);
			acervo->setPalavraChave2(palavraChave2);
			cin.clear();
			fflush(stdin);
		}
	}while(op != 'S' && op != 's' && op !='N' && op!='n');
	
	cout << "Digite a cidade: ";
	string cidade;
	getline(cin, cidade);
	acervo->setCidade(cidade);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o CDU: ";
	string cdu;
	getline(cin, cdu);
	acervo->setCdu(cdu);
	cin.clear();
	fflush(stdin);
}

void cadastrarLivro(Livro *li, int *id){
	cout << "		Cadastro de livro\n";
	
	cadastroItem(li, &(*id));
	
	cout << "Digite o ISBN: ";
	string isbn;
	getline(cin, isbn);
	li->setIsbn(isbn);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o número de páginas: ";
	int numPag;
	cin >> numPag;
	li->setNumPaginas(numPag);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o tamanho das páginas (cm): ";
	float tamPag;
	cin >> tamPag;
	li->setTamanhoPag(tamPag);
	cin.clear();
	fflush(stdin);
	
	cout << endl << endl;
}

void cadastrarPeriodico(Periodico *pe, int *id){
	cout << "		Cadastro de periódico\n";
	
	cadastroItem(pe, &(*id));
	
	cout << "Digite o ISBN: ";
	string isbn;
	getline(cin, isbn);
	pe->setIsbn(isbn);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o número de páginas: ";
	int numPag;
	cin >> numPag;
	pe->setNumPaginas(numPag);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o tamanho das páginas (cm): ";
	float tamPag;
	cin >> tamPag;
	pe->setTamanhoPag(tamPag);
	cin.clear();
	fflush(stdin);
	
	char tipo;
	
	do{
		cout << "R - Revista\n";
		cout << "J - Jornal\n";
		cout << "Digite o tipo de periódico: ";
		cin >> tipo;
		cin.clear();
		fflush(stdin);
		
		if(tipo != 'R' && tipo != 'r' && tipo != 'J' && tipo != 'j'){
			cout << "Opção inválida!\n";
		}
	}while(tipo != 'R' && tipo != 'r' && tipo != 'J' && tipo != 'j');
	
	pe->setTipoPeriodico(tipo);
	
	cout << endl << endl;
}

void cadastrarTC(TC *tc, int *id){
	cout << "		Cadastro de trabalho de conclusão\n";
	
	cadastroItem(tc, &(*id));
	
	cout << "Digite o ISBN: ";
	string isbn;
	getline(cin, isbn);
	tc->setIsbn(isbn);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o número de páginas: ";
	int numPag;
	cin >> numPag;
	tc->setNumPaginas(numPag);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o tamanho das páginas (cm): ";
	float tamPag;
	cin >> tamPag;
	tc->setTamanhoPag(tamPag);
	cin.clear();
	fflush(stdin);
	
	char tipo;
	
	do{
		cout << "M - Monografia\n";
		cout << "D - Dissertação\n";
		cout << "T - Tese\n";
		cout << "Digite o tipo de trabalho de conclusão: ";
		cin >> tipo;
		cin.clear();
		fflush(stdin);
		
		if(tipo != 'M' && tipo != 'm' && tipo != 'D' && tipo != 'd' && tipo != 'T' && tipo != 't'){
			cout << "Opção inválida!\n";
		}
	}while(tipo != 'M' && tipo != 'm' && tipo != 'D' && tipo != 'd' && tipo != 'T' && tipo != 't');
	
	tc->setTipoTC(tipo);
	
	cout << endl << endl;
}

void cadastrarRelatorio(Relatorio *re, int *id){
	cout << "		Cadastro de relatorio\n";
	
	cadastroItem(re, &(*id));
	
	cout << "Digite o ISBN: ";
	string isbn;
	getline(cin, isbn);
	re->setIsbn(isbn);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o número de páginas: ";
	int numPag;
	cin >> numPag;
	re->setNumPaginas(numPag);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o tamanho das páginas (cm): ";
	float tamPag;
	cin >> tamPag;
	re->setTamanhoPag(tamPag);
	cin.clear();
	fflush(stdin);
	
	cout << endl << endl;
}

void cadastrarMidia(Midia *midia, int *id){
	cout << "		Cadastro de midia\n";
	
	cadastroItem(midia, &(*id));
	
	char tipo;
	
	do{
		cout << "F - Fita\n";
		cout << "V - VHS\n";
		cout << "C - CD\n";
		cout << "D - DVD\n";
		cout << "Digite o tipo de trabalho de conclusão: ";
		cin >> tipo;
		cin.clear();
		fflush(stdin);
		
		if(tipo != 'F' && tipo != 'f' && tipo != 'V' && tipo != 'v' && tipo != 'C' && tipo != 'c' && tipo != 'D' && tipo != 'd'){
			cout << "Opção inválida!\n";
		}
	}while(tipo != 'F' && tipo != 'f' && tipo != 'V' && tipo != 'v' && tipo != 'C' && tipo != 'c' && tipo != 'D' && tipo != 'd');
	
	midia->setTipoMidia(tipo);
	
	cout << endl << endl;
}

void cadastrarCartaz(Cartaz *ca, int *id){
	cout << "		Cadastro de cartaz\n";
	
	cadastroItem(ca, &(*id));
	
	cout << "Digite o número de páginas: ";
	int numPag;
	cin >> numPag;
	ca->setNumPaginas(numPag);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o tamanho das páginas (cm): ";
	float tamPag;
	cin >> tamPag;
	ca->setTamanhoPag(tamPag);
	cin.clear();
	fflush(stdin);
	
	cout << endl << endl;
}

void cadastrarMapa(Mapa *mapa, int *id){
	cout << "		Cadastro de cartaz\n";
	
	cadastroItem(mapa, &(*id));
	
	cout << "Digite o número de páginas: ";
	int numPag;
	cin >> numPag;
	mapa->setNumPaginas(numPag);
	cin.clear();
	fflush(stdin);
	
	cout << "Digite o tamanho das páginas (cm): ";
	float tamPag;
	cin >> tamPag;
	mapa->setTamanhoPag(tamPag);
	cin.clear();
	fflush(stdin);
	
	cout << endl << endl;
}

void cadastrarItemAcervo(vector<Acervo *> &listAcervo, int *id){
	int op;
	
	do{
		do{
			cout << "		Cadastro de item\n";
			cout << "1 - Cadastrar livro\n";
			cout << "2 - Cadastrar periódico\n";
			cout << "3 - Cadastrar trabralho de conclusão\n";
			cout << "4 - Cadastrar relatório\n";
			cout << "5 - Cadastrar mídia\n";
			cout << "6 - Cadastrar cartaz\n";
			cout << "7 - Cadastrar mapa\n";
			cout << "8 - Voltar ao menu anterior\n";
			cout << "Entre com a opção: ";
			cin >> op;
			cin.clear();
			fflush(stdin);
			
			if(op < 1 || op > 8){
				cout << "Opção inválida!";
			}
			
			cout << endl << endl;
		}while(op < 1 || op >8);
		
		switch(op){
			case 1:{
				Livro *li = new Livro();
				cadastrarLivro(li, &(*id));
				listAcervo.push_back(li);
				break;
			}
			case 2:{
				Periodico *pe = new Periodico();
				cadastrarPeriodico(pe, &(*id));
				listAcervo.push_back(pe);
				break;
			}
			case 3:{
				TC *tc = new TC();
				cadastrarTC(tc, &(*id));
				listAcervo.push_back(tc);
				break;
			}
			case 4:{
				Relatorio *re =  new Relatorio();
				cadastrarRelatorio(re, &(*id));
				listAcervo.push_back(re);
				break;
			}
			case 5:{
				Midia *midia = new Midia();
				cadastrarMidia(midia, &(*id));
				listAcervo.push_back(midia);
				break;
			}
			case 6:{
				Cartaz *ca = new Cartaz();
				cadastrarCartaz(ca, &(*id));
				listAcervo.push_back(ca);
				break;
			}
			case 7:{
				Mapa *mapa = new Mapa();
				cadastrarMapa(mapa, &(*id));
				listAcervo.push_back(mapa);
				break;
			}
		}
	}while(op != 8);
}

Acervo *buscarItem(vector<Acervo *> &listAcervo){
	cout << "Digite o id do item: ";
	int id;
	cin >> id;
	cin.clear();
	fflush(stdin);
	
	for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
		if(id == (*it)->getId() ){
			return (*it);
		}
	}
}

void imprimirTodos(vector<Acervo *> &listAcervo){
	for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
		(*it)->imprimirInformacoes();
	}
}

void verificaClasse(vector<Acervo *> &listAcervo, int op){
	for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
		Acervo *acervo = (*it);
		
		if(dynamic_cast<Livro *>((*it)) && op == 2){
			cout << "Livros\n";
			(*it)->imprimirInformacoes();
		}
		else if(dynamic_cast<Periodico *>((*it)) && op ==3){
			cout << "Periodicos\n";
			(*it)->imprimirInformacoes();
		}
		else if(dynamic_cast<TC *>((*it)) && op == 4){
			cout << "Trabalhos de conclusão\n";
			(*it)->imprimirInformacoes();
		}
		else if(dynamic_cast<Relatorio *>((*it)) && op == 5){
			cout << "Relatorios\n";
			(*it)->imprimirInformacoes();
		}
		else if(dynamic_cast<Midia *>((*it)) && op == 6){
			cout << "Midias\n";
			(*it)->imprimirInformacoes();
		}
		else if(dynamic_cast<Cartaz *>((*it)) && op ==7){
			cout << "Cartazes\n";
			(*it)->imprimirInformacoes();
		}else{
			cout << "Mapas\n";
			(*it)->imprimirInformacoes();
		}
	}
	
	cout << endl << endl;
	
}

void listarItens(vector<Acervo*> &listAcervo){
	int op;
	
	do{
		do{
			cout << "		Biblioteca Universitária\n";
			cout << "1 - Listar todos os itens\n";
			cout << "2 - Listar livros\n";
			cout << "3 - Listar periódicos\n";
			cout << "4 - Listar trabalhos de conclusão\n";
			cout << "5 - Listar relatórios\n";
			cout << "6 - Listar mídias\n";
			cout << "7 - Listar cartazes\n";
			cout << "8 - Listar mapas\n";
			cout << "9 - Voltar ao menu anterior\n";
			cout << "Entre com a opção: ";
			cin >> op;
			cin.clear();
			fflush(stdin);
			
			if(op < 1 || op > 9){
				cout << "Opção inválida!";
			}
			
			cout << endl << endl;
		}while(op < 1 || op > 9);
		
		switch(op){
			case 1:{
				imprimirTodos(listAcervo);
				break;
			}
			case 2:{
				verificaClasse(listAcervo, op);
				break;
			}
			case 3:
				verificaClasse(listAcervo, op);
				break;
			case 4:
				verificaClasse(listAcervo, op);
				break;
			case 5:
				verificaClasse(listAcervo, op);
				break;
			case 6:
				verificaClasse(listAcervo, op);
				break;
			case 7:
				verificaClasse(listAcervo, op);
				break;
			case 8:
				verificaClasse(listAcervo, op);
				break;
		}
	}while(op != 9);
}

bool exlcuirItem(vector<Acervo *> &listAcervo){
	cout << "		Deletar item\n";
	cout << "Digite o id do item: ";
	int id;
	cin >> id;
	cin.clear();
	fflush(stdin);
	
	for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
		if(id == (*it)->getId() ){
			listAcervo.erase(it);
			return true;
		}
	}
	
	return false;
}

void administrarAcervo(vector<Acervo *> &listAcervo, int *id, DadosAcervo *da){
	int op;
	
	do{
		do{
			cout << "		Biblioteca Universitária\n";
			cout << "1 - Listar itens do acervo\n";
			cout << "2 - Cadastrar item no acervo\n";
			cout << "3 - Deletar item do acervo\n";
			cout << "4 - Voltar ao menu anterior\n";
			cout << "Entre com a opção: ";
			cin >> op;
			cin.clear();
			fflush(stdin);
			
			if(op < 1 || op > 4){
				cout << "Opção inválida!";
			}
			
			cout << endl << endl;
		}while(op < 1 || op > 4);
		
		switch(op){
			case 1:
				listarItens(listAcervo);
				break;
			case 2:
				cadastrarItemAcervo(listAcervo, &(*id));
				da->gravarDadosAcervo(listAcervo);
				break;
			case 3:{
				if(!listAcervo.empty()){
					bool excluir = exlcuirItem(listAcervo);
					
					if(excluir){
						cout << "Item exlcuído!\n";
					}else{
						cout << "Item não encontrado!\n";
					}
				}
				break;
			}
		}
		
		cout << endl << endl;
	}while(op != 4);
}

void fornecerFichaCatalografica(vector<Acervo *> &listAcervo){
	Acervo *acervo = buscarItem(listAcervo);
	
	acervo->fichaCatalografica();
}

void fichaCatalografica(vector<Acervo *> &listAcervo){
	int op;
	
	do{
		do{
			cout << "		Biblioteca Universitária\n";
			cout << "1 - Listar itens do acervo\n";
			cout << "2 - Fornecer ficha catalográfica\n";
			cout << "3 - Voltar ao menu anterior\n";
			cout << "Entre com a opção: ";
			cin >> op;
			cin.clear();
			fflush(stdin);
			
			if(op < 1 || op > 3){
				cout << "Opção inválida!";
			}
			
			cout << endl << endl;
		}while(op < 1 || op > 3);
		
		switch(op){
			case 1:
				listarItens(listAcervo);
				break;
			case 2:
				fornecerFichaCatalografica(listAcervo);
				break;
		}
	}while(op != 3);
}

void emprestimoItem(vector<Acervo *> &listAcervo){
	cout << "		Emprestimo de item\n";
	cout << "Digite o id do item: ";
	int id;
	cin >> id;
	cin.clear();
	fflush(stdin);
	
	for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
		if(id == (*it)->getId() ){
			int emprestimo = 1;
			(*it)->setEmprestimo(emprestimo);
		}
	}
}

void realizarEmprestimo(vector<Acervo *> &listAcervo){
	int op;
	
	do{
		do{
			cout << "		Biblioteca Universitária\n";
			cout << "1 - Listar itens do acervo\n";
			cout << "2 - Emprestar item do acervo\n";
			cout << "3 - Voltar ao menu anterior\n";
			cout << "Entre com a opção: ";
			cin >> op;
			cin.clear();
			fflush(stdin);
			
			if(op < 1 || op > 3){
				cout << "Opção inválida!";
			}
			
			cout << endl << endl;
		}while(op < 1 || op > 3);
		
		switch(op){
			case 1:
				listarItens(listAcervo);
				break;
			case 2:
				emprestimoItem(listAcervo);
				break;
		}
	}while(op != 3);
}

int main(int argc, char** argv){
	setlocale(LC_ALL, "");
	system("chcp 1252 > nul");
	
	vector<Acervo *> listAcervo;
	DadosAcervo *da = new DadosAcervo();
	
	da->lerDadosAcervo(listAcervo);
	
	int op, id=0;
	
	do{
		do{
			cout << "		Biblioteca Universitária\n";
			cout << "1 - Realizar emprestimo de item do acervo\n";
			cout << "2 - Pesquisar informações de item do acervo\n";
			cout << "3 - Imprimir ficha catalográfica de item do acervo\n";
			cout << "4 - Admistrar item do acervo\n";
			cout << "5 - Sair\n";
			cout << "Entre com a opção: ";
			cin >> op;
			cin.clear();
			fflush(stdin);
			
			if(op < 1 || op > 5){
				cout << "Opção inválida!";
			}
		}while(op < 1 || op > 5);
		
		cout << endl << endl;
		
		switch(op){
			case 1:
				realizarEmprestimo(listAcervo);
				break;
			case 2:
				listarItens(listAcervo);
				break;
			case 3:
				fichaCatalografica(listAcervo);
				break;
			case 4:
				administrarAcervo(listAcervo, &id, da);
				break;
		}
	}while(op != 5);
	
	return 0;
}
