package SkillBuilders;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{
		int width = 4;				//longer side of rectangle
		int length = 13;			//shorter side of rectangle
		int perimeter;	//calculate perimeter of rectangle by multiplying the width by 2 and length by 2
		
		perimeter = 2 * length + 2 * width;
		
		System.out.println("The Perimeter of the rectangle is: " + perimeter);
	}

}
