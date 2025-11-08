package com.dhomini.conversor_moedas.Controller;

import com.dhomini.conversor_moedas.Dto.ConversaoResponseDto;
import com.dhomini.conversor_moedas.Service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversor")
public class ConversorController {

    @Autowired
    private ConversorService conversorService;


    @GetMapping
    public ResponseEntity<ConversaoResponseDto> converterMoeda(@RequestParam String de, @RequestParam String para, @RequestParam double valor){

        ConversaoResponseDto resultado = conversorService.converterMoeda(de, para, valor);

        return ResponseEntity.ok(resultado);
    }

}
