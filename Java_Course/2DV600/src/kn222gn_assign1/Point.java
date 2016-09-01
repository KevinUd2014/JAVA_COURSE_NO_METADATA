package kn222gn_assign1;

public class Point {
	
	int xOrigin, yOrigin;
	
	public static void main(String args[]){
		
		try{
			Point p1 = new Point();
			Point p2 = new Point(3,4);
					
			System.out.println(p1.toString());   // ==> (0,0)
			System.out.println(p2.toString());   // ==> (3,4)
					
			if (p1.isEqualTo(p2))              // False!
				System.out.println("The two points are equal");
					
			double dist = p1.distanceTo(p2);
			System.out.println("Point Distance: "+dist);
					
			p2.move(5,-2);         // ==> (8,2)
			p1.moveToXY(8,2);      // ==> (8,2)
					
			if (p1.isEqualTo(p2))              // True!
				System.out.println("The two points are equal");
		}
		catch(Exception e){
			
			e.getMessage();
		}
	}
	
	public String toString(){
		
		String string = "(" + xOrigin + "," + yOrigin + ")\n";
		
		return string;
	}
	public Point(int x, int y){
		
		//points are set to new coordinates
		xOrigin = x;
		yOrigin = y;
		
	}
	public Point() {
		
		//Coordinates are set to 0
		xOrigin = 0;
		yOrigin = 0;
	}

	public void move(int x, int y){
		
		//moves the coordinate to the new x and y
		xOrigin += x;
		yOrigin += y;
	}
	public void moveToXY(int x, int y){
		
		//Sets the origin x and y to the new x and y
		xOrigin = x;
		yOrigin = y;
		
	}
	
	public double distanceTo(Point point){
		
		//returns the math.sqrt value and makes the value to a double and make a math.pow on it
		return Math.sqrt(Math.pow((double)xOrigin - point.xOrigin, 2) + (Math.pow((double)yOrigin - point.yOrigin, 2)));
	}
	public boolean isEqualTo(Point p2){
		
		boolean boo = false;
		
		//if they are the same return true
		if(xOrigin == p2.xOrigin && yOrigin == p2.yOrigin){
			
			boo = true;
			return boo;
		}
		
		return boo;
	}
	
}
