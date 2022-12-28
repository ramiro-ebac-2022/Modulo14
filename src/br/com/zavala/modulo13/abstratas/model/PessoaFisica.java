package br.com.zavala.modulo13.abstratas.model;

import java.util.Objects;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String enderecoCasa;
	private String telefonePessoal;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String cpf, String enderecoCasa, String telefonePessoal) {
		super();
		this.cpf = cpf;
		this.enderecoCasa = enderecoCasa;
		this.telefonePessoal = telefonePessoal;
	}

	@Override
	public Integer idade() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnderecoCasa() {
		return enderecoCasa;
	}

	public void setEnderecoCasa(String enderecoCasa) {
		this.enderecoCasa = enderecoCasa;
	}

	public String getTelefonePessoal() {
		return telefonePessoal;
	}

	public void setTelefonePessoal(String telefonePessoal) {
		this.telefonePessoal = telefonePessoal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", Endereço de Casa=" + enderecoCasa + ", Telefone Pessoal=" + telefonePessoal
				+ "]";
	}
	
}
