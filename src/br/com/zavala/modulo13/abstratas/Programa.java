package br.com.zavala.modulo13.abstratas;

import br.com.zavala.modulo13.abstratas.model.Pessoa;
import br.com.zavala.modulo13.abstratas.model.PessoaFisica;
import br.com.zavala.modulo13.abstratas.model.PessoaJuridica;

/**
 * 
 * @author Ramiro
 *  • Criar classe abstrata Pessoa.
 *       ◦ Colocar os atributos comuns nesta classe.
 *   • Criar as subclasses concretas PessoaFisica, PessoaJuridica.
 *       ◦ Colocar propriedades específicas para cada uma das classes concretas.
 *   • Imprimir.
 *
 */

public class Programa {

	public static void main(String[] args) {

		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Ramiro");
		pf1.setSobreNome("Zavala");
		pf1.setCpf("11111");
		pf1.setEnderecoCasa("Rua 1, bloco B, ap 202");
		pf1.setTelefonePessoal("11111");
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Doutor Joaõ");
		pj1.setSobreNome("Da Silva");
		pj1.setCnpj("222222");
		pj1.setEnderecoEscritorio("Av Central, Edificio 1, Escritorio 300");
		pj1.setTelefoneEscritorio("2222222");
		pj1.setEmail("joao.silva@email.com");
		
		imprimir(pf1);
		imprimir(pj1);

	}

	private static void imprimir(Pessoa p) {
		System.out.println(p);
		
	}

}
