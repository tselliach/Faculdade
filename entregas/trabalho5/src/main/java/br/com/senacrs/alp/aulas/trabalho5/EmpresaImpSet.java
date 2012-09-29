package br.com.senacrs.alp.aulas.trabalho5;
import java.util.HashSet;
import java.util.Set;

import br.com.senacrs.alp.aulas.MinhaLista;
import br.com.senacrs.alp.aulas.MinhaListaImp;
public class EmpresaImpSet implements Empresa {
		Set<Funcionario> listaFunc = null;
		
		
		public EmpresaImpSet() {
			listaFunc = new HashSet<Funcionario>();
		}

		@Override
		public void adicionaFuncionario(Funcionario funcionario) {
			listaFunc.add(funcionario);
			
		}

		@Override
		public Funcionario buscaFuncionario(String nome) {
			Set<Funcionario> busca = null;
			for(Funcionario a:busca )  {
				
			}
			return null;
		}

		@Override
		public int totalFolhaPgto() {
		
			return 0;
		}}

		