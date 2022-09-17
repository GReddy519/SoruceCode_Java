package in.ashok.beans;

public class DieselEngine implements IEngine {
	
	public DieselEngine()
	{
		System.out.println("Diesel Engine constructor");
	}
	
	public int start()
	{
		System.out.println("DieselEngine started..");
		return 0;
	}

}
