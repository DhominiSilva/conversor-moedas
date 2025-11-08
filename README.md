# 💱 Conversor de Moedas API

Uma API REST para conversão de moedas em tempo real desenvolvida em Spring Boot.

## 🚀 Tecnologias

- Java 17
- Spring Boot 3.5.7
- Maven
- Lombok
- Jackson

## 🌐 API Externa Utilizada

- **Provedor:** [Frankfurter.app](https://www.frankfurter.app/)
- **Finalidade:** Obter cotações de moedas em tempo real
- **Documentação:** [Frankfurter Docs](https://www.frankfurter.app/docs/)

## 📦 Como usar

### Parâmetros
````
de - Moeda de origem (ex: USD, EUR, BRL)

para - Moeda de destino (ex: BRL, USD, JPY)

valor - Valor a ser convertido
````

### Requisição
```http
GET http://localhost:8080/conversor?de=USD&para=BRL&valor=100
````

### Resposta

````Json
{
"valorOriginal": 100.0,
"moedaOrigem": "USD",
"moedaDestino": "BRL",
"valorConvertido": 520.50,
"dataHora": "08/11/2025 02:52"
}
````
