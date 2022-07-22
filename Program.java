import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Banco>listaDeBancos = new ArrayList<>();
		ArrayList<Pessoa>listaDePessoas = new ArrayList<>();
		Pessoa pessoa=null;
		Banco banco;
		int opcaoMenu1;
		do {
			menu1();
			opcaoMenu1=sc.nextInt();
			
				switch (opcaoMenu1) {
				case 1: {
					menuPessoa();
					int opcaoPessoa=sc.nextInt();
					sc.nextLine();
						switch (opcaoPessoa) {
						case 1: {
							
							System.out.println("\nCadastro de Pessoa: ");
							System.out.println("Primeiro nome: ");
							String nome = sc.nextLine();
							System.out.println("Sobrenome: ");
							String sobrenome = sc.nextLine();
							System.out.println("Idade: ");
							int idade = sc.nextInt();	sc.nextLine();
							System.out.println("CPF: ");
							int cpf =sc.nextInt();	sc.nextLine();
							
							 pessoa = new Pessoa(nome, sobrenome, idade, cpf);
							
							banco = new Banco("Santander", "51656165165/0001", 33);
							
							listaDePessoas.add(pessoa);
							
							listaDeBancos.add(banco);
							
							ContaCorrente cc = new ContaCorrente(pessoa, banco, 1, 00, "12345", 0.1);
							pessoa.addConta(cc);
							banco.addConta(cc);
							 cc = new ContaCorrente(pessoa, banco, 3, 00, "12545", 0.2);
							pessoa.addConta(cc);
							
							
							
							break;
						}
						
						case 2 : {
							
							System.out.println("---Login---");
							System.out.println("Informe o CPF: ");
							int cpf=sc.nextInt();
							
							
								
								if (pessoa.getCpf()==cpf) {
									System.out.println("Escolha a Conta: ");
									pessoa.infoContasProtected();
									int escolhaConta=sc.nextInt();
									escolhaConta--;
									sc.nextLine();
									System.out.println("Informe a senha: ");
									String senha=sc.nextLine();
									System.out.println(escolhaConta);
									
									
									boolean verificacao=pessoa.getCc(escolhaConta).verificaSenha(senha);			
									
									if(verificacao=true) {
										System.out.println("Informações da conta: ");
										pessoa.getCc(escolhaConta);
									}
									else {
										System.out.println("Senha incorreta");
									}
								}else {
									System.out.println("CPF Não cadastrado!!");
								}
								break;
							
						}
						
						
						
						default:
							throw new IllegalArgumentException("Unexpected value: " + opcaoPessoa);
							
						}
					
					
					
					
					
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcaoMenu1);
				}
			
			
			
			
			
			
		}while(opcaoMenu1!=0);
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		
		
	
		
		
		
	
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
	
	public static void menuPessoa() {
		
		System.out.println("1 - Cadastrar nova conta");
		System.out.println("2 - Acessar conta: ");
		System.out.println("3 - Menu anterior");
	}
	
}
