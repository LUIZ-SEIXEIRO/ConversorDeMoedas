package com.seuusuario.conversormoedas;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        JsonParser parser = new JsonParser();
        Scanner scanner = new Scanner(System.in);
        String baseCurrency = "BRL"; // Moeda base inicial
        String baseJson;

        try {
            baseJson = apiClient.fetchExchangeRates(baseCurrency);
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro ao buscar taxas de câmbio: " + e.getMessage());
            return; // Finaliza o programa em caso de erro
        }

        Map<String, Double> exchangeRates = null;
        try {
            exchangeRates = parser.parseExchangeRates(baseJson);
            baseCurrency = parser.getBaseCurrency(baseJson);
        } catch (IOException e) {
            System.err.println("Erro ao processar dados de câmbio: " + e.getMessage());
            return;
        }

        if (exchangeRates == null || exchangeRates.isEmpty()) {
            System.err.println("Não há taxas de câmbio disponíveis.");
            return;
        }

        // Moedas definidas para o programa
        String[] desiredCurrencies = {"USD", "EUR", "GBP", "JPY", "CAD", "AUD"};

        // Menu para interagir com o usuario
        while (true) {
            System.out.println("\nEscolha uma opção de conversão:");
            for (int i = 0; i < desiredCurrencies.length; i++) {
                System.out.println((i + 1) + ". " + baseCurrency + " para " + desiredCurrencies[i]);
            }
            System.out.println((desiredCurrencies.length + 1) + ". Sair");

            System.out.print("Sua escolha: ");
            int choice = scanner.nextInt();

            if (choice == desiredCurrencies.length + 1) {
                System.out.println("Saindo do conversor.");
                break;
            }

            if (choice <= 0 || choice > desiredCurrencies.length) {
                System.out.println("Opção inválida. Escolha um número do menu.");
                continue;
            }

            String targetCurrency = desiredCurrencies[choice - 1];

            System.out.print("Digite o valor em " + baseCurrency + ": ");
            double amount = scanner.nextDouble();

            if (exchangeRates.containsKey(targetCurrency)) {
                double conversionRate = exchangeRates.get(targetCurrency);
                double convertedAmount = amount * conversionRate;
                System.out.println(
                        amount + " " + baseCurrency + " equivale a " + String.format("%.2f", convertedAmount) + " " + targetCurrency);
            } else {
                System.out.println("Taxa de câmbio não encontrada para " + targetCurrency);
            }
        }

        scanner.close();
    }
}
