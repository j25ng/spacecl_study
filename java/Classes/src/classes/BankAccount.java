package classes;

public class BankAccount {
	private String ano;
	private String owner;
	private int balance;

	BankAccount() {
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAno() {
		return ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
}