
public class ContaPoupanca extends ContaBancaria {
	private double rendimento;
	private int saquesMensais;
	
	
	
	
	
	
	public ContaPoupanca(Pessoa titular, Banco banco, int nroConta, double saldo, String senha, double rendimento) {
		super(titular, banco, nroConta, saldo, senha);
		this.rendimento = rendimento;
		
	}
	

	
	public double getRendimento() {
		return rendimento;
	}




	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}





	public int getSaquesMensais() {
		return saquesMensais;
	}




	public void setSaquesMensais(int saquesMensais) {
		this.saquesMensais = saquesMensais;
	}





	public void info() {
		System.out.println(
				"Conta Corrente"
			+	"\nTitular: "+getTitular().nome
			+	"\nBanco "   +getBanco()
			+   "\nN° Conta: "+getNroConta()
			+	"\nSaldo: R$ "+getSaldo()
			//não exibe senha
			+ "\nRendimento: "+getRendimento());
		
	}
	
	
	public void novoMes() {
		
		
	}
	
	
	public void saque() {
		
	}
	
	
	
	
	

}
