package br.com.senacrs.alp.aulas.trabalho6;

import br.com.senacrs.alp.aulas.MinhaLista;

import java.util.LinkedList;
import java.util.List;


public class MinhaListaListImp<Tipo> implements MinhaLista<Tipo> {
	List <Tipo> lista = new LinkedList<Tipo>();
	
	public void sufixar(Tipo valor) {
		lista.add(valor);
		
	}

	@Override
	public void prefixar(Tipo valor) {
		lista.add(0, valor);
		
	}

	@Override
	public Tipo buscar(int posicao) {
		
		
		return lista.get(posicao);
	}

	@Override
	public void inserir(int posicao, Tipo valor) {
		lista.set(posicao, valor);
		
	}

	@Override
	public Tipo remover(int posicao) {
		Tipo aux;
		aux = lista.get(posicao);
		lista.remove(posicao);
		return aux;
	}

	@Override
	public int tamanho() {
		int tamanho = lista.size();
		return tamanho ;
	}

}
