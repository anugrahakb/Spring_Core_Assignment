package question3;

public interface BankAccRepository{

	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
	
	
}
