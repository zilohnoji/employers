package Program;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Entities.Source;

public class Main {
	public static void main(String[] args) {
		List<Source> listFuncionarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);

		int aumentar;
		int counter = 0;
		int quantidade;
		int id = 0;
		double salario = 0;
		String nome = null;

		do {
			System.out.print("Quantos usuários você quer registrar? ");
			quantidade = sc.nextInt();
		} while (quantidade <= 0);

		for (int i = 0; i < quantidade; i++) {
			System.out.print("\nID: ");
			id = sc.nextInt();
			sc.nextLine();

			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Salário: ");
			
			salario = sc.nextDouble();

			Source obj = new Source(nome, id, salario);
			listFuncionarios.add(obj);

		}

		System.out.println("Digite o id na qual irá ter aumento salarial: ");
		aumentar = sc.nextInt();
		
		for (Source aumento : listFuncionarios) {
			if (aumento.getId() == aumentar) {
				System.out.println("Digite a porcentagem do aumento: ");
				int kk = sc.nextInt();
				
				double salar = aumento.getSalario();
				aumento.setSalario(aumento.getSalario() + (salar * kk) / 100.0);
			}
		}
		System.out.println("\nDados Atualizados");
		for (Source key : listFuncionarios) {
			System.out.printf("[%d]Nome: %s | ID:%d | Salario:%.2f\n", counter, key.getNome(), key.getId(), key.getSalario());
			counter++;
		}
		
		sc.close();
	}
}
