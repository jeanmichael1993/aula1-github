package entities;

public class Account {
	
	private int numCont;
	private String nomeTitular;
	private double depositoInicial;
	
	public Account(int numCont, String nomeTitular) {
		this.numCont = numCont;
		this.nomeTitular = nomeTitular;
	}
	
	public Account(int numCont, String nomeTitular, double depositoInicial) {
		this.numCont = numCont;
		this.nomeTitular = nomeTitular;
		deposit(depositoInicial);
	}
	
	public int getNumCont() {
		return numCont;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void deposit(double dep) {
		this.depositoInicial += dep;
	}
    public void withdraw(double whit) {
    	this.depositoInicial -= (whit + 5.00);
	}
	
	public String toString() {
		
		return "Account " 
		+ getNumCont()
		+ ", Holder: " 
		+ getNomeTitular()  
		+ ", Balance: $ " 
		+ String.format("%.2f",getDepositoInicial());
		
	}
}
