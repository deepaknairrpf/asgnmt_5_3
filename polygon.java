
public class polygon {
	private int length,breadth,area;
	polygon(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		area=length*breadth;
	}
	polygon(int length)
	{
		this.length=length;
		area=length*length;
		
	}
	int getArea()
	{
		return area;
	}

}
