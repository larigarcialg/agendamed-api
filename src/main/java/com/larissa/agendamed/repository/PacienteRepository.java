package com.larissa.agendamed.repository;

import com.larissa.agendamed.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
