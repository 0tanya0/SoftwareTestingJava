public class MyFirstProgram {

	public static void main(String[] args) {

		//System.out.println("Hello, world!");

		Point p1 = new Point(7.5, 2.7);
		Point p2 = new Point(4.9, 3.4);

		//System.out.println(distance(p1,p2));

		System.out.println("Расстояние между двумя точками =" + p1.distance(p2));
	}

//	public static double distance(Point p1, Point p2){
//		return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
//	}
}
