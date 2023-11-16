package model;

import java.util.ArrayList;

import controller.DataAccessObject;
import utils.Select;

public class Proprietario extends DataAccessObject {

	private int idProprietario;
	private String nome;
	private String email;
	private String telefone;
	private String dataNascimento;
	private String cpf;
	private String rg;

	public Proprietario() {
		super("Proprietario");
	}

	public int getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(int idProprietario) {

		if (idProprietario != this.idProprietario) {

			this.idProprietario = idProprietario;
			// addChange( "idProprietario", this.idProprietario );
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		if (!email.equals(this.email)) {

			this.email = email;
			addChange("email", this.email);
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {

		if (!dataNascimento.equals(this.dataNascimento)) {

			this.dataNascimento = dataNascimento;
			addChange("dataNascimento", this.dataNascimento);
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {

		if (!rg.equals(this.rg)) {

			this.rg = rg;
			addChange("rg", this.rg);
		}
	}

	@Override
	protected String getWhereClauseForOneEntry() {
		return "idProprietario = " + this.idProprietario;
	}

	@Override
	protected void fill(ArrayList<Object> data) {

	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Proprietario) {
			Proprietario aux = (Proprietario) obj;

			if (idProprietario == aux.getIdProprietario()) {
				return true;
			}
		}
		return false;
	}

	public void carregar(Proprietario instance, int whereClause) {
		setIdProprietario(whereClause);

		Select select = new Select();

		select.add("idProprietario");
		select.add("nome");
		select.add("email");
		select.add("dataNascimento");
		select.add("cpf");
		select.add("rg");
		select.add("telefone");

		instance.fill(select.build(), instance);
	}
}
