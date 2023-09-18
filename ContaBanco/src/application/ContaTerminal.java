package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor digite o número da conta: ");
		int numeroDaConta = sc.nextInt();

		System.out.print("Por favor digite a agência da conta: ");
		String agencia = sc.next();

		System.out.print("Por favor digite o nome do titular da conta: ");
		String nomeDoCliente = sc.next();

		System.out.print("Por favor digite o saldo da conta: ");
		double saldo = sc.nextDouble();

		System.out.printf("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numeroDaConta + " e seu saldo R$ " + saldo + " já está disponível para saque!");

		sc.close();

	}

}
