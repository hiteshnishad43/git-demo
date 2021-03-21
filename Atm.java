import java.util.*;
class Atm
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int amount;
		double balance, rem_bal;
		amount=sc.nextInt();
		balance= sc.nextDouble();
		
		if(amount%5==0){
				if(amount<balance && (amount+0.5)<=balance){
					rem_bal= balance-amount-(0.5);
					System.out.println(rem_bal);
				}
				else{
					System.out.println(balance);
				}
		}
		else{
			System.out.println(balance);
		}
	}
}
