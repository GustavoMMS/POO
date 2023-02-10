#ifndef DADOSACERVO_H
#define DADOSACERVO_H

#include <vector>

#include "Acervo.h"

class DadosAcervo : public Acervo
{
	private:
		void lerDadosLivro(vector<Acervo *> &listAcervo);
		void lerDadosPeriodico(vector<Acervo *> &listAcervo);
		void lerDadosTC(vector<Acervo *> &listAcervo);
		void lerDadosRelatorio(vector<Acervo *> &listAcervo);
		void lerDadosMidia(vector<Acervo *> &listAcervo);
		void lerDadosCartaz(vector<Acervo *> &listAcervo);
		void lerDadosMapa(vector<Acervo *> &listAcervo);
		
		void gravarDadosLivro(vector<Acervo *> listAcervo);
		void gravarDadosPeriodico(vector<Acervo *> listAcervo);
		void gravarDadosTC(vector<Acervo *> listAcervo);
		void gravarDadosRelatorio(vector<Acervo *> listAcervo);
		void gravarDadosMidia(vector<Acervo *> listAcervo);
		void gravarDadosCartaz(vector<Acervo *> listAcervo);
		void gravarDadosMapa(vector<Acervo *> listAcervo);
		
	public:
		DadosAcervo();
		~DadosAcervo();
		
		void lerDadosAcervo(vector<Acervo *> &listAcervo);
		void gravarDadosAcervo(vector<Acervo *> listAcervo);
		
	protected:
};

#endif
