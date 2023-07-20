package com.jan1ooo.agenda.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jan1ooo.agenda.domain.dto.PacienteDto;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class AgendaRequest {

    private Long id_agenda;

    @NotBlank
    private String descricao;

    @NotBlank
    @Column(unique = true)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime horario;

    @NotBlank
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime dataCriacao;

    @NotBlank
    private Long paciente;
}