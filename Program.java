import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Banco>listaDeBancos = new ArrayList<>();
		ArrayList<Pessoa>listaDePessoas = new ArrayList<>();
		Pessoa pessoa=null;
		Banco banco;
		int opcaoMenu1,opcaoPessoa=0, opcaoBanco=0;
		do {
			menu1();
			opcaoMenu1=sc.nextInt();
			sc.nextLine();
				switch (opcaoMenu1) {
				case 1: {
						do {
							
							menuPessoa();
							opcaoPessoa=sc.nextInt();
							sc.nextLine();
								switch (opcaoPessoa) {
								case 1: {
									
									
									
									System.out.println("\nCadastro de Pessoa: ");
									System.out.println("Primeiro nome: ");
									String nome ="Bruno"; //sc.nextLine();
									System.out.println("Sobrenome: ");
									String sobrenome ="Soares"; //sc.nextLine();
									System.out.println("Idade: ");
									int idade = 24;//sc.nextInt();	sc.nextLine();
									System.out.println("CPF: ");
									int cpf=sc.nextInt();	
									sc.nextLine();
									
									 pessoa = new Pessoa(nome, sobrenome, idade, cpf);
									 
									
									banco = new Banco("Santander", "51656165165/0001", 33);
									
									
									
									listaDeBancos.add(banco);
									
									System.out.println("Escolha o tipo de conta: ");
									System.out.println("1 - Conta Corrente");
									System.out.println("2 - Conta Poupança");
									
									
									int opcaoTipo=sc.nextInt(); sc.nextLine();
									
									int numeracaoConta=5;
											System.out.println("Escolha uma senha para a conta: ");
											String senha =sc.nextLine();
											switch (opcaoTipo) {
											case 1: {
												//CRIAR CONTA CORRENTE E ADICIONAR A LISTA DE PESSOA
													ContaCorrente conta = new ContaCorrente(pessoa, banco, numeracaoConta, 0.0, "12345", 0.1);
													pessoa.addConta(conta);
													listaDePessoas.add(pessoa);
													numeracaoConta++;
												break;
											}
											
											case 2: {
												//CRIAR CONTA POUPANÇA E ADICIONAR A LISTA DE PESSOA
												ContaPoupanca conta = new ContaPoupanca(pessoa, banco, numeracaoConta, 0.0, senha, 0.6);
												pessoa.addConta(conta);
												listaDePessoas.add(pessoa);
												numeracaoConta++;
												break;
											}
											
											case 0: {
												System.out.println("Voltando ao menu anterior!");
												break;
											}
											default:
												System.out.println("Opção inválida!!");
												break;
											}
									
									
									System.out.println("CONTA CADASTRADA!!!");
									System.out.println("");
									listaDePessoas.get(0).info();
									
									break;
								}
								
									case 2 : {
										if(listaDePessoas.isEmpty()){
											System.out.println("Não há usuários cadastrados!!");
											break;
										}
										
										System.out.println("---Login---");
										System.out.println("Informe o CPF: ");
										int cpf=sc.nextInt();
										sc.nextLine();
										
											
											if (listaDePessoas.get(0).cpf==cpf) {
												System.out.println("Escolha a Conta: ");
												listaDePessoas.get(0).infoContasProtected();
												int escolhaConta=sc.nextInt();
												sc.nextLine();
												escolhaConta--;
												
												System.out.println("Informe a senha: ");
												String senha=sc.nextLine();
												System.out.println(escolhaConta);
												sc.nextLine();
												
												@SuppressWarnings("unused")
												boolean verificacao=pessoa.getCc(0).verificaSenha(senha);			
												
														if(verificacao=true) {
															System.out.println("Informações da conta: ");
															
															if(listaDePessoas.get(0).getCc(0).getClass().equals(ContaCorrente.class)) {
																ContaBancaria conta=listaDePessoas.get(0).getCc(0);
																listaDePessoas.get(0).infoCc(conta);
																System.out.println("");										
															}else{
																ContaBancaria conta=listaDePessoas.get(0).getCc(0);
																listaDePessoas.get(0).infoCp(conta);
																System.out.println("");	
																
															}
														
														}
														else {
															System.out.println("Senha incorreta");
														}
											}else {
												System.out.println("CPF Não cadastrado!!\n\n");
											}
											break;
									
									}
									
									case 0: {
										System.out.println("Retornando ao menu principal!\n\n");
									}
								
														
								default:
									;
									break;
								}
							
						}while(opcaoPessoa!=0);
						break;
		
				}
				//OPCAO BANCOS
				case 2 :{
					do {
						menuBanco();
						opcaoBanco=sc.nextInt();
						sc.nextLine();
						switch (opcaoBanco) {
						case 1: {
								if(listaDeBancos.isEmpty()) {
									System.out.println("Não há bancos cadastrados!");								
								}else {
									for (Banco lista: listaDeBancos ) {
										lista.infoBanco();										
									}
								}
							break;
						}
						
						case 2:{System.out.println("Cadastrar novo banco: ");
						System.out.println("\nInforme a razão social/nome do banco: ");
						String nome=sc.nextLine();
						System.out.println("Informe o CNPJ: ");
						String cnpj =sc.nextLine();
						System.out.println("Informe o N° do banco: ");
						int nro=sc.nextInt();
							sc.nextLine();
							banco=new Banco(nome, cnpj, nro);
							listaDeBancos.add(banco);
							break;
						}
						
						default:
							System.out.println("OPÇÃO INVÁLIDA!!!");
							break;
						}
					}while(opcaoBanco!=0);
					break;
				}
				
				
					default:			
					break;
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
		System.out.println("0 - Menu anterior");
	}
	
	public static void menuPessoa() {
		
		System.out.println("1 - Cadastrar nova pessoa");
		System.out.println("2 - Acessar conta: ");
		System.out.println("0 - Menu anterior");
	}
	
}
