
public abstract class ContaBancaria {

	protected Pessoa titular;
	protected Banco banco;
	protected int nroConta;
	protected double saldo;
	protected String senha;
	
	
	
	
	
	public ContaBancaria(Pessoa titular, Banco banco, int nroConta, double saldo, String senha) {
		this.titular = titular;
		this.banco = banco;
		this.nroConta = nroConta;
		this.saldo = saldo;
		this.senha = senha;
	}

	
	public Pessoa getTitular() {
		return this.titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public String getBanco() {
		return banco.getNome();
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public double getSaldo() {
		return saldo;
	}


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void saque(double saque) {
		
		this.saldo=saldo-saque; 		
	}
	
	
	public void deposito(double deposito) {
		System.out.println("Informe o valor do depósito: ");
		this.saldo+=deposito;
	}
	
	
	public boolean verificaSenha(String senha) {
	
		
		if(this.senha==senha) {
			return true;
		}else {						
			return false;
		}
	
	}
	
	

	@Override
	public String toString() {
		return "ContaBancaria [titular=" + titular.getNome() + ", banco=" + banco + ", nroConta=" + nroConta + ", saldo=" + saldo
				+ ", senha=" + senha + "]";
	}
	
	
	
	
	
	
}
