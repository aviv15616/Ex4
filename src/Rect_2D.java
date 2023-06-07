import java.util.Arrays;

/**
 * This class represents a 2D axis parallel rectangle.
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Rect_2D implements GeoShape {
	private Point_2D _p1;
	private Point_2D _p2;
	public Rect_2D(Point_2D p1, Point_2D p2) {
		_p1=p1;
		_p2=p2;
	}
	public Rect_2D(Rect_2D t1) {
		_p1=t1.get_p1();
		_p2=t1.get_p2();
	}
	public Point_2D get_p1() {
		return this._p1;

	}
	public Point_2D get_p2() {
		return this._p2;

	}
//    public Point_2D[] getOtherPoints()
//	{
//		Point_2D[] points= new Point_2D[2];
//		points[0]=new Point_2D(_p1.x(),_p2.y());
//		points[1]=new Point_2D(_p2.x(),_p1.y());
//		System.out.println(points[0].x()+","+points[0].y());
//		System.out.println(points[1].x()+","+points[1].y());
//		return points;
//
//
//	}
	@Override
	public boolean contains(Point_2D ot) {
		double MinX=Math.min(_p1.x(),_p2.x());
		double MinY=Math.min(_p1.y(),_p2.y());
		double MaxX=Math.max(_p1.x(),_p2.x());
		double MaxY=Math.max(_p1.y(),_p2.y());
		if(ot.x()>=MinX&&ot.x()<=MaxX&&ot.y()>=MinY&&ot.y()<=MaxY)
		return true;

		return false;
	}

	@Override
	public double area() {
		return Math.abs(_p1.x()-_p2.x())*Math.abs(_p1.y()-_p2.y());
	}

	@Override
	public double perimeter() {
		return 2*(Math.abs(_p1.x()-_p2.x())+Math.abs(_p1.y()-_p2.y()));
	}

	@Override
	public void translate(Point_2D vec) {
		this._p1=new Point_2D(this._p1.x()+vec.x(),this._p1.y()+vec.y());
		this._p2=new Point_2D(this._p2.x()+vec.x(),this._p2.y()+vec.y());
	}

	@Override
	public GeoShape copy() {
		GeoShape a1= new Rect_2D(_p1,_p2);
		return a1;
	}

	@Override
	public void scale(Point_2D center, double ratio) {
		_p1.scale(center,ratio);
		_p2.scale(center,ratio);
	}

	@Override
	public void rotate(Point_2D center, double angleDegrees) {
		_p1.rotate(center,angleDegrees);
		_p2.rotate(center,angleDegrees);
	}
}
