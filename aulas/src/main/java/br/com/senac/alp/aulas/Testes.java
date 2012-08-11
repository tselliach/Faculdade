package br.com.senac.alp.aulas;

public class Testes {

	public void testeUm() {
		PrimeiraAula obj = null;
		double resultado = 0.0;
		double esperado = 0.0;

		obj = PrimeiraAula.getInstancia();
		resultado = obj.somaTotal(null);
		esperado = Double.NaN;

		if (Double.compare(resultado, esperado) == 0) {
			System.out.println("Teste ok");

		} else {
			System.out.println("Teste nok");
		}

	}

	public void testeDois(){
		PrimeiraAula obj = null;		
		obj = PrimeiraAula.getInstancia();
		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
			
		valores = new double[0];
		resultado = obj.somaTotal(valores);
			
		if(Double.compare(resultado,esperado)==0){
			System.out.println("Teste ok");
			
		}
		else{
			System.out.println("Teste nok");
		}
	}

	public void testeTres(){
		PrimeiraAula obj = null;
		obj = PrimeiraAula.getInstancia();
		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
		valores = new double[1];
		valores[0] = Math.random();
		esperado = valores[0];
		resultado = obj.somaTotal(valores);
			
		if(Double.compare(resultado,esperado)==0){
			System.out.println("Teste ok");
		}

		else{
				System.out.println("Teste nok");
			}
		}
	

	public void testeQuatro() {
		PrimeiraAula obj = null;
		obj = PrimeiraAula.getInstancia();
		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
		
		valores = new double[10];
		for (int i = 0; i < valores.length; i++) {
			double val = Math.random();
			valores[i] = val;
			esperado += val;
		}
		resultado = obj.somaTotal(valores);
		

		if (Double.compare(resultado, esperado) == 0) {
			System.out.println("Teste ok");

		} else {
			System.out.println("Teste nok");
		}
	}
}
