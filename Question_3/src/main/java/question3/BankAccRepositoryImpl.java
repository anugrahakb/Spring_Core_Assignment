package question3;


public abstract class BankAccRepositoryImpl implements BankAccRepository {
	
	private void BankAccountRepositoryImpl(){
	  BankAcc bankaccount = new BankAcc();
	  bankaccount.setAccountHolderName("sai");
	  bankaccount.setAccountId(55);
	  bankaccount.setAccountType("Savings");
	  bankaccount.setAccountBalance((long) 21132.4);


	}
}
