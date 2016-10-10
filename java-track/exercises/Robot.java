
public class Robot {

	//fields
	private String name;
	private int speed;
	private int x;
	private int y;
	private int orientation;

	public Robot(String name, int x, int y, int speed, int orientation){

		this.name = name;
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	public String getName(){
		return this.name;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getSpeed(){
		return this.getSpeed();
	}
	public int getOrientation(){
		return this.orientation;

	}
	public String convertOrientation()
	{
		if((orientation == 360) || (orientation == -360))
		{
			orientation = 0;
		}
		if((orientation==0))
		{
			return "north";
		}
		else if((orientation==90) || (orientation ==-270 ))
		{
			return "east";
		}
		else if((orientation==180) || (orientation == -180))
		{
			return "south";
		}
		else if((orientation==270) || (orientation == -90))
		{
			return "west";
		}
		else
			return "Invalid direction";

	}
	public String move(int x, int y, int speed, int orientation)
	{
		if(convertOrientation()=="north")
		{
			this.x = x;
			this.y = y+speed;

		}
		else if(convertOrientation()=="east")
		{
			this.x = x+speed;
			this.y = y;
		}
		else if(convertOrientation()=="south")
		{
			this.x = x;
			this.y = y-speed;
		}
		else if(convertOrientation()=="west")
		{
			this.x = x-speed;
			this.y = y;
		}
		return "("+this.x+","+this.y+")";

	}
	public String Position(String direction)
	{
		if(direction=="left")
		{
			orientation = orientation - 90;
			return  " If the Robot " + this.name+" turns "+ direction + " then the New Position = " + move(this.x,this.y,this.speed,this.orientation)+" and Orientation = "+convertOrientation();
		}
		if(direction=="right")
		{
			orientation = orientation + 90;
			return " If the Robot "+this.name+" turns "+ direction + " then the New Position = " + move(this.x,this.y,this.speed,this.orientation)+" and Orientation = "+convertOrientation(); 
		}
		else return "Invalid Position"; 
	}
	public double distance(Robot r)
	{
		double dist = Math.sqrt((Math.pow((this.x-r.x), 2))+(Math.pow((this.y-r.y), 2)));
		return dist;
	}
	public String toString() 
	{
		return "Robot [Name=" + this.name + ", Position= [" + this.x+", " +this.y+"], Speed=" + this.speed + ", Orientation="
				+ convertOrientation() + "]";
	}


	public static void main(String[] args)
	{
		Robot a = new Robot("Sam", 3, 4, 5, 90);

		Robot b = new Robot("Zac", -3, 7, 2,  180);

		Robot c = new Robot("Fred", -7, -1, 5,  0);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(a.Position("left"));
	}
}	

