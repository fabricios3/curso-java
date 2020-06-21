package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;

	public double area() {
		double x = (this.a + this.b + this.c) / 2;
		double areaX = Math.sqrt(x * (x - this.a) * (x - this.b) * (x - this.c));
		return areaX;
	}
}
