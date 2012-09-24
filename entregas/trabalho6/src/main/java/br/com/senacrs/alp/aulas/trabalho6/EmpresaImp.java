package br.com.senacrs.alp.aulas.trabalho6;
import br.com.senacrs.alp.aulas.MinhaLista;
import br.com.senacrs.alp.aulas.MinhaListaImp;
public class EmpresaImp implements Empresa {
		MinhaLista <Funcionario> listaFunc = null;
		
		public EmpresaImp() {
			listaFunc = new MinhaListaListImp<Funcionario>();
		}

		private FuncionarioImp cast(Funcionario funcionario){ 
		return (FuncionarioImp)funcionario;
	}

		@Override
		public void adicionaFuncionario(Funcionario funcionario) {
		 	if(funcionario == null){
		 		throw new IllegalArgumentException();
		 	}
		 	listaFunc.prefixar(funcionario);
		}

		@Override
		public Funcionario buscaFuncionario(String nome) {
			Funcionario resultado = null; 
			Funcionario funcao;
			FuncionarioImp funcaoImp;
			int pos = 0;
			for(int i = 0; i < listaFunc.tamanho();i++){
				funcao = listaFunc.buscar(pos);
				funcaoImp = cast(funcao);
				pos++;
				if(funcaoImp.getNome().equals(nome)){
					resultado = funcao;
					break;
				}
			}
			return resultado;
		}

		@Override
		public int totalFolhaPgto() {
			
			Funcionario funcao;
			FuncionarioImp funcaoImp;
			int salario = 0;
			int salarioTotal = 0;
			
			
			for (int i = 0; i < listaFunc.tamanho(); i++) {
				
				funcao = listaFunc.buscar(i);
				funcaoImp = cast(funcao);
				salario = funcaoImp.getSalario();
				salarioTotal += salario;
			
			}
			
			return salarioTotal;			
			
		}
}
