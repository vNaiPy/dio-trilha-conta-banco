package org.example;

import org.example.model.ContaCliente;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta:");
        Double saldo = scanner.nextDouble();
        scanner.nextLine();

        ContaCliente contaCliente = new ContaCliente(numero, agencia, nomeCliente, saldo);

        String msgFormatted = "Olá ".concat(contaCliente.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(contaCliente.getAgencia())
                .concat(", conta ").concat(contaCliente.getNumero().toString())
                .concat(" e seu saldo ").concat(contaCliente.getSaldo().toString())
                .concat(" já está disponível para saque.");

        System.out.println(msgFormatted);

        scanner.close();
    }
}