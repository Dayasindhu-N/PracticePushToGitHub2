package programs;

class Bank
{
	String accHolderName;
	String branch;
	String ifscCode;
	double bal;
	public Bank (String accHolderName,String branch,String ifscCode,double bal)
	{
		this.accHolderName=accHolderName;
		this.branch=branch;
		this.ifscCode=ifscCode;
		this.bal=bal;
		System.out.println("Account Holder Name:"+this.accHolderName+" "+"Branch:"+this.branch+" "+"IFSC Code:"+this.ifscCode+" "+"Balance:"+this.bal);
	}
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Bank b1=new Bank("Asit","BRC","SBIN0040896",23511.02);
		@SuppressWarnings("unused")
		Bank b2=new Bank("Arun","NGM","SBIN0040556",20882.59);
		@SuppressWarnings("unused")
		Bank b3=new Bank("Sati","MYS","SBIN0040123",98665.05);
	}
}
