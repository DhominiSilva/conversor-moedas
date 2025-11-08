package com.dhomini.conversor_moedas.Service;

import com.dhomini.conversor_moedas.Dto.ConversaoResponseDto;
import com.dhomini.conversor_moedas.Dto.FrankfurterResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class ConversorService {

        public ConversaoResponseDto converterMoeda (String de, String para,double valor){

            RestTemplate restTemplate = new RestTemplate();
            String url = "https://api.frankfurter.app/latest?from=" + de + "&to=" + para;
            FrankfurterResponse respostaAPI = restTemplate.getForObject(url, FrankfurterResponse.class);
            Double valorMoedaDestino = respostaAPI.getRates().get(para);
            double valorConvertido = valor * valorMoedaDestino;
            ConversaoResponseDto resposta = new ConversaoResponseDto();
            resposta.setValorOriginal(valor);
            resposta.setMoedaOriginal(de);
            resposta.setMoedaDestino(para);
            resposta.setValorConvertido(valorConvertido);
            resposta.setDataHora(LocalDateTime.now());
            return resposta;

        }

}
