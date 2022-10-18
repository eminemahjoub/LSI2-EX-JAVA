package pack0;

import java.util.Vector;

public class TestPoint {


	public static void main(String[] args) {
		Point p1 = new Point(1.2,4.5);
		Point p2 = new Point(2.2,6.1);
		Point p3 = new Point(-1.5,3.8);
		System.out.println(p1.toString());
		System.out.println("La Distance = "+p1.distance(p2));

Vector w = new Vector();
w.addElement(p1);
w.addElement(p2);
w.addElement(p3);
w.addElement(new Point(2,5));

for(int k=0;k<w.size();k++)
System.out.println(w.elementAt(k));
	}

}
