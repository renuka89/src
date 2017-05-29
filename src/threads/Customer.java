package threads;
//inter thread communication using moniter block i.e wait ,notify,notifyall
public class Customer{  
	int amount=10000;  
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
	if(this.amount<amount){  
	System.out.println("Less balance; waiting for deposit...");  
	try{
		wait();
		}catch(Exception e){}  
	}  
	this.amount-=amount;  
	System.out.println("withdraw completed... extisting balance "+this.amount);  
	}  
	//----------------------  
	synchronized void deposit(int amount){  
	System.out.println("going to deposit...");  
	this.amount+=amount;  
	System.out.println("deposit completed... "+this.amount +"present in account");  
	notify();  
	}  
	}  
	  
	class Test{  
	public static void main(String args[]){  
	 final Customer c=new Customer();  
	
	new Thread(){  
	public void run(){
		c.withdraw(15000);
		}  
	}.start(); 
	
	new Thread(){  
	public void run(){
		c.deposit(10000);
		}  
	}.start();  
	  
	}}  