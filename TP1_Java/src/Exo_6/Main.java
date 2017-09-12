package Exo_6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Point p1 = new Point(1,2);
		 Point p2 = p1;
		 Point p3 = new Point(1,2);
		 Point p4 = new Point(1,2);
		 Point p5 = new Point(1,2);

		 ArrayList<Point> list = new ArrayList();
		 list.add(p1);
		 //System.out.println(p1 == p2);
		 //System.out.println(p1 == p3);
		 
		 System.out.println(list.indexOf(p1));
		 System.out.println(list.indexOf(p2));
		 System.out.println(list.indexOf(p3));
		 System.out.println(list.indexOf(p4));
		 System.out.println(list.indexOf(p5));
		
		
		
		
	}

}
