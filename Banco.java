import java.util.ArrayList;

public class Banco {
	private String nome;
	private String cnpj;
	private int nroBanco;

	private ArrayList <ContaBancaria>contasBancarias = new ArrayList<ContaBancaria>();

	
	public Banco(String nome, String cnpj, int nroBanco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.nroBanco = nroBanco;
	}

	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}




	public int getNroBanco() {
		return nroBanco;
	}




	public void setNroBanco(int nroBanco) {
		this.nroBanco = nroBanco;
	}




	public ArrayList<ContaBancaria> getContasBancarias() {
		return contasBancarias;
	}




	public void setContasBancarias(ArrayList<ContaBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}




	public void infoBanco() {
		System.out.println(
				
				"\nBanco: "+this.nome
				+"\nCNPJ: "+this.cnpj
				+"\nN° : "+this.nroBanco
				+"\n");
		
	}
	
	public void addConta(ContaBancaria conta) {
		this.contasBancarias.add(conta);
	}
	
	public void removeConta(ContaBancaria conta) {
		this.contasBancarias.remove(conta);
	}
	
	public void infoContas() {
		
	}
	
	public void criarConta() {
		
	}
	
	public void fecharConta() {
		
	}
}
