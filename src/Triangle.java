public class Triangle extends Square
{ 
    //Calculate and return area of triangle
    public double getArea() 
    {
    	this.area = (getHeight() * getBase()) / 2;
    	return this.area; 
    }
}   