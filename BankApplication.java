import java.util.Scanner;

class BankApplication
{
	private String accountHolderName;
	private String address;
	private long addharNumber;
	private String panNumber;
	private int` upiNumber;
	private double balance;
	private long phoneNumber;

	public BankApplication(string name,string address,long addharNumber,string panNumber,int upiNumber,double balance,long phonrNumber){
		this.accountHoldername=accountHoldername;
		this.address=address;
		this.addharNumber=addarNumber;
		this.panNumber=panNumber;
		this.upiNumber=upiNumber;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}

	//getters and setter

	public string getaccountHolderName(){
		return accountHoldername;
	}
	public void setaccountHolderName(String accountHolderName){
		this.accountHolderName = accountHoldername;
	}
	public string getaddress(){
		return address;
	}
	public void setaddress(String address) {
		this.address=address;	
	}
	public long getaddharNumber(){
		return addharNumber;
	}
	public void setaddharNumber(String addharNumber) {
		this.addharNumber=addharNumber;
	}
	public string setPanNumber(){
		return panNumber;
	}
	public void getPanNumber(){
        this.PanNumber=panNumber;
	}
	public int setupiNumber(){
		return upiNumber;
	}
	public void getupiNumber(){
		this.upiNumber=upiNumber;
	}
	public double getbalance(){
		return balance;
	}
	public void setbalance(){
		this.balance=balance;
	}
	public long getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(){
		this.phoneNumber.phoneNumber
	}
    public void displayAccountDetails(){
    	System.out.println("AccountHolderName: "+AccountHoldername);
    	System.out.println("Address: "+Address);
    	System.out.println("adharNumber: "+adharNumber);
    	System.out.println("PanNumber: "+PanNumber);
    	System.out.println("upiNumber: "+UpiNumber);
    	System.out.println("Balance: "+Balance);
    	System.out.println("phoneNumber: "+phoneNumber);
    }    
    //depositmoney
    public void deposit(double amount)
    {
    	balance +=amount;
    	System.out.println(amount+"deposited Sucessfully");
    }
    public void withdrawn(double amount){
    	if(amount<=balance){
    		balance -= amount;
    		System.out.println(amount + "withdrawn Sucessfully");
    	}else{
    		System.out.println("Insufficient balance. ");
    	}
    }
    public void UpdateAccount(string accountHolderName, string address,long addharNumber,string panNumber,int upiPin,double balance,long phoneNumber)
}
