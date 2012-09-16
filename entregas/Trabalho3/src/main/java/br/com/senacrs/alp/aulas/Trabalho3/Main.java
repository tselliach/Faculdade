package br.com.senacrs.alp.aulas.Trabalho3;

public class Main {
	public static void main(String[] args) {
		MinhaLista<String> lista = new MinhaListaImp<String>();
		MinhaLista<Integer> lista2 = new MinhaListaImp<Integer>();

		lista.prefixar("novoInicio");
		lista.sufixar("novoFim");
		System.out.println(lista.tamanho());
		System.out.println(lista.buscar(0));
		System.out.println(lista.tamanho());
	}
}
