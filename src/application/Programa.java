package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Contribuinte> lista = new ArrayList<Contribuinte>();
		
		System.out.println("Digite o numero de Contribuintes:");
		int numeroContribuintes = sc.nextInt();
		
		for (int i = 1; i <= numeroContribuintes; i ++) {
			System.out.println("Dados do " + i +"º Contribuinte ");
			System.out.println("O Contribuinte eh uma Pessoa Física ou Juridica (f/j)?");
			char c = sc.next().charAt(0);
			sc.nextLine();
			
			if(c == 'f') {
				System.out.println("Insira o nome da Pessoa Fisica: ");
				String nome = sc.nextLine();
				System.out.println("Informe a renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.println("Informe os gastos com saude:");
				double gastoSaude = sc.nextDouble();
				
				PessoaFisica pf = new PessoaFisica(nome, rendaAnual, gastoSaude);
				lista.add(pf);
				
			}else  {
				System.out.println("Insira o nome da Pessoa Juridica: ");
				String nome = sc.nextLine();
				System.out.println("Informe a renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.println("Informe o numero de funcionarios:");
				Integer qtdFuncionarios = sc.nextInt();
				
				PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, qtdFuncionarios);
				lista.add(pj);
			}
		}
		double somaImpostos = 0.0;
		System.out.println();
		System.out.println("Impostos Calculados:");
		for (Contribuinte cb : lista) {
			System.out.println(cb);
			somaImpostos+= cb.calculoImposto();
		}
		
		System.out.println("Valor total em Impostos: "+ somaImpostos);
		
		sc.close();
	}
}
