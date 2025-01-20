package com.seuusuario.conversormoedas;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class JsonParser {
    private static final ObjectMapper mapper = new ObjectMapper();

    public Map<String, Double> parseExchangeRates(String json) throws IOException {
        JsonNode root = mapper.readTree(json);
        JsonNode ratesNode = root.get("rates");

        if (ratesNode != null && ratesNode.isObject()) {
            Map<String, Double> rates = new HashMap<>();
            ratesNode.fields().forEachRemaining(entry ->
                    rates.put(entry.getKey(), entry.getValue().asDouble())
            );
            return rates;
        } else {
            throw new IOException("Estrutura JSON de taxas de câmbio inesperada.");
        }
    }

    public String getBaseCurrency(String json) throws IOException {
        JsonNode root = mapper.readTree(json);
        JsonNode baseCurrencyNode = root.get("base_code");
        if (baseCurrencyNode != null) {
            return baseCurrencyNode.asText();
        }
        throw new IOException("Estrutura JSON de moeda base inesperada.");
    }
}
