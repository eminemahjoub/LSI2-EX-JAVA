package pack0;

class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public double distance(Point p) {
		return Math.sqrt(Math.pow((p.x-this.x), 2)+Math.pow((p.y-this.y), 2));
	}
}
