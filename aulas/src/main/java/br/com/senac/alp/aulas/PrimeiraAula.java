package br.com.senac.alp.aulas;

import java.util.Arrays;

import org.junit.Assert;

public class PrimeiraAula {

	private static PrimeiraAula instancia = new PrimeiraAula();

	private PrimeiraAula() {

		super();
	}

	public double somaTotal(double[] valores) {

		double resultado = 0.0;

		if (valores == null) {
			resultado = Double.NaN;
		} else {
			for (int i = 0; i < valores.length; i++) {
				resultado += valores[i];
			}
		}

		return resultado;
	}

	public static PrimeiraAula getInstancia() {

		return PrimeiraAula.instancia;
	}

	public static void main(String[] args) {
		Testes obj = new Testes();
		obj.testeUm();
		obj.testeDois();
		obj.testeTres();
		obj.testeQuatro();
	}

	

	}

