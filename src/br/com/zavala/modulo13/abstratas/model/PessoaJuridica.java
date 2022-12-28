package br.com.zavala.modulo13.abstratas.model;

import java.util.Objects;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String enderecoEscritorio;
	private String telefoneEscritorio;
	private String email;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String cnpj, String enderecoEscritorio, String telefoneEscritorio, String email) {
		super();
		this.cnpj = cnpj;
		this.enderecoEscritorio = enderecoEscritorio;
		this.telefoneEscritorio = telefoneEscritorio;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	@Override
	public Integer idade() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEnderecoEscritorio() {
		return enderecoEscritorio;
	}

	public void setEnderecoEscritorio(String enderecoEscritorio) {
		this.enderecoEscritorio = enderecoEscritorio;
	}

	public String getTelefoneEscritorio() {
		return telefoneEscritorio;
	}

	public void setTelefoneEscritorio(String telefoneEscritorio) {
		this.telefoneEscritorio = telefoneEscritorio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", Endereco do Escritorio=" + enderecoEscritorio + ", Telefone do Escritorio="
				+ telefoneEscritorio + "]";
	}
	
}
