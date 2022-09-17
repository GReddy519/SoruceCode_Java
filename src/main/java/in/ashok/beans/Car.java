package in.ashok.beans;

public class Car {
	private IEngine eng;
	private int i;
	public Car()
	{
		System.out.println("car constructor");
	}
	
	public void setEng(IEngine eng)
	{
		
		System.out.println("set called");
		this.eng=eng;
	}
	
	public void drive()
	{
		
		int status=eng.start();
		if(status==0)
		{
			System.out.println("Journey started");
		}
	}

}
