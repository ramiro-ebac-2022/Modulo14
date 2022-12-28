package br.com.zavala.modulo13.abstratas.model;

import java.time.LocalDate;

public abstract class Pessoa {

	private String nome;
	private String sobreNome;
	private LocalDate nascimento;
	
	public abstract Integer idade();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobreNome=" + sobreNome + ", nascimento=" + nascimento + "]";
	}
	
	
}
