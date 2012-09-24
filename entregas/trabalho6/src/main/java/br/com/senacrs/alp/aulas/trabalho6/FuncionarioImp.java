package br.com.senacrs.alp.aulas.trabalho6;

public class FuncionarioImp implements Funcionario  {
		private String nome;
		private int salario;
		public FuncionarioImp(String nome2, int salario2) {
			this.nome = nome2;
			this.salario = salario2;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getSalario() {
			return salario;
		}
		public void setSalario(int salario) {
			this.salario = salario;
		}
	
		
	

}
