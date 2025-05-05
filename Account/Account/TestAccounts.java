public class TestAccounts
{
	public static void main(String[] args) 
	{
		Account c1 = new Credit("1111111111",-1000,-500000);
		Account c2 = new Credit("2222222222",-1250000,-500000);
		Account c3 = new Credit("3333333333",1000,-500000);
		Account s1 = new Savings("4444444444", 10000,500);
		Account s2 = new Savings("5555555555", 100,500);
		System.out.println(c1+" with interest: "+c1.calculateInterest(10) );
		System.out.println(c2+" with interest: "+c2.calculateInterest(10) );
		System.out.println(c3+" with interest: "+c3.calculateInterest(10) );
		System.out.println(s1+" with interest: "+s1.calculateInterest(10) );
		System.out.println(s2+" with interest: "+s2.calculateInterest(10) );		
	}
}