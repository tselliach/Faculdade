package br.com.tpselliach.aula2;

public class PessoaTesteCast extends Pessoa {
	
	Pessoa pessoaA = new Cliente();
	Pessoa pessoaB = new Funcionario();
	
	
	public void testeCast(){
	if(pessoaA instanceof Cliente){
		System.out.println("é Cliente");
	}
	else{
		System.out.println("não é cliente");
	}
	}
}
