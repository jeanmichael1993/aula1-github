package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numCont = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String resp = sc.next();
		Account conta;
		if (resp.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Account(numCont, nomeTitular, depositoInicial);
		} else {
			conta = new Account(numCont, nomeTitular);
		}

		System.out.println("Account data: ");
		System.out.println(conta);

		System.out.print("Enter a deposit value: ");
		conta.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(conta);

		System.out.print("Enter a whithdraw value: ");
		conta.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(conta);

		sc.close();

	}

}
