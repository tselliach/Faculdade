package br.com.senacrs.alp.aulas.Trabalho4;

public class Main {
	public static void main(String[] args) {
		MinhaLista<String> lista = new MinhaListaImp<String>();
		MinhaLista<Integer> lista2 = new MinhaListaImp<Integer>();
		System.out.println(lista.tamanho());
		
		lista.prefixar("novoInicio");
		System.out.println(lista.buscar(1));
		lista.prefixar("novoInicio");
		lista.prefixar("novoInicio");
		lista.prefixar("novoInicio");
		lista.prefixar("novoInicio");
		System.out.println(lista.tamanho());
	}
}
