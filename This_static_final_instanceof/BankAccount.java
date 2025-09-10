public class BankAccount {
		static String bankname = "ICICI";
		static int totalaccounts = 0;
		final String accountNumber;
		String accountHolderName;
		static void getTotalAccounts() {
			System.out.println("Total Accounts: " + totalaccounts);
		}
		BankAccount(String accountHolderName, String accountNumber){
			this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber;
			totalaccounts++;
		}
		public void getAccountDetails() {
			if( this  instanceof  BankAccount) {
				 System.out.println("Bank Name: " + bankname);
		         System.out.println("Account Holder: " + accountHolderName);
		         System.out.println("Account Number: " + accountNumber);
			}
		}
		 public String getAccountHolderName() {
		       return accountHolderName;
		   }
		  public void setAccountHolderName(String accountHolderName) {
		       this.accountHolderName = accountHolderName;
		   }

		public static void main(String[] args) {
			BankAccount account1 = new BankAccount("Yanshi", "ACC12345");
			BankAccount account2 = new BankAccount("Agarwal", "ACC67890");
		       System.out.println("Account1 Details:");
		       account1.getAccountDetails();
		       System.out.println();
		       System.out.println("Account2 Details:");
		       account2.getAccountDetails();
		       System.out.println();
		       System.out.println("Total Accounts: " + totalaccounts);	        
		}
}
