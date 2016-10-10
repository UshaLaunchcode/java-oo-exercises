package studio1;

public class Rectangle {
	double length;
	double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public double area(){
		return this.length*this.width;
	}
	public double perimeter(){
		return 2*(this.length + this.width);
	}
	public boolean isSmaller(Rectangle Rectangle1){
		if(this.area()< Rectangle1.area())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean square()
	{
		if(this.length == this.width)
		{
			return true;
			}
		else
		{
			return false;
		}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4, 5);
		System.out.println(r1.area());
		Rectangle r2 = new Rectangle(6, 7);
		System.out.println(r2.area());
		Rectangle r3 = new Rectangle(2,3);
		System.out.println(r3.isSmaller(r2));
		

	}

	
}

