package com.example;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero da sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a sua agencia: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.print("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ conta +" e seu saldo "+saldo+ " já está disponível para saque.");
    }
}
