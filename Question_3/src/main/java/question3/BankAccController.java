package question3;

public class BankAccController{

	
	BankAccServiceImpl bankaccountS = new BankAccServiceImpl() {
		
		public double withdraw(long accountId, double balance) {
			return withdraw(323902,1301);
		}
		
		public double getBalance(long accountId) {
			return getBalance(342);
		}
		
		public boolean fundTransfer(long fromAccount, long toAccount, double aount) {
			return false;
		}
		
		public double deposit(long accountId, double balance) {
			return deposit(1000, 1000);
		}
	};

	public void withdraw() {
		return;
	}
	
	
}

