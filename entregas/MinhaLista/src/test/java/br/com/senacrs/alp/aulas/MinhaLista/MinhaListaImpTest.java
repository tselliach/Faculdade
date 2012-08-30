package br.com.senacrs.alp.aulas.MinhaLista;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinhaListaImpTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMinhaListaImp() {
		
		MinhaListaImp<String> obj = null;
		String arg = null;
		
		arg = "valor valido";
		obj = new MinhaListaImp<String>(arg);
		Assert.assertNotNull(obj);
		
	}
	@Test
	public void testMinhaListaImpNull() {
		
		MinhaListaImp<String> obj = null;
		try{
		obj = new MinhaListaImp<String>(null);
		fail();
		}catch (IllegalArgumentException e){
			Assert.assertTrue(true);//verifica se o argumento é verdadeiro
		}
		
	}
	@Test
	public void testSufixar() {
		
		MinhaListaImp <String> obj = null;
		String valor = null;
		String sufixo = null;
		
		obj = new MinhaListaImp<String>("Inicio");
		valor = "valor";
		obj.sufixar(valor);
		sufixo = obterSufixo(obj);
		Assert.assertEquals(valor, sufixo);
		

	}

	private String obterSufixo(MinhaListaImp<String> obj) {
		String resultado = null;
		Nodo<String> nodo = null;
		
		nodo = obj.getInicio();
		while (nodo.getProximo() != null){
			nodo = nodo.getProximo();
		}
		resultado = "valor";
		
		return resultado;
	}

	@Test
	public void testPrefixar() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscar() {
		fail("Not yet implemented");
	}

	@Test
	public void testInserir() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemover() {
		fail("Not yet implemented");
	}

	@Test
	public void testTamanho() {
		fail("Not yet implemented");
	}

}
