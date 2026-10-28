package com.larissa.agendamed.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.larissa.agendamed.model.Paciente;
import com.larissa.agendamed.repository.PacienteRepository;

@Service
public class PacienteService {

	private final PacienteRepository pacienteRepository;

	public PacienteService(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;

	}

	public Paciente cadastrar(Paciente paciente) {
		return pacienteRepository.save(paciente);

	}

	public List<Paciente> listar() {

		return pacienteRepository.findAll();
	}

	public ResponseEntity<Paciente> buscarPorId(Long id) {

		return pacienteRepository.findById(id).map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());

	}

	public ResponseEntity<Paciente> atualizar(Long id, Paciente dados) {
		return pacienteRepository.findById(id).map(paciente -> {
			paciente.setNome(dados.getNome());
			paciente.setEmail(dados.getEmail());
			paciente.setTelefone(dados.getTelefone());

			Paciente atualizado = pacienteRepository.save(paciente);

			return ResponseEntity.ok(atualizado);
		}).orElseGet(() -> ResponseEntity.notFound().build());
	}

	public ResponseEntity<Void> excluir(Long id) {
		if (!pacienteRepository.existsById(id)) {

			return ResponseEntity.notFound().build();
		}

		pacienteRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}
	
	
	

}
