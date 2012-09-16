package br.com.senacrs.alp.aulas.Trabalho4;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.senacrs.alp.aulas.Trabalho4.MinhaListaImp;
import br.com.senacrs.alp.aulas.Trabalho4.Nodo;

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
		obj = new MinhaListaImp<String>();
		Assert.assertNotNull(obj);
		
	}
	
		
	
	 @Test
     public void testSufixar() {
             
             MinhaListaImp <String> obj = null;
             String valor = null;
             String sufixo = null;
             
             obj = new MinhaListaImp<String>();
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
             resultado = nodo.getValor();
             
             return resultado;
     }

	@Test
public void testPrefixar() {
		
		MinhaListaImp <String> obj = null;
		String valor = null;
		Nodo<String> nodo = null;
		
		
		obj = new MinhaListaImp<String>();
			
		valor = "Teste";
		obj.prefixar(valor);
		
		nodo = obj.getInicio();
		String inicio = nodo.getValor();
		
		Assert.assertEquals(valor, inicio);
		
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
	public void testTamanhozero() {
		MinhaListaImp<String> obj = null;
		obj = new MinhaListaImp<String>();
		int tamanho = obj.tamanho();
		if(tamanho > 0){
			Assert.assertTrue(true);	
		}
		else{
			fail();
		}
				
		}
	@Test
public void testTamanho() {
		
		MinhaListaImp<String> obj = null;
        obj = new MinhaListaImp<String>();
        int qtd;
        int tamanho;
          
        Random randomGenerator = new Random();
        qtd = randomGenerator.nextInt(20);
        
        for (int i = 1; i <= qtd; i++) {
        	obj.sufixar("caixa");
        
        }         
        
        tamanho = obj.tamanho();
        
        Assert.assertEquals(qtd, tamanho);
        
	} 
	
			
}
		


