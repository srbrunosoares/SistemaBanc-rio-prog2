import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Banco>listaDeBancos = new ArrayList<>();
		ArrayList<Pessoa>listaDePessoas = new ArrayList<>();
	
		int opcaoMenu1;
		do {
			menu1();
			opcaoMenu1=sc.nextInt();
			
			
			
		}while(opcaoMenu1!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Cadastro de Pessoa: ");
		System.out.println("Primeiro nome: ");
		String nome = sc.nextLine();
		System.out.println("Sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.println("Idade: ");
		int idade = sc.nextInt();	sc.nextLine();
		System.out.println("CPF: ");
		int cpf =sc.nextInt();	sc.nextLine();
		
		Pessoa pessoa = new Pessoa(nome, sobrenome, idade, cpf);
		
		Banco banco = new Banco("Santander", "51656165165/0001", 33);
		
		listaDePessoas.add(pessoa);
		
		listaDeBancos.add(banco);
		
		ContaCorrente cc = new ContaCorrente(pessoa, banco, 1, 00, "12345", 0.1);
		pessoa.addConta(cc);
		banco.addConta(cc);
		 cc = new ContaCorrente(pessoa, banco, 3, 00, "12545", 0.2);
		pessoa.addConta(cc);
		
	
		
		
		System.out.println("---Login---");
		System.out.println("Informe o CPF: ");
		cpf =sc.nextInt();
		
		
			
			if (pessoa.getCpf()==cpf) {
				System.out.println("Escolha a Conta: ");
				pessoa.infoContasProtected();
				int escolhaConta=sc.nextInt();
				sc.nextLine();
				System.out.println("Informe a senha: ");
				String senha=sc.nextLine();
				
				
				
				boolean verificacao=pessoa.getCc(escolhaConta-1).verificaSenha(senha);			
				
				if(verificacao=true) {
					System.out.println("Informações da conta: ");
					pessoa.getCc(0);
				}
				else {
					System.out.println("Senha incorreta");
				}
			}
			
		
		
		
	
	sc.close();
	
	}

	
	public static void menu1() {
		System.out.println("ESCOLHA UMA OPÇÃO: ");
		System.out.println("1 - PESSOAS");
		System.out.println("2 - BANCOS");
		System.out.println("0 - ENCERRAR PROGRAMA");
	}
	
	public static void menuBanco() {
		System.out.println("1 - Listar bancos cadastrados");
		System.out.println("2 - Cadastrar novo banco");		
	}
	
	
}
