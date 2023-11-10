package model;

import java.util.ArrayList;

import controller.DataAccessObject;

public class Morador extends DataAccessObject {

	private int codigo;
	private String nome;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String email;
	private String celular;
	private String telefone;
	private String inicioMoradia;

	private int casa;

	public Morador() {
		super("Morador");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo != this.codigo) {
			this.codigo = codigo;
			addChange("codigo", this.codigo);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!nome.equals(this.nome)) {
			this.nome = nome;
			addChange("nome", this.nome);
		}
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		if (!dataNascimento.equals(this.dataNascimento)) {
			this.dataNascimento = dataNascimento;
			addChange("dataNascimento", this.dataNascimento);
		}
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		if (!rg.equals(this.rg)) {
			this.rg = rg;
			addChange("rg", this.rg);
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (!cpf.equals(this.cpf)) {
			this.cpf = cpf;
			addChange("cpf", this.cpf);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.equals(this.email)) {
			this.email = email;
			addChange("email", this.email);
		}
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		if (!celular.equals(this.celular)) {
			this.celular = celular;
			addChange("celular", this.celular);
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (!telefone.equals(this.telefone)) {
			this.telefone = telefone;
			addChange("telefone", this.telefone);
		}
	}

	public String getInicioMoradia() {
		return inicioMoradia;
	}

	public void setInicioMoradia(String inicioMoradia) {
		if (!inicioMoradia.equals(this.inicioMoradia)) {
			this.inicioMoradia = inicioMoradia;
			addChange("inicioMoradia", this.inicioMoradia);
		}
	}

	public int getCasa() {
		return casa;
	}

	public void setCasa(int casa) {
		if (casa != this.casa) {
			this.casa = casa;
			addChange("casa", this.casa);
		}
	}

	@Override
	protected void fill(ArrayList<Object> data) {
	}

	@Override
	protected String getWhereClauseForOneEntry() {
		return "codigo = " + this.codigo;
	}

}
