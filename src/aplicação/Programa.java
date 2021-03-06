package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuentes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contribuentes> lista = new ArrayList<>();
		
		System.out.print("Insira o numero de contribuentes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da taxa do #" + i + " contribuente:");
			System.out.print("Pessoa Física ou Juridica (f/j)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double renda = sc.nextDouble();
			switch (resp) {
			case 'f': {
				System.out.print("Despesas com saúde: ");
				double saude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, renda, saude));
				break;
			} case 'j':{
				System.out.print("Número de empregados: ");
				int empregados = sc.nextInt();
				lista.add(new PessoaJuridica(nome, renda, empregados));
				break;
			}
			default:			
		}
	}
		System.out.println();
		System.out.println("Impostos Pagos:");
		double soma = 0;
		for (Contribuentes p: lista) {
			System.out.println(p);
			soma += p.impostoDeRenda(); 
		}
		System.out.println();
		System.out.printf("Imposto Total: $ %.2f",soma);
	sc.close();
}
}
