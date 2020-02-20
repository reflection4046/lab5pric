package lab5.com;

public class Bicycle {
	
	
	public int Gear;
    public int Speed;
    
    public Bicycle() 
	{
		
	}
	
	
	public Bicycle(int gear, int speed) 
	{
		
		Gear = gear;
		Speed = speed;
	}


	public int getGear() {
		return Gear;
	}


	public void setGear(int gear) {
		Gear = gear;
	}


	public int getSpeed() {
		return Speed;
	}


	public void setSpeed(int speed) {
		Speed = speed;
	}
    
	public void Apply_Break( int s)
	{
		
		if (s<=Speed)
		{    
			Speed--;
			
			System.out.println(" Speed decreased  ");
			System.out.println("  After Break Speed  : "+ Speed);
			
		}
		else
			
		System.out.println(" speed method ");
		
	}
	
	public void speed (int b)
	{
		
		if(b>=Speed)
		{
			Speed++;
			
			System.out.println(" Speed  increased  ");
			System.out.println("  Now Speed  : "+ Speed);
			
		}
		
		else
			
			System.out.println("slow down your Speed " );
	}
	
	public void Show()
	{
		System.out.println("  Input Gear: "+ Gear);
		System.out.println("  Input Speed  : "+ Speed);
		
	}
	
}

