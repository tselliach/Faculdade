package br.com.senacrs.alp.aulas.trabalho13;

import java.io.File;
import java.util.Arrays;


public class ListaDiretorio {
	
	public String[] listaConteudoDiretorio(String diretorio) {
		
		if (diretorio == null) {
			throw new IllegalArgumentException();
		}
		
		String path = diretorio;
		File file = new File(path);
		
		validacao(diretorio, file);
	
		File[] dadosDiretorio;
		dadosDiretorio = file.listFiles();
		
		int quantidade = dadosDiretorio.length;
		
		String[] dir = new String[quantidade+2];
		dir[0] = "list: " + path;
		dir[1] = "total: " + quantidade;
		
		int contadorDir = 0;
		String[] arrayDiretorios = new String[quantidade];
		
		int contadorArq = 0;
		String[] arrayArquivos = new String[quantidade];
		
		for (int i = 0; i<dadosDiretorio.length; i++) { 
			
			if (dadosDiretorio[i].isDirectory()) {
				arrayDiretorios[contadorDir] = "d " + dadosDiretorio[i].getName();
				contadorDir++;
			} else {
				arrayArquivos[contadorArq] = "a " + dadosDiretorio[i].getName();
				contadorArq++;
			}
		
		}
		
		int indice = 2;
		
		for (int i = 0; i<contadorDir; i++) {
			dir[indice] = arrayDiretorios[i];
			indice++;
		}
		
		for (int i = 0; i<contadorArq; i++) {
			dir[indice] = arrayArquivos[i];
			indice++;
		}
		
		return dir;
		
	}
	
	public void validacao(String diretorio, File file) {
		
		if(file.isFile()) {
			throw new IllegalArgumentException();
		}
		
		if(!(file.isDirectory())) {
			throw new IllegalArgumentException();
		}
		
	}
	
}