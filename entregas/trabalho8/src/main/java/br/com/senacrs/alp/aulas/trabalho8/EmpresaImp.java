package br.com.senacrs.alp.aulas.trabalho8;
import java.util.HashMap;
import java.util.Map;

public class EmpresaImp implements Empresa{
	private Map<String,Funcionario> mapFunc = new HashMap<String, Funcionario>();
	
	@Override
	public void adicionaFuncionario(Funcionario funcionario) {
		String nome = null;

		if (funcionario == null) {
			throw new IllegalArgumentException("Funcionário é Nulo");
		}

		nome = funcionario.getNome();

		if (funcionario.getNome() !=null) {
	
			mapFunc.put(nome, funcionario);
		}
		
	}

	@Override
	public Funcionario buscaFuncionario(String nome) {
		Funcionario funcionario = null; 
		funcionario = mapFunc.get(nome);
		return funcionario;
	}

	@Override
	public int totalFolhaPgto() {
		int resultado = 0; 
		for(Funcionario a: mapFunc.values()){
			resultado += a.getSalario();
		}
		return resultado;
	}

}
