package br.com.senacrs.alp.aulas.trabalho8;

public class FuncionarioFactoryImp implements FuncionarioFactory {
	private static FuncionarioFactoryImp instancia = new FuncionarioFactoryImp(); /*
	A linha acima é a instância de um singleton que define que esse objeto será 
	usado uma unica vez no projeto inteiro, normalmente um singleton esta dentro 
	de alguma factory*/
	@Override
	public Funcionario criaFuncionario(String nome, int salario) {
			FuncionarioImp funcionario = new FuncionarioImp(nome,salario);
			 
			if(nome == null){
				throw new IllegalArgumentException();
			}
			if(nome == ""){
				throw new IllegalArgumentException();
			}
			if(salario < 0){
				throw new IllegalArgumentException();
			}
		return funcionario;
	}
	
	public static FuncionarioFactoryImp getInstancia() {

		return FuncionarioFactoryImp.instancia;
	}

}
