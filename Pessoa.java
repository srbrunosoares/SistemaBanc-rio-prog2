import java.util.ArrayList;

public class Pessoa {
	public String nome;
	public String sobrenome;
	public int idade;
	public int cpf;
	
	
	private ArrayList <ContaBancaria>contaBancaria = new ArrayList<>();
	
	
	
	
	
	
	
	public Pessoa(String nome, String sobrenome, int idade, int cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
		
	}

	
	public void addConta(ContaBancaria conta) {
		this.contaBancaria.add(conta);		
	}
	
	public void removeConta(ContaCorrente conta) {
		this.contaBancaria.remove(conta);
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void info() {
		
		System.out.println(
				
				"\nNome: "+getNome()
			+	"\nSobrenome: "+getSobrenome()
			+	"\nIdade: "+getIdade()
				);		
	}
	
	
	public void infoContasProtected() {
		for(ContaBancaria lista :contaBancaria) {
			
			System.out.println("\n\nBanco: "+lista.getBanco()
							+"\nN° Conta:"+lista.getNroConta()
				
					);
			
						
		}
		
	}


	public int getIndex(ContaBancaria cc) {
		return this.contaBancaria.indexOf(cc);
	}
	
	public int getSizeCc() {
		return this.contaBancaria.size();
	}
	
	public ContaBancaria getCc(int index) {
		
		return this.contaBancaria.get(index);
	}
	
	public void infoCc(ContaBancaria conta) {
		ContaCorrente cc = (ContaCorrente) conta;
		cc.info();
	}
	public void infoCp(ContaBancaria conta) {
		ContaPoupanca cp = (ContaPoupanca) conta;
		cp.info();
	}
	
	
	
	
	
}
