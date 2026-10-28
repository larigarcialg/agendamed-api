package com.larissa.agendamed.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity

public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "o nome é obrigatório")
	private String nome;

	@Email(message = "Informe um email válido")
	@NotBlank(message = "o email é obrigatório")
	private String email;

	@NotBlank(message = "o telefone é obrigatório")
	private String telefone;

	public Paciente() {

	}

	public Long getId() {

		return id;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {

		return telefone;
	}

	public void setTelefone(String telefone) {

		this.telefone = telefone;
	}

}
