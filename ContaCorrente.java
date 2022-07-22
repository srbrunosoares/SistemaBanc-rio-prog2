
public class ContaCorrente extends ContaBancaria {
	private double taxasMensais;
	

	public ContaCorrente(Pessoa titular, Banco banco, int nroConta, double saldo, String senha, double taxasMensais) {
		super(titular, banco, nroConta, saldo, senha);
		this.taxasMensais = taxasMensais;
	}

	public double getTaxasMensais() {
		return taxasMensais;
	}

	public void setTaxasMensais(double taxasMensais) {
		this.taxasMensais = taxasMensais;
	}
	
	
	
	
	public void info() {
		
		System.out.println(
				"Conta Corrente"
			+	"\nTitular: "+getTitular().nome
			+	"\nBanco "   +getBanco()
			+   "\nN° Conta: "+getNroConta()
			+	"\nSaldo: R$ "+getSaldo()
			//não exibe senha
			+ "\nTaxas Mensais: "+getTaxasMensais());
		
		
		
	}
	
	
	
	public void desconto() {
		this.saldo=(saldo*this.taxasMensais)*100;
		
	}
	
	public void novoMes() {
		
		desconto();
	}
	
	
	
	
	
}
