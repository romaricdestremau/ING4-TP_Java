package Exo_5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		System.out.println(p.getX()+" "+p.getY()); 
		
		
		Point p1 = new Point(1,2);
		System.out.println(p1.getX()+" "+p1.getY());
		
		p1.setX(4);
		p1.setY(5);
		System.out.println(p1.getX()+" "+p1.getY());

	}

}
