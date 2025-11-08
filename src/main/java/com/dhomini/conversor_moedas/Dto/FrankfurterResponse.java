package com.dhomini.conversor_moedas.Dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class FrankfurterResponse {

    private double valorOriginal;
    private String moedaBase;
    private String date;
    private Map<String, Double> rates;

}
