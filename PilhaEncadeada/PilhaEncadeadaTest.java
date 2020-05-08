package PilhaEncadeada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaEncadeadaTest {

	@Test
	void testPush() {
		Conta Leandro = new Conta(12345);
		Conta Abella = new Conta(33456);
		Conta Robinho = new Conta(66875);
		
		PilhaEncadeada pilha = new PilhaEncadeada();
		pilha.push(Leandro);
		pilha.push(Abella);
		pilha.push(Robinho);
		assertEquals(66875, pilha.peek());
	}
	
	@Test
	void testPop() {
		Conta Leandro = new Conta(12345);
		Conta Abella = new Conta(33456);
		Conta Robinho = new Conta(66875);
		
		PilhaEncadeada pilha = new PilhaEncadeada();
		pilha.push(Leandro);
		pilha.push(Abella);
		pilha.push(Robinho);
		pilha.pop();
		assertEquals(33456, pilha.peek());
	}
	
	@Test
	void testTop() {
		Conta Leandro = new Conta(12345);
		Conta Abella = new Conta(33456);
		Conta Robinho = new Conta(66875);
		
		PilhaEncadeada pilha = new PilhaEncadeada();
		pilha.push(Leandro);
		pilha.push(Abella);
		pilha.push(Robinho);
		assertEquals(66875, pilha.peek());
	}

}
