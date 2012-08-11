package br.com.senac.alp.aulas;


public class PrimeiraAula {
	
	private static PrimeiraAula instancia = new PrimeiraAula();
	
	
	private PrimeiraAula() {

		super();
	}
	
	public double somaTotal(double[] valores) {
		
		double resultado = 0.0;
		
		if (valores == null) {
			resultado = Double.NaN;
		}
		else{
			for( int i = 0; i < valores.length; i++){
				resultado += valores [i];
			}
		}
		
		return resultado;
	}
	
	public static PrimeiraAula getInstancia() {
		
		return PrimeiraAula.instancia;
	}
	public static void main(String[] args){
		
		PrimeiraAula obj = null;		
		double resultado = 0.0;
		double esperado = 0.0;
		
		obj = PrimeiraAula.getInstancia();
		resultado = obj.somaTotal(null);
		esperado = Double.NaN;
		if(Double.compare(resultado,esperado)==0){
			System.out.println("Teste ok");
			
		}
		else{
			System.out.println("Teste nok");
		}
	}
}
