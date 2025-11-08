package com.dhomini.conversor_moedas.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConversaoResponseDto {

    private double valorOriginal;
    private String moedaOriginal;
    private String moedaDestino;
    private double valorConvertido;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataHora;

}
