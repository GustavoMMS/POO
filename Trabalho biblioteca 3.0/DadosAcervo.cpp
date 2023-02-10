#include "DadosAcervo.h"
#include "Livro.h"
#include "Periodico.h"
#include "Relatorio.h"
#include "TC.h"
#include "Cartaz.h"
#include "Midia.h"
#include "Mapa.h"

#include <fstream>
#include <cstdio>

DadosAcervo::DadosAcervo()
{
}

DadosAcervo::~DadosAcervo()
{
}

void DadosAcervo::lerDadosAcervo(vector<Acervo *> &listAcervo){
	void lerDadosLivro(vector<Acervo *> &listAcervo);
	void lerDadosPeriodico(vector<Acervo *> &listAcervo);
	void lerDadosTC(vector<Acervo *> &listAcervo);
	void lerDadosRelatorio(vector<Acervo *> &listAcervo);
	void lerDadosMidia(vector<Acervo *> &listAcervo);
	void lerDadosCartaz(vector<Acervo *> &listAcervo);
	void lerDadosMapa(vector<Acervo *> &listAcervo);
}
void DadosAcervo::gravarDadosAcervo(vector<Acervo *> listAcervo){
	void gravarDadosLivro(vector<Acervo *> listAcervo);
	void gravarDadosPeriodico(vector<Acervo *> listAcervo);
	void gravarDadosTC(vector<Acervo *> listAcervo);
	void gravarDadosRelatorio(vector<Acervo *> listAcervo);
	void gravarDadosMidia(vector<Acervo *> listAcervo);
	void gravarDadosCartaz(vector<Acervo *> listAcervo);
	void gravarDadosMapa(vector<Acervo *> listAcervo);
}

void DadosAcervo::lerDadosLivro(vector<Acervo *> &listAcervo){
	ifstream arq;
	arq.open("Livro.txt");
	
	if(arq.is_open() ){
		while(!arq.eof() ){
			string linha;
			getline(arq, linha);
			
			if(!linha.empty() ){
				string autor1 = linha;
				
				getline(arq, linha);
				string autor2 = linha;
				
				getline(arq, linha);
				string titulo = linha;
				
				getline(arq, linha);
				string editora = linha;
				
				getline(arq, linha);
				string assunto = linha;
				
				getline(arq, linha);
				string palavraChave1 = linha;
				
				getline(arq, linha);
				string palavraChave2 = linha;
				
				getline(arq, linha);
				string cidade = linha;
				
				getline(arq, linha);
				string cdu = linha;
				
				getline(arq, linha);
				int ano;
				sscanf(linha.c_str(), "%i", &ano);
				
				getline(arq, linha);
				int id;
				sscanf(linha.c_str(), "%i", &id);
				
				getline(arq, linha);
				int edicao;
				sscanf(linha.c_str(), "%i", &edicao);
				
				getline(arq, linha);
				char emprestimo;
				sscanf(linha.c_str(), "%c", &emprestimo);
				
				getline(arq, linha);
				string isbn = linha;
				
				getline(arq, linha);
				int numPaginas;
				sscanf(linha.c_str(), "%i", &numPaginas);
				
				getline(arq, linha);
				float tamanhoPag;
				sscanf(linha.c_str(), "%f", &tamanhoPag);
				
				Livro *livro = new Livro(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao, isbn, numPaginas, tamanhoPag);
				
				listAcervo.push_back(livro);
			}
		}
	}
}
void DadosAcervo::lerDadosPeriodico(vector<Acervo *> &listAcervo){
	ifstream arq;
	arq.open("Periodico.txt");
	
	if(arq.is_open() ){
		while(!arq.eof() ){
			string linha;
			getline(arq, linha);
			
			if(!linha.empty() ){
				string autor1 = linha;
				
				getline(arq, linha);
				string autor2 = linha;
				
				getline(arq, linha);
				string titulo = linha;
				
				getline(arq, linha);
				string editora = linha;
				
				getline(arq, linha);
				string assunto = linha;
				
				getline(arq, linha);
				string palavraChave1 = linha;
				
				getline(arq, linha);
				string palavraChave2 = linha;
				
				getline(arq, linha);
				string cidade = linha;
				
				getline(arq, linha);
				string cdu = linha;
				
				getline(arq, linha);
				int ano;
				sscanf(linha.c_str(), "%i", &ano);
				
				getline(arq, linha);
				int id;
				sscanf(linha.c_str(), "%i", &id);
				
				getline(arq, linha);
				int edicao;
				sscanf(linha.c_str(), "%i", &edicao);
				
				getline(arq, linha);
				char emprestimo;
				sscanf(linha.c_str(), "%c", &emprestimo);
				
				getline(arq, linha);
				string isbn = linha;
				
				getline(arq, linha);
				int numPaginas;
				sscanf(linha.c_str(), "%i", &numPaginas);
				
				getline(arq, linha);
				float tamanhoPag;
				sscanf(linha.c_str(), "%f", &tamanhoPag);
				
				getline(arq, linha);
				char tipoPeriodico;
				sscanf(linha.c_str(), "%c", &tipoPeriodico);
				
				Periodico *periodico = new Periodico(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao, isbn, numPaginas, tamanhoPag, tipoPeriodico);
				
				listAcervo.push_back(periodico);
			}
		}
	}
}
void DadosAcervo::lerDadosTC(vector<Acervo *> &listAcervo){
	ifstream arq;
	arq.open("TC.txt");
	
	if(arq.is_open() ){
		while(!arq.eof() ){
			string linha;
			getline(arq, linha);
			
			if(!linha.empty() ){
				string autor1 = linha;
				
				getline(arq, linha);
				string autor2 = linha;
				
				getline(arq, linha);
				string titulo = linha;
				
				getline(arq, linha);
				string editora = linha;
				
				getline(arq, linha);
				string assunto = linha;
				
				getline(arq, linha);
				string palavraChave1 = linha;
				
				getline(arq, linha);
				string palavraChave2 = linha;
				
				getline(arq, linha);
				string cidade = linha;
				
				getline(arq, linha);
				string cdu = linha;
				
				getline(arq, linha);
				int ano;
				sscanf(linha.c_str(), "%i", &ano);
				
				getline(arq, linha);
				int id;
				sscanf(linha.c_str(), "%i", &id);
				
				getline(arq, linha);
				int edicao;
				sscanf(linha.c_str(), "%i", &edicao);
				
				getline(arq, linha);
				char emprestimo;
				sscanf(linha.c_str(), "%c", &emprestimo);
				
				getline(arq, linha);
				string isbn = linha;
				
				getline(arq, linha);
				int numPaginas;
				sscanf(linha.c_str(), "%i", &numPaginas);
				
				getline(arq, linha);
				float tamanhoPag;
				sscanf(linha.c_str(), "%f", &tamanhoPag);
				
				getline(arq, linha);
				char tipoTC;
				sscanf(linha.c_str(), "%c", &tipoTC);
				
				TC *tc = new TC(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao, isbn, numPaginas, tamanhoPag, tipoTC);
				
				listAcervo.push_back(tc);
			}
		}
	}
}
void DadosAcervo::lerDadosRelatorio(vector<Acervo *> &listAcervo){
	ifstream arq;
	arq.open("Relatorio.txt");
	
	if(arq.is_open() ){
		while(!arq.eof() ){
			string linha;
			getline(arq, linha);
			
			if(!linha.empty() ){
				string autor1 = linha;
				
				getline(arq, linha);
				string autor2 = linha;
				
				getline(arq, linha);
				string titulo = linha;
				
				getline(arq, linha);
				string editora = linha;
				
				getline(arq, linha);
				string assunto = linha;
				
				getline(arq, linha);
				string palavraChave1 = linha;
				
				getline(arq, linha);
				string palavraChave2 = linha;
				
				getline(arq, linha);
				string cidade = linha;
				
				getline(arq, linha);
				string cdu = linha;
				
				getline(arq, linha);
				int ano;
				sscanf(linha.c_str(), "%i", &ano);
				
				getline(arq, linha);
				int id;
				sscanf(linha.c_str(), "%i", &id);
				
				getline(arq, linha);
				int edicao;
				sscanf(linha.c_str(), "%i", &edicao);
				
				getline(arq, linha);
				char emprestimo;
				sscanf(linha.c_str(), "%c", &emprestimo);
				
				getline(arq, linha);
				string isbn = linha;
				
				getline(arq, linha);
				int numPaginas;
				sscanf(linha.c_str(), "%i", &numPaginas);
				
				getline(arq, linha);
				float tamanhoPag;
				sscanf(linha.c_str(), "%f", &tamanhoPag);
				
				Relatorio *relatorio = new Relatorio(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao, isbn, numPaginas, tamanhoPag);
				
				listAcervo.push_back(relatorio);
			}
		}
	}
}
void DadosAcervo::lerDadosMidia(vector<Acervo *> &listAcervo){
	ifstream arq;
	arq.open("Midia.txt");
	
	if(arq.is_open() ){
		while(!arq.eof() ){
			string linha;
			getline(arq, linha);
			
			if(!linha.empty() ){
				string autor1 = linha;
				
				getline(arq, linha);
				string autor2 = linha;
				
				getline(arq, linha);
				string titulo = linha;
				
				getline(arq, linha);
				string editora = linha;
				
				getline(arq, linha);
				string assunto = linha;
				
				getline(arq, linha);
				string palavraChave1 = linha;
				
				getline(arq, linha);
				string palavraChave2 = linha;
				
				getline(arq, linha);
				string cidade = linha;
				
				getline(arq, linha);
				string cdu = linha;
				
				getline(arq, linha);
				int ano;
				sscanf(linha.c_str(), "%i", &ano);
				
				getline(arq, linha);
				int id;
				sscanf(linha.c_str(), "%i", &id);
				
				getline(arq, linha);
				int edicao;
				sscanf(linha.c_str(), "%i", &edicao);
				
				getline(arq, linha);
				char emprestimo;
				sscanf(linha.c_str(), "%c", &emprestimo);
				
				getline(arq, linha);
				int tipoMidia;
				sscanf(linha.c_str(), "%c", &tipoMidia);
				
				Midia *midia = new Midia(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao, tipoMidia);
				
				listAcervo.push_back(midia);
			}
		}
	}
}
void DadosAcervo::lerDadosCartaz(vector<Acervo *> &listAcervo){
	ifstream arq;
	arq.open("Cartaz.txt");
	
	if(arq.is_open() ){
		while(!arq.eof() ){
			string linha;
			getline(arq, linha);
			
			if(!linha.empty() ){
				string autor1 = linha;
				
				getline(arq, linha);
				string autor2 = linha;
				
				getline(arq, linha);
				string titulo = linha;
				
				getline(arq, linha);
				string editora = linha;
				
				getline(arq, linha);
				string assunto = linha;
				
				getline(arq, linha);
				string palavraChave1 = linha;
				
				getline(arq, linha);
				string palavraChave2 = linha;
				
				getline(arq, linha);
				string cidade = linha;
				
				getline(arq, linha);
				string cdu = linha;
				
				getline(arq, linha);
				int ano;
				sscanf(linha.c_str(), "%i", &ano);
				
				getline(arq, linha);
				int id;
				sscanf(linha.c_str(), "%i", &id);
				
				getline(arq, linha);
				int edicao;
				sscanf(linha.c_str(), "%i", &edicao);
				
				getline(arq, linha);
				char emprestimo;
				sscanf(linha.c_str(), "%c", &emprestimo);
				
				getline(arq, linha);
				int numPaginas;
				sscanf(linha.c_str(), "%i", &numPaginas);
				
				getline(arq, linha);
				float tamanhoPag;
				sscanf(linha.c_str(), "%f", &tamanhoPag);
				
				Cartaz *cartaz = new Cartaz(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao, numPaginas, tamanhoPag);
				
				listAcervo.push_back(cartaz);
			}
		}
	}
}
void DadosAcervo::lerDadosMapa(vector<Acervo *> &listAcervo){
	ifstream arq;
	arq.open("Mapa.txt");
	
	if(arq.is_open() ){
		while(!arq.eof() ){
			string linha;
			getline(arq, linha);
			
			if(!linha.empty() ){
				string autor1 = linha;
				
				getline(arq, linha);
				string autor2 = linha;
				
				getline(arq, linha);
				string titulo = linha;
				
				getline(arq, linha);
				string editora = linha;
				
				getline(arq, linha);
				string assunto = linha;
				
				getline(arq, linha);
				string palavraChave1 = linha;
				
				getline(arq, linha);
				string palavraChave2 = linha;
				
				getline(arq, linha);
				string cidade = linha;
				
				getline(arq, linha);
				string cdu = linha;
				
				getline(arq, linha);
				int ano;
				sscanf(linha.c_str(), "%i", &ano);
				
				getline(arq, linha);
				int id;
				sscanf(linha.c_str(), "%i", &id);
				
				getline(arq, linha);
				int edicao;
				sscanf(linha.c_str(), "%i", &edicao);
				
				getline(arq, linha);
				char emprestimo;
				sscanf(linha.c_str(), "%c", &emprestimo);
				
				getline(arq, linha);
				int numPaginas;
				sscanf(linha.c_str(), "%i", &numPaginas);
				
				getline(arq, linha);
				float tamanhoPag;
				sscanf(linha.c_str(), "%f", &tamanhoPag);
				
				Mapa *mapa = new Mapa(autor1, autor2, titulo, editora, assunto, palavraChave1, palavraChave2, cidade, cdu, ano, id, emprestimo, edicao, numPaginas, tamanhoPag);
				
				listAcervo.push_back(mapa);
			}
		}
	}
}

void DadosAcervo::gravarDadosLivro(vector<Acervo *> listAcervo){
	ofstream arq;
	
	arq.open("Livro.txt", ios::trunc);
	
	if(arq.is_open() ){
		for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
			if(dynamic_cast<Livro *>(*it) ){
				Livro *livro = dynamic_cast<Livro *>(*it);
				arq << livro->getAutor1() << endl;
				arq << livro->getAutor2() << endl;
				arq << livro->getTitulo() << endl;
				arq << livro->getEditora() << endl;
				arq << livro->getAssunto() << endl;
				arq << livro->getPalavraChave1() << endl;
				arq << livro->getPalavraChave2() << endl;
				arq << livro->getCidade() << endl;
				arq << livro->getCdu() << endl;
				arq << livro->getAno() << endl;
				arq << livro->getId() << endl;
				arq << livro->getEmprestimo() << endl;
				arq << livro->getEdicao() << endl;
				arq << livro->getIsbn() << endl;
				arq << livro->getNumPaginas() << endl;
				arq << livro->getTamanhoPag() << endl;
			}
		}
		
		arq.close();
	}
}
void DadosAcervo::gravarDadosPeriodico(vector<Acervo *> listAcervo){
	ofstream arq;
	
	arq.open("Periodico.txt", ios::trunc);
	
	if(arq.is_open() ){
		for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
			if(dynamic_cast<Periodico *>(*it) ){
				Periodico *periodico = dynamic_cast<Periodico *>(*it);
				arq << periodico->getAutor1() << endl;
				arq << periodico->getAutor2() << endl;
				arq << periodico->getTitulo() << endl;
				arq << periodico->getEditora() << endl;
				arq << periodico->getAssunto() << endl;
				arq << periodico->getPalavraChave1() << endl;
				arq << periodico->getPalavraChave2() << endl;
				arq << periodico->getCidade() << endl;
				arq << periodico->getCdu() << endl;
				arq << periodico->getAno() << endl;
				arq << periodico->getId() << endl;
				arq << periodico->getEmprestimo() << endl;
				arq << periodico->getEdicao() << endl;
				arq << periodico->getIsbn() << endl;
				arq << periodico->getNumPaginas() << endl;
				arq << periodico->getTamanhoPag() << endl;
				arq << periodico->getTipoPeriodico() << endl;
			}
		}
		
		arq.close();
	}
}
void DadosAcervo::gravarDadosTC(vector<Acervo *> listAcervo){
	ofstream arq;
	
	arq.open("TC.txt", ios::trunc);
	
	if(arq.is_open() ){
		for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
			if(dynamic_cast<TC *>(*it) ){
				TC *tc = dynamic_cast<TC *>(*it);
				arq << tc->getAutor1() << endl;
				arq << tc->getAutor2() << endl;
				arq << tc->getTitulo() << endl;
				arq << tc->getEditora() << endl;
				arq << tc->getAssunto() << endl;
				arq << tc->getPalavraChave1() << endl;
				arq << tc->getPalavraChave2() << endl;
				arq << tc->getCidade() << endl;
				arq << tc->getCdu() << endl;
				arq << tc->getAno() << endl;
				arq << tc->getId() << endl;
				arq << tc->getEmprestimo() << endl;
				arq << tc->getEdicao() << endl;
				arq << tc->getIsbn() << endl;
				arq << tc->getNumPaginas() << endl;
				arq << tc->getTamanhoPag() << endl;
				arq << tc->getTipoTC() << endl;
			}
		}
		
		arq.close();
	}
}
void DadosAcervo::gravarDadosRelatorio(vector<Acervo *> listAcervo){
	ofstream arq;
	
	arq.open("Relatorio.txt", ios::trunc);
	
	if(arq.is_open() ){
		for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
			if(dynamic_cast<Relatorio *>(*it) ){
				Relatorio *relatorio = dynamic_cast<Relatorio *>(*it);
				arq << relatorio->getAutor1() << endl;
				arq << relatorio->getAutor2() << endl;
				arq << relatorio->getTitulo() << endl;
				arq << relatorio->getEditora() << endl;
				arq << relatorio->getAssunto() << endl;
				arq << relatorio->getPalavraChave1() << endl;
				arq << relatorio->getPalavraChave2() << endl;
				arq << relatorio->getCidade() << endl;
				arq << relatorio->getCdu() << endl;
				arq << relatorio->getAno() << endl;
				arq << relatorio->getId() << endl;
				arq << relatorio->getEmprestimo() << endl;
				arq << relatorio->getEdicao() << endl;
				arq << relatorio->getIsbn() << endl;
				arq << relatorio->getNumPaginas() << endl;
				arq << relatorio->getTamanhoPag() << endl;
			}
		}
		
		arq.close();
	}
}
void DadosAcervo::gravarDadosMidia(vector<Acervo *> listAcervo){
	ofstream arq;
	
	arq.open("Midia.txt", ios::trunc);
	
	if(arq.is_open() ){
		for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
			if(dynamic_cast<Midia *>(*it) ){
				Midia *midia = dynamic_cast<Midia *>(*it);
				arq << midia->getAutor1() << endl;
				arq << midia->getAutor2() << endl;
				arq << midia->getTitulo() << endl;
				arq << midia->getEditora() << endl;
				arq << midia->getAssunto() << endl;
				arq << midia->getPalavraChave1() << endl;
				arq << midia->getPalavraChave2() << endl;
				arq << midia->getCidade() << endl;
				arq << midia->getCdu() << endl;
				arq << midia->getAno() << endl;
				arq << midia->getId() << endl;
				arq << midia->getEmprestimo() << endl;
				arq << midia->getEdicao() << endl;
				arq << midia->getTipoMidia() << endl;
			}
		}
		
		arq.close();
	}
}
void DadosAcervo::gravarDadosCartaz(vector<Acervo *> listAcervo){
	ofstream arq;
	
	arq.open("Cartaz.txt", ios::trunc);
	
	if(arq.is_open() ){
		for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
			if(dynamic_cast<Cartaz *>((*it)) ){
				Cartaz *cartaz = dynamic_cast<Cartaz *>(*it);
				arq << cartaz->getAutor1() << endl;
				arq << cartaz->getAutor2() << endl;
				arq << cartaz->getTitulo() << endl;
				arq << cartaz->getEditora() << endl;
				arq << cartaz->getAssunto() << endl;
				arq << cartaz->getPalavraChave1() << endl;
				arq << cartaz->getPalavraChave2() << endl;
				arq << cartaz->getCidade() << endl;
				arq << cartaz->getCdu() << endl;
				arq << cartaz->getAno() << endl;
				arq << cartaz->getId() << endl;
				arq << cartaz->getEmprestimo() << endl;
				arq << cartaz->getEdicao() << endl;
				arq << cartaz->getNumPaginas() << endl;
				arq << cartaz->getTamanhoPag() << endl;
			}
		}
		
		arq.close();
	}
}
void DadosAcervo::gravarDadosMapa(vector<Acervo *> listAcervo){
	ofstream arq;
	
	arq.open("Mapa.txt", ios::trunc);
	
	if(arq.is_open() ){
		for(vector<Acervo *>::iterator it = listAcervo.begin(); it != listAcervo.end(); it++){
			if(dynamic_cast<Mapa *>(*it) ){
				Mapa *mapa = dynamic_cast<Mapa *>(*it);
				arq << mapa->getAutor1() << endl;
				arq << mapa->getAutor2() << endl;
				arq << mapa->getTitulo() << endl;
				arq << mapa->getEditora() << endl;
				arq << mapa->getAssunto() << endl;
				arq << mapa->getPalavraChave1() << endl;
				arq << mapa->getPalavraChave2() << endl;
				arq << mapa->getCidade() << endl;
				arq << mapa->getCdu() << endl;
				arq << mapa->getAno() << endl;
				arq << mapa->getId() << endl;
				arq << mapa->getEmprestimo() << endl;
				arq << mapa->getEdicao() << endl;
				arq << mapa->getNumPaginas() << endl;
				arq << mapa->getTamanhoPag() << endl;
			}
		}
		
		arq.close();
	}
}
